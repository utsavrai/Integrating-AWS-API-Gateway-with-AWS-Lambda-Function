package com.utsav;
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<PersonRequest, String> {

    public String handleRequest(PersonRequest personRequest, Context context) {
    	
        DynamoDB dynamoDB = new DynamoDB(AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(new EndpointConfiguration("dynamodb.ap-south-1.amazonaws.com","ap-south-1")).build());
        Table table = dynamoDB.getTable("DynamoLambda");
        final Item item = new Item()
                .withPrimaryKey("id", personRequest.getId()) // Every item gets a unique id
                .withString("firstName", personRequest.getFirstName())
                .withString("lastName", personRequest.getLastName())
                .withInt("age", personRequest.getAge())
                .withString("address", personRequest.getAddress());
        PutItemOutcome p = table.putItem(item);
        if(p != null) {
        	return "added";
        }else {
        	return "not added";
        }
        
    }
}

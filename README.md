# Integration-of-API-Gateway-with-Lambda-Function-to-update-DynamoDB-Table
This is helpful when your application is serverless and you want to send some data through http post request and before saving into database you need to process the data or use it to get some other result and then save it. AWS Lambda function plays this role of handling the data which is received through API Gateway. API Gateway sends the result of lambda function as a response to the request made which can be either a custom POJO or a simple confirmation string.

![postman request](https://raw.githubusercontent.com/utsavrai/Integration-of-API-Gateway-with-Lambda-Function-to-update-DynamoDB-Table/master/api_integration.PNG)
![dynamodb](https://raw.githubusercontent.com/utsavrai/Integration-of-API-Gateway-with-Lambda-Function-to-update-DynamoDB-Table/master/api_integration_res.PNG)
![lambda](https://raw.githubusercontent.com/utsavrai/Integration-of-API-Gateway-with-Lambda-Function-to-update-DynamoDB-Table/master/api_integration_setup.PNG)

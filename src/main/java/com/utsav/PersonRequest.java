package com.utsav;

public class PersonRequest {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public static void main(String[] args) {
        PersonRequest personRequest = new PersonRequest();
        personRequest.setId(1);
        personRequest.setFirstName("Utsav");
        personRequest.setLastName("Rai");
        personRequest.setAge(21);
        personRequest.setAddress("India");
        System.out.println(personRequest);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

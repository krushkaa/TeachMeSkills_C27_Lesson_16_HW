package com.teachmeskills.lesson16.model;


import java.util.ArrayList;
import java.util.Date;

public class Client {
    private String name;
    private int age;
    private Date registrationDate;
    private ArrayList<Order> order;
    private long clientPassportNumber;

    public Client(String name, int age, Date registrationDate, long clientPassportNumber) {
        this.name = name;
        this.age = age;
        this.registrationDate = registrationDate;
        this.clientPassportNumber = clientPassportNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public ArrayList<Order> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<Order> order) {
        this.order = order;
    }

    public long getClientPassportNumber() {
        return clientPassportNumber;
    }

    public void setClientPassportNumber(long clientPassportNumber) {
        this.clientPassportNumber = clientPassportNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", registrationDate=" + registrationDate +
                ", order=" + order +
                ", clientPassportNumber=" + clientPassportNumber +
                '}';
    }
}


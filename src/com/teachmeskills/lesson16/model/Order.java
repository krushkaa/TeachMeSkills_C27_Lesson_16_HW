package com.teachmeskills.lesson16.model;

public class Order {
    private String productName;
    private double productPrice;

    public Order(java.lang.String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}

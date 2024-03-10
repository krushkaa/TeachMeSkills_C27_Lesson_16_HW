package com.teachmeskills.lesson16.fabric;

import com.teachmeskills.lesson16.model.Order;

import java.util.ArrayList;

public class OrderFabric {
    public static ArrayList<Order> firstOrder() {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order("Order1", 100));
        orders.add(new Order("Order2", 99.99));
        orders.add(new Order("Order3", 49.50));
        return orders;
    }

    public static ArrayList<Order> secondOrder() {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order("Order1", 91.22));
        orders.add(new Order("Order2",65.99));
        orders.add(new Order("Order3", 4.99));
        return orders;
    }

    public static ArrayList<Order> thirdOrder() {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order("Order1", 100));
        orders.add(new Order("Order2",65.99));
        orders.add(new Order("Order3", 22.22));
        return orders;
    }
}

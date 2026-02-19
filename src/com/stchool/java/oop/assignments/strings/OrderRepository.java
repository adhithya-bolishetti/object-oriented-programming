package com.stchool.java.oop.assignments.strings;

import java.util.HashSet;
import java.util.Iterator;

public class OrderRepository {
    HashSet<Order> orders;

    public OrderRepository() {
        orders = new HashSet<>();
    }

    Order save(Order order) {
        orders.add(order);
        return order;
    }

    HashSet<Order> getAll() {
        return orders;
    }

    Order getById(String id) {
        System.out.println("Id : " + id);
        Order orderById = null;

        for(Order order : orders) {
            if(order.getId().equals(id)) {
                orderById = order;
            }
        }

        return orderById;
    }

    Order update(Order order) {
        Iterator<Order> orderIterator = orders.iterator();

        while (orderIterator.hasNext()) {
            Order existingOrder = orderIterator.next();

            if(existingOrder.getId().equals(order.getId())) {
                orderIterator.remove();
                break;
            }
        }

        orders.add(order);
        return order;
    }

    void delete(String id) {
        Iterator<Order> orderIterator = orders.iterator();

        while (orderIterator.hasNext()) {
            Order existingOrder = orderIterator.next();
            if (existingOrder.getId().equals(id)) {
                orderIterator.remove();
                break;
            }
        }
    }
}

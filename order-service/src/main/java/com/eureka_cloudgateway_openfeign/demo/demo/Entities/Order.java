package com.eureka_cloudgateway_openfeign.demo.demo.Entities;

import java.util.Date;

public class Order {

    private Long id;

    private Date dateReceived;

    private double price;

    private OrderState orederState = OrderState.CREATED;

    public Order() {
    }

    public Order(Long id, double price, Date dateReceived, OrderState orederState) {
        this.id = id;
        this.price = price;
        this.dateReceived = dateReceived;
        this.orederState = orederState;
    }

    public Long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public OrderState getOrederState() {
        return orederState;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOrederState(OrderState orederState) {
        this.orederState = orederState;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    public enum OrderState {
        CREATED, PROCESSING, FAILED, PICKEDUP, DELIVERED
    }
}


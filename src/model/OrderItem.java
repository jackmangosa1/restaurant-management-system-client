/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;


/**
 *
 * @author pc
 */
public class OrderItem implements Serializable {
    private int orderItemId;
    private CustomerOrder order;
    private Dish dish;
    private int quantity;

    public OrderItem() {
    }

    public OrderItem(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public OrderItem(int orderItemId, CustomerOrder order, Dish dish, int quantity) {
        this.orderItemId = orderItemId;
        this.order = order;
        this.dish = dish;
        this.quantity = quantity;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public CustomerOrder getOrder() {
        return order;
    }

    public void setOrder(CustomerOrder order) {
        this.order = order;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}

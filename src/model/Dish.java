/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */

public class Dish implements Serializable {
    private int dishId;
    private String name;
    private double price;
    private DishCategory category;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Dish() {
    }

    public Dish(int dishId) {
        this.dishId = dishId;
    }

    public Dish(int dishId, String name, double price, DishCategory category) {
        this.dishId = dishId;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public DishCategory getCategory() {
        return category;
    }

    public void setCategory(DishCategory category) {
        this.category = category;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
    
}

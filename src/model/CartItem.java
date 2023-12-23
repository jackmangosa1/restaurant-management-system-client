/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pc
 */
public class CartItem {
    private int itemId;
    private String itemName;
    private double price;
    private int quantity;
    private Dish dish;

    public CartItem() {
    }

    public CartItem(int itemId) {
        this.itemId = itemId;
    }

    public CartItem(int itemId, String itemName, double price, int quantity, Dish dish) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.dish = dish;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }
    
    public double getTotalPrice() {
        return price * quantity;
    }
    @Override
    public String toString() {
        return itemName + "     " +  price + " " + "FC" + "      Qty " + quantity;
    }
    
   
}

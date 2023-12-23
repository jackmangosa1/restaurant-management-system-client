/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
/**
 *
 * @author pc
 */
public class CustomerOrder implements Serializable {
    private int orderId;
    private Customer customer;
    private List<OrderItem> orderItems;
    private Date orderDate;
    private double totalAmount;
    private OrderStatus status;
    private Employee cashier;

    public CustomerOrder() {
    }

    public CustomerOrder(int orderId) {
        this.orderId = orderId;
    }

    public CustomerOrder(int orderId, Customer customer, List<OrderItem> orderItems, Date orderDate, double totalAmount, OrderStatus status, Employee cashier) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderItems = orderItems;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
        this.cashier = cashier;
    }
    
     public CustomerOrder(Customer customer, List<OrderItem> orderItems, Date orderDate, double totalAmount, OrderStatus status, Employee cashier) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderItems = orderItems;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
        this.cashier = cashier;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Employee getCashier() {
        return cashier;
    }

    public void setCashier(Employee cashier) {
        this.cashier = cashier;
    }

   
}

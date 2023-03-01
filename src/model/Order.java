/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author USER
 */
public class Order extends ShoppingGuides {
    private final List<String> VALID_DELIVERY_STATUS = Arrays.asList(
        new String[] {
            "Pending",
            "Delivered",
            "Out of Delivery"
        }
    );
    private float totalPrice;
    private String deliveryStatus;
    private boolean paidStatus;
    private LocalDate created;
    private DeliveryStaff staff;

    public Order() {
        this.created  = LocalDate.now();
    }

    public Order(
            String recordId, 
            ArrayList<Item> products,
            Customer customer,
            float totalPrice,
            String deliveryStatus,
            boolean paidStatus,
            LocalDate created,
            DeliveryStaff staff
    ) {
        this.recordId = recordId;
        this.products = products;
        this.customer = customer;
        this.totalPrice = totalPrice;
        this.deliveryStatus = deliveryStatus;
        this.paidStatus = paidStatus;
        this.created = created;
        this.staff = staff;
    }
    
    @Override
    public String serializeProducts()
    {
        String productIds = "";
        for (Item product: this.products)
        {
            productIds += product.getProductId() + "$";
        }
        
        return productIds;
    }
    
    public String getRecordId()
    {
        return this.recordId;
    }
    
    public ArrayList<Item> getProducts()
    {
        return this.products;
    }

    public Customer getCustomer() {
        return customer;
    }
     
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public float getTotalPrice() {
        return totalPrice;
    }
    
    public boolean getPaidStatus() {
        return this.paidStatus;
    }

    public LocalDate getCreated() {
        return created;
    }

    public DeliveryStaff getStaff() {
        return staff;
    }
    
    public void setRecordId(String id)
    {
        this.recordId = id;
    }
    
    public void setProducts(ArrayList<Item> products)
    {
        this.products = products;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        if (VALID_DELIVERY_STATUS.contains(deliveryStatus))
        {
            this.deliveryStatus = deliveryStatus;
        }
        System.err.println("Invalid delivery status");
    }

    public void setPaidStatus(boolean paidStatus) {
        this.paidStatus = paidStatus;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public void setStaff(DeliveryStaff staff) {
        this.staff = staff;
    }
}

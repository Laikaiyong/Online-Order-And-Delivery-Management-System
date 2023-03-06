/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;


abstract class ShoppingGuides {
    protected String recordId;
    protected ArrayList<Item> products; 
    protected Customer customer;
    protected String serializeProducts() {
        String productIds = "";
        for (Item product: this.products)
        {
            productIds += product.getProductId() + "$";
        }
        
        return productIds;
    }
}

/**
 *
 * @author USER
 */
public class Cart extends ShoppingGuides {
    public Cart() {}

    public Cart(
            String recordId, 
            ArrayList<Item> products,
            Customer customer
    ) {
        this.recordId = recordId;
        this.products = products;
        this.customer = customer;
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
    
    
    public void addItem(Item product)
    {
        this.products.add(product);
    }
    
    public void removeItem(Item product)
    {
        this.products.remove(product);
    }
        
    public void checkout()
    {
        this.products = new ArrayList<> ();
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
     
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class Item {
    private String productId;
    private String productName;
    private String description;
    private float price;
    private int inStockQuantity;
    private Category category;
    
    public Item() { }

    public Item(String productId, String productName, String description, float price, int inStockQuantity, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.inStockQuantity = inStockQuantity;
        this.category = category;
    }
    
    public String getProductId()
    {
        return this.productId;
    }
        
    public String getProductName()
    {
        return this.productName;
    }
    
    public String getDescription()
    {
        return this.description;
    }
        
    public float getPrice()
    {
        return this.price;
    }
        
    public int getInStockQuantity()
    {
        return this.inStockQuantity;
    }
                
    public Category getCategory()
    {
        return this.category;
    }
    
    public void setProductId(String productId)
    {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
        
    public void setDescription(String desc)
    {
        this.description = desc;
    }
        
    public void setPrice(float price)
    {
        this.price = price;
    }
        
    public void setInStockQuantity(int quantity)
    {
        this.inStockQuantity = quantity;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
    public void addQuantity(int quantity)
    {
        this.inStockQuantity += quantity;
    }
        
    public void substractQuantity(int quantity)
    {
        this.inStockQuantity -= quantity;
    }
}

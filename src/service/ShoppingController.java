/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.Cart;
import model.Category;
import model.Feedback;
import model.Item;
import model.Order;

/**
 *
 * @author USER
 */
public class ShoppingController {
    public ArrayList<Category> category;
    public ArrayList<Item> item;
    public ArrayList<Order> orders;
    public ArrayList<Cart> carts;
    public ArrayList<Feedback> feedback;
    
    public ShoppingController() { }

    public ShoppingController(ArrayList<Category> category, ArrayList<Item> item, ArrayList<Order> orders, ArrayList<Cart> carts, ArrayList<Feedback> feedback) {
        this.category = category;
        this.item = item;
        this.orders = orders;
        this.carts = carts;
        this.feedback = feedback;
    }
    
    
    public ShoppingController(UserController userController) {
        this.category = new GeneraFileHandler().configCategoryFile(this);
        this.item = new GeneraFileHandler().configItemFile(this, userController);
        this.orders = new GeneraFileHandler().configOrderFile(userController, this);
        this.carts = new GeneraFileHandler().configCartFile(this, userController);
        this.feedback = new GeneraFileHandler().configFeedbackFile(this);
    }
    
    // Getters
    public ArrayList<Order> getOrders()
    {
        return this.orders;
    }
       
    public ArrayList<Cart> getCarts()
    {
        return this.carts;
    }

    public ArrayList<Category> getCategory() {
        return category;
    }

    public ArrayList<Feedback> getFeedback() {
        return feedback;
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    // Setters
    public void setOrders(ArrayList<Order> orders)
    {
        this.orders = orders;
    }
    
    public void setCarts(ArrayList<Cart> carts)
    {
        this.carts = carts;
    }
    
    public ArrayList<Cart> filteredCart(String personalId)
    {
        List<Cart> list = (List<Cart>) this.carts.clone();
        list.removeIf(cart -> 
                !cart.getCustomer().getPersonalId().equals(personalId)
        );
        return new ArrayList<>(list);
    }
    
    public ArrayList<Order> filteredOrder(String personalId)
    {
        List<Order> list = (List<Order>) this.orders.clone();
        list.removeIf(order -> 
                !order.getCustomer().getPersonalId().equals(personalId)
        );
        return new ArrayList<>(list);
    }
    
    public ArrayList<Item> filteredItem(String[] itemIds)
    {
        System.out.println(this.item);
        List<Item> oriItems = (List<Item>) this.item.clone();
        ArrayList<Item> result = new ArrayList<> ();
        for (Item product: oriItems) {
            for (String itemId : itemIds) {
                if (!itemId.equals("")) {
                    if (product.getProductId().equals(itemId)) {
                        result.add(product);
                    }
                }
            }
        }

        return result;
    }
        
    public ArrayList<Category> filteredCategory(String categoryId)
    {
        List<Category> list = (List<Category>) this.category.clone();
        list.removeIf(cat -> 
                !cat.getCategoryId().equals(categoryId)
        );
        System.err.println(list);
        return new ArrayList<>(list);
    }
        
    public ArrayList<Feedback> filteredFeedback(String feedbackId)
    {
        List<Feedback> list = (List<Feedback>) this.feedback.clone();
        list.removeIf(fb -> 
                !fb.getFeedbackId().equals(feedbackId)
        );
        return new ArrayList<>(list);
    }
}

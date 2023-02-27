/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import misc.Security;
import model.parent.User;

/**
 *
 * @author USER
 */
public class Customer extends User {
    private char gender;
    private String email;
    private ArrayList<Cart> cart;
    private ArrayList<Item> products;
    
    // Register in System. 
    public void register(String username, String password)
    {
        Security secureAgent = new Security();
        secureAgent.encrypt(password);
    }
    
    
    // View and select Orders for Delivery. 
    public ArrayList<Item> getCart()
    {
        ArrayList<Cart> personalCart = new ArrayList<Cart>();
        ArrayList<Item> products = new ArrayList<Item>();
        return products;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import service.Security;
import model.parent.User;
import service.GeneraFileHandler;
import service.ShoppingController;
import service.UUIDGenerator;
import service.UserController;

/**
 *
 * @author USER
 */
public class Customer extends User {
    private String email;
    private String address;
    private String phoneNumber;
    
    /**
    * Constructor
    * For empty new user
    */
    public Customer()
    {
        super.setUsername("");
        super.setPersonalId("");
        super.setPassword("");
        super.setGender('U');
        this.email = "-";
        this.address = "-";
        this.phoneNumber = "-";
    }

    /**
    * Constructor
    * For existing Booking Request from Data Reading
     * @param newUsername
     * @param newPersonalId
     * @param newPassword
     * @param newGender
     * @param email
     * @param address
     * @param phoneNumber
    */
    public Customer(
            String newUsername, 
            String newPersonalId, 
            String newPassword,
            char newGender,
            String email,
            String address,
            String phoneNumber
    )
    {
        super.setUsername(newUsername);
        super.setPersonalId(newPersonalId);
        super.setPassword(newPassword);
        super.setGender(newGender);
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    // Register in System. 
    public Customer register(
            String username,
            String password
    ) {
        String personalId = new UUIDGenerator().generateUniqueKey();
        Security secureAgent = new Security();
        String encryptedPass = secureAgent.encrypt(password);
        
        Customer newCustomer = new Customer();
        newCustomer.setPersonalId(personalId);
        newCustomer.setUsername(username);
        newCustomer.setPassword(encryptedPass);
        
        return newCustomer;
    }
    
    
    // View and select Orders for Delivery. 
    public void payOrder(Order order, ShoppingController controller)
    {
        int index = controller.orders.indexOf(order);
        order.setPaidStatus(true);
        controller.orders.set(index, order);
        
        ArrayList<Item> items = order.getProducts();
        for (Item item: items)
        {
            int itemIndex = controller.item.indexOf(item);
            Item selectedItem = controller.item.get(itemIndex);
            selectedItem.substractQuantity(1);
            controller.item.set(index, selectedItem);
            
            new GeneraFileHandler().updateItemFile(items);
        }
    }
    
    // View and select Orders for Delivery. 
    public void submitFeedback(
        String review,
        int rating,
        Order order,
        ShoppingController controller
    ) {
        Feedback feedback = new Feedback();
        feedback.setReview(review);
        feedback.setRating(rating);
        feedback.setOrderId(order.getRecordId());

        controller.feedback.add(feedback);
        new GeneraFileHandler().updateFeedbackFile(controller.feedback);
    }
}

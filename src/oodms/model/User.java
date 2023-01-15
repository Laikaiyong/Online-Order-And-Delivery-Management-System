package oodms.model;

import oodms.misc.Security;

public class User {
    // Login to Access System. 
    public void login(String username, String password)
    {
        Security secureAgent = new Security();
        secureAgent.decrypt(password);
    }
    
// Login to Access system. 
//
// View and select Orders for Delivery. 
//
// Take Feedback and Update Delivery Status. 
//
// Exit 
//
// 
//
// Functionalities of All Customers (Registered / Not-Registered): 
//
// View all Items as per category  
//
// New customer Register to Access other Details 
//
// Exit 
//
// 
//
// Functionalities of Registered Customer: 
//
// Login to Access System 
//
// Modify Customer’s Own Profile 
//
// View Purchase History 
//
// Search for Items and Place an Order (Select Item and add to card) 
//
// Make payment to confirm order placement.  
//
// Exit 
}

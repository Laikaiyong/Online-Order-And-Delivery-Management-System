/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.Admin;
import model.Customer;
import model.DeliveryStaff;

/**
 *
 * @author USER
 */
public class UserController {
    public ArrayList<Admin> admins;
    public ArrayList<Customer> customers;
    public ArrayList<DeliveryStaff> deliveryStaff;
    public String loginedUserId;

    public UserController() {
        this.admins = new GeneraFileHandler().configAdmin();
        this.customers = new GeneraFileHandler().configCustomer();
        this.deliveryStaff = new GeneraFileHandler().configDeliveryStaff();
    }

    public UserController(
            ArrayList<Admin> admins,
            ArrayList<Customer> customers,
            ArrayList<DeliveryStaff> deliveryStaff,
            String loginedUserId
    ) {
        this.admins = admins;
        this.customers = customers;
        this.deliveryStaff = deliveryStaff;
        this.loginedUserId = loginedUserId;
    }
    
    // Getters
    public ArrayList<Admin> getAdmins()
    {
        return this.admins;
    }
       
    public ArrayList<Customer> getCustomers()
    {
        return this.customers;
    }
        
    public ArrayList<DeliveryStaff> getDeliveryStaff()
    {
        return this.deliveryStaff;
    }
    
    public String getLoginedUserId()
    {
        return this.loginedUserId;
    }
    
    // Setters
    public void setAdmins(ArrayList<Admin> admins)
    {
        this.admins = admins;
    }
    
    public void setCustomers(ArrayList<Customer> customers)
    {
        this.customers = customers;
    }
    
    public void setDeliveryStaff(ArrayList<DeliveryStaff> staffs)
    {
        this.deliveryStaff = staffs;
    }
        
    public void setLoginedUserId(String userId)
    {
        this.loginedUserId = userId;
    }
    
    public Customer filteredCustomerId(String id)
    {
        
    }
    
    public Admin filteredAdminId(String id)
    {
        
    }
        
    public DeliveryStaff filteredDeliveryStaffId(String id)
    {
        
    }
}

package model.parent;

import service.Security;
import model.Admin;
import model.Customer;
import model.DeliveryStaff;
import service.UserController;

public class User {
     /**
     * Attributes
     */
    private String personalId;
    private String username;
    private String password;
    private char gender;

    public User() {
    }
    
    /*
    * Setters
    */
    public void setUsername(String userName)
    {
        this.username = userName;
    }
    
    public void setPersonalId(String customerPersonalId)
    {
        this.personalId = customerPersonalId;
    }
    
    public void setGender(char customerGender)
    {
        this.gender = customerGender;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
 
    /*
    * Getters
    */
    public String getUsername()
    {
        return this.username;
    }
    
    public String getPersonalId()
    {
        return this.personalId;
    }
    
    public char getGender()
    {
        return this.gender;
    }
    
    public String getPassword()
    {
        return this.password;
    }
    
    // Login to Access System. 
    public String login(UserController controller, String username, String password)
    {
        Security secureAgent = new Security();
        String decryptedPassword = secureAgent.decrypt(password);
        
        for (Admin admin: controller.admins) {
            if (
                admin.getUsername().equals(username) && 
                admin.getPassword().equals(decryptedPassword)
            )
            {
                return "admin " + admin.getPersonalId();
            }
        }
        
        for (DeliveryStaff staff: controller.deliveryStaff) {
            if (
                staff.getUsername().equals(username) && 
                staff.getPassword().equals(decryptedPassword)
            )
            {
                return "deliverystaff " + staff.getPersonalId();
            }
        }
                
        for (Customer customer: controller.customers) {
            if (
                customer.getUsername().equals(username) && 
                customer.getPassword().equals(decryptedPassword)
            )
            {
                return "customer " + customer.getPersonalId();
            }
        }
        
        return "";
    }
    
    public boolean resetPassword(String newPassword, String matchingPassword)
    {
        if (newPassword.equals(matchingPassword))
        {
            this.setPassword(newPassword);
            return true;
        }
        return false;
    }
}

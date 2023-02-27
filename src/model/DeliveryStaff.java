package model;

import model.parent.User;

public class DeliveryStaff extends User {
    
    
    
    // Display message when printed
    @Override
    public String toString()
    {
        return "Delivery staff " + 
                this.getUsername() + 
                " - (" + this.getPersonalId() + ")";
    }
}

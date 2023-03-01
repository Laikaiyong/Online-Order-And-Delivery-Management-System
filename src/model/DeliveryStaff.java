package model;

import model.parent.User;
import service.ShoppingController;

public class DeliveryStaff extends User {
    private String carPlate;

    public DeliveryStaff() {
    }

    public DeliveryStaff(
            String personalId,
            String newUsername, 
            String newPassword,
            char newGender,
            String carPlate
    )   {
        super.setUsername(newUsername);
        super.setPassword(newPassword);
        super.setGender(newGender);
        super.setPersonalId(personalId);
        this.carPlate = carPlate;
    }
    
    
    public String getCarPlate()
    {
        return this.carPlate;
    }
    
    public void setCarPlate(String newCarPlate)
    {
        this.carPlate = newCarPlate;
    }
    
    public void updateDeliveryStatus(
            String status,
            Order order,
            ShoppingController controller
    ) {
        order.setDeliveryStatus(status);
        int index = controller.orders.indexOf(order);
        controller.orders.set(index, order);
    }
    
    // Display message when printed
    @Override
    public String toString()
    {
        return "Delivery staff " + 
                this.getUsername() + 
                " - (" + this.getPersonalId() + ")";
    }
}

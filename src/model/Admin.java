/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import model.parent.User;
import service.GeneraFileHandler;
import service.Security;
import service.UUIDGenerator;
import service.UserController;

/**
 *
 * @author USER
 */
public class Admin extends User{
    /**
    * Constructor
    * For existing Booking Request from Data Reading
     * @param newUsername
     * @param newPersonalId
     * @param newPassword
     * @param newGender
    */
    
    public Admin() { }

    public Admin(String newPersonalId, String newUsername, String newPassword, char newGender) {
        super.setUsername(newUsername);
        super.setPersonalId(newPersonalId);
        super.setPassword(newPassword);
        super.setGender(newGender);
    }
    
    public void addUser(Admin admin, UserController controller)
    {
        controller.admins.add(admin);
        new GeneraFileHandler().updateUserFile(controller);
    }
    
    public void addUser(DeliveryStaff staff, UserController controller)
    {
        controller.deliveryStaff.add(staff);
        new GeneraFileHandler().updateUserFile(controller);
    }
    
    public void modifyUser(Admin admin, UserController controller)
    {
        int index = controller.admins.indexOf(admin);
        controller.admins.set(index, admin);
        new GeneraFileHandler().updateUserFile(controller);
    }
    
    public void modifyUser(DeliveryStaff staff, UserController controller)
    {
        int index = controller.deliveryStaff.indexOf(staff);
        controller.deliveryStaff.set(index, staff);
        new GeneraFileHandler().updateUserFile(controller);
    }
        
    public void deleteUser(Admin admin, UserController controller)
    {
        controller.admins.remove(admin);
        new GeneraFileHandler().updateUserFile(controller);
    }
    
    public void deleteUser(DeliveryStaff staff, UserController controller)
    {
        controller.deliveryStaff.remove(staff);
        new GeneraFileHandler().updateUserFile(controller);
    }
        
    public void assignStaff(DeliveryStaff staff, Order order)
    {
        order.
        new GeneraFileHandler().updateUserFile(controller);
    }
}

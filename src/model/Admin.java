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
import service.ShoppingController;
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
    
    public void modifyUser(Admin oriAdmin, Admin newAdmin, UserController controller)
    {
        int index = controller.admins.indexOf(oriAdmin);
        controller.admins.set(index, newAdmin);
        new GeneraFileHandler().updateUserFile(controller);
    }
    
    public void modifyUser(DeliveryStaff oriStaff, DeliveryStaff newStaff, UserController controller)
    {
        int index = controller.deliveryStaff.indexOf(oriStaff);
        controller.deliveryStaff.set(index, newStaff);
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
        
    public void assignStaff(DeliveryStaff staff, Order order, ShoppingController shopController)
    {
        order.setStaff(staff);
        int index = shopController.orders.indexOf(order);
        shopController.orders.set(index, order);
        new GeneraFileHandler().updateOrderFile(shopController.orders);
    }
     
    public void addItem(Item item, ShoppingController controller)
    {
        controller.item.add(item);
        new GeneraFileHandler().updateItemFile(controller.item);
    }
    
    public void modifyItem(Item oriItem, Item newItem, ShoppingController controller)
    {
        int index = controller.item.indexOf(oriItem);
        controller.item.set(index, newItem);
        new GeneraFileHandler().updateItemFile(controller.item);
    }
        
    public void deleteItem(Item item, ShoppingController controller)
    {
        controller.item.remove(item);
        new GeneraFileHandler().updateItemFile(controller.item);
    }
         
    public void addCategoy(Category category, ShoppingController controller)
    {
        controller.category.add(category);
        new GeneraFileHandler().updateCategoryFile(controller.category);
    }
    
    public void modifyCategory(
            Category oriCategory,
            Category newCategory,
            ShoppingController controller)
    {
        int index = controller.category.indexOf(oriCategory);
        controller.category.set(index, newCategory);
        new GeneraFileHandler().updateCategoryFile(controller.category);
    }
        
    public void deleteCategory(Category category, ShoppingController controller)
    {
        controller.category.remove(category);
        new GeneraFileHandler().updateCategoryFile(controller.category);
    }
}

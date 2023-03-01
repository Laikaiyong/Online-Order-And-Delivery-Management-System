/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.util.ArrayList;
import model.Admin;
import model.Customer;
import model.DeliveryStaff;
import service.GeneraFileHandler;
import service.Security;
import service.UUIDGenerator;
import service.UserController;

/**
 *
 * @author USER
 */
public class UserConfig {
        
    // Config Usee
    public static void main(String[] args)
    {
        UserController controller = new UserController();
        
        ArrayList<Admin> admins = new ArrayList<>();
        admins.add(
            new Admin(
                new UUIDGenerator().generateUniqueKey(),
                "Admin1",
                new Security().encrypt("admin123"),
                'M'
            )
        );
        
        ArrayList<DeliveryStaff> staffs = new ArrayList<>();
        staffs.add(
            new DeliveryStaff(
                new UUIDGenerator().generateUniqueKey(),
                "Staff1",
                new Security().encrypt("staff123"),
                'M',
                "XYKD123"
            )
        );
        staffs.add(
            new DeliveryStaff(
                new UUIDGenerator().generateUniqueKey(),
                "Staff2",
                new Security().encrypt("staff123"),
                'F',
                "SSNI192"
            )
        );
                
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(
            new Customer(
                "james",
                new UUIDGenerator().generateUniqueKey(),
                new Security().encrypt("customer123"),
                'M',
                "james@customer.co",
                "Jalan Jalil Majmuk",
                "0129909982"
            )
        );
        
        controller.admins = admins;
        controller.deliveryStaff = staffs;
        controller.customers = customers;
       
        new GeneraFileHandler().updateUserFile(controller);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import model.Admin;
import model.Cart;
import model.Category;
import model.Customer;
import model.DeliveryStaff;
import model.Feedback;
import model.Item;
import model.Order;
import service.GeneraFileHandler;
import service.Security;
import service.ShoppingController;
import service.UUIDGenerator;
import service.UserController;

/**
 *
 * @author USER
 */
public class ShoppingConfig {
    public static void main(String[] args) {
        UserController users = new UserController();

        ShoppingController controller = new ShoppingController();
        
        ArrayList<Category> categories = new ArrayList<> ();
        categories.add(
            new Category(
                new UUIDGenerator().generateUniqueKey(),
                "Electronics",
                "Electronice appliances for household, engineering"
            )
        );
        categories.add(
            new Category(
                new UUIDGenerator().generateUniqueKey(),
                "Clothing",
                "Tops, shirts and bottoms."
            )
        );

        ArrayList<Item> items = new ArrayList<> ();
        items.add(
            new Item(
                new UUIDGenerator().generateUniqueKey(),
                "Tanks",
                "Tanks top for summer",
                15f,
                100,
                categories.get(1)
            )
        );
        items.add(
            new Item(
                new UUIDGenerator().generateUniqueKey(),
                "Denim shorts",
                "Denim cool shorts",
                49.9f,
                150,
                categories.get(1)
            )
        );
        items.add(
            new Item(
                new UUIDGenerator().generateUniqueKey(),
                "Fans",
                "light white fans",
                100.15f,
                50,
                categories.get(0)
            )
        );
        
        ArrayList <Cart> carts = new ArrayList<> ();
        ArrayList<Item> cartItems = new ArrayList<Item>();
        cartItems.add(items.get(0));
        carts.add(
            new Cart(
                new UUIDGenerator().generateUniqueKey(),
                cartItems,
                users.customers.get(0)
            )
        );
         
        ArrayList<Order> orders = new ArrayList<> ();
        ArrayList<Item> cartItems1 = new ArrayList<Item>();
        cartItems1.add(items.get(0));
        cartItems1.add(items.get(1));
        
        ArrayList<Item> cartItems2 = new ArrayList<Item>();
        cartItems2.add(items.get(2));
        
        orders.add(
            new Order(
                new UUIDGenerator().generateUniqueKey(),
                cartItems1,
                users.customers.get(0),
                64.9f,
                "Delivered",
                true,
                LocalDate.of(2023, Month.JANUARY, 13),
                users.deliveryStaff.get(1)
            )
        );
        orders.add(
            new Order(
                new UUIDGenerator().generateUniqueKey(),
                cartItems2,
                users.customers.get(0),
                100.15f,
                "Pending",
                false,
                LocalDate.of(2023, Month.JANUARY, 19),
                users.deliveryStaff.get(0)
            )
        );
        
        ArrayList<Feedback> feedbacks = new ArrayList<>();
        feedbacks.add(
            new Feedback(
                new UUIDGenerator().generateUniqueKey(),
                "Good cloth quality",
                5,
                users.customers.get(0).getUsername(),
                orders.get(0).getRecordId()
            )
        );
      
        
        controller.category = categories;
        controller.item = items;
        controller.carts = carts;
        controller.orders = orders;
        controller.feedback = feedbacks;
        
        new GeneraFileHandler().updateCartFile(carts);
        new GeneraFileHandler().updateItemFile(items);
        new GeneraFileHandler().updateCategoryFile(categories);
        new GeneraFileHandler().updateOrderFile(orders);
        new GeneraFileHandler().updateFeedbackFile(feedbacks);
    }
}

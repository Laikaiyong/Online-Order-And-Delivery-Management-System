/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import model.Admin;
import model.Cart;
import model.Category;
import model.Customer;
import model.DeliveryStaff;
import model.Feedback;
import model.Item;
import model.Order;

/**
 *
 * @author USER
 */
public class GeneraFileHandler {
    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final String ORDER_FILE_NAME = "src/data/order.txt";
    private static final String USER_FILE_NAME = "src/data/user.txt";
    private static final String CART_FILE_NAME = "src/data/cart.txt";
    private static final String CATEGORY_FILE_NAME = "src/data/category.txt";
    private static final String ITEM_FILE_NAME = "src/data/item.txt";
    private static final String FEEDBACK_FILE_NAME = "src/data/feedback.txt";
   
    public GeneraFileHandler() {
        
    }
    
    public void updateOrderFile(ArrayList<Order> list) {
        System.out.println("Updating Order database");
        File file = new File(this.ORDER_FILE_NAME);
        try
        {
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, false));
            printWriter.flush();
            int item = 1;
            for (Order record: list)
            {

                printWriter.append(
                    String.format(
                        "%s, %s, %s, %f, %s, %b, %s, %s\n",
                        record.getRecordId(),
                        record.serializeProducts(),
                        record.getCustomer().getPersonalId(),
                        record.getTotalPrice(),
                        record.getDeliveryStatus(),
                        record.getPaidStatus(),
                        record.getCreated().toString(),
                        record.getStaff().getPersonalId()
                    )
                );
                item++;
            }
            printWriter.close();
        }
        catch(IOException e)
        {
            System.err.println("Unable to update order.txt");
        };
    }
    
    public ArrayList<Order> configOrderFile(UserController users, ShoppingController controller)
    {
        ArrayList<Order> orderRecord = new ArrayList<>();
        
        File file = new File(this.ORDER_FILE_NAME);
        // Create file / Retrive data from file
        try 
        {
            if (file.createNewFile()) 
            {
                System.out.println("Empty file creating.");
            }       
            else
            {
                System.out.println("Record file exists.");
                Scanner input = new Scanner(file);
                while(input.hasNextLine()){
                    String line = input.nextLine();
                    String[] orderInformation = line.split(", ");
                    ArrayList<Item> items = controller
                            .filteredItem(orderInformation[1].split("$"));
                    Order order = new Order(
                            orderInformation[0],
                            items,
                            users.filteredCustomerId(orderInformation[2]),
                            Float.parseFloat(orderInformation[3]),
                            orderInformation[4],
                            Boolean.parseBoolean(orderInformation[5]),
                            LocalDate.parse(orderInformation[6], dateFormatter),
                            users.filteredDeliveryStaffId(orderInformation[7])
                    );
                    orderRecord.add(order);
                }
            }
        } 
        catch (IOException e)
        {
          System.out.println("Booking record cannot be sent to database.");
        }
        
        return orderRecord;
    }
    
     public void updateCartFile(ArrayList<Cart> list) {
        System.out.println("Updating Order database");
        File file = new File(this.CART_FILE_NAME);
        try
        {
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, false));
            printWriter.flush();
            int item = 1;
            for (Cart record: list)
            {

                printWriter.append(
                    String.format(
                        "%s, %s, %s\n",
                        record.getRecordId(),
                        record.serializeProducts(),
                        record.getCustomer().getPersonalId()
                    )
                );
                item++;
            }
            printWriter.close();
        }
        catch(IOException e)
        {
            System.err.println("Unable to update order.txt");
        };
    }
    
    public ArrayList<Cart> configCartFile(
            ShoppingController controller,
            UserController users
    )   {
        ArrayList<Cart> carts = new ArrayList<>();
        
        File file = new File(this.CART_FILE_NAME);
        // Create file / Retrive data from file
        try 
        {
            if (file.createNewFile()) 
            {
                System.out.println("Empty file creating.");
            }       
            else
            {
                System.out.println("Record file exists.");
                Scanner input = new Scanner(file);
                while(input.hasNextLine()){
                    String line = input.nextLine();
                    String[] orderInformation = line.split(", ");
                    ArrayList<Item> products = controller.filteredItem(orderInformation[1].split("$"));
                    Customer customer = users.filteredCustomerId(orderInformation[2]);
                    Cart cart = new Cart(
                            orderInformation[0],
                            products,
                            customer
                    );
                    carts.add(cart);
                }
            }
        } 
        catch (IOException e)
        {
          System.out.println("Booking record cannot be sent to database.");
        }
        
        return carts;
    }
    
     public void updateItemFile(ArrayList<Item> list) {
        System.out.println("Updating Ityem database");
        File file = new File(this.ITEM_FILE_NAME);
        try
        {
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, false));
            printWriter.flush();
            int item = 1;
            for (Item record: list)
            {

                printWriter.append(
                    String.format(
                        "%s, %s, %s, %f, %d, %s\n",
                        record.getProductId(),
                        record.getProductName(),
                        record.getDescription(),
                        record.getPrice(),
                        record.getInStockQuantity(),
                        record.getCategory().getCategoryId()
                    )
                );
                item++;
            }
            printWriter.close();
        }
        catch(IOException e)
        {
            System.err.println("Unable to update order.txt");
        };
    }
     
     public ArrayList<Item> configItemFile(
            ShoppingController controller,
            UserController users
    )   {
        ArrayList<Item> items = new ArrayList<>();
        
        File file = new File(this.ITEM_FILE_NAME);
        // Create file / Retrive data from file
        try 
        {
            if (file.createNewFile()) 
            {
                System.out.println("Empty file creating.");
            }       
            else
            {
                System.out.println("Record Item file exists.");
                Scanner input = new Scanner(file);
                while(input.hasNextLine()){
                    String line = input.nextLine();
                    String[] itemInformation = line.split(", ");
                    Item item = new Item(
                        itemInformation[0],
                        itemInformation[1],
                        itemInformation[2],
                        Float.parseFloat(itemInformation[3]),
                        Integer.parseInt(itemInformation[4]),
                        controller.filteredCategory(itemInformation[5]).get(0)
                    );
                    items.add(item);
                }
            }
        } 
        catch (IOException e)
        {
          System.out.println("Booking record cannot be sent to database.");
        }
        
        return items;
    }
    
    public ArrayList<Category> configCategoryFile(
            ShoppingController controller
    )   {
        ArrayList<Category> categories = new ArrayList<>();
        
        File file = new File(this.CATEGORY_FILE_NAME);
        // Create file / Retrive data from file
        try 
        {
            if (file.createNewFile()) 
            {
                System.out.println("Empty file creating.");
            }       
            else
            {
                System.out.println("Record file exists.");
                Scanner input = new Scanner(file);
                while(input.hasNextLine()){
                    String line = input.nextLine();
                    String[] categoryInformation = line.split(", ");
                    Category category = new Category(
                            categoryInformation[0],
                            categoryInformation[1],
                            categoryInformation[2]
                    );
                    categories.add(category);
                }
            }
        } 
        catch (IOException e)
        {
          System.out.println("Booking record cannot be sent to database.");
        }
        
        return categories;
    }
    
     public void updateCategoryFile(ArrayList<Category> list) {
        System.out.println("Updating Category database");
        File file = new File(this.CATEGORY_FILE_NAME);
        try
        {
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, false));
            printWriter.flush();
            int item = 1;
            for (Category record: list)
            {

                printWriter.append(
                    String.format(
                        "%s, %s, %s\n",
                        record.getCategoryId(),
                        record.getCategoryName(),
                        record.getCategoryDescription()
                    )
                );
                item++;
            }
            printWriter.close();
        }
        catch(IOException e)
        {
            System.err.println("Unable to update order.txt");
        };
    }
    
    public ArrayList<Feedback> configFeedbackFile(
            ShoppingController controller
    )   {
        ArrayList<Feedback> feedbacks = new ArrayList<>();
        
        File file = new File(this.FEEDBACK_FILE_NAME);
        // Create file / Retrive data from file
        try 
        {
            if (file.createNewFile()) 
            {
                System.out.println("Empty feedback creating.");
            }       
            else
            {
                System.out.println("Record file exists.");
                Scanner input = new Scanner(file);
                while(input.hasNextLine()){
                    String line = input.nextLine();
                    String[] itemInformation = line.split(", ");
                    Feedback feedback = new Feedback(
                        itemInformation[0],
                        itemInformation[1],
                        Integer.parseInt(itemInformation[2]),
                        itemInformation[3],
                        itemInformation[4]
                    );
                    feedbacks.add(feedback);
                }
            }
        } 
        catch (IOException e)
        {
          System.out.println("Booking record cannot be sent to database.");
        }
        
        return feedbacks;
    }
    
    
     public void updateFeedbackFile(ArrayList<Feedback> list) {
        System.out.println("Updating Feedback database");
        File file = new File(this.FEEDBACK_FILE_NAME);
        try
        {
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, false));
            printWriter.flush();
            int item = 1;
            for (Feedback record: list)
            {

                printWriter.append(
                    String.format(
                        "%s, %s, %d, %s, %s\n",
                        record.getFeedbackId(),
                        record.getReview(),
                        record.getRating(),
                        record.getCustomerName(),
                        record.getOrderId()
                    )
                );
                item++;
            }
            printWriter.close();
        }
        catch(IOException e)
        {
            System.err.println("Unable to update order.txt");
        };
    }
     
    public void updateUserFile(UserController controller) {
        System.out.println("Updating User database");
        File file = new File(this.USER_FILE_NAME);

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, false))) {
            // printWriter.flush();
            for (Admin admin: controller.admins)
            {
                printWriter.append(
                        String.format(
                                "%s, %s, %s, %s, %c\n",
                                "admin",
                                admin.getPersonalId(),
                                admin.getUsername(),
                                admin.getPassword(),
                                admin.getGender()
                        )
                );
            }

            for (DeliveryStaff staff: controller.deliveryStaff)
            {
                printWriter.append(
                        String.format(
                                "%s, %s, %s, %s, %c, %s\n",
                                "deliverystaff",
                                staff.getPersonalId(),
                                staff.getUsername(),
                                staff.getPassword(),
                                staff.getGender(),
                                staff.getCarPlate()
                        )
                );
            }

            for (Customer customer: controller.customers)
            {
                printWriter.append(
                        String.format(
                                "%s, %s, %s, %s, %c, %s, %s, %s\n",
                                "customer",
                                customer.getPersonalId(),
                                customer.getUsername(),
                                customer.getPassword(),
                                customer.getGender(),
                                customer.getEmail(),
                                customer.getAddress(),
                                customer.getPhoneNumber()
                        )
                );
            }

            if (printWriter != null) {
               printWriter.close();
            }
        }
        catch (Exception e)
        {
            System.err.println("Error in printwrite for userfile");
        }
    }

    public ArrayList<Admin> configAdmin()
    {
        ArrayList<Admin> admins = new ArrayList<>();
        
        File file = new File(this.USER_FILE_NAME);
        // Create file / Retrive data from file
        try
        {
            //  Initialization   
            if (file.createNewFile()) 
            {
                System.out.println("Empty file creating.");
            }
            //  Read file to get rooms          
            else
            {
                System.out.println("Record file exists.");
                Scanner input = new Scanner(file);
                while(input.hasNextLine()){
                    String line = input.nextLine();
                    String[] userInformation = line.split(", ");
                    if(userInformation[0].equals("admin"))
                    {
                        System.out.println(new Security().decrypt(userInformation[3]));
                        Admin admin = new Admin(
                            userInformation[1],
                            userInformation[2],
                            new Security().decrypt(userInformation[3]),
                            userInformation[4].charAt(0)
                        );
                        admins.add(admin);
                    }
                    else
                    {
                        break;
                    }
                }
            }
        } 
        catch (IOException e)
        {
          System.out.println("Booking record cannot be sent to database.");
        }
        
        return admins;
    }
    
    public ArrayList<DeliveryStaff> configDeliveryStaff()
    {
        ArrayList<DeliveryStaff> staffs = new ArrayList<>();
        
        File file = new File(this.USER_FILE_NAME);
        // Create file / Retrive data from file
        try 
        {
            //  Initialization   
            if (file.createNewFile()) 
            {
                System.out.println("Empty file creating.");
            }
            //  Read file to get rooms          
            else
            {
                System.out.println("Record file exists.");
                Scanner input = new Scanner(file);
                OUTER:
                while (input.hasNextLine()) {
                    String line = input.nextLine();
                    String[] userInformation = line.split(", ");
                    switch (userInformation[0]) {
                        case "admin" -> {
                        }
                        case "deliverystaff" -> {
                            DeliveryStaff staff= new DeliveryStaff(
                                    userInformation[1],
                                    userInformation[2],
                                    new Security().decrypt(userInformation[3]),
                                    userInformation[4].charAt(0),
                                    userInformation[5]
                            );  staffs.add(staff);
                        }
                        default -> {
                                break OUTER;
                        }
                    }
                }
            }
        } 
        catch (IOException e)
        {
          System.out.println("Booking record cannot be sent to database.");
        }
        
        return staffs;
    }
    
    public ArrayList<Customer> configCustomer()
    {
        ArrayList<Customer> customers = new ArrayList<>();
        
        File file = new File(this.USER_FILE_NAME);
        // Create file / Retrive data from file
        try 
        {
            //  Initialization   
            if (file.createNewFile()) 
            {
                System.out.println("Empty file creating.");
            }
            //  Read file to get rooms          
            else
            {
                System.out.println("Record file exists.");
                Scanner input = new Scanner(file);
                OUTER:
                while (input.hasNextLine()) {
                    String line = input.nextLine();
                    String[] userInformation = line.split(", ");
                    switch (userInformation[0]) {
                        case "admin" -> {
                        }
                        case "deliverystaff" -> {
   
                        }
                        case "customer" -> {
                            Customer customer = new Customer(
                                    userInformation[2],
                                    userInformation[1],
                                    new Security().decrypt(userInformation[3]),
                                    userInformation[4].charAt(0),
                                    userInformation[5],
                                    userInformation[6],
                                    userInformation[7]
                            ); 
                            customers.add(customer);
                        }
                        default -> {
                                break OUTER;
                        }
                    }
                }
            }
        } 
        catch (IOException e)
        {
          System.out.println("Booking record cannot be sent to database.");
        }
        
        return customers;
    }
}
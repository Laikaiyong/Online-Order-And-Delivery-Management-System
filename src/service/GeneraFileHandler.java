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
import model.Order;


abstract class FileHandler {
    protected String configFilename;
    protected String filename;
    
    public abstract void updateOrderFile(ArrayList<Order> list);
}

/**
 *
 * @author USER
 */
public class GeneraFileHandler {
    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final String ORDER_FILE_NAME = "src/data/order.txt";
    private static final String ORDER_CONFIG_FILE_NAME = "src/data/orderConfig.txt";
    
    private static final String USER_FILE_NAME = "src/data/user.txt";
    private static final String USER_CONFIG_FILE_NAME = "src/data/userrConfig.txt";
    
    private static final String CART_FILE_NAME = "src/data/user.txt";
    private static final String CART_CONFIG_FILE_NAME = "src/data/userrConfig.txt";
    
    public void updateOrderFile(ArrayList<Order> list) {
        System.out.println("Updating Order database");
        File file = new File(this.ORDER_FILE_NAME);
        try
        {
            System.out.println("Updating file");
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, false));
            printWriter.flush();
            int item = 1;
            for (Order record: list)
            {
                printWriter.append(
                    String.format(
                        "%s, %s, %s, %c, %s, %s, %s, %s, %d, %s, %s, %s, %f, %f, %f, %b\n",
                        record.getBookingId(),
                        record.getCustomer().getName(),
                        record.getCustomer().getPersonalId(),
                        record.getCustomer().getGender(),
                        record.getCustomer().getEmail(),
                        record.getCustomer().getContactNumber(),
                        record.getBookedRoom(),
                        record.getStatus(),
                        record.getStayDays(),
                        record.getStartDate().toString(),
                        record.getEndDate().toString(),
                        record.getCreatedTime(),
                        record.getNightPay(),
                        record.getExtraCharges(),
                        record.getTotalTax(),
                        record.getAddedExtra()
                    )
                );
                item++;
            }
            printWriter.close();
        }
        catch(IOException e)
        {
            System.err.println("Unable to update record.txt (Booking Database)");
        };
    }

    public ArrayList<Order> configOrderFile()
    {
        ArrayList<Order> bookingsRecord = new ArrayList<>();
        
        File file = new File("src/database/records.txt");
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
                    String[] orderInformation = line.split(", ");
                    Order newBooking = new Order(
                            orderInformation[0],
                            orderInformation[1],
                            orderInformation[2],
                            orderInformation[3].charAt(0),
                            orderInformation[4],
                            orderInformation[5],
                            orderInformation[6],
                            orderInformation[7],
                            LocalDate.parse(orderInformation[9], dateFormatter),
                            LocalDate.parse(orderInformation[10], dateFormatter),
                            orderInformation[11],
                            Float.parseFloat(orderInformation[13]),
                            Boolean.parseBoolean(orderInformation[15])
                    );
                    bookingsRecord.add(newBooking);
                }
            }
        } 
        catch (IOException e)
        {
          System.out.println("Booking record cannot be sent to database.");
        }
        
        return bookingsRecord;
    }
}
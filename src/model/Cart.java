/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.UUID;

abstract class ShoppingGuides {
    protected UUID recordId;
    protected ArrayList<Item> products; 
    protected boolean checkout() {
        return false;
    }
}

/**
 *
 * @author USER
 */
public class Cart extends ShoppingGuides {
    
}

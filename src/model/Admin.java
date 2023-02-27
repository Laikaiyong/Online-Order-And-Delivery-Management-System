/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.parent.User;

/**
 *
 * @author USER
 */
public class Admin extends User{
    /**
    * Constructor
    * For empty new user
    */
    public Admin()
    {
        this.username = "";
        this.personalId = "";
        this.gender = 'U';
        this.password = "";
    }

    /**
    * Constructor
    * For existing Booking Request from Data Reading
     * @param newUsername
     * @param newPersonalId
     * @param newPassword
     * @param newGender
    */
    public Admin(
            String newUsername, 
            String newPersonalId, 
            String newPassword,
            char newGender
    )
    {
        this.username = newUsername;
        this.personalId = newPersonalId;
        this.password = newPassword;
        this.gender = newGender;
    }
    
}

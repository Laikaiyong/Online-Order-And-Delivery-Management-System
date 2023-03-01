/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.UUID;

/**
 *
 * @author USER
 */
public class UUIDGenerator {

    public UUIDGenerator() {
    }
    
    public String generateUniqueKey()
    {
        UUID newRecordId = UUID.randomUUID();
        return newRecordId.toString();
    }
}

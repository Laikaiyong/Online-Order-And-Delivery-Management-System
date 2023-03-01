/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author USER
 */
public class Security {
    private static final String ALGORITHM = "AES";
    private static final String KEY = "128BitRertrieval";
    
    public Security() { }
    
    public String encrypt(String password)
    {
        String encryptedPass = "";
        StringBuilder encryptedPassword = new StringBuilder();
        try 
        {
            Key aesKey = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            
            // Encrypt password
            cipher.init(Cipher.ENCRYPT_MODE, aesKey);
            byte[] encrypted = cipher.doFinal(password.getBytes());
            for (byte b: encrypted)
            {
                encryptedPassword.append((char)b);
            }
            encryptedPass = encryptedPassword.toString();
        }
        catch(InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) 
        {
            System.err.println("Encryption Fail, some error occurs");
        }
      
       return encryptedPass;
    }
    
    public String decrypt(String password)
    {
        //  Decrypt Password          
        byte[] bytePass = new byte[password.length()];
        for (int i = 0; i < password.length(); i++) 
        {
            bytePass[i] = (byte) password.charAt(i);
        }
        
        try 
        {
            Key aesKey = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, aesKey);
            String decrypted = new String(cipher.doFinal(bytePass));
            return decrypted;
        } 
        catch (Exception e) 
        {
            return "Error";
        }
    }
}

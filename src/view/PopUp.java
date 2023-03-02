/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.net.ResponseCache;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class PopUp {
    public void errorMessage(String messageTitle, String content)
    {
        JOptionPane.showMessageDialog(
            null, 
            messageTitle,
            content,
            JOptionPane.ERROR_MESSAGE
        );
    }
    
    public void successMessage(String messageTitle, String content)
    {
        ImageIcon successIcon = new ImageIcon("src/img/successSmall.png");
        JOptionPane.showMessageDialog(
            null, 
           messageTitle, 
           content,
           JOptionPane.INFORMATION_MESSAGE, 
           successIcon
        );
    }
    
    public void infoMessage(String messageTitle, String content)
    {
        JOptionPane.showMessageDialog(
            null, 
           messageTitle,
           content, 
           JOptionPane.INFORMATION_MESSAGE
        );
    }
    
    public int confirmationDialog(String messageTitle, String content)
    {
        int response = JOptionPane.showConfirmDialog(
            null, 
            messageTitle,
            content,
            JOptionPane.YES_NO_OPTION
        );
        return response;
    }
}

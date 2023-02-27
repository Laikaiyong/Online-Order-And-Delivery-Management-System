/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

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
            content, 
            messageTitle, 
            JOptionPane.ERROR_MESSAGE
        );
    }
    
    public void successMessage(String messageTitle, String content)
    {
        ImageIcon successIcon = new ImageIcon("src/img/successSmall.png");
        JOptionPane.showMessageDialog(
            null, 
           content,
           messageTitle, 
           JOptionPane.INFORMATION_MESSAGE, 
           successIcon);
    }
    
    public void infoMessage(String messageTitle, String content)
    {
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.admin;

import java.awt.print.PrinterException;
import javax.swing.JOptionPane;
import service.ShoppingController;
import service.UserController;
import view.Auth;
import view.PopUp;

/**
 *
 * @author USER
 */
public class BusinessDashboard extends javax.swing.JFrame {

    /**
     * Creates new form BusinessDashboard
     */
    public BusinessDashboard() {
        initComponents();
        setupValues();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userText = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        orderText = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        exitButton1 = new javax.swing.JButton();
        dashboardHyperlink1 = new javax.swing.JLabel();
        userManagementHyperlink1 = new javax.swing.JLabel();
        categoryManagementHyperlink1 = new javax.swing.JLabel();
        itemManagementHyperlink1 = new javax.swing.JLabel();
        orderViewHyperlink1 = new javax.swing.JLabel();
        printButton = new javax.swing.JButton();

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delivery_small.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        reportArea.setColumns(20);
        reportArea.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        reportArea.setRows(5);
        reportArea.setText("Summary Report");
        jScrollPane1.setViewportView(reportArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel1.setText("Dashboard");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/small-person.png"))); // NOI18N

        userText.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        userText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userText.setText("Total User");
        userText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cart.png"))); // NOI18N

        orderText.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        orderText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderText.setText("Total Order");
        orderText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(351, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(orderText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(orderText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel5)))
                .addGap(320, 320, 320))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 102));
        jPanel4.setForeground(new java.awt.Color(255, 204, 153));

        exitButton1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        exitButton1.setText("Exit");
        exitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton1ActionPerformed(evt);
            }
        });

        dashboardHyperlink1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        dashboardHyperlink1.setText("Dashboard");
        dashboardHyperlink1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardHyperlink1MouseClicked(evt);
            }
        });

        userManagementHyperlink1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        userManagementHyperlink1.setText("Manage User");
        userManagementHyperlink1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userManagementHyperlink1MouseClicked(evt);
            }
        });

        categoryManagementHyperlink1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        categoryManagementHyperlink1.setText("Manage  Category");
        categoryManagementHyperlink1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryManagementHyperlink1MouseClicked(evt);
            }
        });

        itemManagementHyperlink1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        itemManagementHyperlink1.setText("Manage Item");
        itemManagementHyperlink1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemManagementHyperlink1MouseClicked(evt);
            }
        });

        orderViewHyperlink1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        orderViewHyperlink1.setText("Customer Orders");
        orderViewHyperlink1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderViewHyperlink1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(exitButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(dashboardHyperlink1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(userManagementHyperlink1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoryManagementHyperlink1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemManagementHyperlink1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderViewHyperlink1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(dashboardHyperlink1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(userManagementHyperlink1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(categoryManagementHyperlink1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(itemManagementHyperlink1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(orderViewHyperlink1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(exitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        printButton.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        printButton.setText("Print Report");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printButton))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton1ActionPerformed
        int reply = new PopUp()
        .confirmationDialog(
            "Exit confirmation",
            "Are you sure you want to logout?"
        );
        if (reply == JOptionPane.YES_OPTION)
        {
            dispose();
            new Auth().setVisible(true);
        }
    }//GEN-LAST:event_exitButton1ActionPerformed

    private void dashboardHyperlink1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardHyperlink1MouseClicked
        dispose();
        new BusinessDashboard().setVisible(true);
    }//GEN-LAST:event_dashboardHyperlink1MouseClicked

    private void userManagementHyperlink1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userManagementHyperlink1MouseClicked
        dispose();
        new UserManagement().setVisible(true);
    }//GEN-LAST:event_userManagementHyperlink1MouseClicked

    private void categoryManagementHyperlink1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryManagementHyperlink1MouseClicked
        dispose();
        new CategoryManagement().setVisible(true);
    }//GEN-LAST:event_categoryManagementHyperlink1MouseClicked

    private void itemManagementHyperlink1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemManagementHyperlink1MouseClicked
        dispose();
        new ItemManagement().setVisible(true);
    }//GEN-LAST:event_itemManagementHyperlink1MouseClicked

    private void orderViewHyperlink1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderViewHyperlink1MouseClicked
        dispose();
        new CustomerOrderPaymentView().setVisible(true);
    }//GEN-LAST:event_orderViewHyperlink1MouseClicked

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        try
        {
            boolean complete = reportArea.print();
            if(complete)
            {
                new PopUp().successMessage("Success", "Report Printed Successfully");
            }
            else
            {
                new PopUp().errorMessage("Printing Cancelled", "Report Printing Terminated");
            }
        }
        catch(PrinterException e)
        {
            new PopUp().errorMessage("Printing Error", "Some error occured");
        }
    }//GEN-LAST:event_printButtonActionPerformed

    
    private void setupValues()
    {
        UserController users = new Auth().userController;
        ShoppingController shopping = new Auth().shoppingController;
        
        userText.setText("Total user\n" + Integer.toString(users.admins.size() + users.customers.size() + users.deliveryStaff.size()));
        orderText.setText("Total order\n" + Integer.toString(shopping.orders.size()));
        
        reportArea.setText(
            "Summary report\n\n" + "Users: " + Integer.toString(users.admins.size() + users.customers.size() + users.deliveryStaff.size()) +
            "\nCustomer: " + Integer.toString(users.customers.size()) +
            "\nAdmin: " + Integer.toString(users.admins.size()) +
           "\nDelivery Staff: " + Integer.toString(users.deliveryStaff.size()) +
           "\n\nOrders: " + Integer.toString(shopping.orders.size()) +
           "\nFeedback: " + Integer.toString(shopping.feedback.size()));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BusinessDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusinessDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusinessDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusinessDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusinessDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryManagementHyperlink1;
    private javax.swing.JLabel dashboardHyperlink1;
    private javax.swing.JButton exitButton1;
    private javax.swing.JLabel itemManagementHyperlink1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel orderText;
    private javax.swing.JLabel orderViewHyperlink1;
    private javax.swing.JButton printButton;
    private javax.swing.JTextArea reportArea;
    private javax.swing.JLabel userManagementHyperlink1;
    private javax.swing.JLabel userText;
    // End of variables declaration//GEN-END:variables
}

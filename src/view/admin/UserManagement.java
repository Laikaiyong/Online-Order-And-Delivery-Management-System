/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.admin;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import view.Auth;
import view.PopUp;

/**
 *
 * @author USER
 */
public class UserManagement extends javax.swing.JFrame {

    /**
     * Creates new form UserManagement
     */
    public UserManagement() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel14 = new javax.swing.JPanel();
        exitButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        usersTable = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        firstQuery = new javax.swing.JButton();
        previousQuery = new javax.swing.JButton();
        nextQuery = new javax.swing.JButton();
        lastQuery = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        bookingId = new javax.swing.JLabel();
        customerName = new javax.swing.JTextField();
        personalId = new javax.swing.JTextField();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        updateButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        roleComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel14.setBackground(new java.awt.Color(255, 204, 102));
        jPanel14.setForeground(new java.awt.Color(255, 204, 153));

        exitButton6.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        exitButton6.setText("Exit");
        exitButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(506, Short.MAX_VALUE)
                .addComponent(exitButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        usersTable.addTab("Users", jScrollPane3);

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel2.setText("Username");
        jScrollPane4.setViewportView(jLabel2);

        usersTable.addTab("New User", jScrollPane4);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usersTable, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(usersTable, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        searchButton.setBackground(new java.awt.Color(11, 180, 212));
        searchButton.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchField.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldKeyPressed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel3.setText("ID:");

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel5.setText("IC / Passport:");

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel6.setText("Gender:");

        firstQuery.setBackground(new java.awt.Color(11, 180, 212));
        firstQuery.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        firstQuery.setForeground(new java.awt.Color(240, 240, 240));
        firstQuery.setText("|<");
        firstQuery.setToolTipText("");
        firstQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstQueryActionPerformed(evt);
            }
        });

        previousQuery.setBackground(new java.awt.Color(11, 180, 212));
        previousQuery.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        previousQuery.setForeground(new java.awt.Color(240, 240, 240));
        previousQuery.setText("<");
        previousQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousQueryActionPerformed(evt);
            }
        });

        nextQuery.setBackground(new java.awt.Color(11, 180, 212));
        nextQuery.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        nextQuery.setForeground(new java.awt.Color(240, 240, 240));
        nextQuery.setText(">");
        nextQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQueryActionPerformed(evt);
            }
        });

        lastQuery.setBackground(new java.awt.Color(11, 180, 212));
        lastQuery.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lastQuery.setForeground(new java.awt.Color(240, 240, 240));
        lastQuery.setText(">|");
        lastQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastQueryActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 0, 51));
        deleteButton.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setToolTipText("");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(255, 204, 0));
        updateButton.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        bookingId.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        bookingId.setText("-");

        customerName.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        personalId.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        maleButton.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        maleButton.setText("M");

        femaleButton.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        femaleButton.setText("F");

        updateButton1.setBackground(new java.awt.Color(255, 204, 0));
        updateButton1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        updateButton1.setForeground(new java.awt.Color(255, 255, 255));
        updateButton1.setText("Update");
        updateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel7.setText("Username");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bookingId, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(personalId, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(maleButton)
                                .addGap(92, 92, 92)
                                .addComponent(femaleButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(firstQuery)
                                .addGap(52, 52, 52)
                                .addComponent(previousQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(customerName))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(nextQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)
                                        .addComponent(lastQuery))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(deleteButton)))
                                .addGap(41, 41, 41)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(102, 102, 102)
                    .addComponent(updateButton1)
                    .addContainerGap(291, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bookingId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(personalId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maleButton)
                        .addComponent(femaleButton))
                    .addComponent(jLabel6))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstQuery)
                    .addComponent(nextQuery)
                    .addComponent(lastQuery)
                    .addComponent(previousQuery))
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(317, Short.MAX_VALUE)
                    .addComponent(updateButton1)
                    .addGap(91, 91, 91)))
        );

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel1.setText("Filter");

        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton)
                .addGap(26, 26, 26)
                .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(roleComboBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton6ActionPerformed
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
    }//GEN-LAST:event_exitButton6ActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        searchRecord();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            searchRecord();
        }
    }//GEN-LAST:event_searchFieldKeyPressed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        bookings = new BookingsConfig().bookings;
        if(validDate && updateButton.isEnabled())
        {
            // Initialization + Value retrieval
            boolean proceedable = true;
            String selectedBooking = bookingId.getText();
            char newGender = maleButton.isSelected() ? 'M' : 'F';
            String newCusName = customerName.getText().trim();
            String newPersonalId = personalId.getText().trim();
            String newEmail = email.getText().trim();
            String newContactNumber = contactNumber.getText().trim();

            // Block process if there are empty field
            if(
                newCusName.isEmpty() ||
                newPersonalId.isEmpty() ||
                newEmail.isEmpty() ||
                newContactNumber.isEmpty()
            )
            {
                JOptionPane.showMessageDialog(
                    null,
                    "There are empty field that are required to be filled",
                    "Error Update",
                    JOptionPane.ERROR_MESSAGE
                );
                proceedable = false;
            }
            else
            {
                // Block process for invalid email value
                if(!EmailValidator.isValidEmail(newEmail))
                {
                    JOptionPane.showMessageDialog(
                        null,
                        "Email entered is in invalid format",
                        "Error Update",
                        JOptionPane.ERROR_MESSAGE
                    );
                    proceedable = false;
                }
            }

            // Execute after validation to update record
            if(proceedable)
            {
                Customer newCustomer = new Customer();
                for(Booking record: bookings)
                {
                    if(record.getBookingId().equals(selectedBooking))
                    {
                        // Free old room and change new room to occupied
                        if(
                            record.getStatus().equals("CheckIn")
                            &&
                            !record.getBookedRoom().equals(
                                roomIdCombo.getModel().getSelectedItem().toString()
                            )
                        )
                        {
                            for(Room room: rooms)
                            {
                                if(room.getRoomNumber().equals(record.getBookedRoom()))
                                {
                                    room.setStatus("Available");
                                }
                                else
                                {
                                    if(room.getRoomNumber().equals(
                                        roomIdCombo.getModel().getSelectedItem().toString()
                                    ))
                                    {
                                        room.setStatus("Occupied");
                                    }
                                }
                            }
                        }

                        // update list
                        newCustomer.setName(newCusName);
                        newCustomer.setPersonalId(newPersonalId);
                        newCustomer.setGender(newGender);
                        newCustomer.setEmail(newEmail);
                        newCustomer.setContactNumber(newContactNumber);
                        record.setCustomer(newCustomer);
                        record.setRoom(roomIdCombo.getModel().getSelectedItem().toString());
                        record.setStartDate(startDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                        record.setEndDate(endDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                    }
                }
                new RoomsUpdate().updateRoomDatabase(rooms);
                new BookingController().updateBookingDatabase(bookings);
                ImageIcon successIcon = new ImageIcon("src/img/successSmall.png");
                JOptionPane.showMessageDialog(
                    null,
                    "Record Updated",
                    "Success Update",
                    JOptionPane.INFORMATION_MESSAGE,
                    successIcon
                );
                setVisible(false);
                setVisible(true);
            }
        }
        // Date is not validated or record is not permitted to be edit
        else
        {
            System.out.println("Date is not validated");
            JOptionPane.showMessageDialog(
                null,
                "Please Validate Date or Record is unable to be updated (CheckOut)",
                "Error Update",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if(deleteButton.isEnabled())
        {
            bookings = new BookingsConfig().bookings;
            String selectedBooking = bookingId.getText();

            // Confirmation on Deletion
            if (
                JOptionPane.showConfirmDialog
                (
                    null,
                    "This action can't be undo. Are you sure you want to cancel booking#ID" + String.valueOf(selectedBooking),
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION
                ) == JOptionPane.YES_OPTION
            )
            {
                // Execute on confirmation
                for(Booking record: bookings)
                {
                    if(record.getBookingId().equals(selectedBooking))
                    {
                        if(record.getStatus().equals("CheckIn"))
                        {
                            for(Room room: rooms)
                            {
                                if(room.getRoomNumber().equals(record.getBookedRoom()))
                                {
                                    room.setStatus("Available");
                                }
                            }
                        }
                        bookings.remove(record);
                        break;
                    }
                }
                new RoomsUpdate().updateRoomDatabase(rooms);
                new BookingController().updateBookingDatabase(bookings);
                ImageIcon successIcon = new ImageIcon("src/img/successSmall.png");
                JOptionPane.showMessageDialog(
                    null,
                    "Record Deleted",
                    "Success Deletion",
                    JOptionPane.INFORMATION_MESSAGE,
                    successIcon
                );
                setVisible(false);
                setVisible(true);
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void lastQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastQueryActionPerformed
        int total = bookings.size();
        manipulateForm(total - 1);
    }//GEN-LAST:event_lastQueryActionPerformed

    private void nextQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQueryActionPerformed
        recordNumber++;
        manipulateForm(recordNumber);
    }//GEN-LAST:event_nextQueryActionPerformed

    private void previousQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousQueryActionPerformed
        recordNumber--;
        manipulateForm(recordNumber);
    }//GEN-LAST:event_previousQueryActionPerformed

    private void firstQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstQueryActionPerformed
        manipulateForm(0);
    }//GEN-LAST:event_firstQueryActionPerformed

    private void updateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookingId;
    private javax.swing.JTextField customerName;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitButton6;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JButton firstQuery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton lastQuery;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JButton nextQuery;
    private javax.swing.JTextField personalId;
    private javax.swing.JButton previousQuery;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton updateButton1;
    private javax.swing.JTabbedPane usersTable;
    // End of variables declaration//GEN-END:variables
}

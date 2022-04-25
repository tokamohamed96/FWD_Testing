/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sig.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author EGYPT_LAPTOP
 */
public class InvoiceDialog extends JDialog {
    private JTextField CustomerName;
        private JLabel customer;

    private JTextField Date;
        private JLabel date;
        
    private JButton okBtn;
    private JButton cancelBtn;

    public InvoiceDialog(InvoiceFrame f) {
        customer = new JLabel("Customer Name:");
        CustomerName = new JTextField(20);
        date = new JLabel("Date:");
        Date = new JTextField(20);
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("Ok");
        cancelBtn.setActionCommand("Cancel");
        
        okBtn.addActionListener(f.getInvoiceAction());
        cancelBtn.addActionListener(f.getInvoiceAction());
        setLayout(new GridLayout(3, 2));
        
        add(date);
        add(Date);
        add(customer);
        add(CustomerName);
        add(okBtn);
        add(cancelBtn);
        
        pack();
        
    }

    public JTextField getCustomerName() {
        return CustomerName;
    }

    public JTextField getDate() {
        return Date;
    }

}

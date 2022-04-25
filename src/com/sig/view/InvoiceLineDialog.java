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
public class InvoiceLineDialog extends JDialog{
    private JTextField Product;
        private JLabel product;

    private JTextField count;
        private JLabel Count;

    private JTextField price;
        private JLabel Price;
    private JButton ok;
    private JButton cancel;
    
    public InvoiceLineDialog(InvoiceFrame f) {
        Product = new JTextField(20);
        product = new JLabel("Product: ");
        
        count = new JTextField(20);
        Count = new JLabel("Count: ");
        
        price = new JTextField(20);
        Price = new JLabel("Price: ");
        
        ok = new JButton("OK");
        cancel = new JButton("Cancel");
        
        ok.setActionCommand("New Line");
        cancel.setActionCommand("Cancel Line");
        
        ok.addActionListener(f.getInvoiceAction());
        cancel.addActionListener(f.getInvoiceAction());
        setLayout(new GridLayout(4, 2));
        
        add(product);
        add(Product);
        add(Count);
        add(count);
        add(Price);
        add(price);
        add(ok);
        add(cancel);
        pack();
    }

    public JTextField getProduct() {
        return Product;
    }

    public JTextField getCount() {
        return count;
    }

    public JTextField getPrice() {
        return price;
    }

   

 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sig.model;

import java.util.Date;

/**
 *
 * @author EGYPT_LAPTOP
 */
public class InvoiceLine {
   private int invoiceNumber;
   private String product;
   private double price;
   private int count;
   
   private InvoiceHeader header;

    public InvoiceLine( String product, double price, int count, InvoiceHeader header) {
        this.invoiceNumber = invoiceNumber;
        this.product = product;
        this.price = price;
        this.count = count;
        this.header = header;
    }

    public InvoiceLine() {
    }

  


    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getProduct() {
        return product;
    }

    public void setItem(String item) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public InvoiceHeader getHeader() {
        return header;
    }

    public void setHeader(InvoiceHeader header) {
        this.header = header;
    }
    
    public double getTotal(){
    return price*count;
    }
    
        @Override
    public String toString() {
        return "InvoiceLine{ Invoice number: " + header.getInvoiceNumber()+ ", product=" + product + ", price=" + price + ", count=" + count + '}';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sig.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author EGYPT_LAPTOP
 */
public class InvoiceHeader {
   private int invoiceNumber;
   private String customerName;
   private Date inoiceDate;
       SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");

   private ArrayList <InvoiceLine> lines;

    public InvoiceHeader() {
    }

    public InvoiceHeader(int invoiceNumber, String customerName, Date inoiceDate) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.inoiceDate = inoiceDate;
    }

   

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getInoiceDate() {
        return inoiceDate;
    }

    public void setInoiceDate(Date inoiceDate) {
        this.inoiceDate = inoiceDate;
    }
    
    public double getInvoiceTotal(){
    
        double total = 0.0;
        for(int i =0; i < getLines().size() ; i++){
        total += getLines().get(i).getTotal();
        }
        return total;
    }

    public ArrayList <InvoiceLine> getLines() {
        if(lines == null){
        lines = new ArrayList<>();
        }
        return lines;
    }

    public void setLines(ArrayList <InvoiceLine> lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return "InvoiceHeader{" + "invoiceNumber=" + invoiceNumber + ", inoiceDate=" + date.format(inoiceDate) +", customerName=" + customerName  + '}';
    }

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sig.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author EGYPT_LAPTOP
 */

public class InvoiceHeaderTable extends AbstractTableModel{
private ArrayList<InvoiceHeader> invoicesArray;
    SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
private String[] columnNames = {"Invoice Number", "Invoice Date", "Customer Name", "Total"};
    public InvoiceHeaderTable(ArrayList<InvoiceHeader> invoicesArray) {
        this.invoicesArray = invoicesArray;
    }

    @Override
    public int getRowCount() {
return invoicesArray.size();    }

    @Override
    public int getColumnCount() {
return columnNames.length;      }

    @Override
    public Object getValueAt(int i, int i1) {

        InvoiceHeader invoice = invoicesArray.get(i);
        switch(i1){
            case 0: return invoice.getInvoiceNumber();
            case 1: return date.format(invoice.getInoiceDate());
            case 2: return invoice.getCustomerName();
            case 3: return invoice.getInvoiceTotal();
        }
  
    return "";
    }

    @Override
    public String getColumnName(int column) {

      return columnNames[column];
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sig.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author EGYPT_LAPTOP
 */
public class InvoiceLineTable extends AbstractTableModel{
    private ArrayList<InvoiceLine> lines;
    private String[] columnNames = {"Product", "Price", "count","Total"};

    public InvoiceLineTable(ArrayList<InvoiceLine> linesArray) {
        this.lines = linesArray;
    }


    @Override
    public int getRowCount() {
        return lines == null ? 0 : lines.size();
    }

    @Override
    public int getColumnCount() {
      
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        if(lines == null) return "";
        InvoiceLine line = lines.get(i);
        switch(i1){
            case 0: return line.getProduct();
            case 1: return line.getPrice();
            case 2: return line.getCount();
            case 3: return line.getTotal();
            default: return "";
        }
    }
    @Override
    public String getColumnName(int column) {

      return columnNames[column];
    }
}

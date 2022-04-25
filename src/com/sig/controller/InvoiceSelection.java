/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sig.controller;

import com.sig.model.InvoiceHeader;
import com.sig.model.InvoiceLine;
import com.sig.model.InvoiceLineTable;
import com.sig.view.InvoiceFrame;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author EGYPT_LAPTOP
 */
public class InvoiceSelection implements ListSelectionListener{
private InvoiceFrame f;
    SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");


    public InvoiceSelection(InvoiceFrame f) {
        this.f = f;
    }
    @Override
    public void valueChanged(ListSelectionEvent lse) {
        int selectedIndex = f.getInvoiceHtbl().getSelectedRow();
        System.out.println("Invoice Selected" + selectedIndex);
        if(selectedIndex != -1){
        InvoiceHeader invoiceSelected = f.getInvoicesArray().get(selectedIndex);
        ArrayList <InvoiceLine> lines = invoiceSelected.getLines();
        InvoiceLineTable lineInfo = new InvoiceLineTable(lines);
        f.getInvoiceLtbl().setModel(lineInfo);
        f.setLines(lines);
        f.getInvoiceCustomername().setText(invoiceSelected.getCustomerName());
        f.getInvoiceLine().setText(String.valueOf(invoiceSelected.getInvoiceNumber()));
        f.getInvoicetotal().setText(String.valueOf(invoiceSelected.getInvoiceTotal()));
        f.getInvoiceDate().setText(date.format(invoiceSelected.getInoiceDate()).toString());
    }
    }
}

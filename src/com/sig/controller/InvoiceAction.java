/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sig.controller;

import com.sig.model.InvoiceHeader;
import com.sig.model.InvoiceHeaderTable;
import com.sig.model.InvoiceLine;
import com.sig.model.InvoiceLineTable;
import com.sig.view.InvoiceDialog;
import com.sig.view.InvoiceFrame;
import com.sig.view.InvoiceLineDialog;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author EGYPT_LAPTOP
 */
public class InvoiceAction implements ActionListener {

    private InvoiceFrame f;
    private SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    private InvoiceDialog dialog;
    private InvoiceLineDialog lineDialog;

    @Override
    public void actionPerformed(ActionEvent ae) {

        switch (ae.getActionCommand()) {
            case "Load File": {
                try {
                    try {
                        loadFile();
                    } catch (ParseException ex) {
                        Logger.getLogger(InvoiceAction.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(InvoiceAction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

            case "Save File":
                saveFile();
                break;

            case "Create New Invoice":
                createInvoice();
                break;

            case "Delete Invoice":
                deleteInvoice();
                break;

            case "Create Line":
                createLine();
                break;

            case "Delete Line":
                deleteLine();
                break;
                
            case "Ok":
                 displayDialog();
                  break;
            
            case "Cancel":
                cancelDialog();
                break;
                
            case "New Line":
                OkLine();
                break;
                
            case "Cancel Line":
                CancelLine();
                break;
        }

    }

    public InvoiceAction(InvoiceFrame f) {
        this.f = f;
    }
    
    private void loadFile() throws FileNotFoundException, ParseException {
        JFileChooser c = new JFileChooser();
        try {
            int r = c.showOpenDialog(f);
            if (r == JFileChooser.APPROVE_OPTION) {
                File header = c.getSelectedFile();
                Path filePath = Paths.get(header.getAbsolutePath());
                List<String> fileLines = Files.readAllLines(filePath);
                ArrayList<InvoiceHeader> headers = new ArrayList<>();
                for (String line : fileLines) {

                    String[] array = line.split(",");
                    int num = Integer.parseInt(array[0]);
                    Date invDate = df.parse(array[1]);
                    String name = array[2];

                    InvoiceHeader invhead = new InvoiceHeader(num, name, invDate);
                    headers.add(invhead);

                }
                f.setInvoicesArray(headers);

                r = c.showOpenDialog(f);
                if (r == JFileChooser.APPROVE_OPTION) {
                    File line = c.getSelectedFile();
                    Path linepath = Paths.get(line.getAbsolutePath());
                    List<String> Lines = Files.readAllLines(linepath);
                    ArrayList<InvoiceLine> invoicelines = new ArrayList<>();
                    for (String lines : Lines) {
                        String[] array2 = lines.split(",");
                        int invCode = Integer.parseInt(array2[0]);
                        String product = array2[1];
                        double price = Double.parseDouble(array2[2]);
                        int count = Integer.parseInt(array2[3]);
                        InvoiceHeader inv = f.getInvoice(invCode);
                        InvoiceLine invLines = new InvoiceLine(product, price, count, inv);
                        inv.getLines().add(invLines);
                    }
                }
                InvoiceHeaderTable headerTableModel = new InvoiceHeaderTable(headers);
                f.setNvoiceTable(headerTableModel);
                f.getInvoiceHtbl().setModel(headerTableModel);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(f, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(f, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("Info of Loaded File: ");
        f.PrintInvoicesDetails();
    }

    private void saveFile() {
        ArrayList <InvoiceHeader> invoiceList = f.getInvoicesArray();
        JFileChooser c = new JFileChooser();
        try {
        int r = c.showSaveDialog(f);
        if(r == JFileChooser.APPROVE_OPTION){
        File header = c.getSelectedFile();
            
                FileWriter save = new FileWriter(header);
                String invoicesHeaders = "";
                String inoicesLines = "";
                for(InvoiceHeader h : invoiceList){
                invoicesHeaders += h.toString();
                invoicesHeaders += "\n";
                for(InvoiceLine l : h.getLines()){
                inoicesLines += l.toString();
                inoicesLines += "\n";
                }
                }
               // invoicesHeaders = invoicesHeaders.substring(0, invoicesHeaders.length()-1);
              ///  inoicesLines = inoicesLines.substring(0, inoicesLines.length()-1);
                r = c.showSaveDialog(f);
                File lineFiles = c.getSelectedFile();
                FileWriter lineWrite = new FileWriter(lineFiles);
                save.write(invoicesHeaders);
                lineWrite.write(inoicesLines);
                save.close();
                lineWrite.close();
        }
            } catch (IOException ex) {
               JOptionPane.showMessageDialog(f, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            
               System.out.println("Info of Saved File: ");

                f.PrintInvoicesDetails();
    }

    private void createInvoice() {
         dialog = new InvoiceDialog(f);
        dialog.setVisible(true);
        
    }

    private void deleteInvoice() {
  int selectedInvoice = f.getInvoiceHtbl().getSelectedRow();
        if(selectedInvoice != -1){
        f.getInvoicesArray().remove(selectedInvoice);
             f.getNvoiceTable().fireTableDataChanged();
             f.getInvoiceLtbl().setModel(new InvoiceLineTable(new ArrayList<InvoiceLine>()));
                     f.setLines(null);

        f.getInvoiceCustomername().setText("");
        f.getInvoiceLine().setText("");
        f.getInvoicetotal().setText("");
        f.getInvoiceDate().setText("");
   

        
        }        System.out.println("Info of File After Invoice Deletion: ");

        f.PrintInvoicesDetails();  }

    private void createLine() {

        lineDialog = new InvoiceLineDialog(f);
        lineDialog.setVisible(true);
    }

    private void deleteLine() {

      int selectedLine = f.getInvoiceLtbl().getSelectedRow();
      if(selectedLine != -1){
      f.getLines().remove(selectedLine);
       InvoiceLineTable lineTable = (InvoiceLineTable)f.getInvoiceLtbl().getModel();
       f.getInvoicetotal().setText(""+f.getInvoicesArray().get(selectedLine).getInvoiceTotal());
 lineTable.fireTableDataChanged();
 f.getNvoiceTable().fireTableDataChanged();
  f.getInvoiceHtbl().setRowSelectionInterval(selectedLine, selectedLine);

 
      }        System.out.println("Info of File After Line Deletion: ");

              f.PrintInvoicesDetails();
    }

    private void displayDialog() {
dialog.setVisible(false);
String customer = dialog.getCustomerName().getText();
String date = dialog.getDate().getText();
Date d = new Date();
        try {
            d = df.parse(date);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(f,"Invalid Date", "Date format", JOptionPane.ERROR_MESSAGE);
        }


     int num = 0;
     for(InvoiceHeader invoiceNumber : f.getInvoicesArray()){
     
     if(invoiceNumber.getInvoiceNumber() > num){
     num = invoiceNumber.getInvoiceNumber();
     }
     }
     num++;
     InvoiceHeader invoice = new InvoiceHeader(num, customer, d);
     f.getInvoicesArray().add(invoice);
     f.getNvoiceTable().fireTableDataChanged();

        dialog.dispose();
        dialog = null;    }

    private void cancelDialog() {
        dialog.setVisible(false);
        dialog.dispose();
        dialog = null;
    }

    private void OkLine() {
lineDialog.setVisible(false);
 String product = lineDialog.getProduct().getText();
 int count = Integer.parseInt(lineDialog.getCount().getText());
 double price = Double.parseDouble(lineDialog.getPrice().getText());
 int selectedHeader = f.getInvoiceHtbl().getSelectedRow();
 if (selectedHeader != -1){
 InvoiceHeader h = f.getInvoicesArray().get(selectedHeader);
 InvoiceLine l = new InvoiceLine(product, price, count, h);
 f.getLines().add(l);
 InvoiceLineTable lineTable = (InvoiceLineTable)f.getInvoiceLtbl().getModel();
 lineTable.fireTableDataChanged();
 f.getNvoiceTable().fireTableDataChanged();
 }
 f.getInvoiceHtbl().setRowSelectionInterval(selectedHeader, selectedHeader);
        lineDialog.dispose();
        lineDialog = null;   
        f.PrintInvoicesDetails(); }

    private void CancelLine() {
lineDialog.setVisible(false);
        lineDialog.dispose();
        lineDialog = null;    }

}

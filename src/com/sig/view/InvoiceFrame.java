/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sig.view;

import com.sig.controller.InvoiceAction;
import com.sig.controller.InvoiceSelection;
import com.sig.model.InvoiceHeader;
import com.sig.model.InvoiceHeaderTable;
import com.sig.model.InvoiceLine;
import com.sig.model.InvoiceLineTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author EGYPT_LAPTOP
 */
public class InvoiceFrame extends javax.swing.JFrame {

    /**
     * Creates new form InvoiceFrame
     */
    public InvoiceFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceHtbl = new javax.swing.JTable();
        createinvoice = new javax.swing.JButton();
        deleteinvoice = new javax.swing.JButton();
        invoicelabel = new javax.swing.JLabel();
        datelabel = new javax.swing.JLabel();
        customernamelabel = new javax.swing.JLabel();
        totallabel = new javax.swing.JLabel();
        invoiceLine = new javax.swing.JLabel();
        InvoiceDate = new javax.swing.JLabel();
        invoiceCustomername = new javax.swing.JLabel();
        invoicetotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        invoiceLtbl = new javax.swing.JTable();
        createlinebutton = new javax.swing.JButton();
        deletelinebutton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadfile = new javax.swing.JMenuItem();
        savefile = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoiceHtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        invoiceHtbl.getSelectionModel().addListSelectionListener(invoiceSelect);
        jScrollPane1.setViewportView(invoiceHtbl);

        createinvoice.setText("Create New Invoice");
        createinvoice.addActionListener(invoiceAction);

        deleteinvoice.setText("Delete Invoice");
        deleteinvoice.addActionListener(invoiceAction);

        invoicelabel.setText("Invoice No:");

        datelabel.setText("Invoice Date");

        customernamelabel.setText("Customer Name");

        totallabel.setText("Total");

        invoiceLtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(invoiceLtbl);

        createlinebutton.setText("Create Line");
        createlinebutton.addActionListener(invoiceAction);

        deletelinebutton.setText("Delete Line");
        deletelinebutton.addActionListener(invoiceAction);

        jMenu1.setText("File");

        loadfile.setText("Load File");
        loadfile.addActionListener(invoiceAction);
        jMenu1.add(loadfile);

        savefile.setText("Save File");
        savefile.addActionListener(invoiceAction);
        jMenu1.add(savefile);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(customernamelabel)
                            .addComponent(invoicelabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datelabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totallabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(invoiceLine)
                            .addComponent(InvoiceDate)
                            .addComponent(invoiceCustomername)
                            .addComponent(invoicetotal)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(createinvoice)
                .addGap(116, 116, 116)
                .addComponent(deleteinvoice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createlinebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(deletelinebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoicelabel)
                            .addComponent(invoiceLine))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datelabel)
                            .addComponent(InvoiceDate))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customernamelabel)
                            .addComponent(invoiceCustomername))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totallabel)
                            .addComponent(invoicetotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createinvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteinvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createlinebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletelinebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InvoiceDate;
    private javax.swing.JButton createinvoice;
    private javax.swing.JButton createlinebutton;
    private javax.swing.JLabel customernamelabel;
    private javax.swing.JLabel datelabel;
    private javax.swing.JButton deleteinvoice;
    private javax.swing.JButton deletelinebutton;
    private javax.swing.JLabel invoiceCustomername;
    private javax.swing.JTable invoiceHtbl;
    private javax.swing.JLabel invoiceLine;
    private javax.swing.JTable invoiceLtbl;
    private javax.swing.JLabel invoicelabel;
    private javax.swing.JLabel invoicetotal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadfile;
    private javax.swing.JMenuItem savefile;
    private javax.swing.JLabel totallabel;
    // End of variables declaration//GEN-END:variables

    private InvoiceAction invoiceAction = new InvoiceAction(this);
    private ArrayList<InvoiceHeader> invoicesArray;
    private ArrayList<InvoiceLine> lines;

    public ArrayList<InvoiceLine> getLines() {
        return lines;
    }

    public InvoiceLineTable getLineTable() {
        return LineTable;
    }

    public void setLineTable(InvoiceLineTable LineTable) {
        this.LineTable = LineTable;
    }

    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }
    private InvoiceHeaderTable invoiceTable;
    private InvoiceLineTable LineTable;
    private InvoiceSelection invoiceSelect = new InvoiceSelection(this);

    public JLabel getInvoiceCustomername() {
        return invoiceCustomername;
    }

    public JLabel getInvoiceLine() {
        return invoiceLine;
    }

    public JLabel getInvoiceDate() {
        return InvoiceDate;
    }

   

    public JLabel getInvoicetotal() {
        return invoicetotal;
    }

    public void setInvoicesArray(ArrayList<InvoiceHeader> invoicesArray) {
        this.invoicesArray = invoicesArray;
    }

    public ArrayList<InvoiceHeader> getInvoicesArray() {
        return invoicesArray;
    }
    

    public InvoiceHeader getInvoice(int num) {

        for (InvoiceHeader invoice : invoicesArray) {
            if (invoice.getInvoiceNumber() == num) {
                return invoice;
            }
        }
        return null;
    }

    public InvoiceHeaderTable getNvoiceTable() {
        return invoiceTable;
    }
    

    public void setNvoiceTable(InvoiceHeaderTable invoiceTable) {
        this.invoiceTable = invoiceTable;
    }

    public JTable getInvoiceHtbl() {
        return invoiceHtbl;
    }

    public JTable getInvoiceLtbl() {
        return invoiceLtbl;
    }

    public InvoiceAction getInvoiceAction() {
        return invoiceAction;
    }

   

}

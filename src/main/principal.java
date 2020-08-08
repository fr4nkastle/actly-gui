/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.beans.PropertyVetoException;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import sqlite.Sqlite;

/**
 *
 * @author fr4nk
 */
public class principal extends javax.swing.JFrame {
    
    public Sqlite db;
    public Iagendar fAgendar;
    public Idesarrollo fDesarrollo;
    private Iestudio fEstudio;
    
    public principal() {
        db = new Sqlite(getUrl());
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        tblDB = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDBclases = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tblDB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "IdTema", "IdClase", "Titulo", "Concepto", "ImgConcepto", "Pregunta", "ImgPregunta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDB.setEnabled(false);
        tblDB.getTableHeader().setReorderingAllowed(false);

        tblDBclases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(tblDBclases);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(257, 688, Short.MAX_VALUE)
                .addComponent(tblDB, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(557, 557, 557)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 131, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(294, Short.MAX_VALUE)
                .addComponent(tblDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        if (tblDB.getColumnModel().getColumnCount() > 0) {
            tblDB.getColumnModel().getColumn(1).setHeaderValue("IdTema");
            tblDB.getColumnModel().getColumn(3).setHeaderValue("Titulo");
            tblDB.getColumnModel().getColumn(4).setHeaderValue("Concepto");
            tblDB.getColumnModel().getColumn(5).setHeaderValue("ImgConcepto");
            tblDB.getColumnModel().getColumn(6).setHeaderValue("Pregunta");
            tblDB.getColumnModel().getColumn(7).setHeaderValue("ImgPregunta");
        }

        jDesktopPane2.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Agenda");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu1MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Crear");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu2MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        db.connect();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        db.close();
    }//GEN-LAST:event_formWindowClosing

    public String[][] extractColumns(String columName,JTable tblDB){
        String query="SELECT * FROM %s";
        String clases[][];
        tblDB.setModel(DbUtils.resultSetToTableModel(db.select(String.format(query,columName))));
        int numRows=tblDB.getRowCount();
        clases= new String[numRows][2];
        for(int c=0; c<numRows; c++){
            for(int cc=0;cc<2; cc++){
                clases[c][cc]=tblDB.getValueAt(c,cc).toString();
            }
            
        }
        return clases;
    }
    
    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed
        String clases[][]=extractColumns("clases",this.tblDBclases);

        
        
        
        
        fAgendar = new Iagendar(this, db, clases);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)fAgendar.getUI()).setNorthPane(null);
        fAgendar.show();
        this.jDesktopPane1.add(fAgendar);
        
        try {
            fAgendar.setMaximum(true);
        } catch (PropertyVetoException ex) { 
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Para cerrar otros internals
//         if(fDesarrollo!=null)
//             this.fDesarrollo.dispose();
    }//GEN-LAST:event_jMenu1MousePressed

    private void jMenu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MousePressed
        fDesarrollo = new Idesarrollo(db);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)fDesarrollo.getUI()).setNorthPane(null);
        fDesarrollo.show();
        this.jDesktopPane1.add(fDesarrollo);
        
        try {
            fDesarrollo.setMaximum(true);
        } catch (PropertyVetoException ex) { 
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Para cerrar otros internals
//         if(fAgendar!=null)
//            this.fAgendar.dispose();
    }//GEN-LAST:event_jMenu2MousePressed

    
    public void addInternal(Iestudio fEstudio){
        
        ((javax.swing.plaf.basic.BasicInternalFrameUI)fEstudio.getUI()).setNorthPane(null);
        fEstudio.show();
        this.jDesktopPane1.add(fEstudio);
        
        try {
            fEstudio.setMaximum(true);
        } catch (PropertyVetoException ex) { 
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Para cerrar otros internals
//         if(fAgendar!=null)
//            this.fAgendar.dispose();
    }
    /**
     * @param args the command line arguments
     */
    
    private static String getUrl(){
        String OS = System.getProperty("os.name").toLowerCase();
        File f = new File("src/db/actly.db");
        String path = f.getAbsolutePath();
        String driver= "jdbc:sqlite:%s";
        String url=null;
        
        if(OS.indexOf("win") >= 0){
            f = new File("src//db//actly.db");
            url=String.format(driver,path);
            //Formatear string para encontrar url si no devolvera null
        }else if(OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 ){
            url=String.format(driver,path);
        }
        return url;
    }
    
    
    public static void main(String args[]) {
        //Extrayendo la ruta dependiendo del OS
       
        
        
        
        
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDB;
    private javax.swing.JTable tblDBclases;
    // End of variables declaration//GEN-END:variables
}
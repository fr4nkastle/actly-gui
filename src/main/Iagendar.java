package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NoeOGM
 */
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import sqlite.Sqlite;
public class Iagendar extends javax.swing.JInternalFrame {

    /**
     * Creates new form int1
     */
    private principal fmain;
    private Sqlite db;   
    public Iagendar(principal fmain, Sqlite db) {
        this.fmain= fmain;
        this.db= db;
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
        jTable1 = new javax.swing.JTable();
        cboxClases = new javax.swing.JComboBox<>();
        cboxTemas = new javax.swing.JComboBox<>();
        cboxSubtemas = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setPreferredSize(new java.awt.Dimension(1019, 532));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Test", "Test", "Test"}
            },
            new String [] {
                "Tema", "Asignatura", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        cboxClases.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clases" }));
        cboxClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxClasesActionPerformed(evt);
            }
        });

        cboxTemas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Temas" }));
        cboxTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTemasActionPerformed(evt);
            }
        });

        cboxSubtemas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Subtemas" }));
        cboxSubtemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxSubtemasActionPerformed(evt);
            }
        });

        jButton1.setText("Agendar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboxTemas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboxClases, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboxSubtemas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboxClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboxTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboxSubtemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
//        int row, col;
//        row=this.jTable1.getSelectedRow();
//        col=this.jTable1.getSelectedColumn();
//        String data =this.jTable1.getValueAt(row,col).toString();
//        
//        Iestudio fEstudio = new Iestudio(data);
//        fmain.add(fEstudio);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        int row, col;
        row=this.jTable1.getSelectedRow();
        col=this.jTable1.getSelectedColumn();
        String data =this.jTable1.getValueAt(row,col).toString();
        Iestudio fEstudio = new Iestudio(data);
        fmain.addInternal(fEstudio);
        
    }//GEN-LAST:event_jTable1MousePressed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        this.cboxClases.addItem(fmain.getTBLclases().getValueAt(0,1).toString());
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void cboxTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTemasActionPerformed

        //Extraer el id de la clase y del tema seleccionado
        int indexClase= this.cboxClases.getSelectedIndex();
        int indexTema= this.cboxTemas.getSelectedIndex();
        if(indexClase>0 && indexTema>0){
            String idClase= fmain.getTBLclases().getValueAt(indexClase-1,0).toString();
            String idTema= fmain.getTBLtemas().getValueAt(indexTema-1,0).toString();
            //Extraer los subtemas de la clase seleccionada
            String cSubtemas[]={"id_subtema","titulo"};
            fmain.extractColumns("subtemas", cSubtemas, fmain.getTBLsubtemas(), "WHERE id_clase="+idClase + " and id_tema= "+ idTema);

            //Mostrar los subtemas de la clase seleccionada en el cboxTemas
             int indexTblSubtemas = fmain.getTBLsubtemas().getRowCount();

            for(int c=0; c<indexTblSubtemas; c++){
                this.cboxSubtemas.addItem(fmain.getTBLsubtemas().getValueAt(c,1).toString());
            }
        }
        
    }//GEN-LAST:event_cboxTemasActionPerformed

    private void cboxSubtemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxSubtemasActionPerformed
        
        
        
    }//GEN-LAST:event_cboxSubtemasActionPerformed

    private void cboxClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxClasesActionPerformed
        //Extraer el id de la clase y del tema seleccionado
        int indexClase= this.cboxClases.getSelectedIndex();
        
        if(indexClase>0){
            String idClase= fmain.getTBLclases().getValueAt(indexClase-1,0).toString();
            //Extraer los subtemas de la clase seleccionada
            String cTemas[]={"id_tema","nombre_tema"};
            fmain.extractColumns("temas", cTemas, fmain.getTBLtemas(), "WHERE id_clase="+idClase);
            
            //Mostrar los temas de la clase seleccionada en el cboxTemas
         int indexTblTemas = fmain.getTBLtemas().getRowCount();
                
        for(int c=0; c<indexTblTemas; c++){
            this.cboxTemas.addItem(fmain.getTBLtemas().getValueAt(c,1).toString());
        }
        }
    }//GEN-LAST:event_cboxClasesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboxClases;
    private javax.swing.JComboBox<String> cboxSubtemas;
    private javax.swing.JComboBox<String> cboxTemas;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

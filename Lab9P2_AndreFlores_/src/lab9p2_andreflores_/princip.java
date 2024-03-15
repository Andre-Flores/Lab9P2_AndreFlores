/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab9p2_andreflores_;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author andre
 */
public class princip extends javax.swing.JFrame {

    /**
     * Creates new form princip
     */
    public princip() {
        initComponents();
        
        horayfecha = new HiloHora(LabelFechaDeHoy, LabelHiloHoraActual);
        horayfecha.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondoRojo = new javax.swing.JPanel();
        panelBlanco = new javax.swing.JPanel();
        labelTituloHoraActual = new javax.swing.JLabel();
        LabelBienvenido = new javax.swing.JLabel();
        LabelFechaDeHoy = new javax.swing.JLabel();
        LabelHiloFechaHoy = new javax.swing.JLabel();
        LabelHiloHoraActual = new javax.swing.JLabel();
        LabelTituloBoroaCloud = new javax.swing.JLabel();
        BotonSubirArchivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaArchivo = new javax.swing.JTextArea();
        BotonGuardar = new javax.swing.JButton();
        barri = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondoRojo.setBackground(new java.awt.Color(255, 153, 153));
        PanelFondoRojo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBlanco.setBackground(new java.awt.Color(255, 255, 255));

        labelTituloHoraActual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTituloHoraActual.setForeground(new java.awt.Color(0, 0, 0));
        labelTituloHoraActual.setText("Hora Actual");

        LabelBienvenido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelBienvenido.setForeground(new java.awt.Color(0, 0, 0));
        LabelBienvenido.setText("Bienvenido");

        LabelFechaDeHoy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelFechaDeHoy.setForeground(new java.awt.Color(0, 0, 0));
        LabelFechaDeHoy.setText("Fecha de hoy");

        LabelHiloFechaHoy.setBackground(new java.awt.Color(0, 102, 255));
        LabelHiloFechaHoy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelHiloFechaHoy.setForeground(new java.awt.Color(0, 0, 0));
        LabelHiloFechaHoy.setText(" ");

        LabelHiloHoraActual.setText("                ");

        javax.swing.GroupLayout panelBlancoLayout = new javax.swing.GroupLayout(panelBlanco);
        panelBlanco.setLayout(panelBlancoLayout);
        panelBlancoLayout.setHorizontalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelHiloHoraActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LabelFechaDeHoy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTituloHoraActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelHiloFechaHoy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                    .addContainerGap(28, Short.MAX_VALUE)
                    .addComponent(LabelBienvenido)
                    .addGap(25, 25, 25)))
        );
        panelBlancoLayout.setVerticalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(LabelFechaDeHoy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelHiloFechaHoy)
                .addGap(56, 56, 56)
                .addComponent(labelTituloHoraActual)
                .addGap(18, 18, 18)
                .addComponent(LabelHiloHoraActual, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
            .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBlancoLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(LabelBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(402, Short.MAX_VALUE)))
        );

        PanelFondoRojo.add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 510));

        LabelTituloBoroaCloud.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelTituloBoroaCloud.setForeground(new java.awt.Color(0, 0, 0));
        LabelTituloBoroaCloud.setText("Boroa Cloud");
        PanelFondoRojo.add(LabelTituloBoroaCloud, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        BotonSubirArchivo.setBackground(new java.awt.Color(255, 255, 255));
        BotonSubirArchivo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonSubirArchivo.setForeground(new java.awt.Color(0, 0, 0));
        BotonSubirArchivo.setText("Subir archivo");
        BotonSubirArchivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonSubirArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSubirArchivoMouseClicked(evt);
            }
        });
        PanelFondoRojo.add(BotonSubirArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        TextAreaArchivo.setColumns(20);
        TextAreaArchivo.setRows(5);
        jScrollPane1.setViewportView(TextAreaArchivo);

        PanelFondoRojo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 250, 260));

        BotonGuardar.setBackground(new java.awt.Color(255, 255, 255));
        BotonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonGuardar.setForeground(new java.awt.Color(0, 0, 0));
        BotonGuardar.setText("Guardar");
        BotonGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGuardarMouseClicked(evt);
            }
        });
        PanelFondoRojo.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));
        PanelFondoRojo.add(barri, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 250, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondoRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondoRojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSubirArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSubirArchivoMouseClicked
        barri.setValue(0);
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro
                    = new FileNameExtensionFilter(
                            "", "txt");
            jfc.setFileFilter(filtro);
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();
                Scanner leedor = new Scanner(fichero);
                String archivo = "";
                while (leedor.hasNextLine()) {
                    
                    archivo += leedor.nextLine() + "\n";
                    
                }
                HiloProgressBar barra = new HiloProgressBar(barri, TextAreaArchivo, archivo);
                barra.start();
                
            } //fin if

        } catch (Exception e) {
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSubirArchivoMouseClicked

    private void BotonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseClicked
        if (fichero != null) {
            try {
                
                FileWriter fw = new FileWriter(fichero);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(TextAreaArchivo.getText());
                bw.flush();
                fw.close();
                bw.close();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "vaya vea porno");
        }

    }//GEN-LAST:event_BotonGuardarMouseClicked

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
            java.util.logging.Logger.getLogger(princip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(princip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(princip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(princip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new princip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonSubirArchivo;
    private javax.swing.JLabel LabelBienvenido;
    private javax.swing.JLabel LabelFechaDeHoy;
    private javax.swing.JLabel LabelHiloFechaHoy;
    private javax.swing.JLabel LabelHiloHoraActual;
    private javax.swing.JLabel LabelTituloBoroaCloud;
    private javax.swing.JPanel PanelFondoRojo;
    private javax.swing.JTextArea TextAreaArchivo;
    private javax.swing.JProgressBar barri;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTituloHoraActual;
    private javax.swing.JPanel panelBlanco;
    // End of variables declaration//GEN-END:variables
File fichero;
    HiloProgressBar barra;
    HiloHora horayfecha;
}
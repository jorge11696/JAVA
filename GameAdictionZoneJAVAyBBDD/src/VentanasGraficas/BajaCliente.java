package VentanasGraficas;

import ADO.*;
import MisListas.*;
import Exceptions.*;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class BajaCliente extends javax.swing.JFrame {

    ConectaBBDD conCli = new ConectaBBDD();
    ConectaBBDD conAlq = new ConectaBBDD();

    public BajaCliente() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLDni = new javax.swing.JLabel();
        MaskFormatter maskDNI = null; try {
            maskDNI = new MaskFormatter("########?"); } catch (Exception ex){
            ex.printStackTrace(); }
        jFormattedDniBusca = new JFormattedTextField(maskDNI);
        jLErrorDni = new javax.swing.JLabel();
        jButtonValidar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLDni.setText("Dni:");

        jButtonValidar.setText("Validar");
        jButtonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarActionPerformed(evt);
            }
        });

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/elminar.png"))); // NOI18N
        jButtonEliminar.setEnabled(false);
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLDni)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedDniBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLErrorDni, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButtonValidar)
                        .addGap(67, 67, 67)
                        .addComponent(jButtonEliminar)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLDni)
                            .addComponent(jFormattedDniBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLErrorDni, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addComponent(jButtonValidar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jButtonEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarActionPerformed
        boolean sw = true;
        String dniBusca;
        try {
            dniBusca = jFormattedDniBusca.getText();
            MiLibreria.checkDni(dniBusca);
            jLErrorDni.setText("");
        } catch (ExDni e) {
            jLErrorDni.setText(e.getMessage());
            jLErrorDni.setForeground(Color.red);
            jFormattedDniBusca.requestFocus();
            sw = false;
        }
        if (sw) {
            jButtonEliminar.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonValidarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int rc = -1;
        String sentSql = "", sentSqlAlq = "";
        String[] buttons = {"Si", "No"};
        String dniCliBusca = jFormattedDniBusca.getText();

        
        try {
            conCli.conecta();
            conCli.crearSentencia();
            sentSql = "SELECT * FROM clientes WHERE dniCliente = '" + dniCliBusca + "'";
            System.out.println(sentSql);
            conCli.ejecutaSQL(sentSql);
            if (conCli.irSiguiente()) {
                // lo hemos encontrado
                try {
                    rc = JOptionPane.showOptionDialog(this, "Realmente desea borrar el registro con ID = [" + dniCliBusca + "]?",
                            "Confirmation", JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);
                    System.out.println(rc);
                    if (rc == 0) {
                        conAlq.conecta();
                        conAlq.crearSentencia();
                        sentSqlAlq = "SELECT * FROM alquiler WHERE dni = '" + dniCliBusca + "'";
                        System.out.println(sentSqlAlq);
                        conAlq.ejecutaSQL(sentSqlAlq);
                        if (conAlq.irSiguiente()) {
                            //lo hemos encontrado
                            JOptionPane.showMessageDialog(this, "No se puede borrar el cliente ya que tiene algun articulo alquilado", "Atencion!", JOptionPane.WARNING_MESSAGE);
                            jFormattedDniBusca.requestFocus();
                            
                        } else{
                        conCli.eliminarCliente(dniCliBusca);
                        JOptionPane.showMessageDialog(this, "Cliente borrado", "Atencion!", JOptionPane.WARNING_MESSAGE);
                        }
                        conAlq.cerrarConexion();
                        conCli.cerrarConexion();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encuentra el cliente en la BBDD", "Atencion!", JOptionPane.WARNING_MESSAGE);
                jFormattedDniBusca.requestFocus();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención!", JOptionPane.ERROR_MESSAGE);
        }
        setVisible(false);
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JFormattedTextField jFormattedDniBusca;
    private javax.swing.JLabel jLDni;
    private javax.swing.JLabel jLErrorDni;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

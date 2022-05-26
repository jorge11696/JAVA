package VentanasGraficas;

import ADO.*;
import Exceptions.ExNegativo;
import Exceptions.ExTipo;
import MisListas.*;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BajaArticulo extends javax.swing.JFrame {

    private Articulo art;
    ConectaBBDD con = new ConectaBBDD();

    public BajaArticulo() {
        initComponents();
        setLocationRelativeTo(null);//Se posiciona la pantalla en el centro de la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLcodArt = new javax.swing.JLabel();
        jTextcodArt = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();
        jLErrorCodArt = new javax.swing.JLabel();
        jButtonValidar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLcodArt.setText("Codigo Articulo:");

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/elminar.png"))); // NOI18N
        jButtonEliminar.setEnabled(false);
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonValidar.setText("Validar");
        jButtonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarActionPerformed(evt);
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
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLcodArt)
                    .addComponent(jButtonValidar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextcodArt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLErrorCodArt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcodArt)
                    .addComponent(jTextcodArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLErrorCodArt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminar))
                    .addComponent(jButtonValidar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // buscamos el ordenador a borrar por su codigo articulo
        int rc = -1;
        String sentSql = "";
        String[] buttons = {"Si", "No"};
        int codArt = Integer.parseInt(jTextcodArt.getText());
       
            // buscamos el ordenador a borrar
            try {
                con.conecta();
                con.crearSentencia();
                sentSql = "SELECT * FROM articulos WHERE codArt = " + codArt;
                System.out.println(sentSql);
                con.ejecutaSQL(sentSql);
                if (con.irSiguiente()) {
                    // lo hemos encontrado
                    try {
                        rc = JOptionPane.showOptionDialog(this, "Realmente desea borrar el registro con ID = [" + codArt + "]?",
                                "Confirmation", JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);
                        System.out.println(rc);
                        if (rc == 0) {
                            //sentSql = "DELETE FROM articulos WHERE codArt = " + codArt;
                            //System.out.println(sentSql); 
                            //con.updateSQL(sentSql);
                            con.eliminarArticulo(codArt);
                            con.cerrarConexion();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se encuentra el codigo de articulos en la BBDD", "Atencion!", JOptionPane.WARNING_MESSAGE);
                    jTextcodArt.requestFocus();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención!", JOptionPane.ERROR_MESSAGE);
            }
        setVisible(false);
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarActionPerformed
        boolean sw = true;
        int codArt;
        try {
            codArt = Integer.parseInt(jTextcodArt.getText());
            MiLibreria.checkNegativo(codArt);
            jLErrorCodArt.setText("");
        } catch (ExNegativo e) {
            jLErrorCodArt.setText(e.getMessage());
            jLErrorCodArt.setForeground(Color.red);
            jTextcodArt.requestFocus();
            sw = false;
        } catch (NumberFormatException e) {
            jLErrorCodArt.setText("Solo numeros!");
            jLErrorCodArt.setForeground(Color.red);
            jTextcodArt.requestFocus();
            sw = false;
        }
        if (sw) {
            jButtonEliminar.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonValidarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLErrorCodArt;
    private javax.swing.JLabel jLcodArt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextcodArt;
    // End of variables declaration//GEN-END:variables
}

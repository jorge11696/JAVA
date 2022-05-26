package VentanasGraficas;

import ADO.*;
import Exceptions.*;
import MisListas.*;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class DevolverAlquiler extends javax.swing.JFrame {

    ConectaBBDD conCli = new ConectaBBDD();
    ConectaBBDD conArt = new ConectaBBDD();
    ConectaBBDD conAlq = new ConectaBBDD();
    private Cliente cli;
    private Articulo art;
    private Alquiler alq;

    public DevolverAlquiler() {

        initComponents();
        setLocationRelativeTo(null);//Se posiciona la pantalla en el centro de la pantalla
        jPanelFactura.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLDniBusca = new javax.swing.JLabel();
        MaskFormatter maskDNI = null; try {  maskDNI = new MaskFormatter("########?"); } catch (Exception ex){  ex.printStackTrace(); }
        jFormattedDniBusca = new JFormattedTextField(maskDNI);
        jLErrorDniBusca = new javax.swing.JLabel();
        jLcodArtBusca = new javax.swing.JLabel();
        jTextcodArtBusca = new javax.swing.JTextField();
        jLErrorcodArtBusca = new javax.swing.JLabel();
        jButtonValidar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jPanelFactura = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaFactura = new javax.swing.JTextArea();
        jButtonDevolver = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Alquiler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLDniBusca.setText("Dni:");

        jLcodArtBusca.setText("Codigo Articulo:");

        jButtonValidar.setText("Validar");
        jButtonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setEnabled(false);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLDniBusca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jFormattedDniBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLcodArtBusca)
                                .addGap(18, 18, 18)
                                .addComponent(jTextcodArtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLErrorDniBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(jLErrorcodArtBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonValidar)
                        .addGap(55, 55, 55)
                        .addComponent(jButtonBuscar)
                        .addContainerGap(488, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLErrorDniBusca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLDniBusca)
                        .addComponent(jFormattedDniBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcodArtBusca)
                    .addComponent(jTextcodArtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLErrorcodArtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonValidar)
                    .addComponent(jButtonBuscar))
                .addGap(84, 84, 84))
        );

        jPanelFactura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jTextAreaFactura.setColumns(20);
        jTextAreaFactura.setRows(5);
        jScrollPane2.setViewportView(jTextAreaFactura);

        jButtonDevolver.setText("Devolver ");
        jButtonDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFacturaLayout = new javax.swing.GroupLayout(jPanelFactura);
        jPanelFactura.setLayout(jPanelFacturaLayout);
        jPanelFacturaLayout.setHorizontalGroup(
            jPanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFacturaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDevolver)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFacturaLayout.setVerticalGroup(
            jPanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDevolver)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVolver)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelFactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarActionPerformed
        String dniBusca;
        int codArtBusca;
        boolean sw = true;
        try {
            dniBusca = jFormattedDniBusca.getText();
            MiLibreria.checkDni(dniBusca);
            jLErrorDniBusca.setText("");
        } catch (ExDni e) {
            jLErrorDniBusca.setText(e.getMessage());
            jLErrorDniBusca.setForeground(Color.red);
            jFormattedDniBusca.requestFocus();
            sw = false;
        }
        try {
            codArtBusca = Integer.parseInt(jTextcodArtBusca.getText());
            MiLibreria.checkNegativo(codArtBusca);
            jLErrorcodArtBusca.setText("");
        } catch (ExNegativo e) {
            jLErrorcodArtBusca.setText(e.getMessage());
            jLErrorcodArtBusca.setForeground(Color.red);
            jTextcodArtBusca.requestFocus();
            sw = false;
        } catch (NumberFormatException e) {
            jLErrorcodArtBusca.setText(e.getMessage());
            jLErrorcodArtBusca.setForeground(Color.red);
            jTextcodArtBusca.requestFocus();
            sw = false;
        }
        if (sw) {
            jButtonBuscar.setEnabled(true);
        } else {
            jButtonBuscar.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonValidarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String dni, sql;
        int codArt;
        dni = jFormattedDniBusca.getText();
        codArt = Integer.parseInt(jTextcodArtBusca.getText());

        try {
            conCli.conecta();
            conCli.crearSentencia();
            sql = "SELECT * FROM alquiler WHERE dni = '" + dni + "'";
            System.out.println(sql);
            conCli.ejecutaSQL(sql);
            if (conCli.irSiguiente()) { //Que el cliente tenga un alquiler asociado
                //lo hemos encontrado
                conArt.conecta();
                conArt.crearSentencia();
                art = conArt.dameArticuloCodigo(codArt);
                if (art != null) { //Que el articulo exista
                    conAlq.conecta();
                    conAlq.crearSentencia();
                    alq = conAlq.dameAlquilerCodigo(codArt, dni);
                    if (alq != null) { //Que el articulo se encuentre alquilado para efectuar la devolucion
                        //lo hemos encontrado 
                        jTextAreaFactura.setText(alq.muestraInfoAlquiler());
                        jFormattedDniBusca.setEnabled(false);
                        jTextcodArtBusca.setEnabled(false);
                        jPanelFactura.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Lo sentimos! El articulo no se encuentra alquilado!");
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Cliente encontrado!Codigo de Articulo no Existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no dispone de ningun articulo alquilado", "Error", JOptionPane.ERROR_MESSAGE);
            }
            conCli.cerrarConexion();
            conArt.cerrarConexion();
            conAlq.cerrarConexion();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevolverActionPerformed
        int codAlq;
        codAlq = alq.getCodAlq();
        try{
        conAlq.conecta();
        conAlq.crearSentencia();
        if (conAlq.eliminaAlquiler(codAlq) == 1){
            JOptionPane.showMessageDialog(this, "Articulo devuelto");
        } else{
            JOptionPane.showMessageDialog(this, "Articulo no se pudo devolver");
        }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonDevolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonDevolver;
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JFormattedTextField jFormattedDniBusca;
    private javax.swing.JLabel jLDniBusca;
    private javax.swing.JLabel jLErrorDniBusca;
    private javax.swing.JLabel jLErrorcodArtBusca;
    private javax.swing.JLabel jLcodArtBusca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelFactura;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaFactura;
    private javax.swing.JTextField jTextcodArtBusca;
    // End of variables declaration//GEN-END:variables
}

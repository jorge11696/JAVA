package VentanasGraficas;

import ADO.*;
import Exceptions.*;
import MisListas.*;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class AlquilerArticulo extends javax.swing.JFrame {

    private Cliente cli;
    private Articulo art;
    private Alquiler alq;
    ConectaBBDD conCli = new ConectaBBDD();
    ConectaBBDD conArt = new ConectaBBDD();
    ConectaBBDD conAlq = new ConectaBBDD();

    public AlquilerArticulo() {

        initComponents();
        setLocationRelativeTo(null);//Se posiciona la pantalla en el centro de la pantalla
        jDateChooserFechaActual.setCalendar(estableceFechaActual());
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
        jDateChooserFechaActual = new com.toedter.calendar.JDateChooser();
        jLDiasAlq = new javax.swing.JLabel();
        jTextDiasAlq = new javax.swing.JTextField();
        jButtonValidar = new javax.swing.JButton();
        jButtonAlquilar = new javax.swing.JButton();
        jLErrorDiasAlq = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alquiler Articulo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLDniBusca.setText("Dni:");

        jLcodArtBusca.setText("Codigo Articulo:");

        jDateChooserFechaActual.setEnabled(false);

        jLDiasAlq.setText("Dias Alquiler:");

        jButtonValidar.setText("Validar");
        jButtonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarActionPerformed(evt);
            }
        });

        jButtonAlquilar.setText("Alquilar");
        jButtonAlquilar.setEnabled(false);
        jButtonAlquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlquilarActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLDniBusca)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jFormattedDniBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLcodArtBusca)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextcodArtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonValidar)
                                .addGap(63, 63, 63)
                                .addComponent(jButtonAlquilar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLDiasAlq)
                                .addGap(26, 26, 26)
                                .addComponent(jTextDiasAlq, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLErrorDiasAlq, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLErrorDniBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLErrorcodArtBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonVolver)
                                .addGap(31, 31, 31)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
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
                .addComponent(jDateChooserFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDiasAlq)
                    .addComponent(jTextDiasAlq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLErrorDiasAlq, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonValidar)
                    .addComponent(jButtonAlquilar)
                    .addComponent(jButtonVolver))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarActionPerformed
        String dniBusca;
        int diasAlq, codArtBusca;
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
        }
        try {
            diasAlq = Integer.parseInt(jTextDiasAlq.getText());
            MiLibreria.checkNegativo(diasAlq);
            jLErrorDiasAlq.setText("");
        } catch (ExNegativo e) {
            jLErrorDiasAlq.setText(e.getMessage());
            jLErrorDiasAlq.setForeground(Color.red);
            jTextDiasAlq.requestFocus();
            sw = false;
        } catch (NumberFormatException e) {
            jLErrorDiasAlq.setText("Solo numeros!");
            jLErrorDiasAlq.setForeground(Color.red);
            jTextDiasAlq.requestFocus();
        }
        if (sw) {
            jButtonAlquilar.setEnabled(true);
        } else {
            jButtonAlquilar.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonValidarActionPerformed

    private void jButtonAlquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlquilarActionPerformed
        String dni, sql;
        int codArt, resp = -1;
        dni = jFormattedDniBusca.getText();
        codArt = Integer.parseInt(jTextcodArtBusca.getText());
        try {
            conCli.conecta();
            conCli.crearSentencia();
            cli = conCli.dameCliente(dni);
            if (cli != null) { //Que el cliente exista
                conArt.conecta();
                conArt.crearSentencia();
                art = conArt.dameArticuloCodigo(codArt);
                if (art != null) { //Que el articulo exista
                    conAlq.conecta();
                    conAlq.crearSentencia();
                    sql = "SELECT * FROM alquiler WHERE codArt = '" + codArt + "'";
                    System.out.println(sql);
                    conAlq.ejecutaSQL(sql);
                    if (conAlq.irSiguiente()) { //Que el articulo se encuentre o no alquilado
                        //lo hemos encontrado  
                        JOptionPane.showMessageDialog(this, "Lo sentimos! El Articulo está alquilado actualmente");
                    } else {
                        try {
                            alq = new Alquiler(art, Integer.parseInt(jTextDiasAlq.getText()), cli, jDateChooserFechaActual.getDate());
                        } catch (ExNegativo e) {
                            e.printStackTrace();
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Cliente encontrado!Codigo de Articulo no Existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }
            conCli.cerrarConexion();
            conArt.cerrarConexion();
            conAlq.cerrarConexion();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //GUARDA ALQUILER
        try {
            conAlq.conecta();
            conAlq.crearSentencia();
            resp = conAlq.grabaAlquiler(alq);
            System.out.println("respuesta  :" + resp);
            if (resp != -1) {
                JOptionPane.showMessageDialog(this, "Alquiler insertado en la BBDD", "Atencion!", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se ha podido insertar", "Atención!", JOptionPane.ERROR_MESSAGE);
            }
            conAlq.cerrarConexion();
            //restableceDatos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención!", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención!", JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_jButtonAlquilarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlquilar;
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JButton jButtonVolver;
    private com.toedter.calendar.JDateChooser jDateChooserFechaActual;
    private javax.swing.JFormattedTextField jFormattedDniBusca;
    private javax.swing.JLabel jLDiasAlq;
    private javax.swing.JLabel jLDniBusca;
    private javax.swing.JLabel jLErrorDiasAlq;
    private javax.swing.JLabel jLErrorDniBusca;
    private javax.swing.JLabel jLErrorcodArtBusca;
    private javax.swing.JLabel jLcodArtBusca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextDiasAlq;
    private javax.swing.JTextField jTextcodArtBusca;
    // End of variables declaration//GEN-END:variables

    private Calendar estableceFechaActual() {
        Calendar fechaActual; // para almacenar una fecha
        fechaActual = Calendar.getInstance(); // obtiene la fecha actual
        return fechaActual;
    }

}

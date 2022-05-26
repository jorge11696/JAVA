package VentanasGraficas;

import ADO.*;
import Exceptions.*;
import MisListas.*;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class AltaCliente extends javax.swing.JFrame {

    private ConectaBBDD con = new ConectaBBDD();
    private Cliente cli;

    public AltaCliente() {
        
        initComponents();
        setLocationRelativeTo(null);//Se posiciona la pantalla en el centro de la pantalla
        jPanelCliente.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCliente = new javax.swing.JPanel();
        jLDniCli = new javax.swing.JLabel();
        jLNomCli = new javax.swing.JLabel();
        jLApeCli = new javax.swing.JLabel();
        jLDireccionCli = new javax.swing.JLabel();
        jLTlf1 = new javax.swing.JLabel();
        jLTlf2 = new javax.swing.JLabel();
        jTextApeCli = new javax.swing.JTextField();
        jTextNomCli = new javax.swing.JTextField();
        jTextDireccionCli = new javax.swing.JTextField();
        jTextTlf1 = new javax.swing.JTextField();
        jTextTlf2 = new javax.swing.JTextField();
        jLErrorDniCli = new javax.swing.JLabel();
        jLErrorNomCli = new javax.swing.JLabel();
        jLErrorApeCli = new javax.swing.JLabel();
        jLErrorDirCli = new javax.swing.JLabel();
        jLErrorTlf2 = new javax.swing.JLabel();
        jLErrorTlf1 = new javax.swing.JLabel();
        MaskFormatter maskDNI = null; try {
            maskDNI = new MaskFormatter("########?"); } catch (Exception ex){
            ex.printStackTrace(); }
        jFormattedTextDniCli = new JFormattedTextField(maskDNI);
        jPanel2 = new javax.swing.JPanel();
        jButtonValidarTodosCampos = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jPanelBusca = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLErrorDniBusca = new javax.swing.JLabel();
        jButtonBusca = new javax.swing.JButton();
        try {
            maskDNI = new MaskFormatter("########?"); } catch (Exception ex){
            ex.printStackTrace(); }
        jFormattedBuscaDniCli = new JFormattedTextField(maskDNI);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alta Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLDniCli.setText("Dni:");

        jLNomCli.setText("Nombre:");

        jLApeCli.setText("Apellidos:");

        jLDireccionCli.setText("Direccion:");

        jLTlf1.setText("Telefono 1:");

        jLTlf2.setText("Telefono 2:");

        jFormattedTextDniCli.setEnabled(false);

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addComponent(jLTlf2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextTlf2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLErrorTlf2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addComponent(jLTlf1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextTlf1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLErrorTlf1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDniCli)
                            .addComponent(jLNomCli)
                            .addComponent(jLApeCli)
                            .addComponent(jLDireccionCli))
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                                        .addComponent(jTextDireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLErrorDirCli, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                                        .addComponent(jTextApeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLErrorApeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                                        .addComponent(jTextNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLErrorNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jFormattedTextDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLErrorDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLErrorDniCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLDniCli)
                                                .addComponent(jFormattedTextDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLNomCli)
                                            .addComponent(jTextNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLErrorNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLApeCli)
                                    .addComponent(jTextApeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLErrorApeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLDireccionCli)
                            .addComponent(jTextDireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLErrorDirCli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTlf1)
                    .addComponent(jTextTlf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLErrorTlf1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLTlf2)
                        .addComponent(jTextTlf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLErrorTlf2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jButtonValidarTodosCampos.setText("Validar");
        jButtonValidarTodosCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarTodosCamposActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setEnabled(false);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonValidarTodosCampos)
                .addGap(42, 42, 42)
                .addComponent(jButtonGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonValidarTodosCampos)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonVolver))
                .addContainerGap())
        );

        jLabel1.setText("Dni:");

        jLErrorDniBusca.setText(" ");

        jButtonBusca.setText("Buscar");
        jButtonBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBuscaLayout = new javax.swing.GroupLayout(jPanelBusca);
        jPanelBusca.setLayout(jPanelBuscaLayout);
        jPanelBuscaLayout.setHorizontalGroup(
            jPanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jFormattedBuscaDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLErrorDniBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBusca)
                .addGap(37, 37, 37))
        );
        jPanelBuscaLayout.setVerticalGroup(
            jPanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBuscaLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLErrorDniBusca)
                    .addComponent(jButtonBusca)
                    .addComponent(jFormattedBuscaDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValidarTodosCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarTodosCamposActionPerformed
        //DECLARACION VARIABLES
        String dniCli, nombreCli, apeCli, direCli, tlf1, tlf2;
        boolean sw = true;
        //VALIDACIONES CLIENTE
        try {
            dniCli = jFormattedTextDniCli.getText();
            MiLibreria.checkDni(dniCli);
            jLErrorDniCli.setText("");
        } catch (ExDni e) {
            jLErrorDniCli.setText(e.getMessage());
            jLErrorDniCli.setForeground(Color.red);
            jFormattedTextDniCli.requestFocus();
            sw = false;
        }
        try {
            nombreCli = jTextNomCli.getText();
            MiLibreria.checkVacio(nombreCli);
            jLErrorNomCli.setText("");
        } catch (ExVacio e) {
            jLErrorNomCli.setText(e.getMessage());
            jLErrorNomCli.setForeground(Color.red);
            jTextNomCli.requestFocus();
            sw = false;
        }
        try {
            apeCli = jTextApeCli.getText();
            MiLibreria.checkVacio(apeCli);
            jLErrorApeCli.setText("");
        } catch (ExVacio e) {
            jLErrorApeCli.setText(e.getMessage());
            jLErrorApeCli.setForeground(Color.red);
            jTextApeCli.requestFocus();
            sw = false;
        }
        try {
            direCli = jTextDireccionCli.getText();
            MiLibreria.checkVacio(direCli);
            jLErrorDirCli.setText("");
        } catch (ExVacio e) {
            jLErrorDirCli.setText(e.getMessage());
            jLErrorDirCli.setForeground(Color.red);
            jTextDireccionCli.requestFocus();
            sw = false;
        }
        try {
            tlf1 = jTextTlf1.getText();
            MiLibreria.checkTelf(tlf1);
            jLErrorTlf1.setText("");
        } catch (ExTlf e) {
            jLErrorTlf1.setText(e.getMessage());
            jLErrorTlf1.setForeground(Color.red);
            jTextTlf1.requestFocus();
            sw = false;
        }
        try {
            tlf2 = jTextTlf2.getText();
            MiLibreria.checkTelf(tlf2);
            jLErrorTlf2.setText("");
        } catch (ExTlf e) {
            jLErrorTlf2.setText(e.getMessage());
            jLErrorTlf2.setForeground(Color.red);
            jTextTlf2.requestFocus();
            sw = false;
        }
        if (sw) {
            jButtonGuardar.setEnabled(true);
        } else {
            jButtonGuardar.setEnabled(false);
        }

    }//GEN-LAST:event_jButtonValidarTodosCamposActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        //AUTOR
        String dniCli, nombreCli, apeCli, direCli, tlf1, tlf2, tlf3;
        int resp;
        
        dniCli = jFormattedTextDniCli.getText();
        nombreCli = jTextNomCli.getText();
        apeCli = jTextApeCli.getText();
        direCli = jTextDireccionCli.getText();
        tlf1 = jTextTlf1.getText();
        tlf2 = jTextTlf2.getText();

        try {
            cli = new Cliente(dniCli, nombreCli, apeCli, direCli, tlf1, tlf2);
        } catch (ExDni e) {
            System.out.println("Valor capturado: " + e);
        }catch (ExTlf e) {
            System.out.println("Valor capturado: " + e);
        } catch (ExVacio e) {
            System.out.println("Valor capturado: " + e);
        } 
        
        //GUARDA CLIENTE
        try {
            con.conecta();
            con.crearSentencia();
            resp = con.grabaCliente(cli);
            System.out.println("respuesta  :" + resp);
            if (resp != -1) {
                JOptionPane.showMessageDialog(this, "Cliente insertado en la BBDD", "Atencion!", JOptionPane.WARNING_MESSAGE);
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "No se ha podido insertar", "Atención!", JOptionPane.ERROR_MESSAGE);
            }
            con.cerrarConexion();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención!", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaActionPerformed
        String dniCliBusca = "";
        boolean sw = true;
        //VALIDACIONES CLIENTE
        try {
            dniCliBusca = jFormattedBuscaDniCli.getText();
            MiLibreria.checkDni(dniCliBusca);
            jLErrorDniBusca.setText("");
        } catch (ExDni e) {
            jLErrorDniBusca.setText(e.getMessage());
            jLErrorDniBusca.setForeground(Color.red);
            jFormattedBuscaDniCli.requestFocus();
            sw = false;
        }
        if (sw){
            int resp;
            try {
                
                con.conecta();
                con.crearSentencia();
                cli = con.dameCliente(dniCliBusca);
                if (cli == null) {
                    resp = JOptionPane.showConfirmDialog(rootPane, "El Cliente no existe. Desea añadir uno nuevo?", "Cliente", JOptionPane.OK_CANCEL_OPTION);
                    if (resp == 0) {
                        jPanelCliente.setVisible(true);
                        jFormattedTextDniCli.setText(dniCliBusca);
                    }
                    con.cerrarConexion();
                } else {
                    
                    JOptionPane.showMessageDialog(this, "El autor ya existe!", "Atencion!", JOptionPane.WARNING_MESSAGE);
                    setVisible(false);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonBuscaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBusca;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonValidarTodosCampos;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JFormattedTextField jFormattedBuscaDniCli;
    private javax.swing.JFormattedTextField jFormattedTextDniCli;
    private javax.swing.JLabel jLApeCli;
    private javax.swing.JLabel jLDireccionCli;
    private javax.swing.JLabel jLDniCli;
    private javax.swing.JLabel jLErrorApeCli;
    private javax.swing.JLabel jLErrorDirCli;
    private javax.swing.JLabel jLErrorDniBusca;
    private javax.swing.JLabel jLErrorDniCli;
    private javax.swing.JLabel jLErrorNomCli;
    private javax.swing.JLabel jLErrorTlf1;
    private javax.swing.JLabel jLErrorTlf2;
    private javax.swing.JLabel jLNomCli;
    private javax.swing.JLabel jLTlf1;
    private javax.swing.JLabel jLTlf2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBusca;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JTextField jTextApeCli;
    private javax.swing.JTextField jTextDireccionCli;
    private javax.swing.JTextField jTextNomCli;
    private javax.swing.JTextField jTextTlf1;
    private javax.swing.JTextField jTextTlf2;
    // End of variables declaration//GEN-END:variables
}

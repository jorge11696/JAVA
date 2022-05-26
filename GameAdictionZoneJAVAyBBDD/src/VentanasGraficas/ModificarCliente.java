package VentanasGraficas;

import ADO.*;
import Exceptions.*;
import MisListas.*;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class ModificarCliente extends javax.swing.JFrame {

    ConectaBBDD conCli = new ConectaBBDD();
    ConectaBBDD conAlq = new ConectaBBDD();
    private Cliente cli;
    private Alquiler alq;

    public ModificarCliente() {

        initComponents();
        setLocationRelativeTo(null);//Se posiciona la pantalla en el centro de la pantalla
        jPanel2.setVisible(false);
        jButtonValidarTodosCampos.setEnabled(false);
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
        jLErrorDniBuscar = new javax.swing.JLabel();
        jButtonValidar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
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
        maskDNI = null; try {
            maskDNI = new MaskFormatter("########?"); } catch (Exception ex){
            ex.printStackTrace(); }
        jFormattedTextDniCli = new JFormattedTextField(maskDNI);
        jLPuntos = new javax.swing.JLabel();
        jTextPuntos = new javax.swing.JTextField();
        jLErrorDniCli = new javax.swing.JLabel();
        jLErrorNomCli = new javax.swing.JLabel();
        jLErrorApeCli = new javax.swing.JLabel();
        jLErrorDirCli = new javax.swing.JLabel();
        jLErrorTlf1 = new javax.swing.JLabel();
        jLErrorTlf2 = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jButtonValidarTodosCampos = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLDni.setText("Dni:");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLDni)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedDniBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLErrorDniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButtonValidar)
                        .addGap(34, 34, 34)
                        .addComponent(jButtonBuscar)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDni)
                    .addComponent(jFormattedDniBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLErrorDniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonValidar)
                    .addComponent(jButtonBuscar))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mostrar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLDniCli.setText("Dni:");

        jLNomCli.setText("Nombre:");

        jLApeCli.setText("Apellidos:");

        jLDireccionCli.setText("Direccion:");

        jLTlf1.setText("Telefono 1:");

        jLTlf2.setText("Telefono 2:");

        jLPuntos.setText("Puntos");

        jTextPuntos.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLApeCli)
                            .addComponent(jLDireccionCli))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLErrorNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextApeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLErrorApeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jFormattedTextDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLErrorDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextDireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLErrorDirCli, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTlf1)
                            .addComponent(jLTlf2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextTlf2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLErrorTlf2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextTlf1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLErrorTlf1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLDniCli)
                    .addComponent(jLNomCli)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLPuntos)
                        .addGap(18, 18, 18)
                        .addComponent(jTextPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLDniCli)
                                        .addComponent(jFormattedTextDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLErrorDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLNomCli)
                                    .addComponent(jTextNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLErrorNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLApeCli)
                                .addComponent(jTextApeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLErrorApeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLDireccionCli)
                                .addComponent(jTextDireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLErrorDirCli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLTlf1)
                                .addComponent(jTextTlf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLErrorTlf1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTlf2)
                            .addComponent(jTextTlf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLErrorTlf2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPuntos)
                    .addComponent(jTextPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonValidarTodosCampos.setText("Validar");
        jButtonValidarTodosCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarTodosCamposActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.setEnabled(false);
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonValidarTodosCampos)
                .addGap(70, 70, 70)
                .addComponent(jButtonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonValidarTodosCampos)
                    .addComponent(jButtonModificar))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarActionPerformed
        boolean sw = true;
        String dniBusca;
        try {
            dniBusca = jFormattedDniBusca.getText();
            MiLibreria.checkDni(dniBusca);
            jLErrorDniBuscar.setText("");
        } catch (ExDni e) {
            jLErrorDniBuscar.setText(e.getMessage());
            jLErrorDniBuscar.setForeground(Color.red);
            jFormattedDniBusca.requestFocus();
            sw = false;
        }
        if (sw) {
            jButtonBuscar.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonValidarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String dniBusca;
        dniBusca = jFormattedDniBusca.getText();
        try {
            conCli.conecta();
            conCli.crearSentencia();
            cli = conCli.dameCliente(dniBusca);
            if (cli == null) {
                JOptionPane.showMessageDialog(null, "id no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
                jFormattedDniBusca.requestFocus();
            } else {
                jPanel2.setVisible(true);
                jFormattedDniBusca.setEnabled(false);
                jButtonValidarTodosCampos.setEnabled(true);
                cargaCampos(cli);
            }
            conCli.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

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
            jButtonModificar.setEnabled(true);
        } else {
            jButtonModificar.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonValidarTodosCamposActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        Cliente cli;
        int resp;
        String sql, dniBuscar;
        dniBuscar = jFormattedDniBusca.getText();
        try {
            conCli.conecta();
            conCli.crearSentencia();
            cli = obtenCli();
            //Comprobamos si el cliente tiene algun articulo alquilado, ya que se permitira o no la modificacion de su DNI
            conAlq.conecta();
            conAlq.crearSentencia();
            sql = "SELECT * FROM alquiler WHERE dni = '" + dniBuscar + "'";
            System.out.println(sql);
            conAlq.ejecutaSQL(sql);
            if (conAlq.irSiguiente()) {
                //lo hemos encontrado
                if (dniBuscar.equalsIgnoreCase(cli.getDni())) { //Si el dni no se ha modificado se efectura la modificacion
                    resp = conCli.modiCliente(cli,dniBuscar);
                    if (resp == 1) {
                        JOptionPane.showMessageDialog(this, "* * * Ha modificado un Cliente * * * ");
                    } else if (resp == -1) {
                        JOptionPane.showMessageDialog(this, "ERROR: integridad referencial o SQL truncada");
                    } else {
                        JOptionPane.showMessageDialog(this, "* * * no se pudo modificar Cliente * * * ");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se puede modificar el dni ya que tiene algun articulo alquilado, debes mantener el dni " + dniBuscar, "Atencion!", JOptionPane.WARNING_MESSAGE);
                    jFormattedTextDniCli.requestFocus();
                }
            //Si el cliente no tiene ningun articulo alquilado se podra modificar su dni
            } else {
                resp = conCli.modiCliente(cli, dniBuscar);
                if (resp == 1) {
                    JOptionPane.showMessageDialog(this, "* * * Ha modificado un Cliente * * * ");
                } else if (resp == -1) {
                    JOptionPane.showMessageDialog(this, "ERROR: integridad referencial o SQL truncada");
                } else {
                    JOptionPane.showMessageDialog(this, "* * * no se pudo modificar Cliente * * * ");
                }
            }
            conAlq.cerrarConexion();
            conCli.cerrarConexion();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JButton jButtonValidarTodosCampos;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JFormattedTextField jFormattedDniBusca;
    private javax.swing.JFormattedTextField jFormattedTextDniCli;
    private javax.swing.JLabel jLApeCli;
    private javax.swing.JLabel jLDireccionCli;
    private javax.swing.JLabel jLDni;
    private javax.swing.JLabel jLDniCli;
    private javax.swing.JLabel jLErrorApeCli;
    private javax.swing.JLabel jLErrorDirCli;
    private javax.swing.JLabel jLErrorDniBuscar;
    private javax.swing.JLabel jLErrorDniCli;
    private javax.swing.JLabel jLErrorNomCli;
    private javax.swing.JLabel jLErrorTlf1;
    private javax.swing.JLabel jLErrorTlf2;
    private javax.swing.JLabel jLNomCli;
    private javax.swing.JLabel jLPuntos;
    private javax.swing.JLabel jLTlf1;
    private javax.swing.JLabel jLTlf2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextApeCli;
    private javax.swing.JTextField jTextDireccionCli;
    private javax.swing.JTextField jTextNomCli;
    private javax.swing.JTextField jTextPuntos;
    private javax.swing.JTextField jTextTlf1;
    private javax.swing.JTextField jTextTlf2;
    // End of variables declaration//GEN-END:variables

    private void cargaCampos(Cliente cli) {
        //AUTOR
        jFormattedTextDniCli.setText(cli.getDni());
        jTextNomCli.setText(cli.getNombre());
        jTextApeCli.setText(cli.getApellidos());
        jTextDireccionCli.setText(cli.getDireccion());
        jTextTlf1.setText(cli.getTelf1());
        jTextTlf2.setText(cli.getTelf2());
        jTextPuntos.setText(String.valueOf(cli.getPuntos()));
    }

    private Cliente obtenCli() {
        String dniCliente, nombre, apellidos, direccion, telf1, telf2;
        int resp;
        dniCliente = jFormattedTextDniCli.getText();
        nombre = jTextNomCli.getText();
        apellidos = jTextApeCli.getText();
        direccion = jTextDireccionCli.getText();
        telf1 = jTextTlf1.getText();
        telf2 = jTextTlf2.getText();
        //Al tener declaradas las excepciones en los constructores de la clase Autor estoy obligado a declarar
        try {
            cli = new Cliente(dniCliente, nombre, apellidos, direccion, telf1, telf2);
        } catch (ExDni e) {
            e.printStackTrace();
        } catch (ExTlf e) {
            e.printStackTrace();
        } catch (ExVacio e) {
            e.printStackTrace();
        }
        return cli;
    }
}

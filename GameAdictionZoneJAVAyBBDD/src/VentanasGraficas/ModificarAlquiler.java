package VentanasGraficas;

import ADO.*;
import Exceptions.*;
import MisListas.*;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class ModificarAlquiler extends javax.swing.JFrame {

    private Cliente cli;
    private Articulo art;
    private Alquiler alq;
    ConectaBBDD conCli = new ConectaBBDD();
    ConectaBBDD conArt = new ConectaBBDD();
    ConectaBBDD conAlq = new ConectaBBDD();

    public ModificarAlquiler() {

        initComponents();
        setLocationRelativeTo(null);//Se posiciona la pantalla en el centro de la pantalla
        jPanelModificarAlquiler.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBuscaralquiler = new javax.swing.JPanel();
        jLDniBusca = new javax.swing.JLabel();
        MaskFormatter maskDNI = null; try {  maskDNI = new MaskFormatter("########?"); } catch (Exception ex){  ex.printStackTrace(); }
        jFormattedDniBusca = new JFormattedTextField(maskDNI);
        jLErrorDniBusca = new javax.swing.JLabel();
        jLcodArtBusca = new javax.swing.JLabel();
        jTextcodArtBusca = new javax.swing.JTextField();
        jLErrorcodArtBusca = new javax.swing.JLabel();
        jButtonValidar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jPanelModificarAlquiler = new javax.swing.JPanel();
        jLFechaAlq2 = new javax.swing.JLabel();
        jLDiasAlq2 = new javax.swing.JLabel();
        jDateChooserFechaAlq2 = new com.toedter.calendar.JDateChooser();
        jTextDiasAlq2 = new javax.swing.JTextField();
        jLErrorDiasAlquiler = new javax.swing.JLabel();
        jButtonValidarDiasAlq = new javax.swing.JButton();
        jButtonModificarDiasAlq = new javax.swing.JButton();
        jLcodAlq = new javax.swing.JLabel();
        jTextcodAlq = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelBuscaralquiler.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Alquiler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

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

        javax.swing.GroupLayout jPanelBuscaralquilerLayout = new javax.swing.GroupLayout(jPanelBuscaralquiler);
        jPanelBuscaralquiler.setLayout(jPanelBuscaralquilerLayout);
        jPanelBuscaralquilerLayout.setHorizontalGroup(
            jPanelBuscaralquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscaralquilerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBuscaralquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBuscaralquilerLayout.createSequentialGroup()
                        .addGroup(jPanelBuscaralquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelBuscaralquilerLayout.createSequentialGroup()
                                .addComponent(jLDniBusca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jFormattedDniBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBuscaralquilerLayout.createSequentialGroup()
                                .addComponent(jLcodArtBusca)
                                .addGap(18, 18, 18)
                                .addComponent(jTextcodArtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(jPanelBuscaralquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLErrorDniBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(jLErrorcodArtBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelBuscaralquilerLayout.createSequentialGroup()
                        .addComponent(jButtonValidar)
                        .addGap(55, 55, 55)
                        .addComponent(jButtonBuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelBuscaralquilerLayout.setVerticalGroup(
            jPanelBuscaralquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscaralquilerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBuscaralquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLErrorDniBusca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelBuscaralquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLDniBusca)
                        .addComponent(jFormattedDniBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelBuscaralquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcodArtBusca)
                    .addComponent(jTextcodArtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLErrorcodArtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBuscaralquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonValidar)
                    .addComponent(jButtonBuscar))
                .addGap(84, 84, 84))
        );

        jPanelModificarAlquiler.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar Dias Alquiler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLFechaAlq2.setText("Fecha Alquiler:");

        jLDiasAlq2.setText("Dias Alquiler:");

        jDateChooserFechaAlq2.setEnabled(false);

        jButtonValidarDiasAlq.setText("Validar");
        jButtonValidarDiasAlq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarDiasAlqActionPerformed(evt);
            }
        });

        jButtonModificarDiasAlq.setText("Modificar");
        jButtonModificarDiasAlq.setEnabled(false);
        jButtonModificarDiasAlq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarDiasAlqActionPerformed(evt);
            }
        });

        jLcodAlq.setText("Codigo Alquiler");

        jTextcodAlq.setEnabled(false);

        javax.swing.GroupLayout jPanelModificarAlquilerLayout = new javax.swing.GroupLayout(jPanelModificarAlquiler);
        jPanelModificarAlquiler.setLayout(jPanelModificarAlquilerLayout);
        jPanelModificarAlquilerLayout.setHorizontalGroup(
            jPanelModificarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarAlquilerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelModificarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModificarAlquilerLayout.createSequentialGroup()
                        .addGroup(jPanelModificarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLFechaAlq2)
                            .addComponent(jLDiasAlq2))
                        .addGroup(jPanelModificarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModificarAlquilerLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextcodAlq, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonValidarDiasAlq)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonModificarDiasAlq))
                            .addGroup(jPanelModificarAlquilerLayout.createSequentialGroup()
                                .addGroup(jPanelModificarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelModificarAlquilerLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextDiasAlq2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addComponent(jLErrorDiasAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelModificarAlquilerLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jDateChooserFechaAlq2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanelModificarAlquilerLayout.createSequentialGroup()
                        .addComponent(jLcodAlq)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelModificarAlquilerLayout.setVerticalGroup(
            jPanelModificarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarAlquilerLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelModificarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFechaAlq2)
                    .addComponent(jDateChooserFechaAlq2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelModificarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModificarAlquilerLayout.createSequentialGroup()
                        .addGroup(jPanelModificarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLDiasAlq2)
                            .addComponent(jTextDiasAlq2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLErrorDiasAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelModificarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLcodAlq)
                            .addComponent(jTextcodAlq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(jPanelModificarAlquilerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelModificarAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonModificarDiasAlq)
                            .addComponent(jButtonValidarDiasAlq))))
                .addContainerGap())
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
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBuscaralquiler, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelModificarAlquiler, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBuscaralquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelModificarAlquiler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    if (alq != null) { //Que el articulo se encuentre alquilado para efectuar la modificacion
                        //lo hemos encontrado  
                        cargaCampos(alq);
                        jFormattedDniBusca.setEnabled(false);
                        jTextcodArtBusca.setEnabled(false);
                        jPanelModificarAlquiler.setVisible(true);
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

    private void jButtonValidarDiasAlqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarDiasAlqActionPerformed
        int diasAlq;
        boolean sw = true;
        try {
            diasAlq = Integer.parseInt(jTextDiasAlq2.getText());
            MiLibreria.checkNegativo(diasAlq);
            jLErrorDiasAlquiler.setText("");
        } catch (ExNegativo e) {
            jLErrorDiasAlquiler.setText(e.getMessage());
            jLErrorDiasAlquiler.setForeground(Color.red);
            jTextDiasAlq2.requestFocus();
            sw = false;
        } catch (NumberFormatException e) {
            jLErrorDiasAlquiler.setText("Solo numeros");
            jLErrorDiasAlquiler.setForeground(Color.red);
            jTextDiasAlq2.requestFocus();
            sw = false;
        }
        if (sw) {
            jButtonModificarDiasAlq.setEnabled(true);
        } else {
            jButtonModificarDiasAlq.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonValidarDiasAlqActionPerformed

    private void jButtonModificarDiasAlqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarDiasAlqActionPerformed
        Alquiler alq;
        int resp;
        try {
            conAlq.conecta();
            conAlq.crearSentencia();
            alq = obtenAlq();
            resp = conAlq.modiAlquiler(alq);
            if (resp == 1) {
                JOptionPane.showMessageDialog(this, "* * * Ha modificado un Alquiler * * * ");
            } else if (resp == -1) {
                JOptionPane.showMessageDialog(this, "ERROR: integridad referencial o SQL truncada");
            } else {
                JOptionPane.showMessageDialog(this, "* * * no se pudo modificar el alquiler * * * ");
            }
            conAlq.cerrarConexion();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_jButtonModificarDiasAlqActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonModificarDiasAlq;
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JButton jButtonValidarDiasAlq;
    private javax.swing.JButton jButtonVolver;
    private com.toedter.calendar.JDateChooser jDateChooserFechaAlq2;
    private javax.swing.JFormattedTextField jFormattedDniBusca;
    private javax.swing.JLabel jLDiasAlq2;
    private javax.swing.JLabel jLDniBusca;
    private javax.swing.JLabel jLErrorDiasAlquiler;
    private javax.swing.JLabel jLErrorDniBusca;
    private javax.swing.JLabel jLErrorcodArtBusca;
    private javax.swing.JLabel jLFechaAlq2;
    private javax.swing.JLabel jLcodAlq;
    private javax.swing.JLabel jLcodArtBusca;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBuscaralquiler;
    private javax.swing.JPanel jPanelModificarAlquiler;
    private javax.swing.JTextField jTextDiasAlq2;
    private javax.swing.JTextField jTextcodAlq;
    private javax.swing.JTextField jTextcodArtBusca;
    // End of variables declaration//GEN-END:variables

    public void cargaCampos(Alquiler alq) {
        jDateChooserFechaAlq2.setDate(alq.getFechaAlq());
        jTextDiasAlq2.setText(String.valueOf(alq.getDias()));
        jTextcodAlq.setText(String.valueOf(alq.getCodAlq()));
    }

    private Alquiler obtenAlq() {
        String dni;
        int codArticulo, codAlquiler, dias;
        Date fecha_alq;
        dni = jFormattedDniBusca.getText();
        codArticulo = Integer.parseInt(jTextcodArtBusca.getText());
        try {
            conCli.conecta();
            conArt.conecta();
            conAlq.conecta();
            conAlq.crearSentencia();
            conArt.crearSentencia();
            conCli.crearSentencia();
            cli = conCli.dameCliente(dni);
            art = conArt.dameArticuloCodigo(codArticulo);
            alq = conAlq.dameAlquilerCodigo(codArticulo, dni);
            codAlquiler = alq.getCodAlq();
            dias = Integer.parseInt(jTextDiasAlq2.getText());
            fecha_alq = alq.getFechaAlq();
            try {
                alq = new Alquiler(codAlquiler, art, dias, cli, fecha_alq);
            } catch (ExNegativo e) {
                e.printStackTrace();
            }
            conArt.cerrarConexion();
            conCli.cerrarConexion();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return alq;
    }
}

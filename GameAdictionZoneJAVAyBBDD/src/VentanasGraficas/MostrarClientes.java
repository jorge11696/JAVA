package VentanasGraficas;

import ADO.Cliente;
import MisListas.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class MostrarClientes extends javax.swing.JFrame {

    private Cliente cli;
    ConectaBBDD conCli = new ConectaBBDD();

    public MostrarClientes() {

        initComponents();
        setLocationRelativeTo(null);//Se posiciona la pantalla en el centro de la pantallax
        try {
            conCli = new ConectaBBDD();
            conCli.conecta();
            conCli.crearSentencia();
            conCli.ejecutaSQL("SELECT * FROM clientes");
            conCli.irPrimero();
            cli = conCli.obtenerCliente();
            cargaCampos(cli);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        MaskFormatter maskDNI = null; try {
            maskDNI = new MaskFormatter("########-?"); } catch (Exception ex){
            ex.printStackTrace(); }
        jFormattedTextDniCli = new JFormattedTextField(maskDNI);
        jLPuntos = new javax.swing.JLabel();
        jTextPuntos = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonPrimero = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jLNavegacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mostrar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLDniCli.setText("Dni:");

        jLNomCli.setText("Nombre:");

        jLApeCli.setText("Apellidos:");

        jLDireccionCli.setText("Direccion:");

        jLTlf1.setText("Telefono 1:");

        jLTlf2.setText("Telefono 2:");

        jTextApeCli.setEnabled(false);

        jTextNomCli.setEnabled(false);

        jTextDireccionCli.setEnabled(false);

        jTextTlf1.setEnabled(false);

        jTextTlf2.setEnabled(false);

        jFormattedTextDniCli.setEnabled(false);

        jLPuntos.setText("Puntos:");

        jTextPuntos.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDniCli)
                    .addComponent(jLNomCli)
                    .addComponent(jLApeCli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextApeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDireccionCli)
                    .addComponent(jLTlf2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTlf1)
                            .addComponent(jLPuntos))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextTlf2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextTlf1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDniCli)
                    .addComponent(jFormattedTextDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNomCli)
                    .addComponent(jTextNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLApeCli)
                    .addComponent(jTextApeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDireccionCli)
                    .addComponent(jTextDireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTlf1)
                    .addComponent(jTextTlf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTlf2)
                    .addComponent(jTextTlf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPuntos)
                    .addComponent(jTextPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jButtonPrimero.setText("Primero");
        jButtonPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeroActionPerformed(evt);
            }
        });

        jButtonAnterior.setText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jButtonUltimo.setText("Ultimo");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jLNavegacion.setText("1/X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAnterior)
                .addGap(18, 18, 18)
                .addComponent(jLNavegacion)
                .addGap(25, 25, 25)
                .addComponent(jButtonSiguiente)
                .addGap(18, 18, 18)
                .addComponent(jButtonUltimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrimero)
                    .addComponent(jButtonAnterior)
                    .addComponent(jButtonSiguiente)
                    .addComponent(jButtonUltimo)
                    .addComponent(jLNavegacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeroActionPerformed
        try {
            conCli.conecta();
            conCli.irPrimero();
            cli = conCli.obtenerCliente();
            cargaCampos(cli);
        } catch (SQLException ex) {
            Logger.getLogger(MostrarClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPrimeroActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        try {
            conCli.conecta();
            conCli.irAnterior();
            cli = conCli.obtenerCliente();
            cargaCampos(cli);
        } catch (SQLException ex) {
            Logger.getLogger(MostrarClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        try {
            conCli.conecta();
            conCli.irSiguiente();
            cli = conCli.obtenerCliente();
            cargaCampos(cli);
        } catch (SQLException ex) {
            Logger.getLogger(MostrarClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        try {
            conCli.conecta();
            conCli.irFinal();
            cli = conCli.obtenerCliente();
            cargaCampos(cli);
        } catch (SQLException ex) {
            Logger.getLogger(MostrarClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonPrimero;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JFormattedTextField jFormattedTextDniCli;
    private javax.swing.JLabel jLApeCli;
    private javax.swing.JLabel jLDireccionCli;
    private javax.swing.JLabel jLDniCli;
    private javax.swing.JLabel jLNavegacion;
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
        try {
            jFormattedTextDniCli.setText(cli.getDni());
            jTextNomCli.setText(cli.getNombre());
            jTextApeCli.setText(cli.getApellidos());
            jTextDireccionCli.setText(cli.getDireccion());
            jTextTlf1.setText(cli.getTelf1());
            jTextTlf2.setText(cli.getTelf2());
            jTextPuntos.setText(String.valueOf(cli.getPuntos()));
            actualizaBotones();
        } catch (SQLException ex) {
            Logger.getLogger(MostrarClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void actualizaBotones() throws SQLException {
        try {
            conCli.conecta();
            jLNavegacion.setText("Cliente: " + conCli.posRs() + "/" + conCli.tamanyo());
            if (conCli.posRs() == 1) {
                jButtonAnterior.setEnabled(false);
                jButtonPrimero.setEnabled(false);
                if (conCli.tamanyo() > 1) {
                    jButtonSiguiente.setEnabled(true);
                    jButtonUltimo.setEnabled(true);
                }
            }
            if (conCli.posRs() == conCli.tamanyo()) {
                jButtonSiguiente.setEnabled(false);
                jButtonUltimo.setEnabled(false);
                if (conCli.tamanyo() > 1) {
                    jButtonAnterior.setEnabled(true);
                    jButtonPrimero.setEnabled(true);
                }
            }
            if ((conCli.posRs() > 1) && (conCli.posRs() < conCli.tamanyo())) {
                jButtonAnterior.setEnabled(true);
                jButtonPrimero.setEnabled(true);
                jButtonSiguiente.setEnabled(true);
                jButtonUltimo.setEnabled(true);

            }
        } catch (SQLException ex) {
            Logger.getLogger(MostrarClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*
    public void mostrarCliente(Cliente cli) {
        jFormattedTextDniCli.setText(cli.getDni());
        jTextNomCli.setText(cli.getNombre());
        jTextApeCli.setText(cli.getApellidos());
        jTextDireccionCli.setText(cli.getDireccion());
        jTextTlf1.setText(cli.getTelf1());
        jTextTlf2.setText(cli.getTelf2());
        jTextTlf3.setText(cli.getTelf3());
        jTextPuntos.setText(cli.getCodSocio());
        actualizaBotones();
        jLNavegacion.setText((miListaCli.getActivo() + 1) + "/" + miListaCli.numClientes());
    }

    private void actualizaBotones() {
        if (miListaCli.getActivo() == 0) {
            jButtonAnterior.setEnabled(false);
            jButtonPrimero.setEnabled(false);
            if (miListaCli.numClientes() > 1) {
                jButtonSiguiente.setEnabled(true);
                jButtonUltimo.setEnabled(true);
            }
        }
        if (miListaCli.getActivo() == miListaCli.numClientes()- 1) {
            jButtonSiguiente.setEnabled(false);
            jButtonUltimo.setEnabled(false);
            if (miListaCli.numClientes()> 1) {
                jButtonAnterior.setEnabled(true);
                jButtonPrimero.setEnabled(true);
            }
        }
        if ((miListaCli.getActivo() > 0) && (miListaCli.getActivo() < miListaCli.numClientes()- 1)) {
            jButtonAnterior.setEnabled(true);
            jButtonPrimero.setEnabled(true);
            jButtonSiguiente.setEnabled(true);
            jButtonUltimo.setEnabled(true);

        }
    }
     */
}


package VentanasGraficas;

import ADO.Autor;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MostrarAutores extends javax.swing.JFrame {

    ConectaBBDD conAutor = new ConectaBBDD();
    private Autor aut;
    public MostrarAutores() {
        setLocationRelativeTo(null);//Se posiciona la pantalla en el centro de la pantalla
        initComponents();
        try {
            conAutor = new ConectaBBDD();
            conAutor.conecta();
            conAutor.crearSentencia();
            conAutor.ejecutaSQL("SELECT * FROM autores");
            conAutor.irPrimero();
            aut = conAutor.dameAutor();
            cargaCampos(aut);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAutor = new javax.swing.JPanel();
        jLNomAutor = new javax.swing.JLabel();
        jTextNomAutor = new javax.swing.JTextField();
        jLApeAutor = new javax.swing.JLabel();
        jTextApeAut = new javax.swing.JTextField();
        jLAñoAut = new javax.swing.JLabel();
        jTextAñoAut = new javax.swing.JTextField();
        jLAñoAut1 = new javax.swing.JLabel();
        jTextPubliAut = new javax.swing.JTextField();
        jLErrorNomAut = new javax.swing.JLabel();
        jLErrorApeAut = new javax.swing.JLabel();
        jLErrorAñoAut = new javax.swing.JLabel();
        jLErrorPubliAut = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextcodAut = new javax.swing.JTextField();
        jLErrorCodAut = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonVolver = new javax.swing.JButton();
        jButtonPrimero = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jLNavegacion = new javax.swing.JLabel();
        jButtonSiguiente = new javax.swing.JButton();
        jButtonFinal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelAutor.setBorder(javax.swing.BorderFactory.createTitledBorder("Autor"));

        jLNomAutor.setText("Nombre:");

        jLApeAutor.setText("Apellidos:");

        jLAñoAut.setText("Año Nacimiento:");

        jLAñoAut1.setText("Publicaciones:");

        jTextPubliAut.setText("1");

        jLabel1.setText("Codigo Autor");

        jTextcodAut.setEnabled(false);

        jLErrorCodAut.setText(" ");

        javax.swing.GroupLayout jPanelAutorLayout = new javax.swing.GroupLayout(jPanelAutor);
        jPanelAutor.setLayout(jPanelAutorLayout);
        jPanelAutorLayout.setHorizontalGroup(
            jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAutorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLAñoAut1)
                    .addComponent(jLAñoAut)
                    .addComponent(jLApeAutor)
                    .addComponent(jLNomAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAutorLayout.createSequentialGroup()
                        .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNomAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextApeAut, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextAñoAut, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLErrorNomAut, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLErrorAñoAut, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLErrorApeAut, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextcodAut))
                        .addGap(75, 75, 75))
                    .addGroup(jPanelAutorLayout.createSequentialGroup()
                        .addComponent(jTextPubliAut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLErrorPubliAut, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLErrorCodAut, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        jPanelAutorLayout.setVerticalGroup(
            jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAutorLayout.createSequentialGroup()
                .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAutorLayout.createSequentialGroup()
                        .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNomAutor)
                            .addComponent(jTextNomAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLErrorNomAut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLApeAutor)
                                .addComponent(jTextApeAut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLErrorApeAut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLAñoAut)
                                .addComponent(jTextAñoAut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLErrorAñoAut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAutorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15)
                        .addComponent(jTextcodAut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLAñoAut1)
                        .addComponent(jTextPubliAut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLErrorPubliAut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLErrorCodAut))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

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

        jLNavegacion.setText("1 / X");

        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jButtonFinal.setText("Ultimo");
        jButtonFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jButtonPrimero)
                .addGap(36, 36, 36)
                .addComponent(jButtonAnterior)
                .addGap(72, 72, 72)
                .addComponent(jLNavegacion)
                .addGap(81, 81, 81)
                .addComponent(jButtonSiguiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButtonFinal)
                .addGap(30, 30, 30)
                .addComponent(jButtonVolver)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrimero)
                    .addComponent(jButtonAnterior)
                    .addComponent(jLNavegacion)
                    .addComponent(jButtonSiguiente)
                    .addComponent(jButtonFinal)
                    .addComponent(jButtonVolver))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 216, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 93, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeroActionPerformed
        try {
            conAutor.conecta();
            conAutor.irPrimero();
            aut = conAutor.dameAutor();
            cargaCampos(aut);
        } catch (SQLException ex) {
            Logger.getLogger(MostrarAutores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPrimeroActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        try {
            conAutor.conecta();
            conAutor.irAnterior();
            aut = conAutor.dameAutor();
            cargaCampos(aut);
        } catch (SQLException ex) {
            Logger.getLogger(MostrarAutores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        try {
            conAutor.conecta();
            conAutor.irSiguiente();
            aut = conAutor.dameAutor();
            cargaCampos(aut);
        } catch (SQLException ex) {
            Logger.getLogger(MostrarAutores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jButtonFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalActionPerformed
        try {
            conAutor.conecta();
            conAutor.irFinal();
            aut = conAutor.dameAutor();
            cargaCampos(aut);
        } catch (SQLException ex) {
            Logger.getLogger(MostrarAutores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonFinalActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonFinal;
    private javax.swing.JButton jButtonPrimero;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLApeAutor;
    private javax.swing.JLabel jLAñoAut;
    private javax.swing.JLabel jLAñoAut1;
    private javax.swing.JLabel jLErrorApeAut;
    private javax.swing.JLabel jLErrorAñoAut;
    private javax.swing.JLabel jLErrorCodAut;
    private javax.swing.JLabel jLErrorNomAut;
    private javax.swing.JLabel jLErrorPubliAut;
    private javax.swing.JLabel jLNavegacion;
    private javax.swing.JLabel jLNomAutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAutor;
    private javax.swing.JTextField jTextApeAut;
    private javax.swing.JTextField jTextAñoAut;
    private javax.swing.JTextField jTextNomAutor;
    private javax.swing.JTextField jTextPubliAut;
    private javax.swing.JTextField jTextcodAut;
    // End of variables declaration//GEN-END:variables

    private void cargaCampos(Autor aut) {
        //AUTOR
        try{
        conAutor.conecta();
       
        jTextNomAutor.setText(aut.getNom());
        jTextApeAut.setText(aut.getApell());
        jTextAñoAut.setText(String.valueOf(aut.getAnyo_nac()));
        jTextPubliAut.setText(String.valueOf(aut.getPublicaciones()));
        jTextcodAut.setText(aut.getCodAut());
        actualizaBotones();
    
        } catch(SQLException ex){
            Logger.getLogger(MostrarAutores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void actualizaBotones() throws SQLException {
        try{          
        conAutor.conecta();
        jLNavegacion.setText("Autor: " + conAutor.posRs() + "/" + conAutor.tamanyo());
        if (conAutor.posRs() == 1) {
            jButtonAnterior.setEnabled(false);
            jButtonPrimero.setEnabled(false);
            if (conAutor.tamanyo() > 1) {
                jButtonSiguiente.setEnabled(true);
                jButtonFinal.setEnabled(true);
            }
        }
        if (conAutor.posRs() == conAutor.tamanyo()) {
            jButtonSiguiente.setEnabled(false);
            jButtonFinal.setEnabled(false);
            if (conAutor.tamanyo() > 1) {
                jButtonAnterior.setEnabled(true);
                jButtonPrimero.setEnabled(true);
            }
        }
        if ((conAutor.posRs() > 1) && (conAutor.posRs() < conAutor.tamanyo())) {
            jButtonAnterior.setEnabled(true);
            jButtonPrimero.setEnabled(true);
            jButtonSiguiente.setEnabled(true);
            jButtonFinal.setEnabled(true);

        }
        } catch (SQLException ex){
            Logger.getLogger(MostrarAutores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

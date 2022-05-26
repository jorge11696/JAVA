/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasGraficas;

import ADO.Autor;
import Exceptions.*;
import MisListas.MiLibreria;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AltaAutor extends javax.swing.JFrame {

    private Autor aut;
    private ConectaBBDD con = new ConectaBBDD();
    private String codAut, info = "";

    public AltaAutor(String codAut, String info) {
        this.codAut = codAut;
        this.info = info;
        initComponents();
        setLocationRelativeTo(null);
        if (info.equalsIgnoreCase("NoBuscar")) {
            jTextCodAut.setVisible(true);
            jTextCodAut.setText(codAut);
            jPanelBuscaAutor.setVisible(false);
            jButtonGuardar.setVisible(true);
            jButtonValidar.setVisible(true);
        } else {
            jTextCodAut.setVisible(false);
            jPanelBuscaAutor.setVisible(false);
        }
    }

    public AltaAutor(String info) {
        this.info = info;
        initComponents();
        setLocationRelativeTo(null);
        jPanelAutor.setVisible(false);
        jButtonGuardar.setVisible(false);
        jButtonValidar.setVisible(false);
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
        jLErrorCodAut = new javax.swing.JLabel();
        jTextCodAut = new javax.swing.JTextField();
        jLcodAut = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonValidar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonGuardarBusqueda = new javax.swing.JButton();
        jPanelBuscaAutor = new javax.swing.JPanel();
        jLCodAutBusca = new javax.swing.JLabel();
        jTextCodAutBusca = new javax.swing.JTextField();
        jLErrorCodAutBusca = new javax.swing.JLabel();
        jButtonBuscaCodAut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelAutor.setBorder(javax.swing.BorderFactory.createTitledBorder("Autor"));

        jLNomAutor.setText("Nombre:");

        jLApeAutor.setText("Apellidos:");

        jLAñoAut.setText("Año Nacimiento:");

        jLAñoAut1.setText("Publicaciones:");

        jTextPubliAut.setText("1");

        jTextCodAut.setEnabled(false);

        jLcodAut.setText("Codigo Autor:");

        javax.swing.GroupLayout jPanelAutorLayout = new javax.swing.GroupLayout(jPanelAutor);
        jPanelAutor.setLayout(jPanelAutorLayout);
        jPanelAutorLayout.setHorizontalGroup(
            jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAutorLayout.createSequentialGroup()
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
                            .addComponent(jLErrorApeAut, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLErrorAñoAut, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelAutorLayout.createSequentialGroup()
                        .addComponent(jTextPubliAut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLErrorPubliAut, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103)
                .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextCodAut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLcodAut)
                    .addComponent(jLErrorCodAut, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanelAutorLayout.setVerticalGroup(
            jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAutorLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLNomAutor)
                        .addComponent(jTextNomAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLErrorNomAut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAutorLayout.createSequentialGroup()
                        .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLApeAutor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextApeAut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLErrorApeAut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLAñoAut, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextAñoAut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLErrorAñoAut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLAñoAut1)
                                .addComponent(jTextPubliAut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLErrorPubliAut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelAutorLayout.createSequentialGroup()
                        .addComponent(jLcodAut)
                        .addGap(18, 18, 18)
                        .addComponent(jTextCodAut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLErrorCodAut, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        jButtonValidar.setText("Validar");
        jButtonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarActionPerformed(evt);
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

        jButtonGuardarBusqueda.setText("Guardar");
        jButtonGuardarBusqueda.setEnabled(false);
        jButtonGuardarBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButtonValidar)
                .addGap(39, 39, 39)
                .addComponent(jButtonGuardar)
                .addGap(56, 56, 56)
                .addComponent(jButtonGuardarBusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonValidar)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonGuardarBusqueda))
                .addContainerGap())
        );

        jLCodAutBusca.setText("Codigo Autor:");

        jLErrorCodAutBusca.setText(" ");

        jButtonBuscaCodAut.setText("Buscar");
        jButtonBuscaCodAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaCodAutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBuscaAutorLayout = new javax.swing.GroupLayout(jPanelBuscaAutor);
        jPanelBuscaAutor.setLayout(jPanelBuscaAutorLayout);
        jPanelBuscaAutorLayout.setHorizontalGroup(
            jPanelBuscaAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscaAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCodAutBusca)
                .addGap(18, 18, 18)
                .addComponent(jTextCodAutBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLErrorCodAutBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(jButtonBuscaCodAut)
                .addGap(142, 142, 142))
        );
        jPanelBuscaAutorLayout.setVerticalGroup(
            jPanelBuscaAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBuscaAutorLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanelBuscaAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodAutBusca)
                    .addComponent(jTextCodAutBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLErrorCodAutBusca)
                    .addComponent(jButtonBuscaCodAut))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBuscaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBuscaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarActionPerformed
        //VALIDACIONES AUTOR
        String nombreAutor, apeAutor;
        int anyoAutor, publiAutor;
        boolean sw = true;
        try {
            nombreAutor = jTextNomAutor.getText();
            MiLibreria.checkVacio(nombreAutor);
            jLErrorNomAut.setText("");
        } catch (ExVacio e) {
            jLErrorNomAut.setText(e.getMessage());
            jLErrorNomAut.setForeground(Color.red);
            jTextNomAutor.requestFocus();
            sw = false;
        }

        try {
            apeAutor = jTextApeAut.getText();
            MiLibreria.checkVacio(apeAutor);
            jLErrorApeAut.setText("");
        } catch (ExVacio e) {
            jLErrorApeAut.setText(e.getMessage());
            jLErrorApeAut.setForeground(Color.red);
            jTextApeAut.requestFocus();
            sw = false;
        }

        try {
            anyoAutor = Integer.parseInt(jTextAñoAut.getText());
            MiLibreria.checkIntervalo(0, 2022, anyoAutor);
            jLErrorAñoAut.setText("");
        } catch (ExIntervalo e) {
            jLErrorAñoAut.setText(e.getMessage());
            jLErrorAñoAut.setForeground(Color.red);
            jTextAñoAut.requestFocus();
            sw = false;
        } catch (NumberFormatException e) {
            jLErrorAñoAut.setText("Solo numeros!");
            jLErrorAñoAut.setForeground(Color.red);
            jTextAñoAut.requestFocus();
            sw = false;
        }

        try {
            publiAutor = Integer.parseInt(jTextPubliAut.getText());
            MiLibreria.checkNegativo(publiAutor);
            jLErrorPubliAut.setText("");
        } catch (ExNegativo e) {
            jLErrorPubliAut.setText(e.getMessage());
            jLErrorPubliAut.setForeground(Color.red);
            jTextPubliAut.requestFocus();
            sw = false;
        } catch (NumberFormatException e) {
            jLErrorPubliAut.setText("Solo numeros!");
            jLErrorPubliAut.setForeground(Color.red);
            jTextPubliAut.requestFocus();
            sw = false;
        }
        if (sw) {
            jButtonGuardar.setEnabled(true);
        } else {
            jButtonGuardar.setEnabled(false);
        }

    }//GEN-LAST:event_jButtonValidarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        //AUTOR
        String nombreAutor, apeAutor;
        int anyoAutor, publiAutor, resp;
        nombreAutor = jTextNomAutor.getText();
        apeAutor = jTextApeAut.getText();
        anyoAutor = Integer.parseInt(jTextAñoAut.getText());
        publiAutor = Integer.parseInt(jTextPubliAut.getText());

        //Al tener declaradas las excepciones en los constructores de la clase Autor estoy obligado a declarar
        try {  //el bloque try-catch a pesar de estar validadas mediante el boton de validar
            aut = new Autor(nombreAutor, apeAutor, anyoAutor, publiAutor, codAut);
        } catch (ExVacio ex) {
            System.out.println("Valor capturado: " + ex);
        } catch (ExIntervalo ex) {
            System.out.println("Valor capturado: " + ex);
        } catch (ExNegativo ex) {
            System.out.println("Valor capturado: " + ex);
        } catch (ExTipo ex) {
            System.out.println("Valor capturado: " + ex);
        }
        //GUARDA AUTOR
        try {
            con.conecta();
            con.crearSentencia();
            resp = con.grabaAutor(aut);
            System.out.println("respuesta  :" + resp);
            if (resp != -1) {
                JOptionPane.showMessageDialog(this, "Autor insertado en la BBDD", "Atencion!", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se ha podido insertar", "Atención!", JOptionPane.ERROR_MESSAGE);
            }
            con.cerrarConexion();
            //restableceDatos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención!", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonBuscaCodAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaCodAutActionPerformed
        //VALIDACIONES AUTOR
        boolean sw = true;
        String codAutBusca;
        try {
            codAutBusca = jTextCodAutBusca.getText();
            MiLibreria.checkCodAutor(codAutBusca);
            jLErrorCodAutBusca.setText("");
        } catch (ExTipo e) {
            jLErrorCodAutBusca.setText(e.getMessage());
            jLErrorCodAutBusca.setForeground(Color.red);
            jTextCodAutBusca.requestFocus();
            sw = false;
        }
        if (sw) {
            String codAut, autor;
            int resp;
            try {
                codAut = jTextCodAutBusca.getText();
                con.conecta();
                con.crearSentencia();
                autor = con.codAutor(codAut);
                if (autor == null) {
                    resp = JOptionPane.showConfirmDialog(rootPane, "El autor no existe. Desea añadir uno nuevo?", "Autor", JOptionPane.OK_CANCEL_OPTION);
                    if (resp == 0) {
                        jPanelAutor.setVisible(true);
                        jButtonGuardarBusqueda.setEnabled(true);
                        jLcodAut.setVisible(false);
                        jTextCodAut.setVisible(false);
                        
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
    }//GEN-LAST:event_jButtonBuscaCodAutActionPerformed

    private void jButtonGuardarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarBusquedaActionPerformed
        String nombreAutor, apeAutor, codAutor;
        int anyoAutor, publiAutor, resp;
        nombreAutor = jTextNomAutor.getText();
        apeAutor = jTextApeAut.getText();
        anyoAutor = Integer.parseInt(jTextAñoAut.getText());
        publiAutor = Integer.parseInt(jTextPubliAut.getText());
        codAutor = jTextCodAutBusca.getText();
        //Al tener declaradas las excepciones en los constructores de la clase Autor estoy obligado a declarar
        try {  //el bloque try-catch a pesar de estar validadas mediante el boton de validar
            aut = new Autor(nombreAutor, apeAutor, anyoAutor, publiAutor, codAutor);
        } catch (ExVacio ex) {
            System.out.println("Valor capturado: " + ex);
        } catch (ExIntervalo ex) {
            System.out.println("Valor capturado: " + ex);
        } catch (ExNegativo ex) {
            System.out.println("Valor capturado: " + ex);
        } catch (ExTipo ex) {
            System.out.println("Valor capturado: " + ex);
        }
        //GUARDA AUTOR
        try {
            con.conecta();
            con.crearSentencia();
            resp = con.grabaAutor(aut);
            System.out.println("respuesta  :" + resp);
            if (resp != -1) {
                JOptionPane.showMessageDialog(this, "Autor insertado en la BBDD", "Atencion!", JOptionPane.WARNING_MESSAGE);
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "No se ha podido insertar", "Atención!", JOptionPane.ERROR_MESSAGE);
                setVisible(false);
            }
            con.cerrarConexion();
            //restableceDatos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención!", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonGuardarBusquedaActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscaCodAut;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonGuardarBusqueda;
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLApeAutor;
    private javax.swing.JLabel jLAñoAut;
    private javax.swing.JLabel jLAñoAut1;
    private javax.swing.JLabel jLCodAutBusca;
    private javax.swing.JLabel jLErrorApeAut;
    private javax.swing.JLabel jLErrorAñoAut;
    private javax.swing.JLabel jLErrorCodAut;
    private javax.swing.JLabel jLErrorCodAutBusca;
    private javax.swing.JLabel jLErrorNomAut;
    private javax.swing.JLabel jLErrorPubliAut;
    private javax.swing.JLabel jLNomAutor;
    private javax.swing.JLabel jLcodAut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAutor;
    private javax.swing.JPanel jPanelBuscaAutor;
    private javax.swing.JTextField jTextApeAut;
    private javax.swing.JTextField jTextAñoAut;
    private javax.swing.JTextField jTextCodAut;
    private javax.swing.JTextField jTextCodAutBusca;
    private javax.swing.JTextField jTextNomAutor;
    private javax.swing.JTextField jTextPubliAut;
    // End of variables declaration//GEN-END:variables
}

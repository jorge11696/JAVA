package VentanasGraficas;

import ADO.Autor;
import Exceptions.ExIntervalo;
import Exceptions.ExNegativo;
import Exceptions.ExTipo;
import Exceptions.ExVacio;
import MisListas.MiLibreria;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ModificarAutor extends javax.swing.JFrame {

     ConectaBBDD conAutor = new ConectaBBDD();
     private Autor aut;
    public ModificarAutor() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLcodArt = new javax.swing.JLabel();
        jTextcodAutBusca = new javax.swing.JTextField();
        jLErrorcodAutBusca = new javax.swing.JLabel();
        jButtonValidar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
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
        jButtonValidarTodosCampos = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLcodArt.setText("Codigo Autor:");

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
                        .addComponent(jLcodArt)
                        .addGap(26, 26, 26)
                        .addComponent(jTextcodAutBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jButtonValidar)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLErrorcodAutBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcodArt)
                    .addComponent(jTextcodAutBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonValidar)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLErrorcodAutBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(0, 14, Short.MAX_VALUE))
        );

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

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButtonValidarTodosCampos)
                .addGap(70, 70, 70)
                .addComponent(jButtonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonValidarTodosCampos)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonVolver))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarActionPerformed
        boolean sw = true;
        String codAutBusca;
        try {
            codAutBusca = jTextcodAutBusca.getText();
            MiLibreria.checkCodAutor(codAutBusca);
            jLErrorcodAutBusca.setText("");
        } catch (ExTipo e) {
            jLErrorcodAutBusca.setText(e.getMessage());
            jLErrorcodAutBusca.setForeground(Color.red);
            jTextcodAutBusca.requestFocus();
            sw = false;
        }
        if (sw) {
            jButtonBuscar.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonValidarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String id;
        id = jTextcodAutBusca.getText();
        try {
            conAutor.conecta();
            conAutor.crearSentencia();
            aut = conAutor.obtenerAutorCodigo(id);
            if (aut == null) {
                JOptionPane.showMessageDialog(null, "id no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                cargaCampos(aut);
            }
            conAutor.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonValidarTodosCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarTodosCamposActionPerformed
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
            jButtonModificar.setEnabled(true);
        } else {
            jButtonModificar.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonValidarTodosCamposActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        Autor aut;
        int resp;
        try {
            conAutor.conecta();
            conAutor.crearSentencia();
            aut = obtenAut();
            resp = conAutor.modiAutor(aut);
            if (resp == 1) {
                JOptionPane.showMessageDialog(this, "* * * Ha modificado un Autor * * * ");
            } else if (resp == -1) {
                JOptionPane.showMessageDialog(this, "ERROR: integridad referencial o SQL truncada");
            } else {
                JOptionPane.showMessageDialog(this, "* * * no se pudo modificar Autor * * * ");
            }
            
            conAutor.cerrarConexion();
            
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
    private javax.swing.JLabel jLApeAutor;
    private javax.swing.JLabel jLAñoAut;
    private javax.swing.JLabel jLAñoAut1;
    private javax.swing.JLabel jLErrorApeAut;
    private javax.swing.JLabel jLErrorAñoAut;
    private javax.swing.JLabel jLErrorCodAut;
    private javax.swing.JLabel jLErrorNomAut;
    private javax.swing.JLabel jLErrorPubliAut;
    private javax.swing.JLabel jLErrorcodAutBusca;
    private javax.swing.JLabel jLNomAutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLcodArt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAutor;
    private javax.swing.JTextField jTextApeAut;
    private javax.swing.JTextField jTextAñoAut;
    private javax.swing.JTextField jTextNomAutor;
    private javax.swing.JTextField jTextPubliAut;
    private javax.swing.JTextField jTextcodAut;
    private javax.swing.JTextField jTextcodAutBusca;
    // End of variables declaration//GEN-END:variables

    private void cargaCampos(Autor aut) {
        //AUTOR
        jTextNomAutor.setText(aut.getNom());
        jTextApeAut.setText(aut.getApell());
        jTextAñoAut.setText(String.valueOf(aut.getAnyo_nac()));
        jTextPubliAut.setText(String.valueOf(aut.getPublicaciones()));
        jTextcodAut.setText(aut.getCodAut());
    }
    private Autor obtenAut() {
        String nombreAutor,apeAutor, codAut;
        int anyoAutor, publiAutor, resp;
        nombreAutor = jTextNomAutor.getText();
        apeAutor = jTextApeAut.getText();
        anyoAutor = Integer.parseInt(jTextAñoAut.getText());
        publiAutor = Integer.parseInt(jTextPubliAut.getText());
        codAut = jTextcodAut.getText();
     
        //Al tener declaradas las excepciones en los constructores de la clase Autor estoy obligado a declarar
        try {  //el bloque try-catch a pesar de estar validadas mediante el boton de validar
            aut = new Autor(nombreAutor, apeAutor, anyoAutor, publiAutor,codAut);
        } catch (ExVacio ex) {
            System.out.println("Valor capturado: "+ex);
        } catch (ExIntervalo ex) {
            System.out.println("Valor capturado: "+ex);
        } catch (ExNegativo ex) {
            System.out.println("Valor capturado: "+ex);
        } catch (ExTipo ex){
            System.out.println("Valor capturado: "+ex);
        }
        return aut;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasGraficas;

import ADO.*;
import Exceptions.*;
import MisListas.*;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MostrarArticulo extends javax.swing.JFrame {

    private Articulo art;
    private Autor aut;
    private LibroImpreso lim;
    private AudioLibro lau;
    private Musica mus;
    private VideoJuego vid;
    ConectaBBDD con = new ConectaBBDD();
    ConectaBBDD conAutor = new ConectaBBDD();

    public MostrarArticulo() {
        initComponents();
        setLocationRelativeTo(null);
        jPanel2.setVisible(false);
        //Añadir Items al jCombobox
        String nom;
        int num;
        try {
            con.conecta();
            con.crearSentencia();
            con.ejecutaSQL("Select * from categorias");
            // Recorremos todo el ResultSet y mostramos sus datos
            con.irPrimero();
            num = con.tamanyo();
            for (int i = 1; i <= num; i++) {
                nom = con.rs.getString("descripcion");
                jComboBoxMostrarCategoria.addItem(nom);
                con.irSiguiente();
            }
            con.cerrarConexion();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLcodArt = new javax.swing.JLabel();
        jTextcodArtBusca = new javax.swing.JTextField();
        jLErrorcodArtBuscar = new javax.swing.JLabel();
        jButtonValidar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanelArticulos = new javax.swing.JPanel();
        jLNomArt = new javax.swing.JLabel();
        jLAñoArt = new javax.swing.JLabel();
        jTextMostrarNomArt = new javax.swing.JTextField();
        jTextMostrarAñoArt = new javax.swing.JTextField();
        jPanelResumen = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextMostrarResumen = new javax.swing.JTextArea();
        jPanelDeteriorado = new javax.swing.JPanel();
        jRadioButtonMostrarDeterioradoSI = new javax.swing.JRadioButton();
        jRadioButtonMostrarDeterioradoNO = new javax.swing.JRadioButton();
        jLDeterioradoArt = new javax.swing.JLabel();
        jDateChooserMostrarFechaActual = new com.toedter.calendar.JDateChooser();
        jLCodArt = new javax.swing.JLabel();
        jTextcodArt = new javax.swing.JTextField();
        jPanelAutor = new javax.swing.JPanel();
        jLNomAutor = new javax.swing.JLabel();
        jTextMostrarNomAutor = new javax.swing.JTextField();
        jLApeAutor = new javax.swing.JLabel();
        jTextMostrarApeAut = new javax.swing.JTextField();
        jLAñoAut = new javax.swing.JLabel();
        jTextMostrarAñoAut = new javax.swing.JTextField();
        jLAñoAut1 = new javax.swing.JLabel();
        jTextMostrarPubliAut = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextMostrarCodAut = new javax.swing.JTextField();
        jTabbedMostrarPaneArticulos = new javax.swing.JTabbedPane();
        jPanelMostrarLibroImpreso = new javax.swing.JPanel();
        jPanelEbook = new javax.swing.JPanel();
        jLEbook = new javax.swing.JLabel();
        jRadioMostrarEbookSI = new javax.swing.JRadioButton();
        jRadioMostrarEbookNO = new javax.swing.JRadioButton();
        jPanelTapa = new javax.swing.JPanel();
        jLTapaLibro = new javax.swing.JLabel();
        jRadioMostrarTapaDURA = new javax.swing.JRadioButton();
        jRadioMostrartapaBLANDA = new javax.swing.JRadioButton();
        jLnumpaginas = new javax.swing.JLabel();
        jTextMostrarNumPags = new javax.swing.JTextField();
        jLImagenLibroImpreso = new javax.swing.JLabel();
        jPanelMostrarComentarioLIM = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextMostrarComenLIM = new javax.swing.JTextArea();
        jCheckBoxMostrarLIMcomen = new javax.swing.JCheckBox();
        jPanelMostrarAudioLibro = new javax.swing.JPanel();
        jPanelSintetizador = new javax.swing.JPanel();
        jLSintetizador = new javax.swing.JLabel();
        jRadioButtonMostrarSintetizSI = new javax.swing.JRadioButton();
        jRadioButtonMostrarSintetizNO = new javax.swing.JRadioButton();
        jLHorasDur = new javax.swing.JLabel();
        jTextMostrarHorasDur = new javax.swing.JTextField();
        jLMinDur = new javax.swing.JLabel();
        jTextMostrarMinDur = new javax.swing.JTextField();
        jLImagenAudioLib = new javax.swing.JLabel();
        jPanelMostrarComentarioAUD = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextMostrarComenAUD = new javax.swing.JTextArea();
        jCheckBoxMostrarLAUcomen = new javax.swing.JCheckBox();
        jPanelMostrarMUS = new javax.swing.JPanel();
        jLNumPistas = new javax.swing.JLabel();
        jTextMostrarNumPistas = new javax.swing.JTextField();
        jLDuracion = new javax.swing.JLabel();
        jTextMostrarDur = new javax.swing.JTextField();
        jPanelFormatoCdVin = new javax.swing.JPanel();
        jLFormato = new javax.swing.JLabel();
        jRadioButtonMostrarCD = new javax.swing.JRadioButton();
        jRadioButtonMostrarVINILO = new javax.swing.JRadioButton();
        jLImagenMUS = new javax.swing.JLabel();
        jPanelMostrarComentarioMUS = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextMostrarComenMUS = new javax.swing.JTextArea();
        jCheckBoxMostrarMUScomen = new javax.swing.JCheckBox();
        jPanelMostrarVID = new javax.swing.JPanel();
        jLEdadRec = new javax.swing.JLabel();
        jTextMostrarEdadRec = new javax.swing.JTextField();
        jComboBoxMostrarPlataforma = new javax.swing.JComboBox<>();
        jLPlataforma = new javax.swing.JLabel();
        jLCategoria = new javax.swing.JLabel();
        jComboBoxMostrarCategoria = new javax.swing.JComboBox<>();
        jLImagenVID = new javax.swing.JLabel();
        jPanelMostrarComentarioVID = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextMostrarComenVID = new javax.swing.JTextArea();
        jCheckBoxMostrarVIDcomen = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLFormatoFisico = new javax.swing.JLabel();
        jRadioMostrarFormatoVIDsi = new javax.swing.JRadioButton();
        jRadioMostrarFormatoVIDno = new javax.swing.JRadioButton();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLcodArt.setText("Codigo Articulo:");

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
                        .addComponent(jTextcodArtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jButtonValidar)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLErrorcodArtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcodArt)
                    .addComponent(jTextcodArtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonValidar)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLErrorcodArtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelArticulos.setBorder(javax.swing.BorderFactory.createTitledBorder("Articulo"));

        jLNomArt.setText("Nombre:");

        jLAñoArt.setText("Año:");

        jTextMostrarNomArt.setEnabled(false);

        jTextMostrarAñoArt.setEnabled(false);

        jPanelResumen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resumen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jTextMostrarResumen.setColumns(20);
        jTextMostrarResumen.setRows(3);
        jTextMostrarResumen.setEnabled(false);
        jScrollPane1.setViewportView(jTextMostrarResumen);

        javax.swing.GroupLayout jPanelResumenLayout = new javax.swing.GroupLayout(jPanelResumen);
        jPanelResumen.setLayout(jPanelResumenLayout);
        jPanelResumenLayout.setHorizontalGroup(
            jPanelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
        );
        jPanelResumenLayout.setVerticalGroup(
            jPanelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jRadioButtonMostrarDeterioradoSI.setText("Si");
        jRadioButtonMostrarDeterioradoSI.setEnabled(false);

        jRadioButtonMostrarDeterioradoNO.setText("No");
        jRadioButtonMostrarDeterioradoNO.setEnabled(false);

        jLDeterioradoArt.setText("Deteriorado:");

        javax.swing.GroupLayout jPanelDeterioradoLayout = new javax.swing.GroupLayout(jPanelDeteriorado);
        jPanelDeteriorado.setLayout(jPanelDeterioradoLayout);
        jPanelDeterioradoLayout.setHorizontalGroup(
            jPanelDeterioradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeterioradoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLDeterioradoArt)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonMostrarDeterioradoSI)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonMostrarDeterioradoNO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDeterioradoLayout.setVerticalGroup(
            jPanelDeterioradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeterioradoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDeterioradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMostrarDeterioradoSI)
                    .addComponent(jRadioButtonMostrarDeterioradoNO)
                    .addComponent(jLDeterioradoArt)))
        );

        jDateChooserMostrarFechaActual.setEnabled(false);

        jLCodArt.setText("Codigo:");

        jTextcodArt.setEnabled(false);

        javax.swing.GroupLayout jPanelArticulosLayout = new javax.swing.GroupLayout(jPanelArticulos);
        jPanelArticulos.setLayout(jPanelArticulosLayout);
        jPanelArticulosLayout.setHorizontalGroup(
            jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArticulosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelArticulosLayout.createSequentialGroup()
                        .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNomArt)
                            .addComponent(jLAñoArt))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextMostrarNomArt, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jTextMostrarAñoArt)))
                    .addComponent(jPanelDeteriorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelResumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelArticulosLayout.createSequentialGroup()
                        .addComponent(jDateChooserMostrarFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jLCodArt)
                        .addGap(18, 18, 18)
                        .addComponent(jTextcodArt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelArticulosLayout.setVerticalGroup(
            jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArticulosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelArticulosLayout.createSequentialGroup()
                        .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNomArt)
                            .addComponent(jTextMostrarNomArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLAñoArt)
                            .addComponent(jTextMostrarAñoArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanelDeteriorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelArticulosLayout.createSequentialGroup()
                        .addComponent(jPanelResumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooserMostrarFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLCodArt)
                                .addComponent(jTextcodArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanelAutor.setBorder(javax.swing.BorderFactory.createTitledBorder("Autor"));

        jLNomAutor.setText("Nombre:");

        jTextMostrarNomAutor.setEnabled(false);

        jLApeAutor.setText("Apellidos:");

        jTextMostrarApeAut.setEnabled(false);

        jLAñoAut.setText("Año Nacimiento:");

        jTextMostrarAñoAut.setEnabled(false);

        jLAñoAut1.setText("Publicaciones:");

        jTextMostrarPubliAut.setEnabled(false);

        jLabel1.setText("Codigo Autor:");

        jTextMostrarCodAut.setEnabled(false);

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
                    .addComponent(jTextMostrarApeAut, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMostrarNomAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMostrarAñoAut, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMostrarPubliAut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextMostrarCodAut))
                .addGap(83, 83, 83))
        );
        jPanelAutorLayout.setVerticalGroup(
            jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAutorLayout.createSequentialGroup()
                .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNomAutor)
                    .addComponent(jTextMostrarNomAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLApeAutor)
                    .addComponent(jTextMostrarApeAut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAñoAut)
                    .addComponent(jTextMostrarAñoAut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMostrarCodAut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAñoAut1)
                    .addComponent(jTextMostrarPubliAut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedMostrarPaneArticulos.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione tipo de articulo"));
        jTabbedMostrarPaneArticulos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLEbook.setText("Formato ebook:");

        jRadioMostrarEbookSI.setText("Si");
        jRadioMostrarEbookSI.setEnabled(false);

        jRadioMostrarEbookNO.setText("No");
        jRadioMostrarEbookNO.setEnabled(false);

        javax.swing.GroupLayout jPanelEbookLayout = new javax.swing.GroupLayout(jPanelEbook);
        jPanelEbook.setLayout(jPanelEbookLayout);
        jPanelEbookLayout.setHorizontalGroup(
            jPanelEbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEbookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLEbook)
                .addGap(18, 18, 18)
                .addComponent(jRadioMostrarEbookSI)
                .addGap(6, 6, 6)
                .addComponent(jRadioMostrarEbookNO)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanelEbookLayout.setVerticalGroup(
            jPanelEbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEbookLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelEbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEbook)
                    .addComponent(jRadioMostrarEbookSI)
                    .addComponent(jRadioMostrarEbookNO)))
        );

        jLTapaLibro.setText("Tapa:");

        jRadioMostrarTapaDURA.setText("Dura");
        jRadioMostrarTapaDURA.setEnabled(false);

        jRadioMostrartapaBLANDA.setText("Blanda");
        jRadioMostrartapaBLANDA.setEnabled(false);

        javax.swing.GroupLayout jPanelTapaLayout = new javax.swing.GroupLayout(jPanelTapa);
        jPanelTapa.setLayout(jPanelTapaLayout);
        jPanelTapaLayout.setHorizontalGroup(
            jPanelTapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTapaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTapaLibro)
                .addGap(34, 34, 34)
                .addComponent(jRadioMostrarTapaDURA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioMostrartapaBLANDA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        jPanelTapaLayout.setVerticalGroup(
            jPanelTapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTapaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelTapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTapaLibro)
                    .addComponent(jRadioMostrarTapaDURA)
                    .addComponent(jRadioMostrartapaBLANDA)))
        );

        jLnumpaginas.setText("Numero paginas:");

        jTextMostrarNumPags.setEnabled(false);

        jLImagenLibroImpreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/book60x60.png"))); // NOI18N

        jPanelMostrarComentarioLIM.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comentario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jScrollPane2.setEnabled(false);

        jTextMostrarComenLIM.setColumns(20);
        jTextMostrarComenLIM.setRows(5);
        jTextMostrarComenLIM.setEnabled(false);
        jScrollPane2.setViewportView(jTextMostrarComenLIM);

        javax.swing.GroupLayout jPanelMostrarComentarioLIMLayout = new javax.swing.GroupLayout(jPanelMostrarComentarioLIM);
        jPanelMostrarComentarioLIM.setLayout(jPanelMostrarComentarioLIMLayout);
        jPanelMostrarComentarioLIMLayout.setHorizontalGroup(
            jPanelMostrarComentarioLIMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        jPanelMostrarComentarioLIMLayout.setVerticalGroup(
            jPanelMostrarComentarioLIMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMostrarComentarioLIMLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jCheckBoxMostrarLIMcomen.setText("Añadir comentario");
        jCheckBoxMostrarLIMcomen.setEnabled(false);

        javax.swing.GroupLayout jPanelMostrarLibroImpresoLayout = new javax.swing.GroupLayout(jPanelMostrarLibroImpreso);
        jPanelMostrarLibroImpreso.setLayout(jPanelMostrarLibroImpresoLayout);
        jPanelMostrarLibroImpresoLayout.setHorizontalGroup(
            jPanelMostrarLibroImpresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMostrarLibroImpresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMostrarLibroImpresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMostrarLibroImpresoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelMostrarLibroImpresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMostrarLibroImpresoLayout.createSequentialGroup()
                                .addComponent(jLnumpaginas)
                                .addGap(18, 18, 18)
                                .addComponent(jTextMostrarNumPags, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelTapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLImagenLibroImpreso))
                    .addComponent(jPanelEbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanelMostrarLibroImpresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMostrarComentarioLIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxMostrarLIMcomen))
                .addGap(68, 68, 68))
        );
        jPanelMostrarLibroImpresoLayout.setVerticalGroup(
            jPanelMostrarLibroImpresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMostrarLibroImpresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMostrarLibroImpresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxMostrarLIMcomen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMostrarLibroImpresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMostrarLibroImpresoLayout.createSequentialGroup()
                        .addComponent(jPanelTapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanelMostrarLibroImpresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLnumpaginas)
                            .addComponent(jTextMostrarNumPags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLImagenLibroImpreso)
                    .addComponent(jPanelMostrarComentarioLIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedMostrarPaneArticulos.addTab("Libro Impreso", jPanelMostrarLibroImpreso);

        jLSintetizador.setText("Sintetizador:");

        jRadioButtonMostrarSintetizSI.setText("Si");
        jRadioButtonMostrarSintetizSI.setEnabled(false);

        jRadioButtonMostrarSintetizNO.setText("No");
        jRadioButtonMostrarSintetizNO.setEnabled(false);

        javax.swing.GroupLayout jPanelSintetizadorLayout = new javax.swing.GroupLayout(jPanelSintetizador);
        jPanelSintetizador.setLayout(jPanelSintetizadorLayout);
        jPanelSintetizadorLayout.setHorizontalGroup(
            jPanelSintetizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSintetizadorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLSintetizador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonMostrarSintetizSI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonMostrarSintetizNO))
        );
        jPanelSintetizadorLayout.setVerticalGroup(
            jPanelSintetizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSintetizadorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelSintetizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSintetizador)
                    .addComponent(jRadioButtonMostrarSintetizSI)
                    .addComponent(jRadioButtonMostrarSintetizNO)))
        );

        jLHorasDur.setText("Horas duracion:");

        jTextMostrarHorasDur.setEnabled(false);

        jLMinDur.setText("Min duracion:");

        jTextMostrarMinDur.setEnabled(false);

        jLImagenAudioLib.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/audio-book60x60.png"))); // NOI18N

        jPanelMostrarComentarioAUD.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comentario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jTextMostrarComenAUD.setColumns(20);
        jTextMostrarComenAUD.setRows(3);
        jTextMostrarComenAUD.setEnabled(false);
        jScrollPane3.setViewportView(jTextMostrarComenAUD);

        javax.swing.GroupLayout jPanelMostrarComentarioAUDLayout = new javax.swing.GroupLayout(jPanelMostrarComentarioAUD);
        jPanelMostrarComentarioAUD.setLayout(jPanelMostrarComentarioAUDLayout);
        jPanelMostrarComentarioAUDLayout.setHorizontalGroup(
            jPanelMostrarComentarioAUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        jPanelMostrarComentarioAUDLayout.setVerticalGroup(
            jPanelMostrarComentarioAUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        jCheckBoxMostrarLAUcomen.setText("Añadir comentario");
        jCheckBoxMostrarLAUcomen.setEnabled(false);

        javax.swing.GroupLayout jPanelMostrarAudioLibroLayout = new javax.swing.GroupLayout(jPanelMostrarAudioLibro);
        jPanelMostrarAudioLibro.setLayout(jPanelMostrarAudioLibroLayout);
        jPanelMostrarAudioLibroLayout.setHorizontalGroup(
            jPanelMostrarAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMostrarAudioLibroLayout.createSequentialGroup()
                .addGroup(jPanelMostrarAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMostrarAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelMostrarAudioLibroLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanelSintetizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelMostrarAudioLibroLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLHorasDur)
                            .addGap(18, 18, 18)
                            .addGroup(jPanelMostrarAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextMostrarMinDur)
                                .addComponent(jTextMostrarHorasDur))))
                    .addGroup(jPanelMostrarAudioLibroLayout.createSequentialGroup()
                        .addComponent(jLMinDur)
                        .addGap(78, 78, 78)))
                .addGap(44, 44, 44)
                .addComponent(jLImagenAudioLib)
                .addGap(69, 69, 69)
                .addGroup(jPanelMostrarAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMostrarComentarioAUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxMostrarLAUcomen))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanelMostrarAudioLibroLayout.setVerticalGroup(
            jPanelMostrarAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMostrarAudioLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMostrarAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSintetizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxMostrarLAUcomen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMostrarAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMostrarAudioLibroLayout.createSequentialGroup()
                        .addGroup(jPanelMostrarAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelMostrarAudioLibroLayout.createSequentialGroup()
                                .addGroup(jPanelMostrarAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLHorasDur)
                                    .addComponent(jTextMostrarHorasDur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))
                            .addComponent(jLImagenAudioLib, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelMostrarAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMostrarAudioLibroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextMostrarMinDur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMostrarAudioLibroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLMinDur)
                                .addGap(46, 46, 46))))
                    .addGroup(jPanelMostrarAudioLibroLayout.createSequentialGroup()
                        .addComponent(jPanelMostrarComentarioAUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedMostrarPaneArticulos.addTab("Audio Libro", jPanelMostrarAudioLibro);

        jLNumPistas.setText("Numero pistas:");

        jTextMostrarNumPistas.setEnabled(false);

        jLDuracion.setText("Duracion:");

        jTextMostrarDur.setEnabled(false);

        jLFormato.setText("Formato:");

        jRadioButtonMostrarCD.setText("Cd");
        jRadioButtonMostrarCD.setEnabled(false);

        jRadioButtonMostrarVINILO.setText("Vinilo");
        jRadioButtonMostrarVINILO.setEnabled(false);

        javax.swing.GroupLayout jPanelFormatoCdVinLayout = new javax.swing.GroupLayout(jPanelFormatoCdVin);
        jPanelFormatoCdVin.setLayout(jPanelFormatoCdVinLayout);
        jPanelFormatoCdVinLayout.setHorizontalGroup(
            jPanelFormatoCdVinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormatoCdVinLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLFormato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonMostrarCD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonMostrarVINILO)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanelFormatoCdVinLayout.setVerticalGroup(
            jPanelFormatoCdVinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormatoCdVinLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFormatoCdVinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMostrarCD)
                    .addComponent(jRadioButtonMostrarVINILO)
                    .addComponent(jLFormato)))
        );

        jLImagenMUS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cd60x60.png"))); // NOI18N

        jPanelMostrarComentarioMUS.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comentario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jTextMostrarComenMUS.setColumns(20);
        jTextMostrarComenMUS.setRows(3);
        jTextMostrarComenMUS.setEnabled(false);
        jScrollPane4.setViewportView(jTextMostrarComenMUS);

        javax.swing.GroupLayout jPanelMostrarComentarioMUSLayout = new javax.swing.GroupLayout(jPanelMostrarComentarioMUS);
        jPanelMostrarComentarioMUS.setLayout(jPanelMostrarComentarioMUSLayout);
        jPanelMostrarComentarioMUSLayout.setHorizontalGroup(
            jPanelMostrarComentarioMUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        jPanelMostrarComentarioMUSLayout.setVerticalGroup(
            jPanelMostrarComentarioMUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );

        jCheckBoxMostrarMUScomen.setText("Añadir comentario");
        jCheckBoxMostrarMUScomen.setEnabled(false);

        javax.swing.GroupLayout jPanelMostrarMUSLayout = new javax.swing.GroupLayout(jPanelMostrarMUS);
        jPanelMostrarMUS.setLayout(jPanelMostrarMUSLayout);
        jPanelMostrarMUSLayout.setHorizontalGroup(
            jPanelMostrarMUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMostrarMUSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMostrarMUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMostrarMUSLayout.createSequentialGroup()
                        .addComponent(jLDuracion)
                        .addGap(43, 43, 43)
                        .addComponent(jTextMostrarDur, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMostrarMUSLayout.createSequentialGroup()
                        .addComponent(jLNumPistas)
                        .addGap(18, 18, 18)
                        .addComponent(jTextMostrarNumPistas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelMostrarMUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMostrarMUSLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanelFormatoCdVin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMostrarMUSLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLImagenMUS)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanelMostrarMUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMostrarComentarioMUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxMostrarMUScomen))
                .addGap(33, 33, 33))
        );
        jPanelMostrarMUSLayout.setVerticalGroup(
            jPanelMostrarMUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMostrarMUSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMostrarMUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxMostrarMUScomen)
                    .addGroup(jPanelMostrarMUSLayout.createSequentialGroup()
                        .addGroup(jPanelMostrarMUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelMostrarMUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLNumPistas)
                                .addComponent(jTextMostrarNumPistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelFormatoCdVin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelMostrarMUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelMostrarMUSLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanelMostrarMUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextMostrarDur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLDuracion)
                                    .addComponent(jLImagenMUS, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelMostrarMUSLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelMostrarComentarioMUS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedMostrarPaneArticulos.addTab("Musica", jPanelMostrarMUS);

        jLEdadRec.setText("Edad Recomendada:");

        jTextMostrarEdadRec.setEnabled(false);

        jComboBoxMostrarPlataforma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PC", "PLAY3", "PLAY4", "PLAY5", "XBOX" }));
        jComboBoxMostrarPlataforma.setEnabled(false);

        jLPlataforma.setText("Plataforma:");

        jLCategoria.setText("Categoria:");

        jComboBoxMostrarCategoria.setEnabled(false);

        jLImagenVID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/videojuego60x60.png"))); // NOI18N

        jPanelMostrarComentarioVID.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comentario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jTextMostrarComenVID.setColumns(20);
        jTextMostrarComenVID.setRows(3);
        jTextMostrarComenVID.setEnabled(false);
        jScrollPane5.setViewportView(jTextMostrarComenVID);

        javax.swing.GroupLayout jPanelMostrarComentarioVIDLayout = new javax.swing.GroupLayout(jPanelMostrarComentarioVID);
        jPanelMostrarComentarioVID.setLayout(jPanelMostrarComentarioVIDLayout);
        jPanelMostrarComentarioVIDLayout.setHorizontalGroup(
            jPanelMostrarComentarioVIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        jPanelMostrarComentarioVIDLayout.setVerticalGroup(
            jPanelMostrarComentarioVIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        jCheckBoxMostrarVIDcomen.setText("Añadir comentario");
        jCheckBoxMostrarVIDcomen.setEnabled(false);

        jLFormatoFisico.setText("Formato Fisico");

        jRadioMostrarFormatoVIDsi.setText("Si");
        jRadioMostrarFormatoVIDsi.setEnabled(false);

        jRadioMostrarFormatoVIDno.setText("No");
        jRadioMostrarFormatoVIDno.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLFormatoFisico)
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioMostrarFormatoVIDsi)
                .addGap(18, 18, 18)
                .addComponent(jRadioMostrarFormatoVIDno)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLFormatoFisico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioMostrarFormatoVIDsi)
                    .addComponent(jRadioMostrarFormatoVIDno))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMostrarVIDLayout = new javax.swing.GroupLayout(jPanelMostrarVID);
        jPanelMostrarVID.setLayout(jPanelMostrarVIDLayout);
        jPanelMostrarVIDLayout.setHorizontalGroup(
            jPanelMostrarVIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMostrarVIDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMostrarVIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMostrarVIDLayout.createSequentialGroup()
                        .addComponent(jLCategoria)
                        .addGap(33, 33, 33)
                        .addComponent(jComboBoxMostrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMostrarVIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelMostrarVIDLayout.createSequentialGroup()
                            .addComponent(jLEdadRec)
                            .addGap(18, 18, 18)
                            .addComponent(jTextMostrarEdadRec, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelMostrarVIDLayout.createSequentialGroup()
                            .addComponent(jLPlataforma)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxMostrarPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelMostrarVIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMostrarVIDLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMostrarVIDLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLImagenVID)))
                .addGap(51, 51, 51)
                .addGroup(jPanelMostrarVIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMostrarComentarioVID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxMostrarVIDcomen))
                .addGap(44, 44, 44))
        );
        jPanelMostrarVIDLayout.setVerticalGroup(
            jPanelMostrarVIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMostrarVIDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMostrarVIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelMostrarVIDLayout.createSequentialGroup()
                        .addGroup(jPanelMostrarVIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEdadRec)
                            .addComponent(jTextMostrarEdadRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxMostrarVIDcomen))
                        .addGroup(jPanelMostrarVIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMostrarVIDLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanelMostrarVIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxMostrarPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLPlataforma))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelMostrarVIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxMostrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelMostrarVIDLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelMostrarComentarioVID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelMostrarVIDLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLImagenVID)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedMostrarPaneArticulos.addTab("Videojuego", jPanelMostrarVID);

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
            .addComponent(jPanelArticulos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonVolver)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTabbedMostrarPaneArticulos)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedMostrarPaneArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(605, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 73, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarActionPerformed
        boolean sw = true;
        int codArtBusca;
        try {
            codArtBusca = Integer.parseInt(jTextcodArtBusca.getText());
            MiLibreria.checkNegativo(codArtBusca);
            jLErrorcodArtBuscar.setText("");
        } catch (ExNegativo e) {
            jLErrorcodArtBuscar.setText(e.getMessage());
            jLErrorcodArtBuscar.setForeground(Color.red);
            jTextcodArtBusca.requestFocus();
            sw = false;
        } catch (NumberFormatException e) {
            jLErrorcodArtBuscar.setText("Solo numeros!");
            jLErrorcodArtBuscar.setForeground(Color.red);
            jTextcodArtBusca.requestFocus();
            sw = false;
        }
        if (sw) {
            jButtonBuscar.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonValidarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        int id;
        id = Integer.parseInt(jTextcodArtBusca.getText());
        try {
            //cargaCampos(id);
            con.conecta();
            con.crearSentencia();
            conAutor.conecta();
            conAutor.crearSentencia();
            art = con.dameArticuloCodigo(id);
            if (art == null) {
                JOptionPane.showMessageDialog(null, "id no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                cargaCampos(art);
                jPanel3.setVisible(true);
            }
            con.cerrarConexion();
            conAutor.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            // TODO add your handling code here:
            con.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(MostrarArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JCheckBox jCheckBoxMostrarLAUcomen;
    private javax.swing.JCheckBox jCheckBoxMostrarLIMcomen;
    private javax.swing.JCheckBox jCheckBoxMostrarMUScomen;
    private javax.swing.JCheckBox jCheckBoxMostrarVIDcomen;
    private javax.swing.JComboBox<String> jComboBoxMostrarCategoria;
    private javax.swing.JComboBox<String> jComboBoxMostrarPlataforma;
    private com.toedter.calendar.JDateChooser jDateChooserMostrarFechaActual;
    private javax.swing.JLabel jLApeAutor;
    private javax.swing.JLabel jLAñoArt;
    private javax.swing.JLabel jLAñoAut;
    private javax.swing.JLabel jLAñoAut1;
    private javax.swing.JLabel jLCategoria;
    private javax.swing.JLabel jLCodArt;
    private javax.swing.JLabel jLDeterioradoArt;
    private javax.swing.JLabel jLDuracion;
    private javax.swing.JLabel jLEbook;
    private javax.swing.JLabel jLEdadRec;
    private javax.swing.JLabel jLErrorcodArtBuscar;
    private javax.swing.JLabel jLFormato;
    private javax.swing.JLabel jLFormatoFisico;
    private javax.swing.JLabel jLHorasDur;
    private javax.swing.JLabel jLImagenAudioLib;
    private javax.swing.JLabel jLImagenLibroImpreso;
    private javax.swing.JLabel jLImagenMUS;
    private javax.swing.JLabel jLImagenVID;
    private javax.swing.JLabel jLMinDur;
    private javax.swing.JLabel jLNomArt;
    private javax.swing.JLabel jLNomAutor;
    private javax.swing.JLabel jLNumPistas;
    private javax.swing.JLabel jLPlataforma;
    private javax.swing.JLabel jLSintetizador;
    private javax.swing.JLabel jLTapaLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLcodArt;
    private javax.swing.JLabel jLnumpaginas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelArticulos;
    private javax.swing.JPanel jPanelAutor;
    private javax.swing.JPanel jPanelDeteriorado;
    private javax.swing.JPanel jPanelEbook;
    private javax.swing.JPanel jPanelFormatoCdVin;
    private javax.swing.JPanel jPanelMostrarAudioLibro;
    private javax.swing.JPanel jPanelMostrarComentarioAUD;
    private javax.swing.JPanel jPanelMostrarComentarioLIM;
    private javax.swing.JPanel jPanelMostrarComentarioMUS;
    private javax.swing.JPanel jPanelMostrarComentarioVID;
    private javax.swing.JPanel jPanelMostrarLibroImpreso;
    private javax.swing.JPanel jPanelMostrarMUS;
    private javax.swing.JPanel jPanelMostrarVID;
    private javax.swing.JPanel jPanelResumen;
    private javax.swing.JPanel jPanelSintetizador;
    private javax.swing.JPanel jPanelTapa;
    private javax.swing.JRadioButton jRadioButtonMostrarCD;
    private javax.swing.JRadioButton jRadioButtonMostrarDeterioradoNO;
    private javax.swing.JRadioButton jRadioButtonMostrarDeterioradoSI;
    private javax.swing.JRadioButton jRadioButtonMostrarSintetizNO;
    private javax.swing.JRadioButton jRadioButtonMostrarSintetizSI;
    private javax.swing.JRadioButton jRadioButtonMostrarVINILO;
    private javax.swing.JRadioButton jRadioMostrarEbookNO;
    private javax.swing.JRadioButton jRadioMostrarEbookSI;
    private javax.swing.JRadioButton jRadioMostrarFormatoVIDno;
    private javax.swing.JRadioButton jRadioMostrarFormatoVIDsi;
    private javax.swing.JRadioButton jRadioMostrarTapaDURA;
    private javax.swing.JRadioButton jRadioMostrartapaBLANDA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedMostrarPaneArticulos;
    private javax.swing.JTextField jTextMostrarApeAut;
    private javax.swing.JTextField jTextMostrarAñoArt;
    private javax.swing.JTextField jTextMostrarAñoAut;
    private javax.swing.JTextField jTextMostrarCodAut;
    private javax.swing.JTextArea jTextMostrarComenAUD;
    private javax.swing.JTextArea jTextMostrarComenLIM;
    private javax.swing.JTextArea jTextMostrarComenMUS;
    private javax.swing.JTextArea jTextMostrarComenVID;
    private javax.swing.JTextField jTextMostrarDur;
    private javax.swing.JTextField jTextMostrarEdadRec;
    private javax.swing.JTextField jTextMostrarHorasDur;
    private javax.swing.JTextField jTextMostrarMinDur;
    private javax.swing.JTextField jTextMostrarNomArt;
    private javax.swing.JTextField jTextMostrarNomAutor;
    private javax.swing.JTextField jTextMostrarNumPags;
    private javax.swing.JTextField jTextMostrarNumPistas;
    private javax.swing.JTextField jTextMostrarPubliAut;
    private javax.swing.JTextArea jTextMostrarResumen;
    private javax.swing.JTextField jTextcodArt;
    private javax.swing.JTextField jTextcodArtBusca;
    // End of variables declaration//GEN-END:variables

    public void cargaCampos(Articulo a) {
        //AUTOR
        aut = conAutor.obtenerAutorCodigo(art.getAutor());
        jTextMostrarNomAutor.setText(aut.getNom());
        jTextMostrarApeAut.setText(aut.getApell());
        jTextMostrarAñoAut.setText(String.valueOf(aut.getAnyo_nac()));
        jTextMostrarPubliAut.setText(String.valueOf(aut.getPublicaciones()));
        jTextMostrarCodAut.setText(art.getAutor());
        //ARTICULO
        jTextMostrarNomArt.setText(a.getNombre());
        jTextMostrarAñoArt.setText(String.valueOf(a.getAnyo()));
        if (a.isDeteriorado()) {
            jRadioButtonMostrarDeterioradoSI.setSelected(true);
        } else if (!a.isDeteriorado()) {
            jRadioButtonMostrarDeterioradoNO.setSelected(true);
        }
        jTextMostrarResumen.setText(a.getResumen());
        jDateChooserMostrarFechaActual.setDate(a.getFecha());
        jTextcodArt.setText(String.valueOf(a.getCodArt()));
        //LIBRO IMPRESO

        if (a instanceof LibroImpreso) {
            lim = (LibroImpreso) a;
            jTabbedMostrarPaneArticulos.setSelectedIndex(0);
            if (lim.isFormato()) {
                jRadioMostrarEbookSI.setSelected(true);
            }

            if (!lim.isFormato()) {
                jRadioMostrarEbookNO.setSelected(true);
            }

            if (lim.getTapa().equalsIgnoreCase("Blanda")) {
                jRadioMostrartapaBLANDA.setSelected(true);
            }
            if (lim.getTapa().equalsIgnoreCase("Dura")) {
                jRadioMostrarTapaDURA.setSelected(true);
            }
            jTextMostrarNumPags.setText(String.valueOf(lim.getNumPaginas()));

            if (lim.getComentarios().toString().equals("[]")) {
                jCheckBoxMostrarLIMcomen.setSelected(false);
            } else {
                jCheckBoxMostrarLIMcomen.setSelected(true);
                jTextMostrarComenLIM.setText(lim.getComentarios().toString());
            }
            //AUDIOLIBRO
        }
        if (a instanceof AudioLibro) {
            lau = (AudioLibro) a;
            jTabbedMostrarPaneArticulos.setSelectedIndex(1);
            if (lau.isSintetizador()) {
                jRadioButtonMostrarSintetizSI.setSelected(true);
            }
            if (!lau.isSintetizador()) {
                jRadioButtonMostrarSintetizNO.setSelected(true);
            }
            jTextMostrarHorasDur.setText(String.valueOf(lau.getHorasDuracion()));
            jTextMostrarMinDur.setText(String.valueOf(lau.getMinDuracion()));

            if (lau.getComentarios().toString().equals("[]")) {
                jCheckBoxMostrarLAUcomen.setSelected(false);
            } else {
                jCheckBoxMostrarLAUcomen.setSelected(true);
                jTextMostrarComenAUD.setText(lau.getComentarios().toString());
            }

        }
        //MUSICA
        if (a instanceof Musica) {
            mus = (Musica) a;
            jTabbedMostrarPaneArticulos.setSelectedIndex(2);
            jTextMostrarNumPistas.setText(String.valueOf(mus.getnPistas()));
            jTextMostrarDur.setText(String.valueOf(mus.getDuracion()));
            if (mus.getTipo().equalsIgnoreCase("CD")) {
                jRadioButtonMostrarCD.setSelected(true);
            }
            if (mus.getTipo().equalsIgnoreCase("Vinilo")) {
                jRadioButtonMostrarVINILO.setSelected(true);
            }
            if (mus.getComentarios().toString().equals("[]")) {
                jCheckBoxMostrarMUScomen.setSelected(false);
            } else {
                jCheckBoxMostrarMUScomen.setSelected(true);
                jTextMostrarComenMUS.setText(mus.getComentarios().toString());
            }
        }
        //VIDEOJUEGO
        if (a instanceof VideoJuego) {
            vid = (VideoJuego) a;
            jTabbedMostrarPaneArticulos.setSelectedIndex(3);
            jTextMostrarEdadRec.setText(String.valueOf(vid.getEdadRecomendada()));
            if (vid.getPlataforma().equalsIgnoreCase("PC")) {
                jComboBoxMostrarPlataforma.setSelectedIndex(0);
            }
            if (vid.getPlataforma().equalsIgnoreCase("PLAY3")) {
                jComboBoxMostrarPlataforma.setSelectedIndex(1);
            }
            if (vid.getPlataforma().equalsIgnoreCase("PLAY4")) {
                jComboBoxMostrarPlataforma.setSelectedIndex(2);
            }
            if (vid.getPlataforma().equalsIgnoreCase("PLAY5")) {
                jComboBoxMostrarPlataforma.setSelectedIndex(3);
            }
            if (vid.getPlataforma().equalsIgnoreCase("XBOX")) {
                jComboBoxMostrarPlataforma.setSelectedIndex(4);
            }
            if (vid.getCategoria().equalsIgnoreCase("Aventuras")) {
                jComboBoxMostrarCategoria.setSelectedIndex(0);
            }
            if (vid.getCategoria().equalsIgnoreCase("Bélico")) {
                jComboBoxMostrarCategoria.setSelectedIndex(1);
            }
            if (vid.getCategoria().equalsIgnoreCase("Puzzle")) {
                jComboBoxMostrarCategoria.setSelectedIndex(2);
            }
            
            if (vid.isFormatoFisico()) {
                jRadioMostrarFormatoVIDsi.setSelected(true);
            }
            if (!vid.isFormatoFisico()) {
                jRadioMostrarFormatoVIDno.setSelected(true);
            }
            if (vid.getComentarios().toString().equals("[]")) {
                jCheckBoxMostrarVIDcomen.setSelected(false);
            } else {
                jCheckBoxMostrarVIDcomen.setSelected(true);
                jTextMostrarComenVID.setText(vid.getComentarios().toString());
            }
        }
    }
    
    /*
    public void mostrarArticulo(Articulo a) {
        //AUTOR
        jTextMostrarNomAutor.setText(a.getAutor().getNom());
        jTextMostrarApeAut.setText(a.getAutor().getApell());
        jTextMostrarAñoAut.setText(String.valueOf(a.getAutor().getAnyo_nac()));
        jTextMostrarPubliAut.setText(String.valueOf(a.getAutor().getPublicaciones()));
        //ARTICULO
        jTextMostrarNomArt.setText(a.getNombre());
        jTextMostrarAñoArt.setText(String.valueOf(a.getAnyo()));
        if (a.isDeteriorado()) {
            jRadioButtonMostrarDeterioradoSI.setSelected(true);
        } else if (!a.isDeteriorado()) {
            jRadioButtonMostrarDeterioradoNO.setSelected(true);
        }
        jTextMostrarResumen.setText(a.getResumen());
        jDateChooserMostrarFechaActual.setDate(a.getFecha());
        jTextcodArt.setText(a.getCodArt());
        //LIBRO IMPRESO

        if (a instanceof LibroImpreso) {
            lim = (LibroImpreso) a;
            jTabbedMostrarPaneArticulos.setSelectedIndex(0);
            if (lim.isFormato()) {
                jRadioMostrarEbookSI.setSelected(true);
            }

            if (!lim.isFormato()) {
                jRadioMostrarEbookNO.setSelected(true);
            }

            if (lim.getTapa().equalsIgnoreCase("Blanda")) {
                jRadioMostrartapaBLANDA.setSelected(true);
            }
            if (lim.getTapa().equalsIgnoreCase("Dura")) {
                jRadioMostrarTapaDURA.setSelected(true);
            }
            jTextMostrarNumPags.setText(String.valueOf(lim.getNumPaginas()));
            
            if (lim.getComentarios().toString().equals("[]") ) {
                jCheckBoxMostrarLIMcomen.setSelected(false);
            } else {
                jCheckBoxMostrarLIMcomen.setSelected(true);
                jTextMostrarComenLIM.setText(lim.getComentarios().toString());
            }
            //AUDIOLIBRO
        }
        if (a instanceof AudioLibro) {
            lau = (AudioLibro) a;
            jTabbedMostrarPaneArticulos.setSelectedIndex(1);
            if (lau.isSintetizador()) {
                jRadioButtonMostrarSintetizSI.setSelected(true);
            }
            if (!lau.isSintetizador()) {
                jRadioButtonMostrarSintetizNO.setSelected(true);
            }
            jTextMostrarHorasDur.setText(String.valueOf(lau.getHorasDuracion()));
            jTextMostrarMinDur.setText(String.valueOf(lau.getMinDuracion()));

            if (lau.getComentarios().toString().equals("[]") ) {
                jCheckBoxMostrarLAUcomen.setSelected(false);
            } else {
                jCheckBoxMostrarLAUcomen.setSelected(true);
                jTextMostrarComenAUD.setText(lau.getComentarios().toString());
            }
            
        }
        //MUSICA
        if (a instanceof Musica) {
            mus = (Musica) a;
            jTabbedMostrarPaneArticulos.setSelectedIndex(2);
            jTextMostrarNumPistas.setText(String.valueOf(mus.getnPistas()));
            jTextMostrarDur.setText(String.valueOf(mus.getDuracion()));
            if (mus.getTipo().equalsIgnoreCase("CD")) {
                jRadioButtonMostrarCD.setSelected(true);
            }
            if (mus.getTipo().equalsIgnoreCase("Vinilo")) {
                jRadioButtonMostrarVINILO.setSelected(true);
            }
            if (mus.getComentarios().toString().equals("[]") ) {
                jCheckBoxMostrarMUScomen.setSelected(false);
            } else {
                jCheckBoxMostrarMUScomen.setSelected(true);
                jTextMostrarComenMUS.setText(mus.getComentarios().toString());
            }
        }
        //VIDEOJUEGO
        if (a instanceof VideoJuego) {
            vid = (VideoJuego) a;
            jTabbedMostrarPaneArticulos.setSelectedIndex(3);
            jTextMostrarEdadRec.setText(String.valueOf(vid.getEdadRecomendada()));
            if (vid.getPlataforma().equalsIgnoreCase("PC")) {
                jComboBoxMostrarPlataforma.setSelectedIndex(0);
            }
            if (vid.getPlataforma().equalsIgnoreCase("PLAY3")) {
                jComboBoxMostrarPlataforma.setSelectedIndex(1);
            }
            if (vid.getPlataforma().equalsIgnoreCase("PLAY4")) {
                jComboBoxMostrarPlataforma.setSelectedIndex(2);
            }
            if (vid.getPlataforma().equalsIgnoreCase("PLAY5")) {
                jComboBoxMostrarPlataforma.setSelectedIndex(3);
            }
            if (vid.getPlataforma().equalsIgnoreCase("XBOX")) {
                jComboBoxMostrarPlataforma.setSelectedIndex(4);
            }
            if (vid.getCategoria().equalsIgnoreCase("Aventura")) {
                jComboBoxMostrarCategoria.setSelectedIndex(0);
            }
            if (vid.getCategoria().equalsIgnoreCase("Multiplataforma")) {
                jComboBoxMostrarCategoria.setSelectedIndex(1);
            }
            if (vid.getCategoria().equalsIgnoreCase("Arcade")) {
                jComboBoxMostrarCategoria.setSelectedIndex(2);
            }
            if (vid.getCategoria().equalsIgnoreCase("Deportivo")) {
                jComboBoxMostrarCategoria.setSelectedIndex(3);
            }
            if (vid.isFormatoFisico()) {
                jRadioMostrarFormatoVIDsi.setSelected(true);
            }
            if (!vid.isFormatoFisico()) {
                jRadioMostrarFormatoVIDno.setSelected(true);
            }
            if (vid.getComentarios().toString().equals("[]") ) {
                jCheckBoxMostrarVIDcomen.setSelected(false);
            } else {
                jCheckBoxMostrarVIDcomen.setSelected(true);
                jTextMostrarComenVID.setText(vid.getComentarios().toString());
            }
        }
    }
     */
    /*
    private int cargaCamposObj(Articulo a) {
        String sentSql = "";
        int ok = -1;
        if (a != null) {
            //AUTOR
            jTextMostrarNomAutor.setText(a.getAutor().getNom());
            jTextMostrarApeAut.setText(a.getAutor().getApell());
            jTextMostrarAñoAut.setText(String.valueOf(a.getAutor().getAnyo_nac()));
            jTextMostrarPubliAut.setText(String.valueOf(a.getAutor().getPublicaciones()));
            //ARTICULO
            jTextMostrarNomArt.setText(a.getNombre());
            jTextMostrarAñoArt.setText(String.valueOf(a.getAnyo()));
            if (a.isDeteriorado()) {
                jRadioButtonMostrarDeterioradoSI.setSelected(true);
            } else if (!a.isDeteriorado()) {
                jRadioButtonMostrarDeterioradoNO.setSelected(true);
            }
            jTextMostrarResumen.setText(a.getResumen());
            jDateChooserMostrarFechaActual.setDate(a.getFecha());
            jTextcodArt.setText(String.valueOf(a.getCodArt()));
            //LIBRO IMPRESO

            if (a instanceof LibroImpreso) {
                lim = (LibroImpreso) a;
                jTabbedMostrarPaneArticulos.setSelectedIndex(0);
                if (lim.isFormato()) {
                    jRadioMostrarEbookSI.setSelected(true);
                }

                if (!lim.isFormato()) {
                    jRadioMostrarEbookNO.setSelected(true);
                }

                if (lim.getTapa().equalsIgnoreCase("Blanda")) {
                    jRadioMostrartapaBLANDA.setSelected(true);
                }
                if (lim.getTapa().equalsIgnoreCase("Dura")) {
                    jRadioMostrarTapaDURA.setSelected(true);
                }
                jTextMostrarNumPags.setText(String.valueOf(lim.getNumPaginas()));

                if (lim.getComentarios().toString().equals("[]")) {
                    jCheckBoxMostrarLIMcomen.setSelected(false);
                } else {
                    jCheckBoxMostrarLIMcomen.setSelected(true);
                    jTextMostrarComenLIM.setText(lim.getComentarios().toString());
                }
                //AUDIOLIBRO
            }
            if (a instanceof AudioLibro) {
                lau = (AudioLibro) a;
                jTabbedMostrarPaneArticulos.setSelectedIndex(1);
                if (lau.isSintetizador()) {
                    jRadioButtonMostrarSintetizSI.setSelected(true);
                }
                if (!lau.isSintetizador()) {
                    jRadioButtonMostrarSintetizNO.setSelected(true);
                }
                jTextMostrarHorasDur.setText(String.valueOf(lau.getHorasDuracion()));
                jTextMostrarMinDur.setText(String.valueOf(lau.getMinDuracion()));

                if (lau.getComentarios().toString().equals("[]")) {
                    jCheckBoxMostrarLAUcomen.setSelected(false);
                } else {
                    jCheckBoxMostrarLAUcomen.setSelected(true);
                    jTextMostrarComenAUD.setText(lau.getComentarios().toString());
                }

            }
            //MUSICA
            if (a instanceof Musica) {
                mus = (Musica) a;
                jTabbedMostrarPaneArticulos.setSelectedIndex(2);
                jTextMostrarNumPistas.setText(String.valueOf(mus.getnPistas()));
                jTextMostrarDur.setText(String.valueOf(mus.getDuracion()));
                if (mus.getTipo().equalsIgnoreCase("CD")) {
                    jRadioButtonMostrarCD.setSelected(true);
                }
                if (mus.getTipo().equalsIgnoreCase("Vinilo")) {
                    jRadioButtonMostrarVINILO.setSelected(true);
                }
                if (mus.getComentarios().toString().equals("[]")) {
                    jCheckBoxMostrarMUScomen.setSelected(false);
                } else {
                    jCheckBoxMostrarMUScomen.setSelected(true);
                    jTextMostrarComenMUS.setText(mus.getComentarios().toString());
                }
            }
            //VIDEOJUEGO
            if (a instanceof VideoJuego) {
                vid = (VideoJuego) a;
                jTabbedMostrarPaneArticulos.setSelectedIndex(3);
                jTextMostrarEdadRec.setText(String.valueOf(vid.getEdadRecomendada()));
                if (vid.getPlataforma().equalsIgnoreCase("PC")) {
                    jComboBoxMostrarPlataforma.setSelectedIndex(0);
                }
                if (vid.getPlataforma().equalsIgnoreCase("PLAY3")) {
                    jComboBoxMostrarPlataforma.setSelectedIndex(1);
                }
                if (vid.getPlataforma().equalsIgnoreCase("PLAY4")) {
                    jComboBoxMostrarPlataforma.setSelectedIndex(2);
                }
                if (vid.getPlataforma().equalsIgnoreCase("PLAY5")) {
                    jComboBoxMostrarPlataforma.setSelectedIndex(3);
                }
                if (vid.getPlataforma().equalsIgnoreCase("XBOX")) {
                    jComboBoxMostrarPlataforma.setSelectedIndex(4);
                }
                if (vid.getCategoria().equalsIgnoreCase("Aventuras")) {
                    jComboBoxMostrarCategoria.setSelectedIndex(0);
                }
                if (vid.getCategoria().equalsIgnoreCase("Belico")) {
                    jComboBoxMostrarCategoria.setSelectedIndex(1);
                }
                if (vid.getCategoria().equalsIgnoreCase("Puzzle")) {
                    jComboBoxMostrarCategoria.setSelectedIndex(2);
                }
                
                if (vid.isFormatoFisico()) {
                    jRadioMostrarFormatoVIDsi.setSelected(true);
                }
                if (!vid.isFormatoFisico()) {
                    jRadioMostrarFormatoVIDno.setSelected(true);
                }
                if (vid.getComentarios().toString().equals("[]")) {
                    jCheckBoxMostrarVIDcomen.setSelected(false);
                } else {
                    jCheckBoxMostrarVIDcomen.setSelected(true);
                    jTextMostrarComenVID.setText(vid.getComentarios().toString());
                }
            }
            ok = 1;
        } else {
            JOptionPane.showMessageDialog(this, "Id no encontrada!");
        }
        return ok;
    }
*/
}

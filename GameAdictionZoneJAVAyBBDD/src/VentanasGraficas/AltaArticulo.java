package VentanasGraficas;

import ADO.*;
import Exceptions.*;
import MisListas.*;
import java.awt.Color;
import java.sql.*;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class AltaArticulo extends javax.swing.JFrame {

    ConectaBBDD con = new ConectaBBDD();
    private Autor aut;
    private Articulo art;

    public AltaArticulo() {
        initComponents();
        jDateChooserFechaActual.setDate(estableceFechaActual());
        
        setLocationRelativeTo(null);//Se posiciona la pantalla en el centro de la pantalla
        jPanelComentarioAUD.setVisible(false);
        jPanelComentarioLIM.setVisible(false);
        jPanelComentarioMUS.setVisible(false);
        jPanelComentarioVID.setVisible(false);
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
                jComboBoxCategoria.addItem(nom);
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

        buttonGroupDeterioradoArt = new javax.swing.ButtonGroup();
        buttonGroupEbook = new javax.swing.ButtonGroup();
        buttonGroupTapa = new javax.swing.ButtonGroup();
        buttonGroupSintetizador = new javax.swing.ButtonGroup();
        buttonGroupFormatoCDVINILO = new javax.swing.ButtonGroup();
        buttonGroupVIDFormato = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanelArticulos = new javax.swing.JPanel();
        jLNomArt = new javax.swing.JLabel();
        jLAñoArt = new javax.swing.JLabel();
        jTextNomArt = new javax.swing.JTextField();
        jTextAñoArt = new javax.swing.JTextField();
        jPanelResumen = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextResumen = new javax.swing.JTextArea();
        jPanelDeteriorado = new javax.swing.JPanel();
        jRadioButtonDeterioradoSI = new javax.swing.JRadioButton();
        jRadioButtonDeterioradoNO = new javax.swing.JRadioButton();
        jLDeterioradoArt = new javax.swing.JLabel();
        jLErrorNomArt = new javax.swing.JLabel();
        jLErrorAñoArt = new javax.swing.JLabel();
        jLErrorResumenArt = new javax.swing.JLabel();
        jDateChooserFechaActual = new com.toedter.calendar.JDateChooser();
        jPanelAutor = new javax.swing.JPanel();
        jLCodAut = new javax.swing.JLabel();
        jTextCodAut = new javax.swing.JTextField();
        jLErrorCodAut = new javax.swing.JLabel();
        jButtonBuscaAutor = new javax.swing.JButton();
        jTabbedPaneArticulos = new javax.swing.JTabbedPane();
        jPanelLibroImpreso = new javax.swing.JPanel();
        jPanelEbook = new javax.swing.JPanel();
        jLEbook = new javax.swing.JLabel();
        jRadioEbookSI = new javax.swing.JRadioButton();
        jRadioEbookNO = new javax.swing.JRadioButton();
        jPanelTapa = new javax.swing.JPanel();
        jLTapaLibro = new javax.swing.JLabel();
        jRadioTapaDURA = new javax.swing.JRadioButton();
        jRadiotapaBLANDA = new javax.swing.JRadioButton();
        jLnumpaginas = new javax.swing.JLabel();
        jTextNumPags = new javax.swing.JTextField();
        jLErrorNumPags = new javax.swing.JLabel();
        jLImagenLibroImpreso = new javax.swing.JLabel();
        jPanelComentarioLIM = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextComenLIM = new javax.swing.JTextArea();
        jLErrorComenLIM = new javax.swing.JLabel();
        jCheckBoxLIMcomen = new javax.swing.JCheckBox();
        jPanelAudioLibro = new javax.swing.JPanel();
        jPanelSintetizador = new javax.swing.JPanel();
        jLSintetizador = new javax.swing.JLabel();
        jRadioButtonSintetizSI = new javax.swing.JRadioButton();
        jRadioButtonSintetizNO = new javax.swing.JRadioButton();
        jLHorasDur = new javax.swing.JLabel();
        jTextHorasDur = new javax.swing.JTextField();
        jLMinDur = new javax.swing.JLabel();
        jTextMinDur = new javax.swing.JTextField();
        jLErrorHorasDur = new javax.swing.JLabel();
        jLErrorMinDur = new javax.swing.JLabel();
        jLImagenAudioLib = new javax.swing.JLabel();
        jPanelComentarioAUD = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextComenAUD = new javax.swing.JTextArea();
        jLErrorComenLAU = new javax.swing.JLabel();
        jCheckBoxLAUcomen = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLNumPistas = new javax.swing.JLabel();
        jTextNumPistas = new javax.swing.JTextField();
        jLErrorNumPistas = new javax.swing.JLabel();
        jLDuracion = new javax.swing.JLabel();
        jTextDur = new javax.swing.JTextField();
        jLErrorDur = new javax.swing.JLabel();
        jPanelFormatoCdVin = new javax.swing.JPanel();
        jLFormato = new javax.swing.JLabel();
        jRadioButtonCD = new javax.swing.JRadioButton();
        jRadioButtonVINILO = new javax.swing.JRadioButton();
        jLImagenMUS = new javax.swing.JLabel();
        jPanelComentarioMUS = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextComenMUS = new javax.swing.JTextArea();
        jLErrorComenMUS = new javax.swing.JLabel();
        jCheckBoxMUScomen = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jLEdadRec = new javax.swing.JLabel();
        jTextEdadRec = new javax.swing.JTextField();
        jLErrorEdadRec = new javax.swing.JLabel();
        jComboBoxPlataforma = new javax.swing.JComboBox<>();
        jLPlataforma = new javax.swing.JLabel();
        jLCategoria = new javax.swing.JLabel();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jLImagenVID = new javax.swing.JLabel();
        jPanelComentarioVID = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextComenVID = new javax.swing.JTextArea();
        jLErrorComenVID = new javax.swing.JLabel();
        jCheckBoxVIDcomen = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLFormatoFisico = new javax.swing.JLabel();
        jRadioFormatoVIDsi = new javax.swing.JRadioButton();
        jRadioFormatoVIDno = new javax.swing.JRadioButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonValidar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));

        jPanelArticulos.setBorder(javax.swing.BorderFactory.createTitledBorder("Articulo"));

        jLNomArt.setText("Nombre:");

        jLAñoArt.setText("Año:");

        jPanelResumen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resumen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jTextResumen.setColumns(20);
        jTextResumen.setRows(3);
        jTextResumen.setText("...");
        jScrollPane1.setViewportView(jTextResumen);

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

        buttonGroupDeterioradoArt.add(jRadioButtonDeterioradoSI);
        jRadioButtonDeterioradoSI.setText("Si");

        buttonGroupDeterioradoArt.add(jRadioButtonDeterioradoNO);
        jRadioButtonDeterioradoNO.setSelected(true);
        jRadioButtonDeterioradoNO.setText("No");

        jLDeterioradoArt.setText("Deteriorado:");

        javax.swing.GroupLayout jPanelDeterioradoLayout = new javax.swing.GroupLayout(jPanelDeteriorado);
        jPanelDeteriorado.setLayout(jPanelDeterioradoLayout);
        jPanelDeterioradoLayout.setHorizontalGroup(
            jPanelDeterioradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeterioradoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLDeterioradoArt)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonDeterioradoSI)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonDeterioradoNO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDeterioradoLayout.setVerticalGroup(
            jPanelDeterioradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeterioradoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDeterioradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonDeterioradoSI)
                    .addComponent(jRadioButtonDeterioradoNO)
                    .addComponent(jLDeterioradoArt)))
        );

        jDateChooserFechaActual.setEnabled(false);

        javax.swing.GroupLayout jPanelArticulosLayout = new javax.swing.GroupLayout(jPanelArticulos);
        jPanelArticulos.setLayout(jPanelArticulosLayout);
        jPanelArticulosLayout.setHorizontalGroup(
            jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArticulosLayout.createSequentialGroup()
                .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelArticulosLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanelDeteriorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelArticulosLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNomArt)
                            .addComponent(jLAñoArt))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLErrorNomArt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextNomArt)
                            .addComponent(jTextAñoArt)
                            .addComponent(jLErrorAñoArt, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLErrorResumenArt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelResumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserFechaActual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                            .addComponent(jTextNomArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLErrorNomArt, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLAñoArt)
                            .addComponent(jTextAñoArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jLErrorAñoArt, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelDeteriorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelArticulosLayout.createSequentialGroup()
                        .addComponent(jPanelResumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLErrorResumenArt, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAutor.setBorder(javax.swing.BorderFactory.createTitledBorder("Autor"));

        jLCodAut.setText("Codigo Autor:");

        jButtonBuscaAutor.setText("Buscar");
        jButtonBuscaAutor.setEnabled(false);
        jButtonBuscaAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAutorLayout = new javax.swing.GroupLayout(jPanelAutor);
        jPanelAutor.setLayout(jPanelAutorLayout);
        jPanelAutorLayout.setHorizontalGroup(
            jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAutorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLCodAut)
                .addGap(36, 36, 36)
                .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLErrorCodAut, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAutorLayout.createSequentialGroup()
                        .addComponent(jTextCodAut, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(jButtonBuscaAutor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAutorLayout.setVerticalGroup(
            jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAutorLayout.createSequentialGroup()
                .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAutorLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCodAut)
                            .addComponent(jTextCodAut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelAutorLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButtonBuscaAutor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLErrorCodAut, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jTabbedPaneArticulos.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione tipo de articulo"));

        jLEbook.setText("Formato ebook:");

        buttonGroupEbook.add(jRadioEbookSI);
        jRadioEbookSI.setSelected(true);
        jRadioEbookSI.setText("Si");

        buttonGroupEbook.add(jRadioEbookNO);
        jRadioEbookNO.setText("No");

        javax.swing.GroupLayout jPanelEbookLayout = new javax.swing.GroupLayout(jPanelEbook);
        jPanelEbook.setLayout(jPanelEbookLayout);
        jPanelEbookLayout.setHorizontalGroup(
            jPanelEbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEbookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLEbook)
                .addGap(18, 18, 18)
                .addComponent(jRadioEbookSI)
                .addGap(6, 6, 6)
                .addComponent(jRadioEbookNO)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanelEbookLayout.setVerticalGroup(
            jPanelEbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEbookLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelEbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEbook)
                    .addComponent(jRadioEbookSI)
                    .addComponent(jRadioEbookNO)))
        );

        jLTapaLibro.setText("Tapa:");

        buttonGroupTapa.add(jRadioTapaDURA);
        jRadioTapaDURA.setSelected(true);
        jRadioTapaDURA.setText("Dura");

        buttonGroupTapa.add(jRadiotapaBLANDA);
        jRadiotapaBLANDA.setText("Blanda");

        javax.swing.GroupLayout jPanelTapaLayout = new javax.swing.GroupLayout(jPanelTapa);
        jPanelTapa.setLayout(jPanelTapaLayout);
        jPanelTapaLayout.setHorizontalGroup(
            jPanelTapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTapaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTapaLibro)
                .addGap(34, 34, 34)
                .addComponent(jRadioTapaDURA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadiotapaBLANDA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        jPanelTapaLayout.setVerticalGroup(
            jPanelTapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTapaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelTapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTapaLibro)
                    .addComponent(jRadioTapaDURA)
                    .addComponent(jRadiotapaBLANDA)))
        );

        jLnumpaginas.setText("Numero paginas:");

        jTextNumPags.setText("1");

        jLImagenLibroImpreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/book60x60.png"))); // NOI18N

        jPanelComentarioLIM.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comentario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jTextComenLIM.setColumns(20);
        jTextComenLIM.setRows(5);
        jScrollPane2.setViewportView(jTextComenLIM);

        javax.swing.GroupLayout jPanelComentarioLIMLayout = new javax.swing.GroupLayout(jPanelComentarioLIM);
        jPanelComentarioLIM.setLayout(jPanelComentarioLIMLayout);
        jPanelComentarioLIMLayout.setHorizontalGroup(
            jPanelComentarioLIMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
            .addGroup(jPanelComentarioLIMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLErrorComenLIM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelComentarioLIMLayout.setVerticalGroup(
            jPanelComentarioLIMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComentarioLIMLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLErrorComenLIM, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jCheckBoxLIMcomen.setText("Añadir comentario");
        jCheckBoxLIMcomen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLIMcomenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLibroImpresoLayout = new javax.swing.GroupLayout(jPanelLibroImpreso);
        jPanelLibroImpreso.setLayout(jPanelLibroImpresoLayout);
        jPanelLibroImpresoLayout.setHorizontalGroup(
            jPanelLibroImpresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLibroImpresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLibroImpresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLibroImpresoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelLibroImpresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLibroImpresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLErrorNumPags, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelLibroImpresoLayout.createSequentialGroup()
                                    .addComponent(jLnumpaginas)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextNumPags, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanelTapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLImagenLibroImpreso))
                    .addComponent(jPanelEbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanelLibroImpresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelComentarioLIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxLIMcomen))
                .addGap(68, 68, 68))
        );
        jPanelLibroImpresoLayout.setVerticalGroup(
            jPanelLibroImpresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLibroImpresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLibroImpresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxLIMcomen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLibroImpresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLibroImpresoLayout.createSequentialGroup()
                        .addGroup(jPanelLibroImpresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLibroImpresoLayout.createSequentialGroup()
                                .addComponent(jPanelTapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(jPanelLibroImpresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLnumpaginas)
                                    .addComponent(jTextNumPags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLImagenLibroImpreso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLErrorNumPags, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addComponent(jPanelComentarioLIM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPaneArticulos.addTab("Libro Impreso", jPanelLibroImpreso);

        jLSintetizador.setText("Sintetizador:");

        buttonGroupSintetizador.add(jRadioButtonSintetizSI);
        jRadioButtonSintetizSI.setSelected(true);
        jRadioButtonSintetizSI.setText("Si");

        buttonGroupSintetizador.add(jRadioButtonSintetizNO);
        jRadioButtonSintetizNO.setText("No");

        javax.swing.GroupLayout jPanelSintetizadorLayout = new javax.swing.GroupLayout(jPanelSintetizador);
        jPanelSintetizador.setLayout(jPanelSintetizadorLayout);
        jPanelSintetizadorLayout.setHorizontalGroup(
            jPanelSintetizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSintetizadorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLSintetizador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonSintetizSI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonSintetizNO))
        );
        jPanelSintetizadorLayout.setVerticalGroup(
            jPanelSintetizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSintetizadorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelSintetizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSintetizador)
                    .addComponent(jRadioButtonSintetizSI)
                    .addComponent(jRadioButtonSintetizNO)))
        );

        jLHorasDur.setText("Horas duracion:");

        jLMinDur.setText("Min duracion:");

        jLImagenAudioLib.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/audio-book60x60.png"))); // NOI18N

        jPanelComentarioAUD.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comentario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jTextComenAUD.setColumns(20);
        jTextComenAUD.setRows(3);
        jScrollPane3.setViewportView(jTextComenAUD);

        javax.swing.GroupLayout jPanelComentarioAUDLayout = new javax.swing.GroupLayout(jPanelComentarioAUD);
        jPanelComentarioAUD.setLayout(jPanelComentarioAUDLayout);
        jPanelComentarioAUDLayout.setHorizontalGroup(
            jPanelComentarioAUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanelComentarioAUDLayout.createSequentialGroup()
                .addComponent(jLErrorComenLAU, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelComentarioAUDLayout.setVerticalGroup(
            jPanelComentarioAUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComentarioAUDLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLErrorComenLAU, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jCheckBoxLAUcomen.setText("Añadir comentario");
        jCheckBoxLAUcomen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLAUcomenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAudioLibroLayout = new javax.swing.GroupLayout(jPanelAudioLibro);
        jPanelAudioLibro.setLayout(jPanelAudioLibroLayout);
        jPanelAudioLibroLayout.setHorizontalGroup(
            jPanelAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAudioLibroLayout.createSequentialGroup()
                .addGroup(jPanelAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLErrorHorasDur, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLErrorMinDur, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelAudioLibroLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanelSintetizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelAudioLibroLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLHorasDur)
                            .addGap(18, 18, 18)
                            .addGroup(jPanelAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextMinDur)
                                .addComponent(jTextHorasDur))))
                    .addGroup(jPanelAudioLibroLayout.createSequentialGroup()
                        .addComponent(jLMinDur)
                        .addGap(78, 78, 78)))
                .addGap(44, 44, 44)
                .addComponent(jLImagenAudioLib)
                .addGap(69, 69, 69)
                .addGroup(jPanelAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelComentarioAUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxLAUcomen))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanelAudioLibroLayout.setVerticalGroup(
            jPanelAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAudioLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSintetizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxLAUcomen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAudioLibroLayout.createSequentialGroup()
                        .addGroup(jPanelAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelAudioLibroLayout.createSequentialGroup()
                                .addGroup(jPanelAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLHorasDur)
                                    .addComponent(jTextHorasDur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addComponent(jLErrorHorasDur, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLImagenAudioLib, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelAudioLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAudioLibroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextMinDur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAudioLibroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLMinDur)
                                .addGap(18, 18, 18)))
                        .addComponent(jLErrorMinDur, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAudioLibroLayout.createSequentialGroup()
                        .addComponent(jPanelComentarioAUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPaneArticulos.addTab("Audio Libro", jPanelAudioLibro);

        jLNumPistas.setText("Numero pistas:");

        jLDuracion.setText("Duracion:");

        jLFormato.setText("Formato:");

        buttonGroupFormatoCDVINILO.add(jRadioButtonCD);
        jRadioButtonCD.setSelected(true);
        jRadioButtonCD.setText("Cd");

        buttonGroupFormatoCDVINILO.add(jRadioButtonVINILO);
        jRadioButtonVINILO.setText("Vinilo");

        javax.swing.GroupLayout jPanelFormatoCdVinLayout = new javax.swing.GroupLayout(jPanelFormatoCdVin);
        jPanelFormatoCdVin.setLayout(jPanelFormatoCdVinLayout);
        jPanelFormatoCdVinLayout.setHorizontalGroup(
            jPanelFormatoCdVinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormatoCdVinLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLFormato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonCD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonVINILO)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanelFormatoCdVinLayout.setVerticalGroup(
            jPanelFormatoCdVinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormatoCdVinLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFormatoCdVinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonCD)
                    .addComponent(jRadioButtonVINILO)
                    .addComponent(jLFormato)))
        );

        jLImagenMUS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cd60x60.png"))); // NOI18N

        jPanelComentarioMUS.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comentario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jTextComenMUS.setColumns(20);
        jTextComenMUS.setRows(3);
        jScrollPane4.setViewportView(jTextComenMUS);

        javax.swing.GroupLayout jPanelComentarioMUSLayout = new javax.swing.GroupLayout(jPanelComentarioMUS);
        jPanelComentarioMUS.setLayout(jPanelComentarioMUSLayout);
        jPanelComentarioMUSLayout.setHorizontalGroup(
            jPanelComentarioMUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(jPanelComentarioMUSLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLErrorComenMUS, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelComentarioMUSLayout.setVerticalGroup(
            jPanelComentarioMUSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComentarioMUSLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLErrorComenMUS, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jCheckBoxMUScomen.setText("Añadir comentario");
        jCheckBoxMUScomen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMUScomenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLErrorNumPistas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLErrorDur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLDuracion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                            .addComponent(jTextDur, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLNumPistas)
                        .addGap(18, 18, 18)
                        .addComponent(jTextNumPistas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanelFormatoCdVin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLImagenMUS)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelComentarioMUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxMUScomen))
                .addGap(33, 33, 33))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxMUScomen)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLNumPistas)
                                .addComponent(jTextNumPistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelFormatoCdVin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLErrorNumPistas, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextDur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLDuracion))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLErrorDur, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLImagenMUS, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelComentarioMUS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPaneArticulos.addTab("Musica", jPanel4);

        jLEdadRec.setText("Edad Recomendada:");

        jComboBoxPlataforma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PC", "PLAY3", "PLAY4", "PLAY5", "XBOX" }));

        jLPlataforma.setText("Plataforma:");

        jLCategoria.setText("Categoria:");

        jLImagenVID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/videojuego60x60.png"))); // NOI18N

        jPanelComentarioVID.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comentario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jTextComenVID.setColumns(20);
        jTextComenVID.setRows(3);
        jScrollPane5.setViewportView(jTextComenVID);

        javax.swing.GroupLayout jPanelComentarioVIDLayout = new javax.swing.GroupLayout(jPanelComentarioVID);
        jPanelComentarioVID.setLayout(jPanelComentarioVIDLayout);
        jPanelComentarioVIDLayout.setHorizontalGroup(
            jPanelComentarioVIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
            .addGroup(jPanelComentarioVIDLayout.createSequentialGroup()
                .addComponent(jLErrorComenVID, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelComentarioVIDLayout.setVerticalGroup(
            jPanelComentarioVIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComentarioVIDLayout.createSequentialGroup()
                .addComponent(jScrollPane5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLErrorComenVID, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jCheckBoxVIDcomen.setText("Añadir comentario");
        jCheckBoxVIDcomen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxVIDcomenActionPerformed(evt);
            }
        });

        jLFormatoFisico.setText("Formato Fisico");

        jRadioFormatoVIDsi.setText("Si");

        jRadioFormatoVIDno.setSelected(true);
        jRadioFormatoVIDno.setText("No");

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
                .addComponent(jRadioFormatoVIDsi)
                .addGap(18, 18, 18)
                .addComponent(jRadioFormatoVIDno)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLFormatoFisico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioFormatoVIDsi)
                    .addComponent(jRadioFormatoVIDno))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLErrorEdadRec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLCategoria)
                                .addGap(33, 33, 33)
                                .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLEdadRec)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextEdadRec, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLPlataforma)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLImagenVID)))
                .addGap(51, 51, 51)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelComentarioVID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxVIDcomen))
                .addGap(44, 44, 44))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEdadRec)
                            .addComponent(jTextEdadRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxVIDcomen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLErrorEdadRec, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLPlataforma))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanelComentarioVID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLImagenVID)
                        .addGap(12, 12, 12)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPaneArticulos.addTab("Videojuego", jPanel5);

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

        jButtonValidar.setText("Validar");
        jButtonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelArticulos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButtonValidar)
                .addGap(116, 116, 116)
                .addComponent(jButtonGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneArticulos)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonValidar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jCheckBoxLIMcomenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLIMcomenActionPerformed
        if (jCheckBoxLIMcomen.isSelected()) {
            jPanelComentarioLIM.setVisible(true);
        } else {
            jPanelComentarioLIM.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBoxLIMcomenActionPerformed

    private void jCheckBoxLAUcomenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLAUcomenActionPerformed
        if (jCheckBoxLAUcomen.isSelected()) {
            jPanelComentarioAUD.setVisible(true);
        } else {
            jPanelComentarioAUD.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBoxLAUcomenActionPerformed

    private void jCheckBoxVIDcomenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxVIDcomenActionPerformed
        if (jCheckBoxVIDcomen.isSelected()) {
            jPanelComentarioVID.setVisible(true);
        } else {
            jPanelComentarioVID.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBoxVIDcomenActionPerformed

    private void jCheckBoxMUScomenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMUScomenActionPerformed
        if (jCheckBoxMUScomen.isSelected()) {
            jPanelComentarioMUS.setVisible(true);
        } else {
            jPanelComentarioMUS.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBoxMUScomenActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        //DECLARACION DE VARIABLES
        int resp = -1, edad_vid, pistas_mus, horasDuracion_aud, minDuracion_aud, anyoArt, numpag_imp;
        String plataforma_vid = "",codAut ="", categoria_vid = "", tipo_mus = "", nombreArt, resumenArt, comentarioArt, nombreAutor, apeAutor, tapa_imp = "";
        boolean sw = true, deterioradoArt = false, formato_imp = false, sintetizador_aud = false, formato_vid = false;
        float duracion_mus;
        Date fechaArt;
        //AUTOR
        
        codAut = jTextCodAut.getText();
        
        //ARTICULO
        nombreArt = jTextNomArt.getText();
        anyoArt = Integer.parseInt(jTextAñoArt.getText());
        resumenArt = jTextResumen.getText();
        if (jRadioButtonDeterioradoSI.isSelected()) {
            deterioradoArt = true;
        }
        if (jRadioButtonDeterioradoNO.isSelected()) {
            deterioradoArt = false;
        }
        fechaArt = estableceFechaActual(); 
        if (jTabbedPaneArticulos.getSelectedIndex() == 0) { //LIBRO IMPRESO
            if (jRadioEbookSI.isSelected()) {
                formato_imp = true;
            }
            if (jRadioEbookNO.isSelected()) {
                formato_imp = false;
            }
            if (jRadiotapaBLANDA.isSelected()) {
                tapa_imp = "Blanda";
            }
            if (jRadioTapaDURA.isSelected()) {
                tapa_imp = "Dura";
            }
            numpag_imp = Integer.parseInt(jTextNumPags.getText());
            try {
                art = new LibroImpreso(formato_imp, tapa_imp, numpag_imp, nombreArt, fechaArt, anyoArt, resumenArt, codAut, deterioradoArt);
                if (jCheckBoxLIMcomen.isSelected()) {
                    art.guardaComentario(jTextComenLIM.getText());
                }
            } catch (ExIntervalo e) {
                System.out.println("Valor capturado: "+e);
            } catch (ExNegativo e) {
                System.out.println("Valor capturado: "+e);
            } catch (ExTipo e) {
                System.out.println("Valor capturado: "+e);
            } catch (ExVacio e) {
                System.out.println("Valor capturado: "+e);
            }

        } else if (jTabbedPaneArticulos.getSelectedIndex() == 1) { //AUDIOLIBRO
            if (jRadioButtonSintetizSI.isSelected()) {
                sintetizador_aud = true;
            }
            if (jRadioButtonSintetizNO.isSelected()) {
                sintetizador_aud = false;
            }
            horasDuracion_aud = Integer.parseInt(jTextHorasDur.getText());
            minDuracion_aud = Integer.parseInt(jTextMinDur.getText());

            try {
                art = new AudioLibro(sintetizador_aud, horasDuracion_aud, minDuracion_aud, nombreArt, fechaArt, anyoArt, resumenArt, codAut, deterioradoArt);
                if (jCheckBoxLAUcomen.isSelected()) {
                    art.guardaComentario(jTextComenAUD.getText());
                }
            } catch (ExNegativo e) {
                System.out.println("Valor capturado: "+e);
            } catch (ExIntervalo e) {
                System.out.println("Valor capturado: "+e);
            } catch (ExVacio e) {
                System.out.println("Valor capturado: "+e);
            }

        } else if (jTabbedPaneArticulos.getSelectedIndex() == 2) { //MUSICA
            pistas_mus = Integer.parseInt(jTextNumPistas.getText());
            duracion_mus = Float.parseFloat(jTextDur.getText());
            if (jRadioButtonCD.isSelected()) {
                tipo_mus = "CD";
            }
            if (jRadioButtonVINILO.isSelected()) {
                tipo_mus = "Vinilo";
            }
            try {
                art = new Musica(pistas_mus, duracion_mus, tipo_mus, nombreArt, fechaArt, anyoArt, resumenArt, codAut, deterioradoArt);
                if (jCheckBoxMUScomen.isSelected()) {
                    art.guardaComentario(jTextComenMUS.getText());
                }
            } catch (ExNegativo e) {
                System.out.println("Valor capturado: "+e);
            } catch (ExTipo e) {
                System.out.println("Valor capturado: "+e);
            } catch (ExIntervalo e) {
                System.out.println("Valor capturado: "+e);
            } catch (ExVacio e) {
                System.out.println("Valor capturado: "+e);
            }
        } else if (jTabbedPaneArticulos.getSelectedIndex() == 3) { //VIDEOJUEGO
            edad_vid = Integer.parseInt(jTextEdadRec.getText());
            if (jRadioFormatoVIDsi.isSelected()) {
                formato_vid = true;
            }
            if (jRadioFormatoVIDno.isSelected()) {
                formato_vid = false;
            }
            if (jComboBoxPlataforma.getSelectedIndex() == 0) {
                plataforma_vid = "PC";
            }
            if (jComboBoxPlataforma.getSelectedIndex() == 1) {
                plataforma_vid = "PLAY3";
            }
            if (jComboBoxPlataforma.getSelectedIndex() == 2) {
                plataforma_vid = "PLAY4";
            }
            if (jComboBoxPlataforma.getSelectedIndex() == 3) {
                plataforma_vid = "PLAY5";
            }
            if (jComboBoxPlataforma.getSelectedIndex() == 4) {
                plataforma_vid = "XBOX";
            }

            if (jComboBoxCategoria.getSelectedIndex() == 0) {
                categoria_vid = "Aventuras";
            }
            if (jComboBoxCategoria.getSelectedIndex() == 1) {
                categoria_vid = "Bélico";
            }
            if (jComboBoxCategoria.getSelectedIndex() == 2) {
                categoria_vid = "Puzzle";
            }

            try {
                art = new VideoJuego(edad_vid, plataforma_vid, categoria_vid, formato_vid, nombreArt, fechaArt, anyoArt, resumenArt, codAut, deterioradoArt);
                if (jCheckBoxVIDcomen.isSelected()) {
                    art.guardaComentario(jTextComenVID.getText());
                }
            } catch (ExNegativo e) {
                System.out.println("Valor capturado: "+e);
            } catch (ExTipo e) {
                System.out.println("Valor capturado: "+e);
            } catch (ExIntervalo e) {
                System.out.println("Valor capturado: "+e);
            } catch (ExVacio e) {
                System.out.println("Valor capturado: "+e);
            }
        }
 
        //GUARDA ARTICULO
        try {
            con.conecta();
            con.crearSentencia();
            resp = con.grabaArticulo(art);
            System.out.println("respuesta  :" + resp);
            if (resp != -1) {
                JOptionPane.showMessageDialog(this, "Articulo insertado en la BBDD", "Atencion!", JOptionPane.WARNING_MESSAGE);
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

    private void jButtonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarActionPerformed
        //DECLARACION DE VARIABLES
        int publiAutor, edad_vid, pistas_mus, horasDuracion_aud, minDuracion_aud, anyoArt, anyoAutor, numpag_imp;
        String plataforma_vid,codAut, categoria_vid, codArt, tipo_mus, nombreArt, resumenArt, comentarioArt, nombreAutor, apeAutor, tapa_imp;
        boolean sw = true, deterioradoArt, formato_imp, sintetizador_aud, formato_vid;
        float duracion_mus;
        //VALIDACIONES AUTOR
        try {
            codAut = jTextCodAut.getText();
            MiLibreria.checkCodAutor(codAut);
            jLErrorCodAut.setText("");
        } catch (ExTipo e) {
            jLErrorCodAut.setText(e.getMessage());
            jLErrorCodAut.setForeground(Color.red);
            jTextCodAut.requestFocus();
            sw = false;
        }

        
        //VALIDACIONES ARTICULO
        try {
            nombreArt = jTextNomArt.getText();
            MiLibreria.checkVacio(nombreArt);
            jLErrorNomArt.setText("");
        } catch (ExVacio e) {
            jLErrorNomArt.setText(e.getMessage());
            jLErrorNomArt.setForeground(Color.red);
            jTextNomArt.requestFocus();
            sw = false;
        }

        try {
            anyoArt = Integer.parseInt(jTextAñoArt.getText());
            MiLibreria.checkIntervalo(2000, 2050, anyoArt);
            jLErrorAñoArt.setText("");
        } catch (ExIntervalo e) {
            jLErrorAñoArt.setText(e.getMessage());
            jLErrorAñoArt.setForeground(Color.red);
            jTextAñoArt.requestFocus();
            sw = false;
        } catch (NumberFormatException e) {
            jLErrorAñoArt.setText("Solo numeros!");
            jLErrorAñoArt.setForeground(Color.red);
            jTextAñoArt.requestFocus();
            sw = false;
        }

        try {
            resumenArt = jTextResumen.getText();
            MiLibreria.checkVacio(resumenArt);
            jLErrorResumenArt.setText("");
        } catch (ExVacio e) {
            jLErrorResumenArt.setText(e.getMessage());
            jLErrorResumenArt.setForeground(Color.red);
            jTextResumen.requestFocus();
            sw = false;
        }

        //VALIDACIONES LIBRO IMPRESO
        if (jTabbedPaneArticulos.getSelectedIndex() == 0) {
            try {
                numpag_imp = Integer.parseInt(jTextNumPags.getText());
                MiLibreria.checkNegativo(numpag_imp);
                jLErrorNumPags.setText("");
            } catch (ExNegativo e) {
                jLErrorNumPags.setText(e.getMessage());
                jLErrorNumPags.setForeground(Color.red);
                jTextNumPags.requestFocus();
                sw = false;
            } catch (NumberFormatException e) {
                jLErrorNumPags.setText("Solo numeros!");
                jLErrorNumPags.setForeground(Color.red);
                jTextNumPags.requestFocus();
                sw = false;
            }

            if (jCheckBoxLIMcomen.isSelected()) {
                try {
                    comentarioArt = jTextComenLIM.getText();
                    MiLibreria.checkVacio(comentarioArt);
                    jLErrorComenLIM.setText("");
                } catch (ExVacio e) {
                    jLErrorComenLIM.setText(e.getMessage());
                    jLErrorComenLIM.setForeground(Color.red);
                    jTextComenLIM.requestFocus();
                    sw = false;
                }
            }
            //VALIDACIONES AUDIOLIBRO

        } else if (jTabbedPaneArticulos.getSelectedIndex() == 1) {
            try {
                horasDuracion_aud = Integer.parseInt(jTextHorasDur.getText());
                MiLibreria.checkNegativo(horasDuracion_aud);
                jLErrorHorasDur.setText("");
            } catch (ExNegativo e) {
                jLErrorHorasDur.setText(e.getMessage());
                jLErrorHorasDur.setForeground(Color.red);
                jTextHorasDur.requestFocus();
                sw = false;
            } catch (NumberFormatException e) {
                jLErrorHorasDur.setText("Solo numeros!");
                jLErrorHorasDur.setForeground(Color.red);
                jTextHorasDur.requestFocus();
                sw = false;
            }

            try {
                minDuracion_aud = Integer.parseInt(jTextMinDur.getText());
                MiLibreria.checkNegativo(minDuracion_aud);
                jLErrorMinDur.setText("");
            } catch (ExNegativo e) {
                jLErrorMinDur.setText(e.getMessage());
                jLErrorMinDur.setForeground(Color.red);
                jTextMinDur.requestFocus();
                sw = false;
            } catch (NumberFormatException e) {
                jLErrorMinDur.setText("Solo numeros!");
                jLErrorMinDur.setForeground(Color.red);
                jTextMinDur.requestFocus();
                sw = false;
            }
            if (jCheckBoxLAUcomen.isSelected()) {
                try {
                    comentarioArt = jTextComenAUD.getText();
                    MiLibreria.checkVacio(comentarioArt);
                    jLErrorComenLAU.setText("");
                } catch (ExVacio e) {
                    jLErrorComenLAU.setText(e.getMessage());
                    jLErrorComenLAU.setForeground(Color.red);
                    jTextComenAUD.requestFocus();
                    sw = false;
                }
            }
            //VALIDACIONES MUSICA
        } else if (jTabbedPaneArticulos.getSelectedIndex() == 2) {
            try {
                pistas_mus = Integer.parseInt(jTextNumPistas.getText());
                MiLibreria.checkNegativo(pistas_mus);
                jLErrorNumPistas.setText("");
            } catch (ExNegativo e) {
                jLErrorNumPistas.setText(e.getMessage());
                jLErrorNumPistas.setForeground(Color.red);
                jTextNumPistas.requestFocus();
                sw = false;
            } catch (NumberFormatException e) {
                jLErrorNumPistas.setText("Solo numeros!");
                jLErrorNumPistas.setForeground(Color.red);
                jTextNumPistas.requestFocus();
                sw = false;
            }

            try {
                duracion_mus = Float.parseFloat(jTextDur.getText());
                MiLibreria.checkNegativof(duracion_mus);
                jLErrorDur.setText("");
            } catch (ExNegativo e) {
                jLErrorDur.setText(e.getMessage());
                jLErrorDur.setForeground(Color.red);
                jTextDur.requestFocus();
                sw = false;
            } catch (NumberFormatException e) {
                jLErrorDur.setText("Solo numeros!");
                jLErrorDur.setForeground(Color.red);
                jTextDur.requestFocus();
                sw = false;
            }
            if (jCheckBoxMUScomen.isSelected()) {
                try {
                    comentarioArt = jTextComenMUS.getText();
                    MiLibreria.checkVacio(comentarioArt);
                    jLErrorComenMUS.setText("");
                } catch (ExVacio e) {
                    jLErrorComenMUS.setText(e.getMessage());
                    jLErrorComenMUS.setForeground(Color.red);
                    jTextComenMUS.requestFocus();
                    sw = false;
                }
            }

            //VALIDACIONES VIDEOJUEGO
        } else if (jTabbedPaneArticulos.getSelectedIndex() == 3) {
            try {
                edad_vid = Integer.parseInt(jTextEdadRec.getText());
                MiLibreria.checkNegativo(edad_vid);
                jLErrorEdadRec.setText("");
            } catch (ExNegativo e) {
                jLErrorEdadRec.setText(e.getMessage());
                jLErrorEdadRec.setForeground(Color.red);
                jTextEdadRec.requestFocus();
                sw = false;
            } catch (NumberFormatException e) {
                jLErrorEdadRec.setText("Solo numeros!");
                jLErrorEdadRec.setForeground(Color.red);
                jTextEdadRec.requestFocus();
                sw = false;
            }
            if (jCheckBoxVIDcomen.isSelected()) {
                try {
                    comentarioArt = jTextComenVID.getText();
                    MiLibreria.checkVacio(comentarioArt);
                    jLErrorComenVID.setText("");
                } catch (ExVacio e) {
                    jLErrorComenVID.setText(e.getMessage());
                    jLErrorComenVID.setForeground(Color.red);
                    jTextComenVID.requestFocus();
                    sw = false;
                }
            }
        }
        if (sw) {
            jButtonBuscaAutor.setEnabled(true);
            JOptionPane.showMessageDialog(this, "Datos correctos, Asegurate de buscar si existe el autor", "Atencion!", JOptionPane.WARNING_MESSAGE);
        } else {
            jButtonBuscaAutor.setEnabled(false);
        }

    }//GEN-LAST:event_jButtonValidarActionPerformed

    private void jButtonBuscaAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaAutorActionPerformed
        
        String codAut, autor, info = "NoBuscar";
        int resp;
        try {
            codAut = jTextCodAut.getText();
            con.conecta();
            con.crearSentencia();
            autor = con.codAutor(codAut);
            if (autor == null) {
                resp = JOptionPane.showConfirmDialog(rootPane, "El autor no existe. Debes añadirlo", "Autor", JOptionPane.OK_CANCEL_OPTION);
                if (resp == 0) {
                    AltaAutor ventanaAutores = new AltaAutor(codAut,info);
                    ventanaAutores.setVisible(true);
                    jButtonGuardar.setEnabled(true);
                }
                con.cerrarConexion();
            } else {
                jTextCodAut.setText(autor);
                JOptionPane.showMessageDialog(this, "El autor ya existe, se guardara el articulo relacionado con dicho autor", "Atencion!", JOptionPane.WARNING_MESSAGE);
                jButtonGuardar.setEnabled(true);
            }
        } catch (SQLException ex) {
             
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButtonBuscaAutorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupDeterioradoArt;
    private javax.swing.ButtonGroup buttonGroupEbook;
    private javax.swing.ButtonGroup buttonGroupFormatoCDVINILO;
    private javax.swing.ButtonGroup buttonGroupSintetizador;
    private javax.swing.ButtonGroup buttonGroupTapa;
    private javax.swing.ButtonGroup buttonGroupVIDFormato;
    private javax.swing.JButton jButtonBuscaAutor;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JCheckBox jCheckBoxLAUcomen;
    private javax.swing.JCheckBox jCheckBoxLIMcomen;
    private javax.swing.JCheckBox jCheckBoxMUScomen;
    private javax.swing.JCheckBox jCheckBoxVIDcomen;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxPlataforma;
    private com.toedter.calendar.JDateChooser jDateChooserFechaActual;
    private javax.swing.JLabel jLAñoArt;
    private javax.swing.JLabel jLCategoria;
    private javax.swing.JLabel jLCodAut;
    private javax.swing.JLabel jLDeterioradoArt;
    private javax.swing.JLabel jLDuracion;
    private javax.swing.JLabel jLEbook;
    private javax.swing.JLabel jLEdadRec;
    private javax.swing.JLabel jLErrorAñoArt;
    private javax.swing.JLabel jLErrorCodAut;
    private javax.swing.JLabel jLErrorComenLAU;
    private javax.swing.JLabel jLErrorComenLIM;
    private javax.swing.JLabel jLErrorComenMUS;
    private javax.swing.JLabel jLErrorComenVID;
    private javax.swing.JLabel jLErrorDur;
    private javax.swing.JLabel jLErrorEdadRec;
    private javax.swing.JLabel jLErrorHorasDur;
    private javax.swing.JLabel jLErrorMinDur;
    private javax.swing.JLabel jLErrorNomArt;
    private javax.swing.JLabel jLErrorNumPags;
    private javax.swing.JLabel jLErrorNumPistas;
    private javax.swing.JLabel jLErrorResumenArt;
    private javax.swing.JLabel jLFormato;
    private javax.swing.JLabel jLFormatoFisico;
    private javax.swing.JLabel jLHorasDur;
    private javax.swing.JLabel jLImagenAudioLib;
    private javax.swing.JLabel jLImagenLibroImpreso;
    private javax.swing.JLabel jLImagenMUS;
    private javax.swing.JLabel jLImagenVID;
    private javax.swing.JLabel jLMinDur;
    private javax.swing.JLabel jLNomArt;
    private javax.swing.JLabel jLNumPistas;
    private javax.swing.JLabel jLPlataforma;
    private javax.swing.JLabel jLSintetizador;
    private javax.swing.JLabel jLTapaLibro;
    private javax.swing.JLabel jLnumpaginas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelArticulos;
    private javax.swing.JPanel jPanelAudioLibro;
    private javax.swing.JPanel jPanelAutor;
    private javax.swing.JPanel jPanelComentarioAUD;
    private javax.swing.JPanel jPanelComentarioLIM;
    private javax.swing.JPanel jPanelComentarioMUS;
    private javax.swing.JPanel jPanelComentarioVID;
    private javax.swing.JPanel jPanelDeteriorado;
    private javax.swing.JPanel jPanelEbook;
    private javax.swing.JPanel jPanelFormatoCdVin;
    private javax.swing.JPanel jPanelLibroImpreso;
    private javax.swing.JPanel jPanelResumen;
    private javax.swing.JPanel jPanelSintetizador;
    private javax.swing.JPanel jPanelTapa;
    private javax.swing.JRadioButton jRadioButtonCD;
    private javax.swing.JRadioButton jRadioButtonDeterioradoNO;
    private javax.swing.JRadioButton jRadioButtonDeterioradoSI;
    private javax.swing.JRadioButton jRadioButtonSintetizNO;
    private javax.swing.JRadioButton jRadioButtonSintetizSI;
    private javax.swing.JRadioButton jRadioButtonVINILO;
    private javax.swing.JRadioButton jRadioEbookNO;
    private javax.swing.JRadioButton jRadioEbookSI;
    private javax.swing.JRadioButton jRadioFormatoVIDno;
    private javax.swing.JRadioButton jRadioFormatoVIDsi;
    private javax.swing.JRadioButton jRadioTapaDURA;
    private javax.swing.JRadioButton jRadiotapaBLANDA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPaneArticulos;
    private javax.swing.JTextField jTextAñoArt;
    private javax.swing.JTextField jTextCodAut;
    private javax.swing.JTextArea jTextComenAUD;
    private javax.swing.JTextArea jTextComenLIM;
    private javax.swing.JTextArea jTextComenMUS;
    private javax.swing.JTextArea jTextComenVID;
    private javax.swing.JTextField jTextDur;
    private javax.swing.JTextField jTextEdadRec;
    private javax.swing.JTextField jTextHorasDur;
    private javax.swing.JTextField jTextMinDur;
    private javax.swing.JTextField jTextNomArt;
    private javax.swing.JTextField jTextNumPags;
    private javax.swing.JTextField jTextNumPistas;
    private javax.swing.JTextArea jTextResumen;
    // End of variables declaration//GEN-END:variables

    private Date estableceFechaActual() {
        Date fechaActual; // para almacenar una fecha
        fechaActual = Calendar.getInstance().getTime(); // obtiene la fecha actual
        return fechaActual;
    }
    

}

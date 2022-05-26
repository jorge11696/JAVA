package VentanasGraficas;

import ADO.*;
import Exceptions.*;
import MisListas.*;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ModificarArticulo extends javax.swing.JFrame {

    private Articulo art;
    private Autor aut;
    private LibroImpreso lim;
    private AudioLibro lau;
    private Musica mus;
    private VideoJuego vid;
    ConectaBBDD con = new ConectaBBDD();
    ConectaBBDD conAutor = new ConectaBBDD();

    public ModificarArticulo() {
        initComponents();
        setLocationRelativeTo(null);
        jPanel4.setVisible(false);
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
        jLcodArt = new javax.swing.JLabel();
        jTextcodArtBusca = new javax.swing.JTextField();
        jLErrorcodArtBuscar = new javax.swing.JLabel();
        jButtonValidar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
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
        jTextcodArt = new javax.swing.JTextField();
        jLcodArt1 = new javax.swing.JLabel();
        jDateChooserfechaActual = new com.toedter.calendar.JDateChooser();
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
        jPanel5 = new javax.swing.JPanel();
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
        jPanel6 = new javax.swing.JPanel();
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
        jButtonValidarTodosCampos = new javax.swing.JButton();
        jButtonModificarArticulo = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonModificarAutor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 750));
        setPreferredSize(new java.awt.Dimension(722, 666));

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
                .addContainerGap(308, Short.MAX_VALUE))
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

        jTextcodArt.setEnabled(false);

        jLcodArt1.setText("Codigo Articulo:");

        jDateChooserfechaActual.setEnabled(false);

        javax.swing.GroupLayout jPanelArticulosLayout = new javax.swing.GroupLayout(jPanelArticulos);
        jPanelArticulos.setLayout(jPanelArticulosLayout);
        jPanelArticulosLayout.setHorizontalGroup(
            jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArticulosLayout.createSequentialGroup()
                .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelArticulosLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanelDeteriorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jDateChooserfechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelArticulosLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNomArt)
                            .addComponent(jLAñoArt))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLErrorNomArt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextNomArt, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jTextAñoArt)
                            .addComponent(jLErrorAñoArt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLErrorResumenArt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelResumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLcodArt1)
                .addGap(18, 18, 18)
                .addComponent(jTextcodArt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanelArticulosLayout.setVerticalGroup(
            jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArticulosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
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
                        .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooserfechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextcodArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLcodArt1)))))
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
                            .addComponent(jLErrorApeAut, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelAutorLayout.createSequentialGroup()
                        .addComponent(jTextPubliAut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLErrorPubliAut, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextcodAut))
                .addGap(75, 75, 75))
        );
        jPanelAutorLayout.setVerticalGroup(
            jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAutorLayout.createSequentialGroup()
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
                    .addComponent(jLErrorAñoAut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLAñoAut1)
                        .addComponent(jTextPubliAut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLErrorPubliAut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelAutorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(jTextcodAut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneArticulos.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione tipo de articulo"));

        jLEbook.setText("Formato ebook:");

        buttonGroupEbook.add(jRadioEbookSI);
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
        jTextComenLIM.setEnabled(false);
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
        jCheckBoxLIMcomen.setEnabled(false);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
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
        jTextComenAUD.setEnabled(false);
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
        jCheckBoxLAUcomen.setEnabled(false);

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
                .addContainerGap(168, Short.MAX_VALUE))
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
        jTextComenMUS.setEnabled(false);
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
        jCheckBoxMUScomen.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLErrorNumPistas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLErrorDur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLDuracion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                            .addComponent(jTextDur, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLNumPistas)
                        .addGap(18, 18, 18)
                        .addComponent(jTextNumPistas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanelFormatoCdVin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLImagenMUS)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelComentarioMUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxMUScomen))
                .addGap(33, 33, 33))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxMUScomen)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLNumPistas)
                                .addComponent(jTextNumPistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelFormatoCdVin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLErrorNumPistas, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextDur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLDuracion))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLErrorDur, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLImagenMUS, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelComentarioMUS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPaneArticulos.addTab("Musica", jPanel5);

        jLEdadRec.setText("Edad Recomendada:");

        jComboBoxPlataforma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PC", "PLAY3", "PLAY4", "PLAY5", "XBOX" }));

        jLPlataforma.setText("Plataforma:");

        jLCategoria.setText("Categoria:");

        jLImagenVID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/videojuego60x60.png"))); // NOI18N

        jPanelComentarioVID.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comentario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jTextComenVID.setColumns(20);
        jTextComenVID.setRows(3);
        jTextComenVID.setEnabled(false);
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
        jCheckBoxVIDcomen.setEnabled(false);

        jLFormatoFisico.setText("Formato Fisico");

        buttonGroupFormatoCDVINILO.add(jRadioFormatoVIDsi);
        jRadioFormatoVIDsi.setText("Si");

        buttonGroupFormatoCDVINILO.add(jRadioFormatoVIDno);
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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLErrorEdadRec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLCategoria)
                                .addGap(33, 33, 33)
                                .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLEdadRec)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextEdadRec, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLPlataforma)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 69, Short.MAX_VALUE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLImagenVID)))
                .addGap(51, 51, 51)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelComentarioVID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxVIDcomen))
                .addGap(44, 44, 44))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEdadRec)
                            .addComponent(jTextEdadRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxVIDcomen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLErrorEdadRec, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLPlataforma))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanelComentarioVID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLImagenVID)
                        .addGap(12, 12, 12)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPaneArticulos.addTab("Videojuego", jPanel6);

        jButtonValidarTodosCampos.setText("Validar");
        jButtonValidarTodosCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarTodosCamposActionPerformed(evt);
            }
        });

        jButtonModificarArticulo.setText("Modificar Articulo");
        jButtonModificarArticulo.setEnabled(false);
        jButtonModificarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarArticuloActionPerformed(evt);
            }
        });

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonModificarAutor.setText("Modificar Autor");
        jButtonModificarAutor.setEnabled(false);
        jButtonModificarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelArticulos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButtonValidarTodosCampos)
                .addGap(153, 153, 153)
                .addComponent(jButtonModificarArticulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonModificarAutor)
                .addGap(102, 102, 102)
                .addComponent(jButtonVolver)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneArticulos)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificarArticulo)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonValidarTodosCampos)
                    .addComponent(jButtonModificarAutor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 655, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 124, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            conAutor.conecta();
            con.crearSentencia();
            conAutor.crearSentencia();
            art = con.dameArticuloCodigo(id);
            if (art == null) {
                JOptionPane.showMessageDialog(null, "id no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                cargaCampos(art);
                jPanel4.setVisible(true);
            }
            con.cerrarConexion();
            conAutor.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonValidarTodosCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarTodosCamposActionPerformed
        //DECLARACION DE VARIABLES
        int publiAutor, edad_vid, pistas_mus, horasDuracion_aud, minDuracion_aud, anyoArt, anyoAutor, numpag_imp;
        String plataforma_vid, codAut, categoria_vid, codArt, tipo_mus, nombreArt, resumenArt, comentarioArt, nombreAutor, apeAutor, tapa_imp;
        boolean sw = true, deterioradoArt, formato_imp, sintetizador_aud, formato_vid;
        float duracion_mus;
        //AUTOR
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
            jButtonModificarArticulo.setEnabled(true);
            jButtonModificarAutor.setEnabled(true);
        } else {
            jButtonModificarArticulo.setEnabled(false);
            jButtonModificarAutor.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonValidarTodosCamposActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonModificarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarArticuloActionPerformed
        Articulo art1;
        int graba;
        try {
            con.conecta();
            con.crearSentencia();
            art1 = obtenArt();
            graba = con.modiArticulo(art1);
            // podemos continuar
            if (graba == 1) {
                JOptionPane.showMessageDialog(this, "* * * Ha modificado un Artículo * * * ");
            } else if (graba == -1) {
                JOptionPane.showMessageDialog(this, "ERROR: integridad referencial o SQL truncada");
            } else {
                JOptionPane.showMessageDialog(this, "* * * no se pudo modificar Artículo * * * ");
            }

            con.cerrarConexion();

            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_jButtonModificarArticuloActionPerformed

    private void jButtonModificarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarAutorActionPerformed
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
    
    }//GEN-LAST:event_jButtonModificarAutorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupDeterioradoArt;
    private javax.swing.ButtonGroup buttonGroupEbook;
    private javax.swing.ButtonGroup buttonGroupFormatoCDVINILO;
    private javax.swing.ButtonGroup buttonGroupSintetizador;
    private javax.swing.ButtonGroup buttonGroupTapa;
    private javax.swing.ButtonGroup buttonGroupVIDFormato;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonModificarArticulo;
    private javax.swing.JButton jButtonModificarAutor;
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JButton jButtonValidarTodosCampos;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JCheckBox jCheckBoxLAUcomen;
    private javax.swing.JCheckBox jCheckBoxLIMcomen;
    private javax.swing.JCheckBox jCheckBoxMUScomen;
    private javax.swing.JCheckBox jCheckBoxVIDcomen;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxPlataforma;
    private com.toedter.calendar.JDateChooser jDateChooserfechaActual;
    private javax.swing.JLabel jLApeAutor;
    private javax.swing.JLabel jLAñoArt;
    private javax.swing.JLabel jLAñoAut;
    private javax.swing.JLabel jLAñoAut1;
    private javax.swing.JLabel jLCategoria;
    private javax.swing.JLabel jLDeterioradoArt;
    private javax.swing.JLabel jLDuracion;
    private javax.swing.JLabel jLEbook;
    private javax.swing.JLabel jLEdadRec;
    private javax.swing.JLabel jLErrorApeAut;
    private javax.swing.JLabel jLErrorAñoArt;
    private javax.swing.JLabel jLErrorAñoAut;
    private javax.swing.JLabel jLErrorComenLAU;
    private javax.swing.JLabel jLErrorComenLIM;
    private javax.swing.JLabel jLErrorComenMUS;
    private javax.swing.JLabel jLErrorComenVID;
    private javax.swing.JLabel jLErrorDur;
    private javax.swing.JLabel jLErrorEdadRec;
    private javax.swing.JLabel jLErrorHorasDur;
    private javax.swing.JLabel jLErrorMinDur;
    private javax.swing.JLabel jLErrorNomArt;
    private javax.swing.JLabel jLErrorNomAut;
    private javax.swing.JLabel jLErrorNumPags;
    private javax.swing.JLabel jLErrorNumPistas;
    private javax.swing.JLabel jLErrorPubliAut;
    private javax.swing.JLabel jLErrorResumenArt;
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
    private javax.swing.JLabel jLcodArt1;
    private javax.swing.JLabel jLnumpaginas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
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
    private javax.swing.JTextField jTextApeAut;
    private javax.swing.JTextField jTextAñoArt;
    private javax.swing.JTextField jTextAñoAut;
    private javax.swing.JTextArea jTextComenAUD;
    private javax.swing.JTextArea jTextComenLIM;
    private javax.swing.JTextArea jTextComenMUS;
    private javax.swing.JTextArea jTextComenVID;
    private javax.swing.JTextField jTextDur;
    private javax.swing.JTextField jTextEdadRec;
    private javax.swing.JTextField jTextHorasDur;
    private javax.swing.JTextField jTextMinDur;
    private javax.swing.JTextField jTextNomArt;
    private javax.swing.JTextField jTextNomAutor;
    private javax.swing.JTextField jTextNumPags;
    private javax.swing.JTextField jTextNumPistas;
    private javax.swing.JTextField jTextPubliAut;
    private javax.swing.JTextArea jTextResumen;
    private javax.swing.JTextField jTextcodArt;
    private javax.swing.JTextField jTextcodArtBusca;
    private javax.swing.JTextField jTextcodAut;
    // End of variables declaration//GEN-END:variables

    /*
    private int cargaCampos(int id2) throws SQLException {
        String sentSql = "";
        int ok = -1;
        try {
            con.conecta();
            con.crearSentencia();
            sentSql = "SELECT * FROM articulos "
                    + "JOIN autores "
                    + "WHERE articulos.codAutor=autores.codAut "
                    + "AND articulos.codArt= " + id2 ;
            con.ejecutaSQL(sentSql);
            if (con.rs.next()) {
                //AUTOR
                jTextNomAutor.setText(con.rs.getString("nombre"));
                jTextApeAut.setText(con.rs.getString("apellidos"));
                jTextAñoAut.setText("" + con.rs.getInt("anyoNac"));
                jTextPubliAut.setText("" + con.rs.getInt("publicaciones"));
                jTextcodAut.setText(con.rs.getString("codAutor"));
                //Codigo de autor no se podra modificar ya que lo crea la BBDD automaticamente
                //ARTICULO
                jTextNomArt.setText(con.rs.getString("titulo"));
                jTextAñoArt.setText("" + con.rs.getInt("anyoArt"));
                if (con.rs.getInt("deteriorado") == 1) {
                    jRadioButtonDeterioradoSI.setSelected(true);
                } else {
                    jRadioButtonDeterioradoNO.setSelected(true);
                }
                jTextResumen.setText(con.rs.getString("resumen"));
                jDateChooserfechaActual.setDate(con.rs.getDate("fechaAlta"));
                jTextcodArt.setText("" + con.rs.getInt("codArt"));
                //LIBROIMPRESO
                if (con.rs.getInt("tipoArticulo") == 1) {
                    jTabbedPaneArticulos.setSelectedIndex(0);
                    if (con.rs.getInt("formatoEbook") == 1) {
                        jRadioEbookSI.setSelected(true);
                    } else {
                        jRadioEbookNO.setSelected(true);
                    }

                    if (con.rs.getString("tapa").equalsIgnoreCase("Blanda")) {
                        jRadiotapaBLANDA.setSelected(true);
                    }
                    if (con.rs.getString("tapa").equalsIgnoreCase("Dura")) {
                        jRadioTapaDURA.setSelected(true);
                    }
                    jTextNumPags.setText("" + con.rs.getInt("numPaginas"));

                    if (con.rs.getString("comentario").equals("[]")) {
                        jCheckBoxLIMcomen.setSelected(false);
                    } else {
                        jCheckBoxLIMcomen.setSelected(true);
                        jTextComenLIM.setText(con.rs.getString("comentario"));
                    }
                }
                //AUDIOLIBRO
                if (con.rs.getInt("tipoArticulo") == 2) {
                    jTabbedPaneArticulos.setSelectedIndex(1);
                    if (con.rs.getInt("sintetizador") == 1) {
                        jRadioButtonSintetizSI.setSelected(true);
                    } else {
                        jRadioButtonSintetizNO.setSelected(true);
                    }
                    jTextHorasDur.setText("" + con.rs.getInt("horasDuracion"));
                    jTextMinDur.setText("" + con.rs.getInt("minDuracion"));

                    if (con.rs.getString("comentario").equals("[]")) {
                        jCheckBoxLAUcomen.setSelected(false);
                    } else {
                        jCheckBoxLAUcomen.setSelected(true);
                        jTextComenAUD.setText(con.rs.getString("comentario"));
                    }
                }
                //MUSICA
                if (con.rs.getInt("tipoArticulo") == 3) {
                    jTabbedPaneArticulos.setSelectedIndex(2);
                    jTextNumPistas.setText("" + con.rs.getInt("nPistas"));
                    jTextDur.setText("" + con.rs.getInt("duracion"));
                    if (con.rs.getString("tipo").equalsIgnoreCase("CD")) {
                        jRadioButtonCD.setSelected(true);
                    }
                    if (con.rs.getString("tipo").equalsIgnoreCase("Vinilo")) {
                        jRadioButtonVINILO.setSelected(true);
                    }
                    if (con.rs.getString("comentario").equals("[]")) {
                        jCheckBoxMUScomen.setSelected(false);
                    } else {
                        jCheckBoxMUScomen.setSelected(true);
                        jTextComenMUS.setText(con.rs.getString("comentario"));
                    }
                }
                //VIDEOJUEGO
                if (con.rs.getInt("tipoArticulo") == 4) {
                    jTabbedPaneArticulos.setSelectedIndex(3);
                    jTextEdadRec.setText("" + con.rs.getInt("edadRecomendada"));
                    if (con.rs.getString("plataforma").equalsIgnoreCase("PC")) {
                        jComboBoxPlataforma.setSelectedIndex(0);
                    }
                    if (con.rs.getString("plataforma").equalsIgnoreCase("PLAY3")) {
                        jComboBoxPlataforma.setSelectedIndex(1);
                    }
                    if (con.rs.getString("plataforma").equalsIgnoreCase("PLAY4")) {
                        jComboBoxPlataforma.setSelectedIndex(2);
                    }
                    if (con.rs.getString("plataforma").equalsIgnoreCase("PLAY5")) {
                        jComboBoxPlataforma.setSelectedIndex(3);
                    }
                    if (con.rs.getString("plataforma").equalsIgnoreCase("XBOX")) {
                        jComboBoxPlataforma.setSelectedIndex(4);
                    }
                    if (con.rs.getInt("categoria") == 1) {
                        jComboBoxCategoria.setSelectedItem("Aventuras");
                    }
                    if (con.rs.getInt("categoria") == 2) {
                        jComboBoxCategoria.setSelectedItem("Bélico");
                    }
                    if (con.rs.getInt("categoria") == 3) {
                        jComboBoxCategoria.setSelectedItem("Puzzle");
                    }
                    if (con.rs.getInt("formatoFisico") == 1) {
                        jRadioFormatoVIDsi.setSelected(true);
                    } else {
                        jRadioFormatoVIDno.setSelected(true);
                    }
                    if (con.rs.getString("comentario").equals("[]")) {
                        jCheckBoxVIDcomen.setSelected(false);
                    } else {
                        jCheckBoxVIDcomen.setSelected(true);
                        jTextComenVID.setText(con.rs.getString("comentario"));
                    }
                }
                ok = con.rs.getRow();

            } else {
                JOptionPane.showMessageDialog(this, "La id introducida no se encuntra en la base de datos");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        con.cerrarConexion();
        return ok;
    }
    
    */
    private Articulo obtenArt() {
        //DECLARACION DE VARIABLES
        int resp = -1, publiAutor,codArt, edad_vid, pistas_mus, horasDuracion_aud, minDuracion_aud, anyoArt, anyoAutor, numpag_imp;
        String plataforma_vid = "",codAut ="", categoria_vid = "", tipo_mus = "", nombreArt, resumenArt, comentarioArt, nombreAutor, apeAutor, tapa_imp = "";
        boolean sw = true, deterioradoArt = false, formato_imp = false, sintetizador_aud = false, formato_vid = false;
        float duracion_mus;
        Date fechaArt;
        
        Articulo art = null;
        
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
        fechaArt = jDateChooserfechaActual.getDate(); 
        codArt = Integer.parseInt(jTextcodArtBusca.getText());
        codAut = jTextcodAut.getText();
        //LIBRO IMPRESO
        if (jTabbedPaneArticulos.getSelectedIndex() == 0) { 
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
                art = new LibroImpreso(formato_imp, tapa_imp, numpag_imp,codArt, nombreArt, fechaArt, anyoArt, resumenArt, codAut, deterioradoArt);
            } catch (ExIntervalo e) {
                System.out.println("Valor capturado: "+e);
            } catch (ExNegativo e) {
                System.out.println("Valor capturado: "+e);
            } catch (ExTipo e) {
                System.out.println("Valor capturado: "+e);
            } catch (ExVacio e) {
                System.out.println("Valor capturado: "+e);
            }
        //AUDIOLIBRO
        } else if (jTabbedPaneArticulos.getSelectedIndex() == 1) { 
            if (jRadioButtonSintetizSI.isSelected()) {
                sintetizador_aud = true;
            }
            if (jRadioButtonSintetizNO.isSelected()) {
                sintetizador_aud = false;
            }
            horasDuracion_aud = Integer.parseInt(jTextHorasDur.getText());
            minDuracion_aud = Integer.parseInt(jTextMinDur.getText());

            try {
                art = new AudioLibro(sintetizador_aud, horasDuracion_aud, minDuracion_aud,codArt, nombreArt, fechaArt, anyoArt, resumenArt, codAut, deterioradoArt);
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
                art = new Musica(pistas_mus, duracion_mus, tipo_mus,codArt, nombreArt, fechaArt, anyoArt, resumenArt, codAut, deterioradoArt);
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
                art = new VideoJuego(edad_vid, plataforma_vid, categoria_vid, formato_vid,codArt, nombreArt, fechaArt, anyoArt, resumenArt, codAut, deterioradoArt);
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
       
        return art;
    }
    
    public void cargaCampos(Articulo a) {
        //AUTOR
        aut = conAutor.obtenerAutorCodigo(art.getAutor());
        jTextNomAutor.setText(aut.getNom());
        jTextApeAut.setText(aut.getApell());
        jTextAñoAut.setText(String.valueOf(aut.getAnyo_nac()));
        jTextPubliAut.setText(String.valueOf(aut.getPublicaciones()));
        jTextcodAut.setText(art.getAutor());
        //ARTICULO
        jTextNomArt.setText(a.getNombre());
        jTextAñoArt.setText(String.valueOf(a.getAnyo()));
        if (a.isDeteriorado()) {
            jRadioButtonDeterioradoSI.setSelected(true);
        } else if (!a.isDeteriorado()) {
            jRadioButtonDeterioradoNO.setSelected(true);
        }
        jTextResumen.setText(a.getResumen());
        jDateChooserfechaActual.setDate(a.getFecha());
        jTextcodArt.setText(String.valueOf(a.getCodArt()));
        //LIBRO IMPRESO

        if (a instanceof LibroImpreso) {
            lim = (LibroImpreso) a;
            jTabbedPaneArticulos.setSelectedIndex(0);
            if (lim.isFormato()) {
                jRadioEbookSI.setSelected(true);
            }

            if (!lim.isFormato()) {
                jRadioEbookNO.setSelected(true);
            }

            if (lim.getTapa().equalsIgnoreCase("Blanda")) {
                jRadiotapaBLANDA.setSelected(true);
            }
            if (lim.getTapa().equalsIgnoreCase("Dura")) {
                jRadioTapaDURA.setSelected(true);
            }
            jTextNumPags.setText(String.valueOf(lim.getNumPaginas()));

            if (lim.getComentarios().toString().equals("[]")) {
                jCheckBoxLIMcomen.setSelected(false);
            } else {
                jCheckBoxLIMcomen.setSelected(true);
                jTextComenLIM.setText(lim.getComentarios().toString());
            }
            //AUDIOLIBRO
        }
        if (a instanceof AudioLibro) {
            lau = (AudioLibro) a;
            jTabbedPaneArticulos.setSelectedIndex(1);
            if (lau.isSintetizador()) {
                jRadioButtonSintetizSI.setSelected(true);
            }
            if (!lau.isSintetizador()) {
                jRadioButtonSintetizNO.setSelected(true);
            }
            jTextHorasDur.setText(String.valueOf(lau.getHorasDuracion()));
            jTextMinDur.setText(String.valueOf(lau.getMinDuracion()));

            if (lau.getComentarios().toString().equals("[]")) {
                jCheckBoxLAUcomen.setSelected(false);
            } else {
                jCheckBoxLAUcomen.setSelected(true);
                jTextComenAUD.setText(lau.getComentarios().toString());
            }

        }
        //MUSICA
        if (a instanceof Musica) {
            mus = (Musica) a;
            jTabbedPaneArticulos.setSelectedIndex(2);
            jTextNumPistas.setText(String.valueOf(mus.getnPistas()));
            jTextDur.setText(String.valueOf(mus.getDuracion()));
            if (mus.getTipo().equalsIgnoreCase("CD")) {
                jRadioButtonCD.setSelected(true);
            }
            if (mus.getTipo().equalsIgnoreCase("Vinilo")) {
                jRadioButtonVINILO.setSelected(true);
            }
            if (mus.getComentarios().toString().equals("[]")) {
                jCheckBoxMUScomen.setSelected(false);
            } else {
                jCheckBoxMUScomen.setSelected(true);
                jTextComenMUS.setText(mus.getComentarios().toString());
            }
        }
        //VIDEOJUEGO
        if (a instanceof VideoJuego) {
            vid = (VideoJuego) a;
            jTabbedPaneArticulos.setSelectedIndex(3);
            jTextEdadRec.setText(String.valueOf(vid.getEdadRecomendada()));
            if (vid.getPlataforma().equalsIgnoreCase("PC")) {
                jComboBoxPlataforma.setSelectedIndex(0);
            }
            if (vid.getPlataforma().equalsIgnoreCase("PLAY3")) {
                jComboBoxPlataforma.setSelectedIndex(1);
            }
            if (vid.getPlataforma().equalsIgnoreCase("PLAY4")) {
                jComboBoxPlataforma.setSelectedIndex(2);
            }
            if (vid.getPlataforma().equalsIgnoreCase("PLAY5")) {
                jComboBoxPlataforma.setSelectedIndex(3);
            }
            if (vid.getPlataforma().equalsIgnoreCase("XBOX")) {
                jComboBoxPlataforma.setSelectedIndex(4);
            }
            if (vid.getCategoria().equalsIgnoreCase("Aventuras")) {
                jComboBoxCategoria.setSelectedIndex(0);
            }
            if (vid.getCategoria().equalsIgnoreCase("Bélico")) {
                jComboBoxCategoria.setSelectedIndex(1);
            }
            if (vid.getCategoria().equalsIgnoreCase("Puzzle")) {
                jComboBoxCategoria.setSelectedIndex(2);
            }
            
            if (vid.isFormatoFisico()) {
                jRadioFormatoVIDsi.setSelected(true);
            }
            if (!vid.isFormatoFisico()) {
                jRadioFormatoVIDno.setSelected(true);
            }
            if (vid.getComentarios().toString().equals("[]")) {
                jCheckBoxVIDcomen.setSelected(false);
            } else {
                jCheckBoxVIDcomen.setSelected(true);
                jTextComenVID.setText(vid.getComentarios().toString());
            }
        }
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

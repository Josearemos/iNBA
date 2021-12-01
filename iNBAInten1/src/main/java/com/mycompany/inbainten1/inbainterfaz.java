/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inbainten1;

import java.awt.CardLayout;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JOSÉ ANTONIO REINA MONTES
 */
public class inbainterfaz extends javax.swing.JFrame {
    
    //CREAMOS VARIAS LISTAS CON LOS DATOS DE JUGADOR Y EQUIPO 
    //CREAMOS UN ARRAY DE LAS TABLAS PARA NOS RESULTE MÁS FACIL LLMARLAS ADEMÁS DE MÁS UTIL
    //LLAMAMOS  CREAMOS AQUI LA CONEXION
    
    private CardLayout card;
    List<Equipo>  equipo;
    List<Jugador> jugador;
    
    JTable[] tablastitulosarray ;
    JTable[] tablasjugadoressarray;
    JTable [] tablascomparararray;
    
    public inbainterfaz() {
        initComponents();
//ARRAY DE LAS TABLAS
        tablastitulosarray = new JTable []{jTableTitulosBulls,jTableTitulosDallas,jTableTitulosGolden,jTableTitulosLakers,jTableTitulosBucks};
        tablasjugadoressarray = new JTable [] {jTableJugadoresBulls,jTableJugadoresDallas,jTableJugadoresGolden,jTableJugadoresLakers,jTableJugadoresBucks};
        tablascomparararray = new JTable [] {jTableCompara1, jTableCompara2};
        
//ARRAYLIST DE LOS DATOS DE LOS EQUIPOS Y JUGADORES
        equipo = new ArrayList<Equipo>();
        jugador = new ArrayList<Jugador>();
        
//CONEXION A LA BASE
        conexionbase();
        
//PARA NO REDIMENSIONAR Y PODER MOVER EL HEADER DE LAS TABLAS
        jTable4.getTableHeader().setReorderingAllowed(false);
        jTable3.getTableHeader().setReorderingAllowed(false);
        jTableTitulosBulls.getTableHeader().setReorderingAllowed(false);
        jTableTitulosGolden.getTableHeader().setReorderingAllowed(false);
        jTableTitulosDallas.getTableHeader().setReorderingAllowed(false);
        jTableTitulosLakers.getTableHeader().setReorderingAllowed(false);
        jTableJugadoresBulls.getTableHeader().setReorderingAllowed(false);
        jTableJugadoresGolden.getTableHeader().setReorderingAllowed(false);
        jTableJugadoresDallas.getTableHeader().setReorderingAllowed(false);
        jTableJugadoresLakers.getTableHeader().setReorderingAllowed(false);
         jTableCompara1.getTableHeader().setReorderingAllowed(false);
         jTableCompara1.getTableHeader().setReorderingAllowed(false);
         
//ITEMS DE TODOS LOS COMBOX        
        jComboBoxEquipos.addItem("Todos");
        jComboBoxEquipos.addItem("Chicago Bulls");
        jComboBoxEquipos.addItem("Los Angeles Lakers");
        jComboBoxEquipos.addItem("Golden State Warriors");
        jComboBoxEquipos.addItem("Milwaukee Bucks");
        jComboBoxEquipos.addItem("Dallas Mavericks");
        
        
        jComboBoxEquipo1.addItem("Chicago Bulls");
        jComboBoxEquipo1.addItem("Los Angeles Lakers");
        jComboBoxEquipo1.addItem("Golden State Warriors");
        jComboBoxEquipo1.addItem("Milwaukee Bucks");
        jComboBoxEquipo1.addItem("Dallas Mavericks");
        
        jComboBoxEquipo2.addItem("Chicago Bulls");
        jComboBoxEquipo2.addItem("Los Angeles Lakers");
        jComboBoxEquipo2.addItem("Golden State Warriors");
        jComboBoxEquipo2.addItem("Milwaukee Bucks");
        jComboBoxEquipo2.addItem("Dallas Mavericks");
        
//NUMEROS DEL SLIDER
        jSliderAltura.setMinimum(0);
        jSliderAltura.setMaximum((int) 3);
        jSliderAltura.setMajorTickSpacing((int)0.5);
        
//PARA MOSTRAR PANEL, UN TAMAÑO CONCRETO , CENTRADO Y EL TÍTULO QUE RECIBE       
        card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1,"Panel2");
        setSize(908, 998);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("iNBA");

    }

//CREACION D ELOS COMPONENTES COMO LABELS, BUTTONS..
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPosicion = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2Inicio = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton38 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        jProgressBar5 = new javax.swing.JProgressBar();
        jProgressBar6 = new javax.swing.JProgressBar();
        jProgressBar7 = new javax.swing.JProgressBar();
        jProgressBar8 = new javax.swing.JProgressBar();
        jProgressBar9 = new javax.swing.JProgressBar();
        jProgressBar10 = new javax.swing.JProgressBar();
        jLabel66 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel82 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jPanelEquipos = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanelBulls = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTitulosBulls = new javax.swing.JTable();
        jLabel98 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabelDatosBullsNombre = new javax.swing.JLabel();
        jLabelDatosBullsCiudad = new javax.swing.JLabel();
        jLabelDatosBullsCancha = new javax.swing.JLabel();
        jLabelDatosBullsPropietarios = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableJugadoresBulls = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanelDallas = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTableTitulosDallas = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabelDatosDallasNombre = new javax.swing.JLabel();
        jLabelDatosDallasCiudad = new javax.swing.JLabel();
        jLabelDatosDallasCancha = new javax.swing.JLabel();
        jLabelDatosDallasPropietarios = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableJugadoresDallas = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanelGolden = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableTitulosGolden = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabelDatosGoldenNombre = new javax.swing.JLabel();
        jLabelDatosGoldenCiudad = new javax.swing.JLabel();
        jLabelDatosGoldenCancha = new javax.swing.JLabel();
        jLabelDatosGoldenPropietario = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTableJugadoresGolden = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanelLakers = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableTitulosLakers = new javax.swing.JTable();
        jPanel27 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabelDatosLakersNombre = new javax.swing.JLabel();
        jLabelDatosLakersCiudad = new javax.swing.JLabel();
        jLabelDatosLakersCancha = new javax.swing.JLabel();
        jLabelDatosLakersPropietarios = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTableJugadoresLakers = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanelBucks = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableTitulosBucks = new javax.swing.JTable();
        jLabel45 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabelDatosBucksCiudad = new javax.swing.JLabel();
        jLabelDatosBucksNombre = new javax.swing.JLabel();
        jLabelDatosBucksCancha = new javax.swing.JLabel();
        jLabelDatosBucksPropietarios = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTableJugadoresBucks = new javax.swing.JTable();
        jLabel48 = new javax.swing.JLabel();
        jPanelJugadores = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jRadioButtonBase = new javax.swing.JRadioButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jRadioButtonEscolta = new javax.swing.JRadioButton();
        jRadioButtonAlero = new javax.swing.JRadioButton();
        jRadioButtonAlaPivot = new javax.swing.JRadioButton();
        jRadioButtonPivot = new javax.swing.JRadioButton();
        jComboBoxEquipos = new javax.swing.JComboBox<>();
        jSliderAltura = new javax.swing.JSlider();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTableJugadoresFiltro = new javax.swing.JTable();
        jLabel110 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jButtonA = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jPanelComparar = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jComboBoxEquipo1 = new javax.swing.JComboBox<>();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableCompara1 = new javax.swing.JTable();
        jLabel62 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableCompara2 = new javax.swing.JTable();
        jComboBoxEquipo2 = new javax.swing.JComboBox<>();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/home.jpg"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/jugadores.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/comparar.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("INICIO");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setText("EQUIPOS");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setText("JUGADORES");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setText("COMPARAR");

        jButton38.setBackground(new java.awt.Color(255, 255, 255));
        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/balon.jpg"))); // NOI18N
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(70, 70, 70))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel4.setLayout(null);

        jPanel2.setLayout(null);

        jPanel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102), 2));
        jPanel35.setLayout(null);

        jLabel93.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("REPP");
        jPanel35.add(jLabel93);
        jLabel93.setBounds(160, 260, 48, 16);

        jLabel94.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("%TL");
        jPanel35.add(jLabel94);
        jLabel94.setBounds(160, 320, 48, 16);

        jLabel95.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("PPP");
        jPanel35.add(jLabel95);
        jLabel95.setBounds(160, 200, 48, 16);

        jLabel96.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("APP");
        jPanel35.add(jLabel96);
        jLabel96.setBounds(160, 230, 48, 16);

        jLabel97.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("%3");
        jPanel35.add(jLabel97);
        jLabel97.setBounds(160, 290, 48, 16);

        jProgressBar1.setMaximum(50);
        jProgressBar1.setValue(6);
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);
        jPanel35.add(jProgressBar1);
        jProgressBar1.setBounds(40, 260, 110, 17);

        jProgressBar2.setMaximum(50);
        jProgressBar2.setValue(6);
        jProgressBar2.setString("");
        jProgressBar2.setStringPainted(true);
        jPanel35.add(jProgressBar2);
        jProgressBar2.setBounds(40, 230, 110, 17);

        jProgressBar3.setValue(41);
        jProgressBar3.setString("");
        jProgressBar3.setStringPainted(true);
        jPanel35.add(jProgressBar3);
        jProgressBar3.setBounds(40, 290, 110, 17);

        jProgressBar4.setValue(96);
        jProgressBar4.setString("");
        jProgressBar4.setStringPainted(true);
        jPanel35.add(jProgressBar4);
        jProgressBar4.setBounds(40, 320, 110, 20);

        jProgressBar5.setValue(28);
        jProgressBar5.setString("");
        jProgressBar5.setStringPainted(true);
        jPanel35.add(jProgressBar5);
        jProgressBar5.setBounds(40, 200, 110, 17);

        jProgressBar6.setValue(28);
        jProgressBar6.setString("");
        jProgressBar6.setStringPainted(true);
        jPanel35.add(jProgressBar6);
        jProgressBar6.setBounds(230, 200, 110, 17);

        jProgressBar7.setMaximum(50);
        jProgressBar7.setValue(5);
        jProgressBar7.setString("");
        jProgressBar7.setStringPainted(true);
        jPanel35.add(jProgressBar7);
        jProgressBar7.setBounds(230, 230, 110, 17);

        jProgressBar8.setMaximum(50);
        jProgressBar8.setValue(8);
        jProgressBar8.setString("");
        jProgressBar8.setStringPainted(true);
        jPanel35.add(jProgressBar8);
        jProgressBar8.setBounds(230, 260, 110, 17);

        jProgressBar9.setValue(42);
        jProgressBar9.setString("");
        jProgressBar9.setStringPainted(true);
        jPanel35.add(jProgressBar9);
        jProgressBar9.setBounds(230, 290, 110, 17);

        jProgressBar10.setValue(85);
        jProgressBar10.setString("");
        jProgressBar10.setStringPainted(true);
        jPanel35.add(jProgressBar10);
        jProgressBar10.setBounds(230, 320, 110, 20);

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("LOS  2  MEJORES  JUGADORES");
        jPanel35.add(jLabel66);
        jLabel66.setBounds(50, 10, 280, 22);

        jLabel87.setBackground(new java.awt.Color(255, 255, 255));
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/curry.png"))); // NOI18N
        jPanel35.add(jLabel87);
        jLabel87.setBounds(40, 50, 120, 87);

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/durant.png"))); // NOI18N
        jPanel35.add(jLabel88);
        jLabel88.setBounds(230, 50, 120, 90);

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel89.setText("Stephen Curry");
        jPanel35.add(jLabel89);
        jLabel89.setBounds(50, 140, 110, 40);

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel90.setText("Kevin Durant");
        jPanel35.add(jLabel90);
        jLabel90.setBounds(250, 150, 80, 20);

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/wallcompara.jpg"))); // NOI18N
        jPanel35.add(jLabel91);
        jLabel91.setBounds(0, 0, 360, 350);

        jPanel2.add(jPanel35);
        jPanel35.setBounds(50, 40, 355, 350);

        jPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel36.setLayout(null);

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/curry.png"))); // NOI18N
        jPanel36.add(jLabel83);
        jLabel83.setBounds(0, 10, 120, 90);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"63", "63", "32", "5.5", "5.8", "34.2", "29.4"}
            },
            new String [] {
                "B", "GS", "PPP", "REPP", "APP", "MPP", "EPI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
            jTable4.getColumnModel().getColumn(4).setResizable(false);
            jTable4.getColumnModel().getColumn(5).setResizable(false);
            jTable4.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel36.add(jScrollPane9);
        jScrollPane9.setBounds(110, 40, 330, 50);

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("Stephen Curry          GOLDEN STATE WARRIORS");
        jPanel36.add(jLabel84);
        jLabel84.setBounds(120, 10, 310, 20);

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/focoplayer.jpg"))); // NOI18N
        jLabel85.setText("jLabel85");
        jPanel36.add(jLabel85);
        jLabel85.setBounds(0, -6, 450, 120);

        jPanel2.add(jPanel36);
        jPanel36.setBounds(430, 70, 451, 111);

        jPanel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel37.setLayout(null);

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/BUCKS.png"))); // NOI18N
        jPanel37.add(jLabel81);
        jLabel81.setBounds(10, 10, 80, 90);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"72", "46.8", "38.9", "79.9", "10.6", "116.4", "48.3"}
            },
            new String [] {
                "B.", "%TC", "%3P", "%TL", "REBO", "PPP", "REPP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(4).setResizable(false);
            jTable3.getColumnModel().getColumn(5).setResizable(false);
            jTable3.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel37.add(jScrollPane8);
        jScrollPane8.setBounds(109, 52, 331, 50);

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel82.setText("Milwaukee Bucks");
        jPanel37.add(jLabel82);
        jLabel82.setBounds(150, 10, 160, 40);

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/equipomejor.png"))); // NOI18N
        jPanel37.add(jLabel86);
        jLabel86.setBounds(0, -6, 450, 120);

        jPanel2.add(jPanel37);
        jPanel37.setBounds(430, 250, 451, 111);

        jPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel38.setLayout(null);

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("PROXIMOS PARTIDOS");
        jPanel38.add(jLabel69);
        jLabel69.setBounds(320, 20, 220, 20);

        jLabel73.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("VS");
        jPanel38.add(jLabel73);
        jLabel73.setBounds(150, 130, 40, 40);

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/raptors.png"))); // NOI18N
        jPanel38.add(jLabel74);
        jLabel74.setBounds(10, 90, 130, 140);

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/grizzllies.png"))); // NOI18N
        jPanel38.add(jLabel75);
        jLabel75.setBounds(200, 80, 140, 160);

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/kings.png"))); // NOI18N
        jPanel38.add(jLabel76);
        jLabel76.setBounds(450, 70, 130, 160);

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/lakers.png"))); // NOI18N
        jLabel77.setToolTipText("");
        jPanel38.add(jLabel77);
        jLabel77.setBounds(630, 100, 160, 120);

        jLabel78.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("VS");
        jPanel38.add(jLabel78);
        jLabel78.setBounds(590, 140, 40, 40);

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Miércoles 01/12/2021");
        jPanel38.add(jLabel70);
        jLabel70.setBounds(560, 270, 160, 30);

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Miércoles 01/12/2021");
        jPanel38.add(jLabel71);
        jLabel71.setBounds(100, 270, 160, 30);

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("4:00 HORA ESPAÑA");
        jPanel38.add(jLabel72);
        jLabel72.setBounds(580, 300, 130, 20);

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("1:30 HORA ESPAÑA");
        jPanel38.add(jLabel79);
        jLabel79.setBounds(120, 300, 130, 20);

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/wallpartid.jpg"))); // NOI18N
        jPanel38.add(jLabel80);
        jLabel80.setBounds(0, -10, 820, 390);

        jPanel2.add(jPanel38);
        jPanel38.setBounds(60, 408, 812, 364);

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel67.setText("MEJOR JUGADOR 20/21");
        jPanel2.add(jLabel67);
        jLabel67.setBounds(430, 50, 180, 17);

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel68.setText("MEJOR EQUIPO 20/21");
        jPanel2.add(jLabel68);
        jLabel68.setBounds(430, 230, 170, 17);

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/negro.jpg"))); // NOI18N
        jPanel2.add(jLabel92);
        jLabel92.setBounds(0, 0, 900, 840);

        jPanel4.add(jPanel2);
        jPanel2.setBounds(0, 0, 910, 840);

        javax.swing.GroupLayout jPanel2InicioLayout = new javax.swing.GroupLayout(jPanel2Inicio);
        jPanel2Inicio.setLayout(jPanel2InicioLayout);
        jPanel2InicioLayout.setHorizontalGroup(
            jPanel2InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2InicioLayout.setVerticalGroup(
            jPanel2InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2InicioLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2Inicio, "Panel2");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/home.jpg"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/balon.jpg"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/jugadores.jpg"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/comparar.jpg"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel9.setText("INICIO");

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel10.setText("EQUIPOS");

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel11.setText("JUGADORES");

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel12.setText("COMPARAR");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(8, 8, 8)))
                .addGap(50, 50, 50)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel11))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );

        jPanel8.setLayout(null);

        jButton13.setBackground(new java.awt.Color(240, 16, 51));
        jButton13.setForeground(new java.awt.Color(212, 0, 0));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipos/img/bull.png"))); // NOI18N
        jButton13.setMaximumSize(new java.awt.Dimension(233, 181));
        jButton13.setMinimumSize(new java.awt.Dimension(233, 181));
        jButton13.setPreferredSize(new java.awt.Dimension(233, 181));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton13);
        jButton13.setBounds(0, 0, 180, 870);

        jButton14.setBackground(new java.awt.Color(51, 51, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipos/img/goldenst.png"))); // NOI18N
        jButton14.setMaximumSize(new java.awt.Dimension(233, 181));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton14);
        jButton14.setBounds(360, 0, 180, 870);

        jButton15.setBackground(new java.awt.Color(255, 255, 153));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipos/img/lake.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton15);
        jButton15.setBounds(540, 0, 180, 870);

        jButton16.setBackground(new java.awt.Color(153, 255, 153));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipos/img/buck.png"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton16);
        jButton16.setBounds(720, 0, 180, 870);

        jButton17.setBackground(new java.awt.Color(153, 204, 255));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipos/img/dalla.png"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton17);
        jButton17.setBounds(180, 0, 180, 870);

        javax.swing.GroupLayout jPanelEquiposLayout = new javax.swing.GroupLayout(jPanelEquipos);
        jPanelEquipos.setLayout(jPanelEquiposLayout);
        jPanelEquiposLayout.setHorizontalGroup(
            jPanelEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
        );
        jPanelEquiposLayout.setVerticalGroup(
            jPanelEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEquiposLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelEquipos, "Panel5");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/home.jpg"))); // NOI18N
        jButton18.setBorder(null);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/balon.jpg"))); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/jugadores.jpg"))); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/comparar.jpg"))); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel13.setText("INICIO");

        jLabel14.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel14.setText("EQUIPOS");

        jLabel15.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel15.setText("JUGADORES");

        jLabel16.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel16.setText("COMPARAR");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(8, 8, 8)))
                .addGap(50, 50, 50)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel15)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel16)))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(783, 783, 783))
        );

        jPanel11.setLayout(null);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipos/img/bulls.png"))); // NOI18N
        jPanel11.add(jLabel18);
        jLabel18.setBounds(100, 20, 290, 290);

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estadios/bullstadium.jpg"))); // NOI18N
        jPanel11.add(jLabel102);
        jLabel102.setBounds(500, 460, 380, 330);

        jTableTitulosBulls.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableTitulosBulls.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NBA", "Conferencia", "División", "Presencias PlayOff"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTitulosBulls.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTableTitulosBulls.setMinimumSize(new java.awt.Dimension(40, 0));
        jScrollPane1.setViewportView(jTableTitulosBulls);
        if (jTableTitulosBulls.getColumnModel().getColumnCount() > 0) {
            jTableTitulosBulls.getColumnModel().getColumn(0).setResizable(false);
            jTableTitulosBulls.getColumnModel().getColumn(0).setPreferredWidth(1);
            jTableTitulosBulls.getColumnModel().getColumn(1).setResizable(false);
            jTableTitulosBulls.getColumnModel().getColumn(1).setPreferredWidth(3);
            jTableTitulosBulls.getColumnModel().getColumn(2).setResizable(false);
            jTableTitulosBulls.getColumnModel().getColumn(2).setPreferredWidth(3);
            jTableTitulosBulls.getColumnModel().getColumn(3).setResizable(false);
            jTableTitulosBulls.getColumnModel().getColumn(3).setPreferredWidth(3);
        }

        jPanel11.add(jScrollPane1);
        jScrollPane1.setBounds(10, 740, 468, 48);

        jLabel98.setFont(new java.awt.Font("sansserif", 1, 27)); // NOI18N
        jLabel98.setText("TÍTULOS");
        jPanel11.add(jLabel98);
        jLabel98.setBounds(170, 680, 120, 35);

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("sansserif", 1, 27)); // NOI18N
        jLabel17.setText("DATOS");

        jLabelDatosBullsNombre.setFont(new java.awt.Font("Zilla Slab Medium", 0, 21)); // NOI18N
        jLabelDatosBullsNombre.setText("jLabelDatosBulls");

        jLabelDatosBullsCiudad.setFont(new java.awt.Font("Zilla Slab Medium", 0, 21)); // NOI18N
        jLabelDatosBullsCiudad.setText("jLabelDatosBulls");

        jLabelDatosBullsCancha.setFont(new java.awt.Font("Zilla Slab Medium", 0, 21)); // NOI18N
        jLabelDatosBullsCancha.setText("jLabelDatosBulls");

        jLabelDatosBullsPropietarios.setFont(new java.awt.Font("Zilla Slab Medium", 0, 21)); // NOI18N
        jLabelDatosBullsPropietarios.setText("jLabelDatosBulls");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDatosBullsPropietarios)
                            .addComponent(jLabelDatosBullsCancha)
                            .addComponent(jLabelDatosBullsCiudad)
                            .addComponent(jLabelDatosBullsNombre)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel17)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel17)
                .addGap(56, 56, 56)
                .addComponent(jLabelDatosBullsNombre)
                .addGap(18, 18, 18)
                .addComponent(jLabelDatosBullsCiudad)
                .addGap(18, 18, 18)
                .addComponent(jLabelDatosBullsCancha)
                .addGap(18, 18, 18)
                .addComponent(jLabelDatosBullsPropietarios)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel12);
        jPanel12.setBounds(50, 340, 390, 320);

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setFont(new java.awt.Font("sansserif", 1, 27)); // NOI18N
        jLabel19.setText("JUGADORES");

        jTableJugadoresBulls.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Nombre", "Posición"
            }
        ));
        jScrollPane10.setViewportView(jTableJugadoresBulls);
        if (jTableJugadoresBulls.getColumnModel().getColumnCount() > 0) {
            jTableJugadoresBulls.getColumnModel().getColumn(0).setResizable(false);
            jTableJugadoresBulls.getColumnModel().getColumn(1).setResizable(false);
            jTableJugadoresBulls.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(96, 96, 96))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.add(jPanel13);
        jPanel13.setBounds(510, 30, 369, 390);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/rojo.jpg"))); // NOI18N
        jPanel11.add(jLabel5);
        jLabel5.setBounds(0, 0, 910, 850);

        javax.swing.GroupLayout jPanelBullsLayout = new javax.swing.GroupLayout(jPanelBulls);
        jPanelBulls.setLayout(jPanelBullsLayout);
        jPanelBullsLayout.setHorizontalGroup(
            jPanelBullsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBullsLayout.setVerticalGroup(
            jPanelBullsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBullsLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelBulls, "Panel9");

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/home.jpg"))); // NOI18N
        jButton22.setBorder(null);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/balon.jpg"))); // NOI18N
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/jugadores.jpg"))); // NOI18N
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/comparar.jpg"))); // NOI18N
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel20.setText("INICIO");

        jLabel21.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel21.setText("EQUIPOS");

        jLabel22.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel22.setText("JUGADORES");

        jLabel23.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel23.setText("COMPARAR");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(8, 8, 8)))
                .addGap(50, 50, 50)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel22)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel23)))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23))
                .addGap(783, 783, 783))
        );

        jPanel16.setLayout(null);

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estadios/dallasstadium.jpg"))); // NOI18N
        jLabel103.setText("jLabel103");
        jPanel16.add(jLabel103);
        jLabel103.setBounds(500, 450, 380, 360);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipos/img/dallas.png"))); // NOI18N
        jPanel16.add(jLabel24);
        jLabel24.setBounds(90, 60, 300, 290);

        jLabel99.setFont(new java.awt.Font("sansserif", 1, 27)); // NOI18N
        jLabel99.setText("TÍTULOS");
        jPanel16.add(jLabel99);
        jLabel99.setBounds(180, 710, 120, 35);

        jTableTitulosDallas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableTitulosDallas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NBA", "Conferencia", "División", "Presencias PlayOff"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTitulosDallas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTableTitulosDallas.setMinimumSize(new java.awt.Dimension(40, 0));
        jScrollPane11.setViewportView(jTableTitulosDallas);
        if (jTableTitulosDallas.getColumnModel().getColumnCount() > 0) {
            jTableTitulosDallas.getColumnModel().getColumn(0).setResizable(false);
            jTableTitulosDallas.getColumnModel().getColumn(0).setPreferredWidth(1);
            jTableTitulosDallas.getColumnModel().getColumn(1).setResizable(false);
            jTableTitulosDallas.getColumnModel().getColumn(1).setPreferredWidth(3);
            jTableTitulosDallas.getColumnModel().getColumn(2).setResizable(false);
            jTableTitulosDallas.getColumnModel().getColumn(2).setPreferredWidth(3);
            jTableTitulosDallas.getColumnModel().getColumn(3).setResizable(false);
            jTableTitulosDallas.getColumnModel().getColumn(3).setPreferredWidth(3);
        }

        jPanel16.add(jScrollPane11);
        jScrollPane11.setBounds(10, 760, 480, 48);

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel25.setFont(new java.awt.Font("sansserif", 1, 27)); // NOI18N
        jLabel25.setText("DATOS");

        jLabelDatosDallasNombre.setFont(new java.awt.Font("Zilla Slab Medium", 0, 20)); // NOI18N
        jLabelDatosDallasNombre.setText("jLabel98");

        jLabelDatosDallasCiudad.setFont(new java.awt.Font("Zilla Slab Medium", 0, 20)); // NOI18N
        jLabelDatosDallasCiudad.setText("jLabel98");

        jLabelDatosDallasCancha.setFont(new java.awt.Font("Zilla Slab Medium", 0, 20)); // NOI18N
        jLabelDatosDallasCancha.setText("jLabel98");

        jLabelDatosDallasPropietarios.setFont(new java.awt.Font("Zilla Slab Medium", 0, 20)); // NOI18N
        jLabelDatosDallasPropietarios.setText("jLabel98");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel25))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDatosDallasCancha)
                            .addComponent(jLabelDatosDallasPropietarios)
                            .addComponent(jLabelDatosDallasCiudad)
                            .addComponent(jLabelDatosDallasNombre))))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel25)
                .addGap(52, 52, 52)
                .addComponent(jLabelDatosDallasNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDatosDallasCiudad)
                .addGap(15, 15, 15)
                .addComponent(jLabelDatosDallasCancha)
                .addGap(18, 18, 18)
                .addComponent(jLabelDatosDallasPropietarios)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel17);
        jPanel17.setBounds(40, 380, 370, 310);

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel26.setFont(new java.awt.Font("sansserif", 1, 27)); // NOI18N
        jLabel26.setText("JUGADORES");

        jTableJugadoresDallas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableJugadoresDallas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Nombre", "Posición"
            }
        ));
        jScrollPane2.setViewportView(jTableJugadoresDallas);
        if (jTableJugadoresDallas.getColumnModel().getColumnCount() > 0) {
            jTableJugadoresDallas.getColumnModel().getColumn(0).setResizable(false);
            jTableJugadoresDallas.getColumnModel().getColumn(1).setResizable(false);
            jTableJugadoresDallas.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(92, 92, 92))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel18);
        jPanel18.setBounds(490, 50, 360, 360);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/azul.jpg"))); // NOI18N
        jPanel16.add(jLabel6);
        jLabel6.setBounds(4, 4, 910, 850);

        javax.swing.GroupLayout jPanelDallasLayout = new javax.swing.GroupLayout(jPanelDallas);
        jPanelDallas.setLayout(jPanelDallasLayout);
        jPanelDallasLayout.setHorizontalGroup(
            jPanelDallasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelDallasLayout.setVerticalGroup(
            jPanelDallasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDallasLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelDallas, "Panel14");

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/home.jpg"))); // NOI18N
        jButton26.setBorder(null);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/balon.jpg"))); // NOI18N
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/jugadores.jpg"))); // NOI18N
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/comparar.jpg"))); // NOI18N
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel27.setText("INICIO");

        jLabel28.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel28.setText("EQUIPOS");

        jLabel29.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel29.setText("JUGADORES");

        jLabel30.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel30.setText("COMPARAR");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(8, 8, 8)))
                .addGap(50, 50, 50)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel28))
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel29)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel30)))
                .addContainerGap(355, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27))
                .addGap(783, 783, 783))
        );

        jPanel21.setLayout(null);

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estadios/goldenstadium.jpg"))); // NOI18N
        jPanel21.add(jLabel104);
        jLabel104.setBounds(520, 440, 360, 340);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipos/img/goldenstatewarriors.png"))); // NOI18N
        jPanel21.add(jLabel31);
        jLabel31.setBounds(120, 50, 240, 280);

        jLabel100.setFont(new java.awt.Font("sansserif", 1, 27)); // NOI18N
        jLabel100.setText("TÍTULOS");
        jPanel21.add(jLabel100);
        jLabel100.setBounds(190, 710, 120, 35);

        jTableTitulosGolden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Títulos NBA", "Títulos Conferencia", "Títulos División", "Presencias PlayOff"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableTitulosGolden);
        if (jTableTitulosGolden.getColumnModel().getColumnCount() > 0) {
            jTableTitulosGolden.getColumnModel().getColumn(0).setResizable(false);
            jTableTitulosGolden.getColumnModel().getColumn(1).setResizable(false);
            jTableTitulosGolden.getColumnModel().getColumn(2).setResizable(false);
            jTableTitulosGolden.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel21.add(jScrollPane3);
        jScrollPane3.setBounds(10, 760, 490, 50);

        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel22.setLayout(null);

        jLabel32.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel32.setText("DATOS");
        jPanel22.add(jLabel32);
        jLabel32.setBounds(150, 21, 83, 32);

        jLabelDatosGoldenNombre.setFont(new java.awt.Font("Zilla Slab Medium", 0, 21)); // NOI18N
        jLabelDatosGoldenNombre.setText("jLabel98");
        jPanel22.add(jLabelDatosGoldenNombre);
        jLabelDatosGoldenNombre.setBounds(40, 110, 340, 26);

        jLabelDatosGoldenCiudad.setFont(new java.awt.Font("Zilla Slab Medium", 0, 21)); // NOI18N
        jLabelDatosGoldenCiudad.setText("jLabel98");
        jPanel22.add(jLabelDatosGoldenCiudad);
        jLabelDatosGoldenCiudad.setBounds(40, 150, 340, 26);

        jLabelDatosGoldenCancha.setFont(new java.awt.Font("Zilla Slab Medium", 0, 21)); // NOI18N
        jLabelDatosGoldenCancha.setText("jLabel98");
        jPanel22.add(jLabelDatosGoldenCancha);
        jLabelDatosGoldenCancha.setBounds(40, 190, 340, 26);

        jLabelDatosGoldenPropietario.setFont(new java.awt.Font("Zilla Slab Medium", 0, 19)); // NOI18N
        jLabelDatosGoldenPropietario.setText("jLabel98");
        jPanel22.add(jLabelDatosGoldenPropietario);
        jLabelDatosGoldenPropietario.setBounds(40, 230, 380, 23);

        jPanel21.add(jPanel22);
        jPanel22.setBounds(30, 370, 440, 320);

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel33.setFont(new java.awt.Font("sansserif", 1, 27)); // NOI18N
        jLabel33.setText("JUGADORES");

        jTableJugadoresGolden.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableJugadoresGolden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Nombre", "Posición"
            }
        ));
        jScrollPane12.setViewportView(jTableJugadoresGolden);
        if (jTableJugadoresGolden.getColumnModel().getColumnCount() > 0) {
            jTableJugadoresGolden.getColumnModel().getColumn(0).setResizable(false);
            jTableJugadoresGolden.getColumnModel().getColumn(1).setResizable(false);
            jTableJugadoresGolden.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addGap(96, 96, 96))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel21.add(jPanel23);
        jPanel23.setBounds(500, 40, 370, 370);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/amarillo.jpg"))); // NOI18N
        jPanel21.add(jLabel7);
        jLabel7.setBounds(0, 0, 910, 860);

        javax.swing.GroupLayout jPanelGoldenLayout = new javax.swing.GroupLayout(jPanelGolden);
        jPanelGolden.setLayout(jPanelGoldenLayout);
        jPanelGoldenLayout.setHorizontalGroup(
            jPanelGoldenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelGoldenLayout.setVerticalGroup(
            jPanelGoldenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGoldenLayout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelGolden, "Panel19");

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/home.jpg"))); // NOI18N
        jButton30.setBorder(null);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setBackground(new java.awt.Color(255, 255, 255));
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/balon.jpg"))); // NOI18N
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/jugadores.jpg"))); // NOI18N
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/comparar.jpg"))); // NOI18N
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel34.setText("INICIO");

        jLabel35.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel35.setText("EQUIPOS");

        jLabel36.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel36.setText("JUGADORES");

        jLabel37.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel37.setText("COMPARAR");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(8, 8, 8)))
                .addGap(50, 50, 50)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel36))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel37))
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(783, 783, 783))
        );

        jPanel26.setLayout(null);

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estadios/lakerstadium.jpg"))); // NOI18N
        jPanel26.add(jLabel105);
        jLabel105.setBounds(510, 440, 380, 360);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipos/img/lakers.png"))); // NOI18N
        jPanel26.add(jLabel38);
        jLabel38.setBounds(60, 90, 400, 280);

        jLabel101.setFont(new java.awt.Font("sansserif", 1, 27)); // NOI18N
        jLabel101.setText("TÍTULOS");
        jPanel26.add(jLabel101);
        jLabel101.setBounds(200, 700, 120, 35);

        jTableTitulosLakers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Títulos NBA", "Títulos Conferencia", "Títulos División", "Presencias PlayOff"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableTitulosLakers);
        if (jTableTitulosLakers.getColumnModel().getColumnCount() > 0) {
            jTableTitulosLakers.getColumnModel().getColumn(0).setResizable(false);
            jTableTitulosLakers.getColumnModel().getColumn(1).setResizable(false);
            jTableTitulosLakers.getColumnModel().getColumn(2).setResizable(false);
            jTableTitulosLakers.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel26.add(jScrollPane4);
        jScrollPane4.setBounds(10, 750, 490, 50);

        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel27.setLayout(null);

        jLabel39.setFont(new java.awt.Font("sansserif", 1, 27)); // NOI18N
        jLabel39.setText("DATOS");
        jPanel27.add(jLabel39);
        jLabel39.setBounds(178, 12, 110, 35);

        jLabelDatosLakersNombre.setFont(new java.awt.Font("Zilla Slab Medium", 0, 20)); // NOI18N
        jLabelDatosLakersNombre.setText("jLabel98");
        jPanel27.add(jLabelDatosLakersNombre);
        jLabelDatosLakersNombre.setBounds(30, 90, 420, 25);

        jLabelDatosLakersCiudad.setFont(new java.awt.Font("Zilla Slab Medium", 0, 20)); // NOI18N
        jLabelDatosLakersCiudad.setText("jLabel98");
        jPanel27.add(jLabelDatosLakersCiudad);
        jLabelDatosLakersCiudad.setBounds(30, 140, 410, 25);

        jLabelDatosLakersCancha.setFont(new java.awt.Font("Zilla Slab Medium", 0, 20)); // NOI18N
        jLabelDatosLakersCancha.setText("jLabel98");
        jPanel27.add(jLabelDatosLakersCancha);
        jLabelDatosLakersCancha.setBounds(30, 180, 410, 25);

        jLabelDatosLakersPropietarios.setFont(new java.awt.Font("Zilla Slab Medium", 0, 15)); // NOI18N
        jLabelDatosLakersPropietarios.setText("jLabel98");
        jPanel27.add(jLabelDatosLakersPropietarios);
        jLabelDatosLakersPropietarios.setBounds(30, 230, 410, 19);

        jPanel26.add(jPanel27);
        jPanel27.setBounds(20, 400, 470, 280);

        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel40.setFont(new java.awt.Font("sansserif", 1, 27)); // NOI18N
        jLabel40.setText("JUGADORES");

        jTableJugadoresLakers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableJugadoresLakers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Nombre", "Posición"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane13.setViewportView(jTableJugadoresLakers);
        if (jTableJugadoresLakers.getColumnModel().getColumnCount() > 0) {
            jTableJugadoresLakers.getColumnModel().getColumn(0).setResizable(false);
            jTableJugadoresLakers.getColumnModel().getColumn(1).setResizable(false);
            jTableJugadoresLakers.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addGap(111, 111, 111))
            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
        );

        jPanel26.add(jPanel28);
        jPanel28.setBounds(510, 40, 376, 370);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/morado.jpg"))); // NOI18N
        jPanel26.add(jLabel8);
        jLabel8.setBounds(0, 0, 910, 860);

        javax.swing.GroupLayout jPanelLakersLayout = new javax.swing.GroupLayout(jPanelLakers);
        jPanelLakers.setLayout(jPanelLakersLayout);
        jPanelLakersLayout.setHorizontalGroup(
            jPanelLakersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelLakersLayout.setVerticalGroup(
            jPanelLakersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLakersLayout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelLakers, "Panel24");

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/home.jpg"))); // NOI18N
        jButton34.setBorder(null);
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/balon.jpg"))); // NOI18N
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/jugadores.jpg"))); // NOI18N
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/comparar.jpg"))); // NOI18N
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel41.setText("INICIO");

        jLabel42.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel42.setText("EQUIPOS");

        jLabel43.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel43.setText("JUGADORES");

        jLabel44.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel44.setText("COMPARAR");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(8, 8, 8)))
                .addGap(50, 50, 50)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel42))
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel43)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel44)))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(783, 783, 783))
        );

        jPanel31.setLayout(null);

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estadios/buckstadium.jpg"))); // NOI18N
        jPanel31.add(jLabel107);
        jLabel107.setBounds(490, 410, 360, 330);

        jLabel106.setFont(new java.awt.Font("sansserif", 1, 27)); // NOI18N
        jLabel106.setText("TÍTULOS");
        jPanel31.add(jLabel106);
        jLabel106.setBounds(180, 690, 120, 35);

        jTableTitulosBucks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Títulos NBA", "Títulos Conferencia", "Títulos División", "Presencias PlayOff"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTableTitulosBucks);
        if (jTableTitulosBucks.getColumnModel().getColumnCount() > 0) {
            jTableTitulosBucks.getColumnModel().getColumn(0).setResizable(false);
            jTableTitulosBucks.getColumnModel().getColumn(1).setResizable(false);
            jTableTitulosBucks.getColumnModel().getColumn(2).setResizable(false);
            jTableTitulosBucks.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel31.add(jScrollPane5);
        jScrollPane5.setBounds(10, 750, 500, 50);

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipos/img/milwaukee.png"))); // NOI18N
        jPanel31.add(jLabel45);
        jLabel45.setBounds(120, 50, 241, 268);

        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel32.setLayout(null);

        jLabel46.setFont(new java.awt.Font("sansserif", 1, 27)); // NOI18N
        jLabel46.setText("DATOS");
        jPanel32.add(jLabel46);
        jLabel46.setBounds(160, 30, 110, 35);

        jLabelDatosBucksCiudad.setFont(new java.awt.Font("Zilla Slab Medium", 0, 21)); // NOI18N
        jLabelDatosBucksCiudad.setText("jLabel98");
        jPanel32.add(jLabelDatosBucksCiudad);
        jLabelDatosBucksCiudad.setBounds(30, 160, 380, 26);

        jLabelDatosBucksNombre.setFont(new java.awt.Font("Zilla Slab Medium", 0, 21)); // NOI18N
        jLabelDatosBucksNombre.setText("jLabel98");
        jPanel32.add(jLabelDatosBucksNombre);
        jLabelDatosBucksNombre.setBounds(30, 110, 370, 26);

        jLabelDatosBucksCancha.setFont(new java.awt.Font("Zilla Slab Medium", 0, 21)); // NOI18N
        jLabelDatosBucksCancha.setText("jLabel98");
        jPanel32.add(jLabelDatosBucksCancha);
        jLabelDatosBucksCancha.setBounds(30, 200, 370, 26);

        jLabelDatosBucksPropietarios.setFont(new java.awt.Font("Zilla Slab Medium", 0, 18)); // NOI18N
        jLabelDatosBucksPropietarios.setText("jLabel98");
        jPanel32.add(jLabelDatosBucksPropietarios);
        jLabelDatosBucksPropietarios.setBounds(30, 240, 380, 22);

        jPanel31.add(jPanel32);
        jPanel32.setBounds(30, 350, 420, 310);

        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel47.setFont(new java.awt.Font("sansserif", 1, 27)); // NOI18N
        jLabel47.setText("JUGADORES");

        jTableJugadoresBucks.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableJugadoresBucks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Nombre", "Posición"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane14.setViewportView(jTableJugadoresBucks);
        if (jTableJugadoresBucks.getColumnModel().getColumnCount() > 0) {
            jTableJugadoresBucks.getColumnModel().getColumn(0).setResizable(false);
            jTableJugadoresBucks.getColumnModel().getColumn(1).setResizable(false);
            jTableJugadoresBucks.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addGap(111, 111, 111))
            .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel47)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
        );

        jPanel31.add(jPanel33);
        jPanel33.setBounds(480, 20, 389, 380);

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/verde.jpg"))); // NOI18N
        jPanel31.add(jLabel48);
        jLabel48.setBounds(0, 0, 950, 840);

        javax.swing.GroupLayout jPanelBucksLayout = new javax.swing.GroupLayout(jPanelBucks);
        jPanelBucks.setLayout(jPanelBucksLayout);
        jPanelBucksLayout.setHorizontalGroup(
            jPanelBucksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBucksLayout.setVerticalGroup(
            jPanelBucksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBucksLayout.createSequentialGroup()
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelBucks, "Panel29");

        jPanelJugadores.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/home.jpg"))); // NOI18N
        jButton39.setBorder(null);
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setBackground(new java.awt.Color(255, 255, 255));
        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/balon.jpg"))); // NOI18N
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/jugadores.jpg"))); // NOI18N
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/comparar.jpg"))); // NOI18N
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel49.setText("INICIO");

        jLabel50.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel50.setText("EQUIPOS");

        jLabel51.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel51.setText("JUGADORES");

        jLabel52.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel52.setText("COMPARAR");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(8, 8, 8)))
                .addGap(50, 50, 50)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel50))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel51))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel52))
                .addContainerGap(1236, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );

        jPanelJugadores.add(jPanel9);
        jPanel9.setBounds(0, 0, 1781, 123);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel53.setText("JUGADORES");

        buttonGroupPosicion.add(jRadioButtonBase);
        jRadioButtonBase.setText("Base");
        jRadioButtonBase.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonBaseItemStateChanged(evt);
            }
        });
        jRadioButtonBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBaseActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel54.setText("FILTROS");

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel55.setText("Posición");

        buttonGroupPosicion.add(jRadioButtonEscolta);
        jRadioButtonEscolta.setText("Escolta");
        jRadioButtonEscolta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonEscoltaItemStateChanged(evt);
            }
        });

        buttonGroupPosicion.add(jRadioButtonAlero);
        jRadioButtonAlero.setText("Alero");
        jRadioButtonAlero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonAleroItemStateChanged(evt);
            }
        });

        buttonGroupPosicion.add(jRadioButtonAlaPivot);
        jRadioButtonAlaPivot.setText("Ala-Pivot");
        jRadioButtonAlaPivot.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonAlaPivotItemStateChanged(evt);
            }
        });

        buttonGroupPosicion.add(jRadioButtonPivot);
        jRadioButtonPivot.setText("Pivot");
        jRadioButtonPivot.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonPivotItemStateChanged(evt);
            }
        });

        jComboBoxEquipos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxEquiposItemStateChanged(evt);
            }
        });
        jComboBoxEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEquiposActionPerformed(evt);
            }
        });

        jSliderAltura.setMajorTickSpacing(1);
        jSliderAltura.setPaintLabels(true);
        jSliderAltura.setPaintTicks(true);
        jSliderAltura.setValue(0);
        jSliderAltura.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderAlturaStateChanged(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel56.setText("Equipo");

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel57.setText("Altura");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonPivot)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jRadioButtonAlaPivot)
                                .addComponent(jRadioButtonBase, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButtonEscolta, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButtonAlero, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel56)
                                .addGap(264, 264, 264)
                                .addComponent(jLabel53))
                            .addComponent(jLabel55)
                            .addComponent(jSliderAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57)
                            .addComponent(jComboBoxEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel54)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel54)
                .addGap(33, 33, 33)
                .addComponent(jLabel55)
                .addGap(10, 10, 10)
                .addComponent(jRadioButtonBase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonEscolta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonAlero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonAlaPivot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonPivot)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel53)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSliderAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(427, Short.MAX_VALUE))
        );

        jPanelJugadores.add(jPanel5);
        jPanel5.setBounds(0, 120, 240, 840);

        jPanel6.setLayout(null);

        jTableJugadoresFiltro.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTableJugadoresFiltro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Equipo", "Posicion", "Altura"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane15.setViewportView(jTableJugadoresFiltro);
        if (jTableJugadoresFiltro.getColumnModel().getColumnCount() > 0) {
            jTableJugadoresFiltro.getColumnModel().getColumn(0).setResizable(false);
            jTableJugadoresFiltro.getColumnModel().getColumn(1).setResizable(false);
            jTableJugadoresFiltro.getColumnModel().getColumn(2).setResizable(false);
            jTableJugadoresFiltro.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel6.add(jScrollPane15);
        jScrollPane15.setBounds(30, 70, 610, 385);

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/nbalogo.png"))); // NOI18N
        jPanel6.add(jLabel110);
        jLabel110.setBounds(180, 500, 320, 160);

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/jugadores.png"))); // NOI18N
        jPanel6.add(jLabel108);
        jLabel108.setBounds(0, 0, 800, 770);

        jPanelJugadores.add(jPanel6);
        jPanel6.setBounds(240, 190, 670, 770);

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonA.setText("A");
        jButtonA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jButtonAItemStateChanged(evt);
            }
        });

        jButton5.setText("F");

        jButton6.setText("H");

        jButton7.setText("M");

        jButton8.setText("L");

        jButton47.setText("K");

        jButton48.setText("J");

        jButton49.setText("I");

        jButton50.setText("B");

        jButton51.setText("C");

        jButton52.setText("D");

        jButton53.setText("E");

        jButton54.setText("G");

        jButton55.setText("N");

        jButton56.setText("O");

        jButton57.setText("P");

        jButton58.setText("Q");

        jButton59.setText("R");

        jButton60.setText("S");

        jButton61.setText("T");

        jButton62.setText("U");

        jButton63.setText("W");

        jButton64.setText("X");

        jButton65.setText("Y");

        jButton66.setText("Z");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jButtonA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton56))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton66)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton50)
                        .addComponent(jButton51)
                        .addComponent(jButton52)
                        .addComponent(jButton53)
                        .addComponent(jButton5)
                        .addComponent(jButton54)
                        .addComponent(jButton6)
                        .addComponent(jButton49)
                        .addComponent(jButton48)
                        .addComponent(jButton47)
                        .addComponent(jButton8)
                        .addComponent(jButton7)
                        .addComponent(jButton55)
                        .addComponent(jButton56)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton57)
                    .addComponent(jButton58)
                    .addComponent(jButton59)
                    .addComponent(jButton60)
                    .addComponent(jButton61)
                    .addComponent(jButton62)
                    .addComponent(jButton63)
                    .addComponent(jButton64)
                    .addComponent(jButton65)
                    .addComponent(jButton66))
                .addContainerGap())
        );

        jPanelJugadores.add(jPanel14);
        jPanel14.setBounds(240, 120, 670, 70);

        jPanel1.add(jPanelJugadores, "PanelJugadores");

        jPanelComparar.setLayout(null);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/home.jpg"))); // NOI18N
        jButton43.setBorder(null);
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setBackground(new java.awt.Color(255, 255, 255));
        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/balon.jpg"))); // NOI18N
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/jugadores.jpg"))); // NOI18N
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img/comparar.jpg"))); // NOI18N
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel58.setText("INICIO");

        jLabel59.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel59.setText("EQUIPOS");

        jLabel60.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel60.setText("JUGADORES");

        jLabel61.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel61.setText("COMPARAR");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addGap(8, 8, 8)))
                .addGap(50, 50, 50)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel59))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel60))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel61))
                .addContainerGap(1236, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );

        jPanelComparar.add(jPanel19);
        jPanel19.setBounds(0, 0, 1781, 123);

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/universo.png"))); // NOI18N

        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel29.setLayout(null);

        jComboBoxEquipo1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxEquipo1ItemStateChanged(evt);
            }
        });
        jComboBoxEquipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEquipo1ActionPerformed(evt);
            }
        });
        jComboBoxEquipo1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxEquipo1PropertyChange(evt);
            }
        });
        jPanel29.add(jComboBoxEquipo1);
        jComboBoxEquipo1.setBounds(250, 40, 170, 30);

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("EQUIPO 1:");
        jPanel29.add(jLabel63);
        jLabel63.setBounds(120, 30, 160, 50);

        jTableCompara1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "MJ", "PTS", "RB", "AS", "TC", "T3", "TL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCompara1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableCompara1.setFocusable(false);
        jTableCompara1.setOpaque(false);
        jScrollPane6.setViewportView(jTableCompara1);
        if (jTableCompara1.getColumnModel().getColumnCount() > 0) {
            jTableCompara1.getColumnModel().getColumn(0).setResizable(false);
            jTableCompara1.getColumnModel().getColumn(0).setPreferredWidth(700);
            jTableCompara1.getColumnModel().getColumn(1).setResizable(false);
            jTableCompara1.getColumnModel().getColumn(2).setResizable(false);
            jTableCompara1.getColumnModel().getColumn(3).setResizable(false);
            jTableCompara1.getColumnModel().getColumn(4).setResizable(false);
            jTableCompara1.getColumnModel().getColumn(5).setResizable(false);
            jTableCompara1.getColumnModel().getColumn(6).setResizable(false);
            jTableCompara1.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel29.add(jScrollPane6);
        jScrollPane6.setBounds(80, 90, 750, 290);

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compara/equipouno.png"))); // NOI18N
        jLabel62.setText("jLabel62");
        jPanel29.add(jLabel62);
        jLabel62.setBounds(0, 0, 870, 410);

        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel34.setLayout(null);

        jTableCompara2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "MJ", "PTS", "RB", "AS", "TC", "T3", "TL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCompara2.setOpaque(false);
        jScrollPane7.setViewportView(jTableCompara2);
        if (jTableCompara2.getColumnModel().getColumnCount() > 0) {
            jTableCompara2.getColumnModel().getColumn(0).setResizable(false);
            jTableCompara2.getColumnModel().getColumn(0).setPreferredWidth(200);
            jTableCompara2.getColumnModel().getColumn(1).setResizable(false);
            jTableCompara2.getColumnModel().getColumn(2).setResizable(false);
            jTableCompara2.getColumnModel().getColumn(3).setResizable(false);
            jTableCompara2.getColumnModel().getColumn(4).setResizable(false);
            jTableCompara2.getColumnModel().getColumn(5).setResizable(false);
            jTableCompara2.getColumnModel().getColumn(6).setResizable(false);
            jTableCompara2.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel34.add(jScrollPane7);
        jScrollPane7.setBounds(80, 80, 750, 290);

        jComboBoxEquipo2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxEquipo2ItemStateChanged(evt);
            }
        });
        jPanel34.add(jComboBoxEquipo2);
        jComboBoxEquipo2.setBounds(240, 30, 170, 30);

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("EQUIPO 2:");
        jPanel34.add(jLabel64);
        jLabel64.setBounds(110, 30, 150, 30);

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compara/equipodos.png"))); // NOI18N
        jPanel34.add(jLabel65);
        jLabel65.setBounds(0, 0, 860, 400);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 1014, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanelComparar.add(jPanel24);
        jPanel24.setBounds(0, 120, 910, 860);

        jPanel1.add(jPanelComparar, "PanelComparar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//MOVIMIENTO DEL PANEL PRINCIPAL PARA IR A CUALQUIER SECCIÓN
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         card.show(jPanel1,"PanelJugadores");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        card.show(jPanel1,"Panel5");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         card.show(jPanel1,"PanelJugadores");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        card.show(jPanel1,"Panel2");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       card.show(jPanel1,"Panel2");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        card.show(jPanel1,"Panel2");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        card.show(jPanel1,"Panel5");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
     card.show(jPanel1,"PanelJugadores");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        card.show(jPanel1,"Panel2");
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        card.show(jPanel1,"Panel5");
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
    card.show(jPanel1,"PanelJugadores");
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        card.show(jPanel1,"Panel2");
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
       card.show(jPanel1,"Panel5");
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
     card.show(jPanel1,"PanelJugadores");
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
      card.show(jPanel1,"Panel2");
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        card.show(jPanel1,"Panel5");
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
    card.show(jPanel1,"PanelJugadores");
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
      card.show(jPanel1,"Panel2");
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
       card.show(jPanel1,"Panel5");
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        card.show(jPanel1,"PanelJugadores");
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
//OBTENER DATOS DE LOS GOLDEN DE EQUIPO Y JUGADOR Y SE SETEAN EN LAS TABLAS Y PANELES CORRESPONDIENTES

        jLabelDatosGoldenNombre.setText("NOMBRE:   "+equipo.get(3).getNombre());
        jLabelDatosGoldenCiudad.setText("CIUDAD:   "+equipo.get(3).getCiudad());
        jLabelDatosGoldenCancha.setText("CANCHA:   "+equipo.get(3).getCancha());
        jLabelDatosGoldenPropietario.setText("PROPIETARIOS/S:   "+equipo.get(3).getPropietarios());
        
        String tbData[] ={Integer.toString(equipo.get(3).getTitulosnba()),Integer.toString(equipo.get(3).getTitulosconferencia()),Integer.toString(equipo.get(3).getTitulosdivision()),Integer.toString(equipo.get(3).getPresenciasplayoff())};
        DefaultTableModel tblModel=(DefaultTableModel)tablastitulosarray[2].getModel();
        tblModel.addRow(tbData);
        
        
        String[] tbDataJuga = null;
        for (int i = 0; i < jugador.size(); i++) {
        if(jugador.get(i).getEquipo().equalsIgnoreCase("Golden State Warriors")){
        tbDataJuga = new String[]{Integer.toString(jugador.get(i).getNumero()),(jugador.get(i).getNombre()),(jugador.get(i).getPosicion())};
        DefaultTableModel tblModelJuga=(DefaultTableModel)tablasjugadoressarray[2].getModel();
        tblModelJuga.addRow(tbDataJuga);
            }
        }
        
        card.show(jPanel1,"Panel19");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
//OBTENER DATOS DE LOS BULLS DE EQUIPO Y JUGADOR Y SE SETEAN EN LAS TABLAS Y PANELES CORRESPONDIENTES
        jLabelDatosBullsNombre.setText("NOMBRE:   "+equipo.get(4).getNombre());
        jLabelDatosBullsCiudad.setText("CIUDAD:   "+equipo.get(4).getCiudad());
        jLabelDatosBullsCancha.setText("CANCHA:   "+equipo.get(4).getCancha());
        jLabelDatosBullsPropietarios.setText("PROPIETARIO/S:   "+equipo.get(4).getPropietarios());
        
        String tbData[] ={Integer.toString(equipo.get(4).getTitulosnba()),Integer.toString(equipo.get(4).getTitulosconferencia()),Integer.toString(equipo.get(4).getTitulosdivision()),Integer.toString(equipo.get(4).getPresenciasplayoff())};
        DefaultTableModel tblModel=(DefaultTableModel)tablastitulosarray[0].getModel();
        tblModel.addRow(tbData);
        
        
        String[] tbDataJuga = null;
        for (int i = 0; i < jugador.size(); i++) {
        if(jugador.get(i).getEquipo().equalsIgnoreCase("Chicago Bulls")){
        tbDataJuga = new String[]{Integer.toString(jugador.get(i).getNumero()),(jugador.get(i).getNombre()),(jugador.get(i).getPosicion())};
        DefaultTableModel tblModelJuga=(DefaultTableModel)tablasjugadoressarray[0].getModel();
        tblModelJuga.addRow(tbDataJuga);
            }
        }

        card.show(jPanel1,"Panel9");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
//OBTENER DATOS DE DALLAS DE EQUIPO Y JUGADOR Y SE SETEAN EN LAS TABLAS Y PANELES CORRESPONDIENTES
        jLabelDatosDallasNombre.setText("NOMBRE:   "+equipo.get(0).getNombre());
        jLabelDatosDallasCiudad.setText("CIUDAD:   "+equipo.get(0).getCiudad());
        jLabelDatosDallasCancha.setText("CANCHA:   "+equipo.get(0).getCancha());
        jLabelDatosDallasPropietarios.setText("PROPIETARIOS/S:   "+equipo.get(0).getPropietarios());
        
        String tbData[] ={Integer.toString(equipo.get(0).getTitulosnba()),Integer.toString(equipo.get(0).getTitulosconferencia()),Integer.toString(equipo.get(0).getTitulosdivision()),Integer.toString(equipo.get(0).getPresenciasplayoff())};
        DefaultTableModel tblModel=(DefaultTableModel)tablastitulosarray[1].getModel();
        tblModel.addRow(tbData);
        
        String[] tbDataJuga = null;
        for (int i = 0; i < jugador.size(); i++) {
        if(jugador.get(i).getEquipo().equalsIgnoreCase("Dallas Mavericks")){
        tbDataJuga = new String[]{Integer.toString(jugador.get(i).getNumero()),(jugador.get(i).getNombre()),(jugador.get(i).getPosicion())};
        DefaultTableModel tblModelJuga=(DefaultTableModel)tablasjugadoressarray[1].getModel();
        tblModelJuga.addRow(tbDataJuga);
            }
        }
        card.show(jPanel1,"Panel14");        

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
//OBTENER DATOS DE LOS LAKERS DE EQUIPO Y JUGADOR Y SE SETEAN EN LAS TABLAS Y PANELES CORRESPONDIENTES  

        jLabelDatosLakersNombre.setText("NOMBRE:   "+equipo.get(2).getNombre());
        jLabelDatosLakersCiudad.setText("CIUDAD:   "+equipo.get(2).getCiudad());
        jLabelDatosLakersCancha.setText("CANCHA:   "+equipo.get(2).getCancha());
        jLabelDatosLakersPropietarios.setText("PROPIETARIOS/S:   "+equipo.get(2).getPropietarios());
        String tbData[] ={Integer.toString(equipo.get(2).getTitulosnba()),Integer.toString(equipo.get(2).getTitulosconferencia()),Integer.toString(equipo.get(2).getTitulosdivision()),Integer.toString(equipo.get(2).getPresenciasplayoff())};
        DefaultTableModel tblModel=(DefaultTableModel)tablastitulosarray[3].getModel();
        tblModel.addRow(tbData);
        
        String[] tbDataJuga = null;
        for (int i = 0; i < jugador.size(); i++) {
        if(jugador.get(i).getEquipo().equalsIgnoreCase("Los Angeles Lakers")){
        tbDataJuga = new String[]{Integer.toString(jugador.get(i).getNumero()),(jugador.get(i).getNombre()),(jugador.get(i).getPosicion())};
        DefaultTableModel tblModelJuga=(DefaultTableModel)tablasjugadoressarray[3].getModel();
        tblModelJuga.addRow(tbDataJuga);
            }
        }
        card.show(jPanel1,"Panel24");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
//OBTENER DATOS DE LOS BUCKS DE EQUIPO Y JUGADOR Y SE SETEAN EN LAS TABLAS Y PANELES CORRESPONDIENTES
        jLabelDatosBucksNombre.setText("NOMBRE:   "+equipo.get(1).getNombre());
        jLabelDatosBucksCiudad.setText("CIUDAD:   "+equipo.get(1).getCiudad());
        jLabelDatosBucksCancha.setText("CANCHA:   "+equipo.get(1).getCancha());
        jLabelDatosBucksPropietarios.setText("PROPIETARIOS/S:   "+equipo.get(1).getPropietarios());
        String tbData[] ={Integer.toString(equipo.get(1).getTitulosnba()),Integer.toString(equipo.get(1).getTitulosconferencia()),Integer.toString(equipo.get(1).getTitulosdivision()),Integer.toString(equipo.get(1).getPresenciasplayoff())};
        DefaultTableModel tblModel=(DefaultTableModel)tablastitulosarray[4].getModel();
        tblModel.addRow(tbData);
        
        String[] tbDataJuga = null;
        for (int i = 0; i < jugador.size(); i++) {
        if(jugador.get(i).getEquipo().equalsIgnoreCase("Milwaukee Bucks")){
        tbDataJuga = new String[]{Integer.toString(jugador.get(i).getNumero()),(jugador.get(i).getNombre()),(jugador.get(i).getPosicion())};
        DefaultTableModel tblModelJuga=(DefaultTableModel)tablasjugadoressarray[4].getModel();
        tblModelJuga.addRow(tbDataJuga);
            }
        }
        card.show(jPanel1,"Panel29");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        card.show(jPanel1,"Panel5");
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        card.show(jPanel1,"Panel2");
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        card.show(jPanel1,"Panel5");
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
      card.show(jPanel1,"PanelJugadores"); 
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jRadioButtonBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonBaseActionPerformed

    private void jComboBoxEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEquiposActionPerformed
        
    }//GEN-LAST:event_jComboBoxEquiposActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
       card.show(jPanel1,"PanelComparar");  
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
              card.show(jPanel1,"Panel2");
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        card.show(jPanel1,"Panel5");
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
      card.show(jPanel1,"PanelJugadores"); 
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       card.show(jPanel1,"PanelComparar");  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
    card.show(jPanel1,"PanelComparar");  
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
    card.show(jPanel1,"PanelComparar");  
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
    card.show(jPanel1,"PanelComparar");  
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
       card.show(jPanel1,"PanelComparar");  
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
       card.show(jPanel1,"PanelComparar");  
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
       card.show(jPanel1,"PanelComparar");  
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jComboBoxEquiposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxEquiposItemStateChanged
//FILTRO DEL COBOX DEL EQUIPO(NO SACA TODOS LOS NOMBRES D ELOS JUGADORES DE TODOS LOS EQUIPOS)       
        String filtroequipoeleccionado= (String)jComboBoxEquipos.getSelectedItem();
        
        jTableJugadoresFiltro.setModel(new javax.swing.table.DefaultTableModel(
        new Object [] []{
            
        },
        new String []{
            "Nombre", "Equipo", "Posicion", "Altura"
        }
        ));
        DefaultTableModel tblModelJugaFiltro= new DefaultTableModel();
        
        String[] tbDataJugaFiltro = null;
        for (int i = 0; i < jugador.size(); i++) {
        if(jugador.get(i).getEquipo().equalsIgnoreCase(filtroequipoeleccionado)){
        tbDataJugaFiltro = new String[]{
            (jugador.get(i).getNombre()),
            ( jugador.get(i).getEquipo()),
            (jugador.get(i).getPosicion()),
            Double.toString((double) jugador.get(i).getAltura())
        };
            
        tblModelJugaFiltro=(DefaultTableModel)jTableJugadoresFiltro.getModel();
        tblModelJugaFiltro.addRow(tbDataJugaFiltro);
        
        }  
        } 
        
    }//GEN-LAST:event_jComboBoxEquiposItemStateChanged

    private void jSliderAlturaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderAlturaStateChanged
 //INTENTO DE HACER QUE FUNCIONE EL SLIDER(NO FUNCIONA AÚN)     
 
        String alturaseleccionada =  Integer.toString(jSliderAltura.getValue());
                jTableJugadoresFiltro.setModel(new javax.swing.table.DefaultTableModel(
        new Object [] []{
            
        },
        new String []{
            "Nombre", "Equipo", "Posicion", "Altura"
        }
        ));
        DefaultTableModel tblModelJugaFiltro= new DefaultTableModel();
        
        String[] tbDataJugaFiltro = null;
        for (int i = 0; i < jugador.size(); i++) {
        if(String.valueOf( jugador.get(i).getAltura()).equalsIgnoreCase(alturaseleccionada)){
        tbDataJugaFiltro = new String[]{
            (jugador.get(i).getNombre()),
            ( jugador.get(i).getEquipo()),
            (jugador.get(i).getPosicion()),
            Double.toString((double) jugador.get(i).getAltura())
        };
            
        tblModelJugaFiltro=(DefaultTableModel)jTableJugadoresFiltro.getModel();
        tblModelJugaFiltro.addRow(tbDataJugaFiltro);
        
        }  
     } 
        
    }//GEN-LAST:event_jSliderAlturaStateChanged

    private void jComboBoxEquipo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxEquipo1ItemStateChanged
//COMPARAR EQUIPO 1       
        String compraracionequipo1= (String)jComboBoxEquipo1.getSelectedItem();
        
            jTableCompara1.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
        "Nombre", "MJ", "PTS", "RB", "AS", "TC", "T3", "TL"
    }
));
        DefaultTableModel tblModelJugaCompa = new DefaultTableModel();
        

        String[] tbDataJugaCompa = null;
        for (int i = 0; i < jugador.size(); i++) {
        if(jugador.get(i).getEquipo().equalsIgnoreCase(compraracionequipo1)){
        tbDataJugaCompa = new String[]{
            (jugador.get(i).getNombre()),
            Integer.toString((int) jugador.get(i).getMJ()),
            Integer.toString((int) jugador.get(i).getPTS()),
            Integer.toString((int) jugador.get(i).getRB()),
            Integer.toString((int) jugador.get(i).getAS()),
            Integer.toString((int) jugador.get(i).getTC()),
            Integer.toString((int) jugador.get(i).getT3()),
            Integer.toString((int) jugador.get(i).getTL()),
        };
            
        tblModelJugaCompa=(DefaultTableModel)tablascomparararray[0].getModel();
        tblModelJugaCompa.addRow(tbDataJugaCompa);
        
        }  
        }        
    }//GEN-LAST:event_jComboBoxEquipo1ItemStateChanged

    private void jComboBoxEquipo2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxEquipo2ItemStateChanged
       //COMPARAR EQUIPO 2
        String compraracionequipo2= (String)jComboBoxEquipo2.getSelectedItem();
        
            jTableCompara2.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
        "Nombre", "MJ", "PTS", "RB", "AS", "TC", "T3", "TL"
    }
));
        String[] tbDataJugaCompa2 = null;
        for (int i = 0; i < jugador.size(); i++) {
        if(jugador.get(i).getEquipo().equalsIgnoreCase(compraracionequipo2)){
        tbDataJugaCompa2 = new String[]{
            (jugador.get(i).getNombre()),
            Integer.toString((int) jugador.get(i).getMJ()),
            Integer.toString((int) jugador.get(i).getPTS()),
            Integer.toString((int) jugador.get(i).getRB()),
            Integer.toString((int) jugador.get(i).getAS()),
            Integer.toString((int) jugador.get(i).getTC()),
            Integer.toString((int) jugador.get(i).getT3()),
            Integer.toString((int) jugador.get(i).getTL()),
        };
        DefaultTableModel tblModelJugaCompa2=(DefaultTableModel)tablascomparararray[1].getModel();
        tblModelJugaCompa2.addRow(tbDataJugaCompa2);
        
        //tblModelJugaCompa2.removeRow(tbDataJugaCompa2);
        
            }
        }

    }//GEN-LAST:event_jComboBoxEquipo2ItemStateChanged

    private void jComboBoxEquipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEquipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEquipo1ActionPerformed

    private void jComboBoxEquipo1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxEquipo1PropertyChange

    }//GEN-LAST:event_jComboBoxEquipo1PropertyChange



//DIFERENTES FILTROS CON LOS RADIO BUTON SEGÚ LA POSICION DE LOS JUGADORES
    private void jRadioButtonBaseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonBaseItemStateChanged

        String filtrobase = jRadioButtonBase.getText();
        
            jTableJugadoresFiltro.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
         "Nombre", "Equipo", "Posicion", "Altura"
    }
));
        String[] tbDataJugaCompa2 = null;
        for (int i = 0; i < jugador.size(); i++) {
        if(jugador.get(i).getPosicion().equalsIgnoreCase(filtrobase)){
        tbDataJugaCompa2 = new String[]{
           (jugador.get(i).getNombre()),
            ( jugador.get(i).getEquipo()),
            (jugador.get(i).getPosicion()),
            Double.toString((double) jugador.get(i).getAltura())
        };
        DefaultTableModel tblModelJugaCompa2=(DefaultTableModel)jTableJugadoresFiltro.getModel();
        tblModelJugaCompa2.addRow(tbDataJugaCompa2);
        
        
            }
        }
    }//GEN-LAST:event_jRadioButtonBaseItemStateChanged

    private void jRadioButtonEscoltaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonEscoltaItemStateChanged
        String filtroescolta = jRadioButtonEscolta.getText();
        jTableJugadoresFiltro.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
         "Nombre", "Equipo", "Posicion", "Altura"
    }
));
        String[] tbDataJugaCompa2 = null;
        for (int i = 0; i < jugador.size(); i++) {
        if(jugador.get(i).getPosicion().equalsIgnoreCase(filtroescolta)){
        tbDataJugaCompa2 = new String[]{
           (jugador.get(i).getNombre()),
            ( jugador.get(i).getEquipo()),
            (jugador.get(i).getPosicion()),
            Double.toString((double) jugador.get(i).getAltura())
        };
        DefaultTableModel tblModelJugaCompa2=(DefaultTableModel)jTableJugadoresFiltro.getModel();
        tblModelJugaCompa2.addRow(tbDataJugaCompa2);
        
        
            }
        }
    }//GEN-LAST:event_jRadioButtonEscoltaItemStateChanged

    private void jRadioButtonAleroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonAleroItemStateChanged
             String filtroalero = jRadioButtonAlero.getText();
        jTableJugadoresFiltro.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
         "Nombre", "Equipo", "Posicion", "Altura"
    }
));
        String[] tbDataJugaCompa2 = null;
        for (int i = 0; i < jugador.size(); i++) {
        if(jugador.get(i).getPosicion().equalsIgnoreCase(filtroalero)){
        tbDataJugaCompa2 = new String[]{
           (jugador.get(i).getNombre()),
            ( jugador.get(i).getEquipo()),
            (jugador.get(i).getPosicion()),
            Double.toString((double) jugador.get(i).getAltura())
        };
        DefaultTableModel tblModelJugaCompa2=(DefaultTableModel)jTableJugadoresFiltro.getModel();
        tblModelJugaCompa2.addRow(tbDataJugaCompa2);
        
        
            }
        }
    }//GEN-LAST:event_jRadioButtonAleroItemStateChanged

    private void jRadioButtonAlaPivotItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonAlaPivotItemStateChanged
        String filtroalapivot = jRadioButtonAlaPivot.getText();
        jTableJugadoresFiltro.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
         "Nombre", "Equipo", "Posicion", "Altura"
    }
));
        String[] tbDataJugaCompa2 = null;
        for (int i = 0; i < jugador.size(); i++) {
        if(jugador.get(i).getPosicion().equalsIgnoreCase(filtroalapivot)){
        tbDataJugaCompa2 = new String[]{
           (jugador.get(i).getNombre()),
            ( jugador.get(i).getEquipo()),
            (jugador.get(i).getPosicion()),
            Double.toString((double) jugador.get(i).getAltura())
        };
        DefaultTableModel tblModelJugaCompa2=(DefaultTableModel)jTableJugadoresFiltro.getModel();
        tblModelJugaCompa2.addRow(tbDataJugaCompa2);
        
        
            }
        }
    }//GEN-LAST:event_jRadioButtonAlaPivotItemStateChanged

    private void jRadioButtonPivotItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonPivotItemStateChanged
             String filtropivot = jRadioButtonPivot.getText();
        jTableJugadoresFiltro.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
         "Nombre", "Equipo", "Posicion", "Altura"
    }
));
        String[] tbDataJugaCompa2 = null;
        for (int i = 0; i < jugador.size(); i++) {
        if(jugador.get(i).getPosicion().equalsIgnoreCase(filtropivot)){
        tbDataJugaCompa2 = new String[]{
           (jugador.get(i).getNombre()),
            ( jugador.get(i).getEquipo()),
            (jugador.get(i).getPosicion()),
            Double.toString((double) jugador.get(i).getAltura())
        };
        DefaultTableModel tblModelJugaCompa2=(DefaultTableModel)jTableJugadoresFiltro.getModel();
        tblModelJugaCompa2.addRow(tbDataJugaCompa2);
        
        
            }
        }
    }//GEN-LAST:event_jRadioButtonPivotItemStateChanged

    //INTENTO DE FILTRO POR LETRAS PARA LOS NOMBRES DE LOS JUGADORES(NO FUNCIONA AÚN)
    private void jButtonAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jButtonAItemStateChanged
        String botonA = jButtonA.getText();
       
    }//GEN-LAST:event_jButtonAItemStateChanged

    
public void conexionbase(){
    //CONEXION A LA BASE Y TRAE LOS RESPECTIVOS DATOS 
    Conexion conne = new Conexion();
    equipo = conne.getDatosEquipos();
    jugador= conne.getDatosJugadores();
}
 
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inbainterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inbainterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inbainterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inbainterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inbainterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPosicion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonA;
    private javax.swing.JComboBox<String> jComboBoxEquipo1;
    private javax.swing.JComboBox<String> jComboBoxEquipo2;
    private javax.swing.JComboBox<String> jComboBoxEquipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jLabelDatosBucksCancha;
    private javax.swing.JLabel jLabelDatosBucksCiudad;
    private javax.swing.JLabel jLabelDatosBucksNombre;
    private javax.swing.JLabel jLabelDatosBucksPropietarios;
    private javax.swing.JLabel jLabelDatosBullsCancha;
    private javax.swing.JLabel jLabelDatosBullsCiudad;
    private javax.swing.JLabel jLabelDatosBullsNombre;
    private javax.swing.JLabel jLabelDatosBullsPropietarios;
    private javax.swing.JLabel jLabelDatosDallasCancha;
    private javax.swing.JLabel jLabelDatosDallasCiudad;
    private javax.swing.JLabel jLabelDatosDallasNombre;
    private javax.swing.JLabel jLabelDatosDallasPropietarios;
    private javax.swing.JLabel jLabelDatosGoldenCancha;
    private javax.swing.JLabel jLabelDatosGoldenCiudad;
    private javax.swing.JLabel jLabelDatosGoldenNombre;
    private javax.swing.JLabel jLabelDatosGoldenPropietario;
    private javax.swing.JLabel jLabelDatosLakersCancha;
    private javax.swing.JLabel jLabelDatosLakersCiudad;
    private javax.swing.JLabel jLabelDatosLakersNombre;
    private javax.swing.JLabel jLabelDatosLakersPropietarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel2Inicio;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelBucks;
    private javax.swing.JPanel jPanelBulls;
    private javax.swing.JPanel jPanelComparar;
    private javax.swing.JPanel jPanelDallas;
    private javax.swing.JPanel jPanelEquipos;
    private javax.swing.JPanel jPanelGolden;
    private javax.swing.JPanel jPanelJugadores;
    private javax.swing.JPanel jPanelLakers;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar10;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    private javax.swing.JProgressBar jProgressBar6;
    private javax.swing.JProgressBar jProgressBar7;
    private javax.swing.JProgressBar jProgressBar8;
    private javax.swing.JProgressBar jProgressBar9;
    private javax.swing.JRadioButton jRadioButtonAlaPivot;
    private javax.swing.JRadioButton jRadioButtonAlero;
    private javax.swing.JRadioButton jRadioButtonBase;
    private javax.swing.JRadioButton jRadioButtonEscolta;
    private javax.swing.JRadioButton jRadioButtonPivot;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSlider jSliderAltura;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTableCompara1;
    private javax.swing.JTable jTableCompara2;
    private javax.swing.JTable jTableJugadoresBucks;
    private javax.swing.JTable jTableJugadoresBulls;
    private javax.swing.JTable jTableJugadoresDallas;
    private javax.swing.JTable jTableJugadoresFiltro;
    private javax.swing.JTable jTableJugadoresGolden;
    private javax.swing.JTable jTableJugadoresLakers;
    private javax.swing.JTable jTableTitulosBucks;
    private javax.swing.JTable jTableTitulosBulls;
    private javax.swing.JTable jTableTitulosDallas;
    private javax.swing.JTable jTableTitulosGolden;
    private javax.swing.JTable jTableTitulosLakers;
    // End of variables declaration//GEN-END:variables
}

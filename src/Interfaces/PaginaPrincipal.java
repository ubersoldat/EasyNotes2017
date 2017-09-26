package Interfaces;

import Animacion.Animacion;
import Clases.datosAsignatura;
import Operaciones.Operaciones;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    boolean ramos, agregar, eliminar, reiniciar;

    datosAsignatura d = new datosAsignatura();
    Operaciones op = new Operaciones();
    int x, y; // poner un label en la parte donde quiero tocar con el mouse para que se mueva bien
    int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

    public PaginaPrincipal() {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        //setLocationRelativeTo(null);
        this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 820, 540);
        ramos = agregar = eliminar = reiniciar = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        Panel_Menu = new javax.swing.JPanel();
        botonReiniciar = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonRamos = new javax.swing.JButton();
        Panel_informacion = new javax.swing.JPanel();
        Panel_datosG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Panel_descripcion = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        Panel_logo = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Panel_cerrMin = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Menu.setBackground(new java.awt.Color(0, 18, 50));
        Panel_Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reiniciar.png"))); // NOI18N
        botonReiniciar.setBorder(null);
        botonReiniciar.setContentAreaFilled(false);
        botonReiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonReiniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonReiniciarMouseExited(evt);
            }
        });
        botonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReiniciarActionPerformed(evt);
            }
        });
        Panel_Menu.add(botonReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-138, 300, -1, -1));

        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        botonAgregar.setBorder(null);
        botonAgregar.setContentAreaFilled(false);
        botonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAgregarMouseExited(evt);
            }
        });
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        Panel_Menu.add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-138, 120, -1, -1));

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        botonEliminar.setBorder(null);
        botonEliminar.setContentAreaFilled(false);
        botonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonEliminarMouseExited(evt);
            }
        });
        Panel_Menu.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-138, 210, -1, -1));

        botonRamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ramos.png"))); // NOI18N
        botonRamos.setBorder(null);
        botonRamos.setContentAreaFilled(false);
        botonRamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRamosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRamosMouseExited(evt);
            }
        });
        botonRamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRamosActionPerformed(evt);
            }
        });
        Panel_Menu.add(botonRamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-138, 30, -1, -1));

        PanelFondo.add(Panel_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 540));

        Panel_informacion.setBackground(new java.awt.Color(32, 47, 90));
        Panel_informacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_datosG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel1.setText("Año");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        Panel_datosG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel2.setText("Nº");
        Panel_datosG.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setText("Ramos");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        Panel_datosG.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel4.setText("Nº");
        Panel_datosG.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel5.setText("Nivel");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        Panel_datosG.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel6.setText("Nº");
        Panel_datosG.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel7.setText("PGA");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        Panel_datosG.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("En espera");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Panel_datosG.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel14.setText("Horas");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        Panel_datosG.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel15.setText("Nº");
        Panel_datosG.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel16.setText("Semestre");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        Panel_datosG.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel17.setText("Nº");
        Panel_datosG.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        Panel_informacion.add(Panel_datosG, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 560, 80));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Descripción");
        Panel_informacion.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Datos Generales");
        Panel_informacion.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        Panel_descripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_descripcionMouseEntered(evt);
            }
        });
        Panel_descripcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText(".");
        Panel_descripcion.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel18.setText(".");
        Panel_descripcion.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        Panel_informacion.add(Panel_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 560, 80));

        jButton4.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gmail.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gmail1.png"))); // NOI18N
        jButton4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gmail1.png"))); // NOI18N
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Panel_informacion.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 30, 30));

        jButton9.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/campus.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/campus1.png"))); // NOI18N
        jButton9.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/campus1.png"))); // NOI18N
        jButton9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Panel_informacion.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 30, 30));

        jButton8.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/intranet.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/intranet2.png"))); // NOI18N
        jButton8.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/intranet2.png"))); // NOI18N
        jButton8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Panel_informacion.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 30, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("-");
        Panel_informacion.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        PanelFondo.add(Panel_informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 620, 330));

        Panel_logo.setBackground(new java.awt.Color(204, 204, 204));
        Panel_logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoo.png"))); // NOI18N
        jLabel12.setToolTipText("");
        Panel_logo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 410, 170));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("2017");
        Panel_logo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        PanelFondo.add(Panel_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 620, 180));

        Panel_cerrMin.setBackground(new java.awt.Color(255, 255, 255));
        Panel_cerrMin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_cerrMinMouseDragged(evt);
            }
        });
        Panel_cerrMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_cerrMinMousePressed(evt);
            }
        });
        Panel_cerrMin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Minus_Math__25px.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/min2.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/min2.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel_cerrMin.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 30, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Delete_25px.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete4.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete4.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Panel_cerrMin.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 30, 30));

        PanelFondo.add(Panel_cerrMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 620, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.setExtendedState(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null,
                "Los Datos no guardado se eliminarán.\n ¿Desea salir igualmente?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.OK_OPTION == resp) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased

    }//GEN-LAST:event_jButton1MouseReleased

    private void Panel_descripcionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_descripcionMouseEntered


    }//GEN-LAST:event_Panel_descripcionMouseEntered

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered

        jLabel11.setForeground(Color.red);
        jLabel11.setText("Cantidad de ramos tomados este semestre");
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited

        jLabel11.setForeground(Color.black);
        jLabel11.setText(".");
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered

        jLabel11.setForeground(Color.red);
        jLabel11.setText("Niveles de la carrera tomados este semestre");
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited

        jLabel11.setForeground(Color.black);
        jLabel11.setText(".");
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered

        jLabel11.setForeground(Color.red);
        jLabel18.setForeground(Color.red);
        jLabel11.setText("Promedio general acumulado de las notas finales de todas las asignaturas cursadas,");
        jLabel18.setText("por el alumno/a durante su permanencia en la Carrera");
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited

        jLabel11.setForeground(Color.black);
        jLabel18.setForeground(Color.black);
        jLabel11.setText(".");
        jLabel18.setText(".");
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered

        jLabel11.setForeground(Color.red);
        jLabel11.setText("Horas totales inscritas este semestre");
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered

        jLabel11.setForeground(Color.red);
        jLabel11.setText("Semestre actual que está cursando");
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited

        jLabel11.setForeground(Color.black);
        jLabel11.setText(".");
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited

        jLabel11.setForeground(Color.black);
        jLabel11.setText(".");
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered

        jLabel11.setForeground(Color.red);
        jLabel11.setText("Año actual cursando la carrera");
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited

        jLabel11.setForeground(Color.black);
        jLabel11.setText(".");
    }//GEN-LAST:event_jLabel1MouseExited

    private void botonRamosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRamosMouseEntered

        if (!ramos) {
            Animacion.mover_derecha(-138, 0, 2, 2, botonRamos);
        }
        jLabel11.setForeground(Color.red);
        jLabel11.setText("Ramos inscritos");
    }//GEN-LAST:event_botonRamosMouseEntered

    private void botonRamosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRamosMouseExited

        if (!ramos) {
            Animacion.mover_izquierda(0, -138, 2, 2, botonRamos);
        }
        jLabel11.setForeground(Color.black);
        jLabel11.setText(".");
    }//GEN-LAST:event_botonRamosMouseExited

    private void botonAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseEntered

        if (!agregar) {
            Animacion.mover_derecha(-138, 0, 2, 2, botonAgregar);
        }
        jLabel11.setForeground(Color.red);
        jLabel11.setText("Agregar ramo/s");
    }//GEN-LAST:event_botonAgregarMouseEntered

    private void botonAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseExited

        if (!agregar) {
            Animacion.mover_izquierda(0, -138, 2, 2, botonAgregar);
        }
        jLabel11.setForeground(Color.black);
        jLabel11.setText(".");
    }//GEN-LAST:event_botonAgregarMouseExited

    private void botonEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseEntered

        if (!eliminar) {
            Animacion.mover_derecha(-138, 0, 2, 2, botonEliminar);
        }
        jLabel11.setForeground(Color.red);
        jLabel11.setText("Eliminar ramo/s");
    }//GEN-LAST:event_botonEliminarMouseEntered

    private void botonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseExited

        if (!eliminar) {
            Animacion.mover_izquierda(0, -138, 2, 2, botonEliminar);
        }
        jLabel11.setForeground(Color.black);
        jLabel11.setText(".");
    }//GEN-LAST:event_botonEliminarMouseExited

    private void botonReiniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonReiniciarMouseEntered

        if (!reiniciar) {
            Animacion.mover_derecha(-138, 0, 2, 2, botonReiniciar);
        }
        jLabel11.setForeground(Color.red);
        jLabel18.setForeground(Color.red);
        jLabel11.setText("Reiniciar semestre.");
        jLabel18.setText("Se eliminarán todos los ramos del semestre, para comenzar uno nuevo");
    }//GEN-LAST:event_botonReiniciarMouseEntered

    private void botonReiniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonReiniciarMouseExited

        if (!reiniciar) {
            Animacion.mover_izquierda(0, -138, 2, 2, botonReiniciar);
        }
        jLabel11.setForeground(Color.black);
        jLabel18.setForeground(Color.black);
        jLabel11.setText(".");
        jLabel18.setText(".");
    }//GEN-LAST:event_botonReiniciarMouseExited

    private void botonRamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRamosActionPerformed

        InterfazAsignaturas inte = new InterfazAsignaturas();
        inte.setTitle("INTERFAZ ASIGNATURA");
        this.dispose();
        inte.setVisible(true);
    }//GEN-LAST:event_botonRamosActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        agregar();
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReiniciarActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "Esto borrará todos los "
                + "ramos que haya creado, vaciando la lista.\nEsto no se puede "
                + "deshacer. ¿Está seguro(a) que desea reiniciar el semestre?",
                "ADVERTENCIA", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_botonReiniciarActionPerformed

    private void Panel_cerrMinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_cerrMinMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_Panel_cerrMinMousePressed

    private void Panel_cerrMinMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_cerrMinMouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_Panel_cerrMinMouseDragged

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        jLabel19.setForeground(Color.WHITE);
        jLabel19.setText("UFROMAIL");
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        jLabel19.setForeground(Color.WHITE);
        jLabel19.setText(".");
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        // TODO add your handling code here:
        jLabel19.setForeground(Color.WHITE);
        jLabel19.setText("CAMPUS VIRTUAL");
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        // TODO add your handling code here:
        jLabel19.setForeground(Color.WHITE);
        jLabel19.setText(".");
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        // TODO add your handling code here:
        jLabel19.setForeground(Color.WHITE);
        jLabel19.setText("INTRANET");
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        // TODO add your handling code here:
        jLabel19.setForeground(Color.WHITE);
        jLabel19.setText(".");
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        	
        goToURL("https://intranet.ufro.cl/"); 
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        goToURL("https://campusvirtual.ufro.cl");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        goToURL("https://www.google.com/intl/es/gmail/about/#");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void agregar() {
        if (op.ConsultaListaRamos().size() < 10) {
            this.dispose();
            AgregarRamo ar = new AgregarRamo();
            ar.setTitle("AGREGAR ASIGNATURA");
            ar.setVisible(true);
            //ar.setResizable(false);

        } else {
            JOptionPane.showMessageDialog(null, "Ya tiene el máximo de\n10 "
                    + "asignaturas creadas.", "Límite alcanzado",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void goToURL(String URL) {
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri = new java.net.URI(URL);
                    desktop.browse(uri);
                } catch (URISyntaxException | IOException ex) {
                    Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel Panel_Menu;
    private javax.swing.JPanel Panel_cerrMin;
    private javax.swing.JPanel Panel_datosG;
    private javax.swing.JPanel Panel_descripcion;
    private javax.swing.JPanel Panel_informacion;
    private javax.swing.JPanel Panel_logo;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonRamos;
    private javax.swing.JButton botonReiniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}

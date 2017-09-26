package Interfaces;

import Clases.*;
import Operaciones.Operaciones;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class InterfazMixto extends javax.swing.JFrame {

    Color naranjo = new Color(255, 120, 0);
    Operaciones op = new Operaciones();
    int cont = 0;
    int x, y;
    int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    
    double[] notasT;
    double[] pondT;
    double[] notasP;
    double[] pondP;
    double prom_Teo;
    double prom_Pract;
    boolean arregloT = false;
    boolean arregloP = false;
    
    public InterfazMixto() {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        //setLocation(318, 214);
        this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 1010, 551);
        //setLocationRelativeTo(null);
        promGral.setVisible(true);
        jLabel6.setVisible(true);
        botonGeneral.setVisible(true);
    }

    public void ingresarRamo(datosAsignatura da, NotasPracticas np, NotasTeoricas nt, PondPracticas pp, PondTeoricas pt, NotasFinales nf) throws IOException {
        nombreAsign.setText(da.getNombre());
        tipoAprob.setText(da.getTipo());
        pondTeo.setText(String.valueOf(da.getPondtTeorica()));
        pondPract.setText(String.valueOf(da.getPondtPratica()));
        cantEvT.setText(Integer.toString(da.getEVteorica()));
        cantEvP.setText(Integer.toString(da.getEVpractica()));
        labelHoras.setText(Integer.toString(da.getHoras()));
        labelNivel.setText(Integer.toString(da.getNivel()));
        
        if (da.getTipo().equals("TEORICO - PRACTICO por Separado")) {
            promGral.setVisible(false);
            jLabel6.setVisible(false);
            botonGeneral.setVisible(false);
            jLabel24.setVisible(false);
            promT.setText(nf.getNft());
            promP.setText(nf.getNfp());
        }
        if (da.getTipo().equals("TEORICO - PRACTICO en Conjunto")) {
            promGral.setVisible(true);
            jLabel6.setVisible(true);
            botonGeneral.setVisible(true);
            promT.setText(nf.getNft());
            promP.setText(nf.getNfp());
            promGral.setText(nf.getPg());
        }
        switch (da.getEVpractica()) {
            case 1:
                np2.setVisible(false);
                pp2.setVisible(false);
            case 2:
                np3.setVisible(false);
                pp3.setVisible(false);
            case 3:
                np4.setVisible(false);
                pp4.setVisible(false);
            case 4:
                np5.setVisible(false);
                pp5.setVisible(false);
            case 5:
                np6.setVisible(false);
                pp6.setVisible(false);
            case 6:
                np7.setVisible(false);
                pp7.setVisible(false);
            case 7:
                np8.setVisible(false);
                pp8.setVisible(false);
            case 8:
                np9.setVisible(false);
                pp9.setVisible(false);
            case 9:
                break;
        }
        switch (da.getEVteorica()) {
            case 1:
                nt2.setVisible(false);
                pt2.setVisible(false);

            case 2:
                nt3.setVisible(false);
                pt3.setVisible(false);
            case 3:
                nt4.setVisible(false);
                pt4.setVisible(false);
            case 4:
                nt5.setVisible(false);
                pt5.setVisible(false);
            case 5:
                nt6.setVisible(false);
                pt6.setVisible(false);
            case 6:
                nt7.setVisible(false);
                pt7.setVisible(false);
            case 7:
                nt8.setVisible(false);
                pt8.setVisible(false);
            case 8:
                nt9.setVisible(false);
                pt9.setVisible(false);
            case 9:
                break;
        }
        switch (da.getEVteorica()) {
            case 9:
                nt9.setText(nt.getN9());
                pt9.setText(pt.getPt9());
            case 8:
                nt8.setText(nt.getN8());
                pt8.setText(pt.getPt8());
            case 7:
                nt7.setText(nt.getN7());
                pt7.setText(pt.getPt7());
            case 6:
                nt6.setText(nt.getN6());
                pt6.setText(pt.getPt6());
            case 5:
                nt6.setText(nt.getN5());
                pt5.setText(pt.getPt5());
            case 4:
                nt4.setText(nt.getN4());
                pt4.setText(pt.getPt4());
            case 3:
                nt3.setText(nt.getN3());
                pt3.setText(pt.getPt3());
            case 2:
                nt2.setText(nt.getN2());
                pt2.setText(pt.getPt2());
            case 1:
                nt1.setText(nt.getN1());
                pt1.setText(pt.getPt1());
                break;
        }
        switch (da.getEVpractica()) {
            case 9:
                np9.setText(np.getN9());
                pp9.setText(pp.getPp9());
            case 8:
                np8.setText(np.getN8());
                pp8.setText(pp.getPp8());
            case 7:
                np7.setText(np.getN7());
                pp7.setText(pp.getPp7());
            case 6:
                np6.setText(np.getN6());
                pp6.setText(pp.getPp6());
            case 5:
                np5.setText(np.getN5());
                pp5.setText(pp.getPp5());
            case 4:
                np4.setText(np.getN4());
                pp4.setText(pp.getPp4());
            case 3:
                np3.setText(np.getN3());
                pp3.setText(pp.getPp3());
            case 2:
                np2.setText(np.getN2());
                pp2.setText(pp.getPp2());
            case 1:
                np1.setText(np.getN1());
                pp1.setText(pp.getPp1());
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombreAsign = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tipoAprob = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cantEvP = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nt1 = new javax.swing.JTextField();
        nt2 = new javax.swing.JTextField();
        nt3 = new javax.swing.JTextField();
        nt4 = new javax.swing.JTextField();
        nt5 = new javax.swing.JTextField();
        nt6 = new javax.swing.JTextField();
        nt7 = new javax.swing.JTextField();
        nt8 = new javax.swing.JTextField();
        nt9 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pt9 = new javax.swing.JTextField();
        pt1 = new javax.swing.JTextField();
        pt2 = new javax.swing.JTextField();
        pt3 = new javax.swing.JTextField();
        pt4 = new javax.swing.JTextField();
        pt5 = new javax.swing.JTextField();
        pt6 = new javax.swing.JTextField();
        pt7 = new javax.swing.JTextField();
        pt8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        np1 = new javax.swing.JTextField();
        np2 = new javax.swing.JTextField();
        np3 = new javax.swing.JTextField();
        np4 = new javax.swing.JTextField();
        np5 = new javax.swing.JTextField();
        np6 = new javax.swing.JTextField();
        np7 = new javax.swing.JTextField();
        np8 = new javax.swing.JTextField();
        np9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        pp1 = new javax.swing.JTextField();
        pp2 = new javax.swing.JTextField();
        pp3 = new javax.swing.JTextField();
        pp4 = new javax.swing.JTextField();
        pp5 = new javax.swing.JTextField();
        pp6 = new javax.swing.JTextField();
        pp7 = new javax.swing.JTextField();
        pp8 = new javax.swing.JTextField();
        pp9 = new javax.swing.JTextField();
        promGral = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        botonGeneral = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        promP = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        promT = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cantEvT = new javax.swing.JLabel();
        pondTeo = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pondPract = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        PanelMenu = new javax.swing.JPanel();
        home2 = new javax.swing.JButton();
        Panel_Superior = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        labelNivel = new javax.swing.JLabel();
        labelHoras = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(32, 47, 90));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreAsign.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        nombreAsign.setForeground(new java.awt.Color(255, 255, 255));
        nombreAsign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreAsign.setText("NomAsign");
        jPanel1.add(nombreAsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo Aprobación:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        tipoAprob.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        tipoAprob.setForeground(new java.awt.Color(255, 255, 255));
        tipoAprob.setText("TIPO");
        jPanel1.add(tipoAprob, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRACTICO - cantidad de evaluaciones :");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        cantEvP.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        cantEvP.setForeground(new java.awt.Color(255, 255, 255));
        cantEvP.setText("cantEvP");
        jPanel1.add(cantEvP, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("  GENERAL");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, -1, -1));

        nt1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nt1KeyTyped(evt);
            }
        });
        jPanel1.add(nt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 50, 40));

        nt2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nt2KeyTyped(evt);
            }
        });
        jPanel1.add(nt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 50, 40));

        nt3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nt3KeyTyped(evt);
            }
        });
        jPanel1.add(nt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 50, 40));

        nt4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nt4KeyTyped(evt);
            }
        });
        jPanel1.add(nt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 50, 40));

        nt5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nt5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nt5KeyTyped(evt);
            }
        });
        jPanel1.add(nt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 50, 40));

        nt6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nt6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nt6KeyTyped(evt);
            }
        });
        jPanel1.add(nt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 50, 40));

        nt7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nt7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nt7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nt7KeyTyped(evt);
            }
        });
        jPanel1.add(nt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 50, 40));

        nt8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nt8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nt8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nt8KeyTyped(evt);
            }
        });
        jPanel1.add(nt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 50, 40));

        nt9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nt9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nt9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nt9KeyTyped(evt);
            }
        });
        jPanel1.add(nt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 50, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("POND. %");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        pt9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pt9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pt9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pt9KeyTyped(evt);
            }
        });
        jPanel1.add(pt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 50, 30));

        pt1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pt1KeyTyped(evt);
            }
        });
        jPanel1.add(pt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 50, 30));

        pt2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pt2KeyTyped(evt);
            }
        });
        jPanel1.add(pt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 50, 30));

        pt3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pt3KeyTyped(evt);
            }
        });
        jPanel1.add(pt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 50, 30));

        pt4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pt4KeyTyped(evt);
            }
        });
        jPanel1.add(pt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 50, 30));

        pt5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pt5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pt5KeyTyped(evt);
            }
        });
        jPanel1.add(pt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 50, 30));

        pt6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pt6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pt6KeyTyped(evt);
            }
        });
        jPanel1.add(pt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 50, 30));

        pt7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pt7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pt7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pt7KeyTyped(evt);
            }
        });
        jPanel1.add(pt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 50, 30));

        pt8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pt8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pt8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pt8KeyTyped(evt);
            }
        });
        jPanel1.add(pt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 50, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TEORICO - cantidad de evaluaciones :");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ponderación Teórico:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NOTAS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        np1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        np1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        np1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                np1KeyTyped(evt);
            }
        });
        jPanel1.add(np1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 50, 40));

        np2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        np2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        np2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                np2KeyTyped(evt);
            }
        });
        jPanel1.add(np2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 50, 40));

        np3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        np3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        np3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                np3KeyTyped(evt);
            }
        });
        jPanel1.add(np3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 50, 40));

        np4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        np4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        np4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                np4KeyTyped(evt);
            }
        });
        jPanel1.add(np4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 50, 40));

        np5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        np5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        np5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                np5KeyTyped(evt);
            }
        });
        jPanel1.add(np5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 50, 40));

        np6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        np6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        np6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                np6KeyTyped(evt);
            }
        });
        jPanel1.add(np6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 50, 40));

        np7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        np7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        np7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                np7KeyTyped(evt);
            }
        });
        jPanel1.add(np7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 50, 40));

        np8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        np8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        np8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                np8KeyTyped(evt);
            }
        });
        jPanel1.add(np8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 50, 40));

        np9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        np9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        np9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                np9KeyTyped(evt);
            }
        });
        jPanel1.add(np9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 50, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("POND. %");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        pp1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pp1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pp1KeyTyped(evt);
            }
        });
        jPanel1.add(pp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 50, 30));

        pp2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pp2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pp2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pp2KeyTyped(evt);
            }
        });
        jPanel1.add(pp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 50, 30));

        pp3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pp3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pp3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pp3KeyTyped(evt);
            }
        });
        jPanel1.add(pp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 50, 30));

        pp4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pp4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pp4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pp4KeyTyped(evt);
            }
        });
        jPanel1.add(pp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 50, 30));

        pp5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pp5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pp5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pp5KeyTyped(evt);
            }
        });
        jPanel1.add(pp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 50, 30));

        pp6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pp6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pp6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pp6KeyTyped(evt);
            }
        });
        jPanel1.add(pp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 50, 30));

        pp7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pp7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pp7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pp7KeyTyped(evt);
            }
        });
        jPanel1.add(pp7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 50, 30));

        pp8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pp8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pp8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pp8KeyTyped(evt);
            }
        });
        jPanel1.add(pp8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 50, 30));

        pp9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pp9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pp9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pp9KeyTyped(evt);
            }
        });
        jPanel1.add(pp9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 50, 30));

        promGral.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        promGral.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        promGral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                promGralKeyTyped(evt);
            }
        });
        jPanel1.add(promGral, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 280, 40, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("NOTAS");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        botonGeneral.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        botonGeneral.setText("CALCULAR");
        botonGeneral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGeneralActionPerformed(evt);
            }
        });
        jPanel1.add(botonGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, 100, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PROMEDIO");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, -1, -1));

        promP.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        promP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        promP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                promPKeyTyped(evt);
            }
        });
        jPanel1.add(promP, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 40, 30));

        jButton2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton2.setText("CALCULAR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, 100, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("PROMEDIO");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, -1, -1));

        promT.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        promT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        promT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                promTKeyTyped(evt);
            }
        });
        jPanel1.add(promT, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 40, 30));

        jButton3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton3.setText("CALCULAR");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, 100, -1));

        jButton4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton4.setText("Nota Teorica");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, -1, -1));

        jButton5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton5.setText("Nota Practica");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 480, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("%");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, -1, -1));

        cantEvT.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        cantEvT.setForeground(new java.awt.Color(255, 255, 255));
        cantEvT.setText("cantEvT");
        jPanel1.add(cantEvT, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        pondTeo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        pondTeo.setForeground(new java.awt.Color(255, 255, 255));
        pondTeo.setText("99");
        jPanel1.add(pondTeo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("%");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, -1, -1));

        pondPract.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        pondPract.setForeground(new java.awt.Color(255, 255, 255));
        pondPract.setText("99");
        jPanel1.add(pondPract, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Ponderación Práctico:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText(".");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText(".");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText(".");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText(".");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add3.png"))); // NOI18N
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add2.png"))); // NOI18N
        jButton6.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add2.png"))); // NOI18N
        jButton6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        PanelMenu.setBackground(new java.awt.Color(0, 18, 50));
        PanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuPrincipal.png"))); // NOI18N
        home2.setBorder(null);
        home2.setBorderPainted(false);
        home2.setContentAreaFilled(false);
        home2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        home2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuPrincipal2.png"))); // NOI18N
        home2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuPrincipal2.png"))); // NOI18N
        home2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        home2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        home2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home2ActionPerformed(evt);
            }
        });
        PanelMenu.add(home2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel1.add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 550));

        Panel_Superior.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_SuperiorMouseDragged(evt);
            }
        });
        Panel_Superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_SuperiorMousePressed(evt);
            }
        });
        Panel_Superior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Panel_Superior.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 30, 30));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Delete_25px.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete4.png"))); // NOI18N
        jButton7.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete4.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Panel_Superior.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 30, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barra_logo1.png"))); // NOI18N
        jLabel19.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel19MouseDragged(evt);
            }
        });
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel19MousePressed(evt);
            }
        });
        Panel_Superior.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(Panel_Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 920, 30));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar1.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar2.png"))); // NOI18N
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar2.png"))); // NOI18N
        jButton8.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar2.png"))); // NOI18N
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
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 30, 40));

        jPanel2.setBackground(new java.awt.Color(32, 47, 90));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Nivel:");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });

        labelNivel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        labelNivel.setForeground(new java.awt.Color(255, 255, 255));
        labelNivel.setText("1");

        labelHoras.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        labelHoras.setForeground(new java.awt.Color(255, 255, 255));
        labelHoras.setText("2");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Horas:");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(22, 22, 22)
                        .addComponent(labelNivel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16)
                        .addComponent(labelHoras)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(labelNivel))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(labelHoras))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 110, 90));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario1.png"))); // NOI18N
        jButton9.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario1.png"))); // NOI18N
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
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered

        jLabel22.setForeground(naranjo);
        jLabel22.setText("GUARDAR CAMBIOS");
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited

        jLabel22.setForeground(Color.WHITE);
        jLabel22.setText(".");
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered

        jLabel22.setForeground(naranjo);
        jLabel22.setText("* Al oprimir Calcula última nota Teórica necesaria para aprobar el ramo");
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited

        jLabel22.setForeground(Color.WHITE);
        jLabel22.setText(".");
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered

        jLabel22.setForeground(naranjo);
        jLabel22.setText("* Al oprimir Calcula última nota Práctica necesaria para aprobar el ramo");
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited

        jLabel22.setForeground(Color.WHITE);
        jLabel22.setText(".");
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        if (nt1.getText().equals("") && nt2.getText().equals("") && nt3.getText().equals("") && nt4.getText().equals("")
                && nt5.getText().equals("") && nt6.getText().equals("") && nt7.getText().equals("") && nt8.getText().equals("")
                && nt9.getText().equals("") && pt1.getText().equals("") && pt2.getText().equals("") && pt3.getText().equals("")
                && pt4.getText().equals("") && pt5.getText().equals("") && pt6.getText().equals("") && pt7.getText().equals("")
                && pt8.getText().equals("") && pt9.getText().equals("") && np1.getText().equals("") && np2.getText().equals("")
                && np3.getText().equals("") && np4.getText().equals("") && np5.getText().equals("") && np6.getText().equals("")
                && np7.getText().equals("") && np8.getText().equals("") && np9.getText().equals("") && pp1.getText().equals("")
                && pp2.getText().equals("") && pp3.getText().equals("") && pp4.getText().equals("") && pp5.getText().equals("")
                && pp6.getText().equals("") && pp7.getText().equals("") && pp8.getText().equals("") && pp9.getText().equals("")
                && promT.getText().equals("") && promP.getText().equals("") && promGral.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Para Guardar Rellene por lo menos UNA Casilla!");
        } else {
            if (nt1.getText().equals(op.notasTeoricas(nombreAsign.getText()).getN1()) && nt2.getText().equals(op.notasTeoricas(nombreAsign.getText()).getN2())
                    && nt3.getText().equals(op.notasTeoricas(nombreAsign.getText()).getN3()) && nt4.getText().equals(op.notasTeoricas(nombreAsign.getText()).getN4())
                    && nt5.getText().equals(op.notasTeoricas(nombreAsign.getText()).getN5()) && nt6.getText().equals(op.notasTeoricas(nombreAsign.getText()).getN6())
                    && nt7.getText().equals(op.notasTeoricas(nombreAsign.getText()).getN7()) && nt8.getText().equals(op.notasTeoricas(nombreAsign.getText()).getN8())
                    && nt9.getText().equals(op.notasTeoricas(nombreAsign.getText()).getN9())
                    && pt1.getText().equals(op.ponderacionTeo(nombreAsign.getText()).getPt1()) && pt2.getText().equals(op.ponderacionTeo(nombreAsign.getText()).getPt2())
                    && pt3.getText().equals(op.ponderacionTeo(nombreAsign.getText()).getPt3()) && pt4.getText().equals(op.ponderacionTeo(nombreAsign.getText()).getPt4())
                    && pt5.getText().equals(op.ponderacionTeo(nombreAsign.getText()).getPt5()) && pt6.getText().equals(op.ponderacionTeo(nombreAsign.getText()).getPt6())
                    && pt7.getText().equals(op.ponderacionTeo(nombreAsign.getText()).getPt7()) && pt8.getText().equals(op.ponderacionTeo(nombreAsign.getText()).getPt8())
                    && pt9.getText().equals(op.ponderacionTeo(nombreAsign.getText()).getPt9())
                    && np1.getText().equals(op.notasPracticas(nombreAsign.getText()).getN1()) && np2.getText().equals(op.notasPracticas(nombreAsign.getText()).getN2())
                    && np3.getText().equals(op.notasPracticas(nombreAsign.getText()).getN3()) && np4.getText().equals(op.notasPracticas(nombreAsign.getText()).getN4())
                    && np5.getText().equals(op.notasPracticas(nombreAsign.getText()).getN5()) && np6.getText().equals(op.notasPracticas(nombreAsign.getText()).getN6())
                    && np7.getText().equals(op.notasPracticas(nombreAsign.getText()).getN7()) && np8.getText().equals(op.notasPracticas(nombreAsign.getText()).getN8())
                    && np9.getText().equals(op.notasPracticas(nombreAsign.getText()).getN9())
                    && pp1.getText().equals(op.ponderacionPrac(nombreAsign.getText()).getPp1()) && pp2.getText().equals(op.ponderacionPrac(nombreAsign.getText()).getPp2())
                    && pp3.getText().equals(op.ponderacionPrac(nombreAsign.getText()).getPp3()) && pp4.getText().equals(op.ponderacionPrac(nombreAsign.getText()).getPp4())
                    && pp5.getText().equals(op.ponderacionPrac(nombreAsign.getText()).getPp5()) && pp6.getText().equals(op.ponderacionPrac(nombreAsign.getText()).getPp6())
                    && pp7.getText().equals(op.ponderacionPrac(nombreAsign.getText()).getPp7()) && pp8.getText().equals(op.ponderacionPrac(nombreAsign.getText()).getPp8())
                    && pp9.getText().equals(op.ponderacionPrac(nombreAsign.getText()).getPp9())
                    && promT.getText().equals(op.notasFinales(nombreAsign.getText()).getNft())
                    && promP.getText().equals(op.notasFinales(nombreAsign.getText()).getNfp())
                    && promGral.getText().equals(op.notasFinales(nombreAsign.getText()).getPg())) {
                JOptionPane.showMessageDialog(this, "Los Datos ya se Encuentran Guardados!");
            } else {
                op.actualizarRamoConNuevosDatos(nombreAsign.getText());
                op.agregarNotasTeoricas(nt1.getText(), nt2.getText(),
                        nt3.getText(), nt4.getText(),
                        nt5.getText(), nt6.getText(), nt7.getText(),
                        nt8.getText(), nt9.getText(), nombreAsign.getText());
                op.agregarPondT(pt1.getText(), pt2.getText(),
                        pt3.getText(), pt4.getText(),
                        pt5.getText(), pt6.getText(), pt7.getText(),
                        pt8.getText(), pt9.getText(), nombreAsign.getText());
                op.agregarNotasPracticas(np1.getText(), np2.getText(),
                        np3.getText(), np4.getText(),
                        np5.getText(), np6.getText(), np7.getText(),
                        np8.getText(), np9.getText(), nombreAsign.getText());
                op.agregarPondP(pp1.getText(), pp2.getText(),
                        pp3.getText(), pp4.getText(),
                        pp5.getText(), pp6.getText(), pp7.getText(),
                        pp8.getText(), pp9.getText(), nombreAsign.getText());
                op.agregarNotasFinales(promP.getText(), promT.getText(), promGral.getText(), nombreAsign.getText());

                JOptionPane.showMessageDialog(this, "Datos Guardados Exitosamente!");
                cont++;
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void home2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home2ActionPerformed

        if (cont == 0) {
            int resp = JOptionPane.showConfirmDialog(null,
                    "Los Datos no guardado se eliminarán.\n ¿Desea ir al Menú de Asignaturas igualmente?",
                    "Menú Asignaturas", JOptionPane.YES_NO_OPTION);
            if (JOptionPane.OK_OPTION == resp) {
                this.dispose();
                InterfazAsignaturas iA = new InterfazAsignaturas();
                iA.setTitle("InterfazAsignaturas");
                iA.setVisible(true);
            }
        } else {

            this.dispose();
            InterfazAsignaturas iA = new InterfazAsignaturas();
            iA.setTitle("InterfazAsignaturas");
            iA.setVisible(true);
            cont = 0;
        }
    }//GEN-LAST:event_home2ActionPerformed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased

    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.setExtendedState(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        int resp = JOptionPane.showConfirmDialog(null,
                "Los Datos no guardado se eliminarán.\n ¿Desea salir de la Aplicación igualmente?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.OK_OPTION == resp) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        // TODO add your handling code here:
        jLabel22.setForeground(naranjo);
        jLabel22.setText("ELIMINAR ASIGNATURA");
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        // TODO add your handling code here:
        jLabel22.setForeground(Color.WHITE);
        jLabel22.setText(".");
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null,
                "Está a punto de ELIMINAR esta ASIGNATURA.\n ¿Desea continuar?", "Eliminar Asignatura", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.OK_OPTION == resp) {
            op.borrarRamo(nombreAsign.getText());
            this.dispose();
            InterfazAsignaturas iA = new InterfazAsignaturas();
            iA.setTitle("InterfazAsignaturas");
            iA.setVisible(true);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void Panel_SuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_SuperiorMousePressed
        // TODO add your handling code here:
        //x = evt.getX();
        //y = evt.getY();
    }//GEN-LAST:event_Panel_SuperiorMousePressed

    private void Panel_SuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_SuperiorMouseDragged
        // TODO add your handling code here:
        //Point point = MouseInfo.getPointerInfo().getLocation();
        //setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_Panel_SuperiorMouseDragged

    private void nt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nt1KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(nt1.getText(), evt);
    }//GEN-LAST:event_nt1KeyTyped

    private void nt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nt2KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(nt2.getText(), evt);
    }//GEN-LAST:event_nt2KeyTyped

    private void nt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nt3KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(nt3.getText(), evt);
    }//GEN-LAST:event_nt3KeyTyped

    private void nt4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nt4KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(nt4.getText(), evt);
    }//GEN-LAST:event_nt4KeyTyped

    private void nt5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nt5KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(nt5.getText(), evt);
    }//GEN-LAST:event_nt5KeyTyped

    private void nt6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nt6KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(nt6.getText(), evt);
    }//GEN-LAST:event_nt6KeyTyped

    private void nt7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nt7KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(nt7.getText(), evt);
    }//GEN-LAST:event_nt7KeyTyped

    private void nt8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nt8KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(nt8.getText(), evt);
    }//GEN-LAST:event_nt8KeyTyped

    private void nt9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nt9KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(nt9.getText(), evt);
    }//GEN-LAST:event_nt9KeyTyped

    private void pt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pt1KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(pt1.getText(), evt);
    }//GEN-LAST:event_pt1KeyTyped

    private void pt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pt2KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(pt2.getText(), evt);
    }//GEN-LAST:event_pt2KeyTyped

    private void pt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pt3KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(pt3.getText(), evt);
    }//GEN-LAST:event_pt3KeyTyped

    private void pt4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pt4KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(pt4.getText(), evt);
    }//GEN-LAST:event_pt4KeyTyped

    private void pt5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pt5KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(pt5.getText(), evt);
    }//GEN-LAST:event_pt5KeyTyped

    private void pt6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pt6KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(pt6.getText(), evt);
    }//GEN-LAST:event_pt6KeyTyped

    private void pt7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pt7KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(pt7.getText(), evt);
    }//GEN-LAST:event_pt7KeyTyped

    private void pt8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pt8KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(pt8.getText(), evt);
    }//GEN-LAST:event_pt8KeyTyped

    private void pt9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pt9KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(pt9.getText(), evt);
    }//GEN-LAST:event_pt9KeyTyped

    private void np1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_np1KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(np1.getText(), evt);
    }//GEN-LAST:event_np1KeyTyped

    private void np2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_np2KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(np2.getText(), evt);
    }//GEN-LAST:event_np2KeyTyped

    private void np3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_np3KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(np3.getText(), evt);
    }//GEN-LAST:event_np3KeyTyped

    private void np4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_np4KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(np4.getText(), evt);
    }//GEN-LAST:event_np4KeyTyped

    private void np5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_np5KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(np5.getText(), evt);
    }//GEN-LAST:event_np5KeyTyped

    private void np6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_np6KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(np6.getText(), evt);
    }//GEN-LAST:event_np6KeyTyped

    private void np7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_np7KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(np7.getText(), evt);
    }//GEN-LAST:event_np7KeyTyped

    private void np8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_np8KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(np8.getText(), evt);
    }//GEN-LAST:event_np8KeyTyped

    private void np9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_np9KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(np9.getText(), evt);
    }//GEN-LAST:event_np9KeyTyped

    private void pp1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pp1KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(pp1.getText(), evt);
    }//GEN-LAST:event_pp1KeyTyped

    private void pp2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pp2KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(pp2.getText(), evt);
    }//GEN-LAST:event_pp2KeyTyped

    private void pp3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pp3KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(pp3.getText(), evt);
    }//GEN-LAST:event_pp3KeyTyped

    private void pp4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pp4KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(pp4.getText(), evt);
    }//GEN-LAST:event_pp4KeyTyped

    private void pp5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pp5KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(pp5.getText(), evt);
    }//GEN-LAST:event_pp5KeyTyped

    private void pp6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pp6KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(pp6.getText(), evt);
    }//GEN-LAST:event_pp6KeyTyped

    private void pp7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pp7KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(pp7.getText(), evt);
    }//GEN-LAST:event_pp7KeyTyped

    private void pp8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pp8KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(pp8.getText(), evt);
    }//GEN-LAST:event_pp8KeyTyped

    private void pp9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pp9KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(pp9.getText(), evt);
    }//GEN-LAST:event_pp9KeyTyped

    private void promTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_promTKeyTyped
        // TODO add your handling code here:
        op.validacionNotas(promT.getText(), evt);
    }//GEN-LAST:event_promTKeyTyped

    private void promPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_promPKeyTyped
        // TODO add your handling code here:
        op.validacionNotas(promP.getText(), evt);
    }//GEN-LAST:event_promPKeyTyped

    private void promGralKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_promGralKeyTyped
        // TODO add your handling code here:
        op.validacionNotas(promGral.getText(), evt);
    }//GEN-LAST:event_promGralKeyTyped

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        // TODO add your handling code here:
        jLabel22.setForeground(naranjo);
        jLabel22.setText("Nivel Academico de la Asignatura");
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        // TODO add your handling code here:
        jLabel22.setForeground(Color.WHITE);
        jLabel22.setText(".");
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel22.setForeground(naranjo);
        jLabel22.setText("Horas de la Asignatura");
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel22.setForeground(Color.WHITE);
        jLabel22.setText(".");
    }//GEN-LAST:event_jLabel1MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        crearArregloTeorico(evt);
        this.arregloT = true;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        crearArregloPractico(evt);
        this.arregloP = true;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGeneralActionPerformed
        // TODO add your handling code here:
        promGral();
    }//GEN-LAST:event_botonGeneralActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        crearArregloTeorico(evt);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        crearArregloPractico(evt);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel19MousePressed

    private void jLabel19MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);

    }//GEN-LAST:event_jLabel19MouseDragged

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        // TODO add your handling code here:
        jLabel22.setForeground(naranjo);
        jLabel22.setText("CALENDARIO PRUEBAS");
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        // TODO add your handling code here:
        jLabel22.setForeground(Color.WHITE);
        jLabel22.setText(".");
    }//GEN-LAST:event_jButton9MouseExited

    //crea un arreglo dependiendo de la cantidad de notas Teoricas que tenga el ramo
//y calcula el promedio de la parte teorica o la nota necesaria.   
    void crearArregloTeorico(java.awt.event.ActionEvent evt) {
        if (jButton3 == evt.getSource()) {
            this.prom_Teo = 0;
        }
        switch (Integer.parseInt(cantEvT.getText())) {
            case 1:
                if (!nt1.getText().equals("") && !pt1.getText().equals("") && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.') {
                    this.notasT = new double[1];
                    notasT[0] = Double.parseDouble(nt1.getText());
                    this.pondT = new double[1];
                    pondT[0] = Double.parseDouble(pt1.getText());
                    if (jButton3 == evt.getSource()) {
                        this.prom_Teo = calcularPromTeorico();
                    } else if (jButton4 == evt.getSource()) {
                        calcularNotaFaltante(pondT, notasT);
                    }
                } else {
                    op.mensajeError();
                }
                break;
            case 2:

                if (jButton3 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.') {
                        this.notasT = new double[2];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());

                        this.pondT = new double[2];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        this.prom_Teo = calcularPromTeorico();

                    } else {
                        op.mensajeError();
                    }
                } else if (jButton4 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !pt2.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.') {
                        this.notasT = new double[2];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = 1;

                        this.pondT = new double[2];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());

                        calcularNotaFaltante(pondT, notasT);
                    } else {
                        op.mensajeError();
                    }
                }

                break;
            case 3:
                if (jButton3 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.') {
                        this.notasT = new double[3];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());

                        this.pondT = new double[3];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        this.prom_Teo = calcularPromTeorico();

                    } else {
                        op.mensajeError();
                    }
                } else if (jButton4 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !pt3.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && pt3.getText().charAt(0) != '.') {
                        this.notasT = new double[3];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = 1;

                        this.pondT = new double[3];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        calcularNotaFaltante(pondT, notasT);
                    } else {
                        op.mensajeError();
                    }
                }

                break;
            case 4:

                if (jButton3 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !nt4.getText().equals("") && !pt4.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && nt4.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.') {
                        this.notasT = new double[4];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = Double.parseDouble(nt4.getText());
                        this.pondT = new double[4];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        this.prom_Teo = calcularPromTeorico();
                    } else {
                        op.mensajeError();
                    }
                } else if (jButton4 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !pt4.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.') {
                        this.notasT = new double[4];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = 1;
                        this.pondT = new double[4];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        calcularNotaFaltante(pondT, notasT);
                    } else {
                        op.mensajeError();
                    }
                }

                break;

            case 5:
                if (jButton3 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !nt4.getText().equals("") && !pt4.getText().equals("")
                            && !nt5.getText().equals("") && !pt5.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && nt4.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.'
                            && nt5.getText().charAt(0) != '.' && pt5.getText().charAt(0) != '.') {
                        this.notasT = new double[5];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = Double.parseDouble(nt4.getText());
                        notasT[4] = Double.parseDouble(nt5.getText());

                        this.pondT = new double[5];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        pondT[4] = Double.parseDouble(pt5.getText());
                        this.prom_Teo = calcularPromTeorico();
                    } else {
                        op.mensajeError();
                    }
                } else if (jButton4 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !nt4.getText().equals("") && !pt4.getText().equals("")
                            && !pt5.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && nt4.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.'
                            && pt5.getText().charAt(0) != '.') {
                        this.notasT = new double[5];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = Double.parseDouble(nt4.getText());
                        notasT[4] = 1;

                        this.pondT = new double[5];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        pondT[4] = Double.parseDouble(pt5.getText());
                        calcularNotaFaltante(pondT, notasT);
                    } else {
                        op.mensajeError();
                    }
                }

                break;
            case 6:
                if (jButton3 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !nt4.getText().equals("") && !pt4.getText().equals("")
                            && !nt5.getText().equals("") && !pt5.getText().equals("") && !nt6.getText().equals("") && !pt6.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && nt4.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.'
                            && nt5.getText().charAt(0) != '.' && pt5.getText().charAt(0) != '.' && nt6.getText().charAt(0) != '.' && pt6.getText().charAt(0) != '.') {
                        this.notasT = new double[6];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = Double.parseDouble(nt4.getText());
                        notasT[4] = Double.parseDouble(nt5.getText());
                        notasT[5] = Double.parseDouble(nt6.getText());
                        this.pondT = new double[6];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        pondT[4] = Double.parseDouble(pt5.getText());
                        pondT[5] = Double.parseDouble(pt6.getText());
                        this.prom_Teo = calcularPromTeorico();
                    } else {
                        op.mensajeError();
                    }
                } else if (jButton4 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !nt4.getText().equals("") && !pt4.getText().equals("")
                            && !nt5.getText().equals("") && !pt5.getText().equals("") && !pt6.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && nt4.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.'
                            && nt5.getText().charAt(0) != '.' && pt5.getText().charAt(0) != '.' && pt6.getText().charAt(0) != '.') {
                        this.notasT = new double[6];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = Double.parseDouble(nt4.getText());
                        notasT[4] = Double.parseDouble(nt5.getText());
                        notasT[5] = 1;
                        this.pondT = new double[6];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        pondT[4] = Double.parseDouble(pt5.getText());
                        pondT[5] = Double.parseDouble(pt6.getText());
                        calcularNotaFaltante(pondT, notasT);
                    } else {
                        op.mensajeError();
                    }
                }
                break;

            case 7:
                if (jButton3 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !nt4.getText().equals("") && !pt4.getText().equals("")
                            && !nt5.getText().equals("") && !pt5.getText().equals("") && !nt6.getText().equals("") && !pt6.getText().equals("")
                            && !nt7.getText().equals("") && !pt7.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && nt4.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.'
                            && nt5.getText().charAt(0) != '.' && pt5.getText().charAt(0) != '.' && nt6.getText().charAt(0) != '.' && pt6.getText().charAt(0) != '.'
                            && nt7.getText().charAt(0) != '.' && pt7.getText().charAt(0) != '.') {
                        this.notasT = new double[7];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = Double.parseDouble(nt4.getText());
                        notasT[4] = Double.parseDouble(nt5.getText());
                        notasT[5] = Double.parseDouble(nt6.getText());
                        notasT[6] = Double.parseDouble(nt7.getText());

                        this.pondT = new double[7];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        pondT[4] = Double.parseDouble(pt5.getText());
                        pondT[5] = Double.parseDouble(pt6.getText());
                        pondT[6] = Double.parseDouble(pt7.getText());
                        this.prom_Teo = calcularPromTeorico();
                    } else {
                        op.mensajeError();
                    }
                } else if (jButton4 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !nt4.getText().equals("") && !pt4.getText().equals("")
                            && !nt5.getText().equals("") && !pt5.getText().equals("") && !nt6.getText().equals("") && !pt6.getText().equals("")
                            && !pt7.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && nt4.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.'
                            && nt5.getText().charAt(0) != '.' && pt5.getText().charAt(0) != '.' && nt6.getText().charAt(0) != '.' && pt6.getText().charAt(0) != '.'
                            && pt7.getText().charAt(0) != '.') {
                        this.notasT = new double[7];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = Double.parseDouble(nt4.getText());
                        notasT[4] = Double.parseDouble(nt5.getText());
                        notasT[5] = Double.parseDouble(nt6.getText());
                        notasT[6] = 1;

                        this.pondT = new double[7];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        pondT[4] = Double.parseDouble(pt5.getText());
                        pondT[5] = Double.parseDouble(pt6.getText());
                        pondT[6] = Double.parseDouble(pt7.getText());
                        calcularNotaFaltante(pondT, notasT);
                    } else {
                        op.mensajeError();
                    }
                }
                break;
            case 8:
                if (jButton3 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !nt4.getText().equals("") && !pt4.getText().equals("")
                            && !nt5.getText().equals("") && !pt5.getText().equals("") && !nt6.getText().equals("") && !pt6.getText().equals("")
                            && !nt7.getText().equals("") && !pt7.getText().equals("") && !nt8.getText().equals("") && !pt8.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && nt4.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.'
                            && nt5.getText().charAt(0) != '.' && pt5.getText().charAt(0) != '.' && nt6.getText().charAt(0) != '.' && pt6.getText().charAt(0) != '.'
                            && nt7.getText().charAt(0) != '.' && pt7.getText().charAt(0) != '.' && nt8.getText().charAt(0) != '.' && pt8.getText().charAt(0) != '.') {
                        this.notasT = new double[8];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = Double.parseDouble(nt4.getText());
                        notasT[4] = Double.parseDouble(nt5.getText());
                        notasT[5] = Double.parseDouble(nt6.getText());
                        notasT[6] = Double.parseDouble(nt7.getText());
                        notasT[7] = Double.parseDouble(nt8.getText());

                        this.pondT = new double[8];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        pondT[4] = Double.parseDouble(pt5.getText());
                        pondT[5] = Double.parseDouble(pt6.getText());
                        pondT[6] = Double.parseDouble(pt7.getText());
                        pondT[7] = Double.parseDouble(pt8.getText());
                        this.prom_Teo = calcularPromTeorico();
                    } else {
                        op.mensajeError();
                    }
                } else if (jButton4 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !nt4.getText().equals("") && !pt4.getText().equals("")
                            && !nt5.getText().equals("") && !pt5.getText().equals("") && !nt6.getText().equals("") && !pt6.getText().equals("")
                            && !nt7.getText().equals("") && !pt7.getText().equals("") && !pt8.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && nt4.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.'
                            && nt5.getText().charAt(0) != '.' && pt5.getText().charAt(0) != '.' && nt6.getText().charAt(0) != '.' && pt6.getText().charAt(0) != '.'
                            && nt7.getText().charAt(0) != '.' && pt7.getText().charAt(0) != '.' && pt8.getText().charAt(0) != '.') {
                        this.notasT = new double[8];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = Double.parseDouble(nt4.getText());
                        notasT[4] = Double.parseDouble(nt5.getText());
                        notasT[5] = Double.parseDouble(nt6.getText());
                        notasT[6] = Double.parseDouble(nt7.getText());
                        notasT[7] = 1;

                        this.pondT = new double[8];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        pondT[4] = Double.parseDouble(pt5.getText());
                        pondT[5] = Double.parseDouble(pt6.getText());
                        pondT[6] = Double.parseDouble(pt7.getText());
                        pondT[7] = Double.parseDouble(pt8.getText());
                        calcularNotaFaltante(pondT, notasT);
                    } else {
                        op.mensajeError();
                    }
                }
                break;
        }
    }
    
//crea un arreglo dependiendo de la cantidad de notas practicas que tenga el ramo
//y calcula el promedio de la parte practica o la nota necesaria.   

    void crearArregloPractico(java.awt.event.ActionEvent evt) {
        if (jButton2 == evt.getSource()) {
            this.prom_Pract = 0;
        }
        switch (Integer.parseInt(cantEvP.getText())) {
            case 1:
                if (!np1.getText().equals("") && !pp1.getText().equals("") && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.') {
                    this.notasP = new double[1];
                    notasP[0] = Double.parseDouble(np1.getText());
                    this.pondP = new double[1];
                    pondP[0] = Double.parseDouble(pp1.getText());
                    if (jButton2 == evt.getSource()) {
                        this.prom_Pract = calcularPromPractico();
                    } else if (jButton5 == evt.getSource()) {
                        calcularNotaFaltante(pondP, notasP);
                    }
                } else {
                    op.mensajeError();
                }
                break;
            case 2:

                if (jButton2 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.') {
                        this.notasP = new double[2];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        this.pondP = new double[2];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());

                        this.prom_Pract = calcularPromPractico();

                    } else {
                        op.mensajeError();
                    }
                } else if (jButton5 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !pp2.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.') {
                        this.notasP = new double[2];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = 1;
                        this.pondP = new double[2];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        calcularNotaFaltante(pondP, notasP);
                    } else {
                        op.mensajeError();
                    }
                }

                break;
            case 3:
                if (jButton2 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.') {
                        this.notasP = new double[3];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        this.pondP = new double[3];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        this.prom_Pract = calcularPromPractico();
                    } else {
                        op.mensajeError();
                    }
                } else if (jButton5 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !pp3.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && pp3.getText().charAt(0) != '.') {
                        this.notasP = new double[3];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = 1;
                        this.pondP = new double[3];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        calcularNotaFaltante(pondP, notasP);
                    } else {
                        op.mensajeError();
                    }
                }

                break;
            case 4:

                if (jButton2 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !np4.getText().equals("") && !pp4.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && np4.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.') {
                        this.notasP = new double[4];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = Double.parseDouble(np4.getText());
                        this.pondP = new double[4];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        this.prom_Pract = calcularPromPractico();
                    } else {
                        op.mensajeError();
                    }
                } else if (jButton5 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !pp4.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.') {
                        this.notasP = new double[4];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = 1;
                        this.pondP = new double[4];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        calcularNotaFaltante(pondP, notasP);
                    } else {
                        op.mensajeError();
                    }
                }

                break;

            case 5:
                if (jButton2 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !np4.getText().equals("") && !pp4.getText().equals("")
                            && !np5.getText().equals("") && !pp5.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && np4.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.'
                            && np5.getText().charAt(0) != '.' && pp5.getText().charAt(0) != '.') {
                        this.notasP = new double[5];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = Double.parseDouble(np4.getText());
                        notasP[4] = Double.parseDouble(np5.getText());
                        this.pondP = new double[5];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        pondP[4] = Double.parseDouble(pp5.getText());
                        this.prom_Pract = calcularPromPractico();
                    } else {
                        op.mensajeError();
                    }
                } else if (jButton5 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !np4.getText().equals("") && !pp4.getText().equals("")
                            && !pp5.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && np4.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.'
                            && pp5.getText().charAt(0) != '.') {
                        this.notasP = new double[5];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = Double.parseDouble(np4.getText());
                        notasP[4] = 1;
                        this.pondP = new double[5];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        pondP[4] = Double.parseDouble(pp5.getText());
                        calcularNotaFaltante(pondP, notasP);
                    } else {
                        op.mensajeError();
                    }
                }

                break;
            case 6:
                if (jButton2 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !np4.getText().equals("") && !pp4.getText().equals("")
                            && !np5.getText().equals("") && !pp5.getText().equals("") && !np6.getText().equals("") && !pp6.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && np4.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.'
                            && np5.getText().charAt(0) != '.' && pp5.getText().charAt(0) != '.' && np6.getText().charAt(0) != '.' && pp6.getText().charAt(0) != '.') {
                        this.notasP = new double[6];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = Double.parseDouble(np4.getText());
                        notasP[4] = Double.parseDouble(np5.getText());
                        notasP[5] = Double.parseDouble(np6.getText());
                        this.pondP = new double[6];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        pondP[4] = Double.parseDouble(pp5.getText());
                        pondP[5] = Double.parseDouble(pp6.getText());
                        this.prom_Pract = calcularPromPractico();
                    } else {
                        op.mensajeError();
                    }
                } else if (jButton5 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !np4.getText().equals("") && !pp4.getText().equals("")
                            && !np5.getText().equals("") && !pp5.getText().equals("") && !pp6.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && np4.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.'
                            && np5.getText().charAt(0) != '.' && pp5.getText().charAt(0) != '.' && pp6.getText().charAt(0) != '.') {
                        this.notasP = new double[6];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = Double.parseDouble(np4.getText());
                        notasP[4] = Double.parseDouble(np5.getText());
                        notasP[5] = 1;
                        this.pondP = new double[6];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        pondP[4] = Double.parseDouble(pp5.getText());
                        pondP[5] = Double.parseDouble(pp6.getText());
                        calcularNotaFaltante(pondP, notasP);
                    } else {
                        op.mensajeError();
                    }
                }
                break;

            case 7:
                if (jButton2 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !np4.getText().equals("") && !pp4.getText().equals("")
                            && !np5.getText().equals("") && !pp5.getText().equals("") && !np6.getText().equals("") && !pp6.getText().equals("")
                            && !np7.getText().equals("") && !pp7.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && np4.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.'
                            && np5.getText().charAt(0) != '.' && pp5.getText().charAt(0) != '.' && np6.getText().charAt(0) != '.' && pp6.getText().charAt(0) != '.'
                            && np7.getText().charAt(0) != '.' && pp7.getText().charAt(0) != '.') {
                        this.notasP = new double[7];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = Double.parseDouble(np4.getText());
                        notasP[4] = Double.parseDouble(np5.getText());
                        notasP[5] = Double.parseDouble(np6.getText());
                        notasP[6] = Double.parseDouble(np7.getText());
                        this.pondP = new double[7];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        pondP[4] = Double.parseDouble(pp5.getText());
                        pondP[5] = Double.parseDouble(pp6.getText());
                        pondP[6] = Double.parseDouble(pp7.getText());
                        this.prom_Pract = calcularPromPractico();
                    } else {
                        op.mensajeError();
                    }
                } else if (jButton5 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !np4.getText().equals("") && !pp4.getText().equals("")
                            && !np5.getText().equals("") && !pp5.getText().equals("") && !np6.getText().equals("") && !pp6.getText().equals("")
                            && !pp7.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && np4.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.'
                            && np5.getText().charAt(0) != '.' && pp5.getText().charAt(0) != '.' && np6.getText().charAt(0) != '.' && pp6.getText().charAt(0) != '.'
                            && pp7.getText().charAt(0) != '.') {
                        this.notasP = new double[7];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = Double.parseDouble(np4.getText());
                        notasP[4] = Double.parseDouble(np5.getText());
                        notasP[5] = Double.parseDouble(np6.getText());
                        notasP[6] = 1;
                        this.pondP = new double[7];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        pondP[4] = Double.parseDouble(pp5.getText());
                        pondP[5] = Double.parseDouble(pp6.getText());
                        pondP[6] = Double.parseDouble(pp7.getText());
                        calcularNotaFaltante(pondP, notasP);
                    } else {
                        op.mensajeError();
                    }
                }
                break;
            case 8:
                if (jButton2 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !np4.getText().equals("") && !pp4.getText().equals("")
                            && !np5.getText().equals("") && !pp5.getText().equals("") && !np6.getText().equals("") && !pp6.getText().equals("")
                            && !np7.getText().equals("") && !pp7.getText().equals("") && !np8.getText().equals("") && !pp8.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && np4.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.'
                            && np5.getText().charAt(0) != '.' && pp5.getText().charAt(0) != '.' && np6.getText().charAt(0) != '.' && pp6.getText().charAt(0) != '.'
                            && np7.getText().charAt(0) != '.' && pp7.getText().charAt(0) != '.' && np8.getText().charAt(0) != '.' && pp8.getText().charAt(0) != '.') {
                        this.notasP = new double[8];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = Double.parseDouble(np4.getText());
                        notasP[4] = Double.parseDouble(np5.getText());
                        notasP[5] = Double.parseDouble(np6.getText());
                        notasP[6] = Double.parseDouble(np7.getText());
                        notasP[7] = Double.parseDouble(np8.getText());

                        this.pondP = new double[8];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        pondP[4] = Double.parseDouble(pp5.getText());
                        pondP[5] = Double.parseDouble(pp6.getText());
                        pondP[6] = Double.parseDouble(pp7.getText());
                        pondP[7] = Double.parseDouble(pp8.getText());
                        this.prom_Pract = calcularPromPractico();
                    } else {
                        op.mensajeError();
                    }
                } else if (jButton5 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !np4.getText().equals("") && !pp4.getText().equals("")
                            && !np5.getText().equals("") && !pp5.getText().equals("") && !np6.getText().equals("") && !pp6.getText().equals("")
                            && !np7.getText().equals("") && !pp7.getText().equals("") && !pp8.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && np4.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.'
                            && np5.getText().charAt(0) != '.' && pp5.getText().charAt(0) != '.' && np6.getText().charAt(0) != '.' && pp6.getText().charAt(0) != '.'
                            && np7.getText().charAt(0) != '.' && pp7.getText().charAt(0) != '.' && pp8.getText().charAt(0) != '.') {
                        this.notasP = new double[8];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = Double.parseDouble(np4.getText());
                        notasP[4] = Double.parseDouble(np5.getText());
                        notasP[5] = Double.parseDouble(np6.getText());
                        notasP[6] = Double.parseDouble(np7.getText());
                        notasP[7] = 1;

                        this.pondP = new double[8];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        pondP[4] = Double.parseDouble(pp5.getText());
                        pondP[5] = Double.parseDouble(pp6.getText());
                        pondP[6] = Double.parseDouble(pp7.getText());
                        pondP[7] = Double.parseDouble(pp8.getText());
                        calcularNotaFaltante(pondP, notasP);
                    } else {
                        op.mensajeError();
                    }
                }
                break;
        }
    }
    
    //instancia un objeto de la clase mixto y calcula el promedio teorico del ramo
    double calcularPromTeorico() {
        //Mixto s = new Mixto();
        double a = 0;
        if ((op.sumPond(this.pondT) <= 100 && op.sumPond(this.pondT) >= 99.96) && op.validarPond(this.pondT) && op.validarNota(this.notasT) == true) {
            a = op.truncarNum(op.calcPromedioSimple(this.notasT, this.pondT));

            if (a >= 3.95) {
                promT.setForeground(Color.black);
                promT.setText(String.valueOf(a));
                jLabel23.setForeground(Color.yellow);
                jLabel23.setText("APROBRADO!!");
            }
            if (a <= 3.94) {
                promT.setForeground(Color.red);
                promT.setText(String.valueOf(a));
                jLabel23.setForeground(Color.red);
                jLabel23.setText("REPROBADO!!");
            }
        } else if (op.sumPond(this.pondT) != 100) {
            JOptionPane.showMessageDialog(null, "Ponderacion Teorica no suma 100",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (!op.validarNota(this.notasT)) {
            JOptionPane.showMessageDialog(null, "ingresar nota menor a 7 y/o mayor a 0",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (!op.validarPond(this.pondT)) {
            JOptionPane.showMessageDialog(null, "Ingresar Ponderacion mayor a 0",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return a;
    }
    
    //instancia un objeto de la clase mixto y calcula el promedio practico del ramo
    double calcularPromPractico() {
        //Simple s = new Simple();
        double a = 0;
        if ((op.sumPond(this.pondP) <= 100 && op.sumPond(this.pondP) >= 99.96) && op.validarPond(this.pondP) && op.validarNota(this.notasP)) {
            a = op.truncarNum(op.calcPromedioSimple(this.notasP, this.pondP));

            if (a >= 3.95) {
                promP.setForeground(Color.black);
                promP.setText(String.valueOf(a));
                jLabel21.setForeground(Color.yellow);
                jLabel21.setText("APROBRADO!!");
            }
            if (a <= 3.94) {
                promP.setForeground(Color.red);
                promP.setText(String.valueOf(a));
                jLabel21.setForeground(Color.red);
                jLabel21.setText("REPROBADO!!");
            }
        } else if (op.sumPond(this.pondP) != 100) {
            JOptionPane.showMessageDialog(null, "Ponderacion no suma 100",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (op.validarNota(this.notasP) == false) {
            JOptionPane.showMessageDialog(null, "ingresar nota menor a 7 y/o mayor a 0",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (!op.validarPond(this.pondP)) {
            JOptionPane.showMessageDialog(null, "Ingresar Ponderacion mayor a 0",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return a;
    }
    
    //instancia un objeto de la clase mixto y calcula el promedio general del ramo
    //usando el promedio teorico y promedio practico guardados con anterioridad en unas variables
    void promGral() {

        //Mixto m = new Mixto();
        if (this.prom_Teo != 0 && this.prom_Pract != 0) {

            double c = op.truncarNum(op.calcPromedioTotal(this.prom_Teo, this.prom_Pract, Double.parseDouble(pondTeo.getText()), Double.parseDouble(pondPract.getText())));
            if (c >= 3.95) {
                promGral.setForeground(Color.black);
                promGral.setText(String.valueOf(c));
                jLabel24.setForeground(Color.yellow);
                jLabel24.setText("APROBRADO!!");
            } else if (c <= 3.94) {
                promGral.setForeground(Color.red);
                promGral.setText(String.valueOf(c));
                jLabel24.setForeground(Color.red);
                jLabel24.setText("REPROBADO!!");

            }
        } else {
            op.mensajeError();
        }
    }
    
    //instancia un objeto de la clase mixto y calcula la nota faltante para aprobar ya sea la parte teorica o practica
    //usando como parametros las notas y ponderaciones de cada parte
    void calcularNotaFaltante(double[] pond, double[] notas) {

        //Mixto s = new Mixto();
        if ((op.sumPond(pond) <= 100 && op.sumPond(pond) >= 99.96) && op.validarNota(notas) && op.validarPond(pond) && notas.length >= 2) {

            double a = op.truncarNum(op.calcNotaFaltante(notas, pond));
            double b = op.truncarNum(op.calcNotaPExamen(notas, pond));

            if ((a <= 7 && b <= 7) && (a > 1 && b > 1)) {
                JOptionPane.showMessageDialog(null, "Para aprobar la asignatura con un 4 necesitas un : |" + String.valueOf(a)
                        + "|, En la última evaluacion\n y \n Para poder rendir examen necesitas un: |" + String.valueOf(b) + "|, En la última evaluacion",
                        "NOTA FALTANTE", JOptionPane.WARNING_MESSAGE);
            } else if (a > 7 && b <= 7) {
                JOptionPane.showMessageDialog(null, "No puedes Aprobar este Ramo, solo puedes ir a Examen\n y \n Para poder rendir examen necesitas un: |" + String.valueOf(b) + "|, En la última evaluacion",
                        "NOTA FALTANTE", JOptionPane.WARNING_MESSAGE);
            } else if (a > 7 && b > 7) {
                JOptionPane.showMessageDialog(null, "Notas insuficientes para aprobar o para rendir examen, ",
                        "NOTA FALTANTE", JOptionPane.WARNING_MESSAGE);
            } else if (a <= 1 && b <= 1) {
                JOptionPane.showMessageDialog(null, "con la nota minima (1.0) En la última evaluacion pasas es ramo",
                        "NOTA FALTANTE", JOptionPane.WARNING_MESSAGE);
            } else if (a > 1 && b <= 1) {
                JOptionPane.showMessageDialog(null, "Para aprobar la asignatura con un 4 necesitas un : |" + String.valueOf(a)
                        + "|, En la última evaluacion\n y \n con la nota minima (1.0) En la última evaluacion pudes dar examen",
                        "NOTA FALTANTE", JOptionPane.WARNING_MESSAGE);
            }
        } else if (op.sumPond(pond) != 100) {
            JOptionPane.showMessageDialog(null, "Ponderacion no suma 100",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (!op.validarNota(notas)) {
            JOptionPane.showMessageDialog(null, "Ingresar nota menor a 7 y/o mayor a 0",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (notas.length < 2) {
            JOptionPane.showMessageDialog(null, "Cantidad de notas debe se superior a 1",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (!op.validarPond(pond)) {
            JOptionPane.showMessageDialog(null, "Ingresar Ponderacion mayor a 0",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
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
            java.util.logging.Logger.getLogger(InterfazMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazMixto().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel Panel_Superior;
    private javax.swing.JButton botonGeneral;
    private javax.swing.JLabel cantEvP;
    private javax.swing.JLabel cantEvT;
    private javax.swing.JButton home2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelHoras;
    private javax.swing.JLabel labelNivel;
    private javax.swing.JLabel nombreAsign;
    private javax.swing.JTextField np1;
    private javax.swing.JTextField np2;
    private javax.swing.JTextField np3;
    private javax.swing.JTextField np4;
    private javax.swing.JTextField np5;
    private javax.swing.JTextField np6;
    private javax.swing.JTextField np7;
    private javax.swing.JTextField np8;
    private javax.swing.JTextField np9;
    private javax.swing.JTextField nt1;
    private javax.swing.JTextField nt2;
    private javax.swing.JTextField nt3;
    private javax.swing.JTextField nt4;
    private javax.swing.JTextField nt5;
    private javax.swing.JTextField nt6;
    private javax.swing.JTextField nt7;
    private javax.swing.JTextField nt8;
    private javax.swing.JTextField nt9;
    private javax.swing.JLabel pondPract;
    private javax.swing.JLabel pondTeo;
    private javax.swing.JTextField pp1;
    private javax.swing.JTextField pp2;
    private javax.swing.JTextField pp3;
    private javax.swing.JTextField pp4;
    private javax.swing.JTextField pp5;
    private javax.swing.JTextField pp6;
    private javax.swing.JTextField pp7;
    private javax.swing.JTextField pp8;
    private javax.swing.JTextField pp9;
    private javax.swing.JTextField promGral;
    private javax.swing.JTextField promP;
    private javax.swing.JTextField promT;
    private javax.swing.JTextField pt1;
    private javax.swing.JTextField pt2;
    private javax.swing.JTextField pt3;
    private javax.swing.JTextField pt4;
    private javax.swing.JTextField pt5;
    private javax.swing.JTextField pt6;
    private javax.swing.JTextField pt7;
    private javax.swing.JTextField pt8;
    private javax.swing.JTextField pt9;
    private javax.swing.JLabel tipoAprob;
    // End of variables declaration//GEN-END:variables

}

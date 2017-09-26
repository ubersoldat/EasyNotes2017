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
public class interfazSimple extends javax.swing.JFrame {

    Color naranjo = new Color(255, 120, 0);
    int cont = 0;
    Operaciones op = new Operaciones();
    int x, y;
    int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    
    double notasT[];
    double pondT[];
    boolean arregloN = false;
    
    
    public interfazSimple() {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        //setLocation(318, 214);// mover a donde yo quiera el frame
        this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 910, 510);
        //setLocationRelativeTo(null);
    }

    public void ingresarRamo(datosAsignatura da, NotasPracticas np, NotasTeoricas nt, PondPracticas pp, PondTeoricas pt, NotasFinales nf) throws IOException {
        nombreAsign.setText(da.getNombre());
        tipoAprob.setText(da.getTipo());
        labelNivel.setText(Integer.toString(da.getNivel()));
        labelHoras.setText(Integer.toString(da.getHoras()));
        prom.setText(nf.getPg());

        if (tipoAprob.getText().equals("Teórico")) {
            cantEv.setText(Integer.toString(da.getEVteorica()));
            switch (da.getEVteorica()) {
                case 1:
                    n2.setVisible(false);
                    p2.setVisible(false);
                case 2:
                    n3.setVisible(false);
                    p3.setVisible(false);
                case 3:
                    n4.setVisible(false);
                    p4.setVisible(false);
                case 4:
                    n5.setVisible(false);
                    p5.setVisible(false);
                case 5:
                    n6.setVisible(false);
                    p6.setVisible(false);
                case 6:
                    n7.setVisible(false);
                    p7.setVisible(false);
                case 7:
                    n8.setVisible(false);
                    p8.setVisible(false);
                case 8:
                    n9.setVisible(false);
                    p9.setVisible(false);
                case 9:
                    break;

            }
            switch (da.getEVteorica()) {
                case 9:
                    n9.setText(nt.getN9());
                    p9.setText(pt.getPt9());
                case 8:
                    n8.setText(nt.getN8());
                    p8.setText(pt.getPt8());
                case 7:
                    n7.setText(nt.getN7());
                    p7.setText(pt.getPt7());
                case 6:
                    n6.setText(nt.getN7());
                    p6.setText(pt.getPt7());
                case 5:
                    n5.setText(nt.getN7());
                    p5.setText(pt.getPt7());
                case 4:
                    n4.setText(nt.getN7());
                    p4.setText(pt.getPt7());
                case 3:
                    n3.setText(nt.getN7());
                    p3.setText(pt.getPt7());
                case 2:
                    n2.setText(nt.getN7());
                    p2.setText(pt.getPt7());
                case 1:
                    n1.setText(nt.getN7());
                    p1.setText(pt.getPt7());

                    break;
            }
        }
        if (tipoAprob.getText().equals("Práctico")) {
            cantEv.setText(Integer.toString(da.getEVpractica()));
            switch (da.getEVpractica()) {
                case 1:
                    n2.setVisible(false);
                    p2.setVisible(false);
                case 2:
                    n3.setVisible(false);
                    p3.setVisible(false);
                case 3:
                    n4.setVisible(false);
                    p4.setVisible(false);
                case 4:
                    n5.setVisible(false);
                    p5.setVisible(false);
                case 5:
                    n6.setVisible(false);
                    p6.setVisible(false);
                case 6:
                    n7.setVisible(false);
                    p7.setVisible(false);
                case 7:
                    n8.setVisible(false);
                    p8.setVisible(false);
                case 8:
                    n9.setVisible(false);
                    p9.setVisible(false);
                case 9:
                    break;

            }
            switch (da.getEVpractica()) {
                case 9:
                    n9.setText(np.getN9());
                    p9.setText(pp.getPp9());
                case 8:
                    n8.setText(np.getN9());
                    p8.setText(pp.getPp9());
                case 7:
                    n7.setText(np.getN9());
                    p7.setText(pp.getPp9());
                case 6:
                    n6.setText(np.getN9());
                    p6.setText(pp.getPp9());
                case 5:
                    n5.setText(np.getN9());
                    p5.setText(pp.getPp9());
                case 4:
                    n4.setText(np.getN9());
                    p4.setText(pp.getPp9());
                case 3:
                    n3.setText(np.getN9());
                    p3.setText(pp.getPp9());
                case 2:
                    n2.setText(np.getN9());
                    p2.setText(pp.getPp9());
                case 1:
                    n1.setText(np.getN9());
                    p1.setText(pp.getPp9());
                    break;
            }
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
        jLabel4 = new javax.swing.JLabel();
        cantEv = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        n3 = new javax.swing.JTextField();
        n4 = new javax.swing.JTextField();
        n5 = new javax.swing.JTextField();
        n6 = new javax.swing.JTextField();
        n7 = new javax.swing.JTextField();
        n8 = new javax.swing.JTextField();
        n9 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        p1 = new javax.swing.JTextField();
        p2 = new javax.swing.JTextField();
        p3 = new javax.swing.JTextField();
        p4 = new javax.swing.JTextField();
        p5 = new javax.swing.JTextField();
        p6 = new javax.swing.JTextField();
        p7 = new javax.swing.JTextField();
        p8 = new javax.swing.JTextField();
        p9 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        prom = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tipoAprob = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        PanelMenu = new javax.swing.JPanel();
        home2 = new javax.swing.JButton();
        Panel_Superior = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
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
        jPanel1.add(nombreAsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad de evaluaciones:");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        cantEv.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        cantEv.setForeground(new java.awt.Color(255, 255, 255));
        cantEv.setText("cantEv");
        jPanel1.add(cantEv, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NOTAS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        n1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        n1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n1KeyTyped(evt);
            }
        });
        jPanel1.add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 50, 40));

        n2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        n2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n2KeyTyped(evt);
            }
        });
        jPanel1.add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 50, 40));

        n3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        n3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n3KeyTyped(evt);
            }
        });
        jPanel1.add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 50, 40));

        n4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        n4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n4KeyTyped(evt);
            }
        });
        jPanel1.add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 50, 40));

        n5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        n5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n5KeyTyped(evt);
            }
        });
        jPanel1.add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 50, 40));

        n6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        n6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n6KeyTyped(evt);
            }
        });
        jPanel1.add(n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 50, 40));

        n7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        n7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n7KeyTyped(evt);
            }
        });
        jPanel1.add(n7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 50, 40));

        n8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        n8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n8KeyTyped(evt);
            }
        });
        jPanel1.add(n8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 50, 40));

        n9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        n9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n9KeyTyped(evt);
            }
        });
        jPanel1.add(n9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 50, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("POND. %");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        p1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        p1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        p1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p1KeyTyped(evt);
            }
        });
        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 50, 30));

        p2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        p2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p2KeyTyped(evt);
            }
        });
        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 50, 30));

        p3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        p3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p3KeyTyped(evt);
            }
        });
        jPanel1.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 50, 30));

        p4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        p4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p4KeyTyped(evt);
            }
        });
        jPanel1.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 50, 30));

        p5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        p5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p5KeyTyped(evt);
            }
        });
        jPanel1.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 50, 30));

        p6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        p6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p6KeyTyped(evt);
            }
        });
        jPanel1.add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 50, 30));

        p7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        p7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p7KeyTyped(evt);
            }
        });
        jPanel1.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 50, 30));

        p8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        p8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p8KeyTyped(evt);
            }
        });
        jPanel1.add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 50, 30));

        p9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        p9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p9KeyTyped(evt);
            }
        });
        jPanel1.add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 50, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("GENERAL");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, -1, -1));

        prom.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        prom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                promKeyTyped(evt);
            }
        });
        jPanel1.add(prom, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, 50, 30));

        jButton1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton1.setText("CALCULAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, -1, -1));

        jButton2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton2.setText("Nota Faltante");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 440, -1, -1));

        tipoAprob.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        tipoAprob.setForeground(new java.awt.Color(255, 255, 255));
        tipoAprob.setText("TIPO");
        jPanel1.add(tipoAprob, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo Aprobación:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(".");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(".");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 330, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add3.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add2.png"))); // NOI18N
        jButton4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add2.png"))); // NOI18N
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
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

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

        jPanel1.add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 510));

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

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Minus_Math__25px.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/min2.png"))); // NOI18N
        jButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/min2.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Panel_Superior.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 30, 30));

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
        Panel_Superior.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barra_logo1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        Panel_Superior.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 30));

        jPanel1.add(Panel_Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 820, 30));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar1.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 30, 40));

        jPanel2.setBackground(new java.awt.Color(32, 47, 90));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nivel:");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
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
                        .addComponent(jLabel13)
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
                    .addComponent(jLabel13)
                    .addComponent(labelNivel))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(labelHoras))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 110, 90));

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
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered

        jLabel9.setForeground(naranjo);
        jLabel9.setText("GUARDAR CAMBIOS");
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited

        jLabel9.setForeground(Color.WHITE);
        jLabel9.setText(".");
    }//GEN-LAST:event_jButton4MouseExited

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed

    }//GEN-LAST:event_p1ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered

        jLabel9.setForeground(naranjo);
        jLabel9.setText("* Al oprimir Calcula última nota necesaria para aprobar el ramo");
    }//GEN-LAST:event_jButton2MouseEntered

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

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased

    }//GEN-LAST:event_jButton3MouseReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        this.setExtendedState(1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        int resp = JOptionPane.showConfirmDialog(null,
                "Los Datos no guardado se eliminarán.\n ¿Desea salir de la Aplicación igualmente?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.OK_OPTION == resp) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        if (n1.getText().equals("") && n2.getText().equals("") && n3.getText().equals("") && n4.getText().equals("")
                && n5.getText().equals("") && n6.getText().equals("") && n7.getText().equals("") && n8.getText().equals("")
                && n9.getText().equals("") && p1.getText().equals("") && p2.getText().equals("") && p3.getText().equals("")
                && p4.getText().equals("") && p5.getText().equals("") && p6.getText().equals("") && p7.getText().equals("")
                && p8.getText().equals("") && p9.getText().equals("") && prom.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Para Guardar Rellene por lo menos UNA Casilla!");
        } else {
            if (tipoAprob.getText().equals("Teórico")) {

                if (n1.getText().equals(op.notasTeoricas(nombreAsign.getText()).getN1()) && n2.getText().equals(op.notasTeoricas(nombreAsign.getText()).getN2())
                        && n3.getText().equals(op.notasTeoricas(nombreAsign.getText()).getN3()) && n4.getText().equals(op.notasTeoricas(nombreAsign.getText()).getN4())
                        && n5.getText().equals(op.notasTeoricas(nombreAsign.getText()).getN5()) && n6.getText().equals(op.notasTeoricas(nombreAsign.getText()).getN6())
                        && n7.getText().equals(op.notasTeoricas(nombreAsign.getText()).getN7()) && n8.getText().equals(op.notasTeoricas(nombreAsign.getText()).getN8())
                        && n9.getText().equals(op.notasTeoricas(nombreAsign.getText()).getN9())
                        && p1.getText().equals(op.ponderacionTeo(nombreAsign.getText()).getPt1()) && p2.getText().equals(op.ponderacionTeo(nombreAsign.getText()).getPt2())
                        && p3.getText().equals(op.ponderacionTeo(nombreAsign.getText()).getPt3()) && p4.getText().equals(op.ponderacionTeo(nombreAsign.getText()).getPt4())
                        && p5.getText().equals(op.ponderacionTeo(nombreAsign.getText()).getPt5()) && p6.getText().equals(op.ponderacionTeo(nombreAsign.getText()).getPt6())
                        && p7.getText().equals(op.ponderacionTeo(nombreAsign.getText()).getPt7()) && p8.getText().equals(op.ponderacionTeo(nombreAsign.getText()).getPt8())
                        && p9.getText().equals(op.ponderacionTeo(nombreAsign.getText()).getPt9())
                        && prom.getText().equals(op.notasFinales(nombreAsign.getText()).getPg())) {
                    JOptionPane.showMessageDialog(this, "Los Datos ya se Encuentran Guardados!");
                } else {
                    op.actualizarRamoConNuevosDatos(nombreAsign.getText());
                    op.agregarNotasTeoricas(n1.getText(), n2.getText(),
                            n3.getText(), n4.getText(),
                            n5.getText(), n6.getText(), n7.getText(),
                            n8.getText(), n9.getText(), nombreAsign.getText());
                    op.agregarPondT(p1.getText(), p2.getText(),
                            p3.getText(), p4.getText(),
                            p5.getText(), p6.getText(), p7.getText(),
                            p8.getText(), p9.getText(), nombreAsign.getText());
                    op.agregarNotasFinales("", "", prom.getText(), nombreAsign.getText());

                    JOptionPane.showMessageDialog(this, "Datos guardados Exitosamente!");
                    cont++;
                }

            }

            if (tipoAprob.getText().equals("Práctico")) {

                if (n1.getText().equals(op.notasPracticas(nombreAsign.getText()).getN1()) && n2.getText().equals(op.notasPracticas(nombreAsign.getText()).getN2())
                        && n3.getText().equals(op.notasPracticas(nombreAsign.getText()).getN3()) && n4.getText().equals(op.notasPracticas(nombreAsign.getText()).getN4())
                        && n5.getText().equals(op.notasPracticas(nombreAsign.getText()).getN5()) && n6.getText().equals(op.notasPracticas(nombreAsign.getText()).getN6())
                        && n7.getText().equals(op.notasPracticas(nombreAsign.getText()).getN7()) && n8.getText().equals(op.notasPracticas(nombreAsign.getText()).getN8())
                        && n9.getText().equals(op.notasPracticas(nombreAsign.getText()).getN9())
                        && p1.getText().equals(op.ponderacionPrac(nombreAsign.getText()).getPp1()) && p2.getText().equals(op.ponderacionPrac(nombreAsign.getText()).getPp2())
                        && p3.getText().equals(op.ponderacionPrac(nombreAsign.getText()).getPp3()) && p4.getText().equals(op.ponderacionPrac(nombreAsign.getText()).getPp4())
                        && p5.getText().equals(op.ponderacionPrac(nombreAsign.getText()).getPp5()) && p6.getText().equals(op.ponderacionPrac(nombreAsign.getText()).getPp6())
                        && p7.getText().equals(op.ponderacionPrac(nombreAsign.getText()).getPp7()) && p8.getText().equals(op.ponderacionPrac(nombreAsign.getText()).getPp8())
                        && p9.getText().equals(op.ponderacionPrac(nombreAsign.getText()).getPp9())
                        && prom.getText().equals(op.notasFinales(nombreAsign.getText()).getPg())) {
                    JOptionPane.showMessageDialog(this, "Los Datos ya se Encuentran Guardados!");

                } else {

                    op.agregarNotasPracticas(n1.getText(), n2.getText(),
                            n3.getText(), n4.getText(),
                            n5.getText(), n6.getText(), n7.getText(),
                            n8.getText(), n9.getText(), nombreAsign.getText());
                    op.agregarPondP(p1.getText(), p2.getText(),
                            p3.getText(), p4.getText(),
                            p5.getText(), p6.getText(), p7.getText(),
                            p8.getText(), p9.getText(), nombreAsign.getText());
                    op.agregarNotasFinales("", "", prom.getText(), nombreAsign.getText());

                    JOptionPane.showMessageDialog(this, "Datos guardados Exitosamente!");
                    cont++;

                }

            }
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        // TODO add your handling code here:
        jLabel9.setForeground(naranjo);
        jLabel9.setText("ELIMINAR ASIGNATURA");
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        // TODO add your handling code here:
        jLabel9.setForeground(Color.WHITE);
        jLabel9.setText(".");
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
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_Panel_SuperiorMousePressed

    private void Panel_SuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_SuperiorMouseDragged
        // TODO add your handling code here:
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_Panel_SuperiorMouseDragged

    private void n1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n1KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(n1.getText(), evt);
    }//GEN-LAST:event_n1KeyTyped

    private void n2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n2KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(n2.getText(), evt);
    }//GEN-LAST:event_n2KeyTyped

    private void n3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n3KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(n3.getText(), evt);
    }//GEN-LAST:event_n3KeyTyped

    private void n4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n4KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(n4.getText(), evt);
    }//GEN-LAST:event_n4KeyTyped

    private void n5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n5KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(n5.getText(), evt);
    }//GEN-LAST:event_n5KeyTyped

    private void n6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n6KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(n6.getText(), evt);
    }//GEN-LAST:event_n6KeyTyped

    private void n7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n7KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(n7.getText(), evt);
    }//GEN-LAST:event_n7KeyTyped

    private void n8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n8KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(n8.getText(), evt);
    }//GEN-LAST:event_n8KeyTyped

    private void n9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n9KeyTyped
        // TODO add your handling code here:
        op.validacionNotas(n9.getText(), evt);
    }//GEN-LAST:event_n9KeyTyped

    private void p1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p1KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(p1.getText(), evt);
    }//GEN-LAST:event_p1KeyTyped

    private void p2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p2KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(p2.getText(), evt);
    }//GEN-LAST:event_p2KeyTyped

    private void p3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p3KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(p3.getText(), evt);
    }//GEN-LAST:event_p3KeyTyped

    private void p4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p4KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(p4.getText(), evt);
    }//GEN-LAST:event_p4KeyTyped

    private void p5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p5KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(p5.getText(), evt);
    }//GEN-LAST:event_p5KeyTyped

    private void p6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p6KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(p6.getText(), evt);
    }//GEN-LAST:event_p6KeyTyped

    private void p7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p7KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(p7.getText(), evt);
    }//GEN-LAST:event_p7KeyTyped

    private void p8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p8KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(p8.getText(), evt);
    }//GEN-LAST:event_p8KeyTyped

    private void p9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p9KeyTyped
        // TODO add your handling code here:
        op.validacionPonderaciones(p9.getText(), evt);
    }//GEN-LAST:event_p9KeyTyped

    private void promKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_promKeyTyped
        // TODO add your handling code here:
        op.validacionNotas(prom.getText(), evt);
    }//GEN-LAST:event_promKeyTyped

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:
        jLabel9.setForeground(naranjo);
        jLabel9.setText("Nivel Academico de la Asignatura");
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        // TODO add your handling code here:
        jLabel9.setForeground(Color.WHITE);
        jLabel9.setText(".");
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel9.setForeground(naranjo);
        jLabel9.setText("Horas de la Asignatura");
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel9.setForeground(Color.WHITE);
        jLabel9.setText(".");
    }//GEN-LAST:event_jLabel1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        crearArreglo(evt);
        arregloN = true;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        // TODO add your handling code here:
        jLabel9.setForeground(naranjo);
        jLabel9.setText("CALENDARIO PRUEBAS");
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        // TODO add your handling code here:
        jLabel9.setForeground(Color.WHITE);
        jLabel9.setText(".");
    }//GEN-LAST:event_jButton9MouseExited
    
    //crea un arreglo dependiendo de la cantidad de notas que tenga el ramo
//y calcula el promedio del ramo o la nota necesaria.    
    void crearArreglo(java.awt.event.ActionEvent evt) {

        switch (Integer.parseInt(cantEv.getText())) {
            case 1:
                if (!n1.getText().equals("") && !p1.getText().equals("") && n1.getText().charAt(0) != '.' && p1.getText().charAt(0) != '.') {
                    this.notasT = new double[1];
                    notasT[0] = Double.parseDouble(n1.getText());
                    this.pondT = new double[1];
                    pondT[0] = Double.parseDouble(p1.getText());
                    if (jButton1 == evt.getSource()) {
                        calcularProm();
                    } else if (jButton2 == evt.getSource()) {
                        calcularNotaFaltante();
                    }
                } else {
                    op.mensajeError();
                }
                break;
            case 2:

                if (jButton1 == evt.getSource()) {
                    if (!n1.getText().equals("") && !p1.getText().equals("") && !n2.getText().equals("") && !p2.getText().equals("")
                            && n1.getText().charAt(0) != '.' && p1.getText().charAt(0) != '.' && n2.getText().charAt(0) != '.' && p2.getText().charAt(0) != '.') {
                        this.notasT = new double[2];
                        notasT[0] = Double.parseDouble(n1.getText());
                        notasT[1] = Double.parseDouble(n2.getText());

                        this.pondT = new double[2];
                        pondT[0] = Double.parseDouble(p1.getText());
                        pondT[1] = Double.parseDouble(p2.getText());

                        calcularProm();
                    } else {
                        op.mensajeError();
                    }
                } else if (jButton2 == evt.getSource()) {
                    if (!n1.getText().equals("") && !p1.getText().equals("") && !p2.getText().equals("")
                            && n1.getText().charAt(0) != '.' && p1.getText().charAt(0) != '.' && p2.getText().charAt(0) != '.') {
                        this.notasT = new double[2];
                        notasT[0] = Double.parseDouble(n1.getText());
                        notasT[1] = 1;

                        this.pondT = new double[2];
                        pondT[0] = Double.parseDouble(p1.getText());
                        pondT[1] = Double.parseDouble(p2.getText());

                        calcularNotaFaltante();
                    } else {
                        op.mensajeError();
                    }
                }

                break;
            case 3:
                if (jButton1 == evt.getSource()) {
                    if (!n1.getText().equals("") && !p1.getText().equals("") && !n2.getText().equals("") && !p2.getText().equals("")
                            && !n3.getText().equals("") && !p3.getText().equals("")
                            && n1.getText().charAt(0) != '.' && p1.getText().charAt(0) != '.' && n2.getText().charAt(0) != '.' && p2.getText().charAt(0) != '.'
                            && n3.getText().charAt(0) != '.' && p3.getText().charAt(0) != '.') {
                        this.notasT = new double[3];
                        notasT[0] = Double.parseDouble(n1.getText());
                        notasT[1] = Double.parseDouble(n2.getText());
                        notasT[2] = Double.parseDouble(n3.getText());

                        this.pondT = new double[3];
                        pondT[0] = Double.parseDouble(p1.getText());
                        pondT[1] = Double.parseDouble(p2.getText());
                        pondT[2] = Double.parseDouble(p3.getText());
                        calcularProm();
                    } else {
                        op.mensajeError();
                    }
                } else if (jButton2 == evt.getSource()) {
                    if (!n1.getText().equals("") && !p1.getText().equals("") && !n2.getText().equals("") && !p2.getText().equals("")
                            && !p3.getText().equals("")
                            && n1.getText().charAt(0) != '.' && p1.getText().charAt(0) != '.' && n2.getText().charAt(0) != '.' && p2.getText().charAt(0) != '.'
                            && p3.getText().charAt(0) != '.') {
                        this.notasT = new double[3];
                        notasT[0] = Double.parseDouble(n1.getText());
                        notasT[1] = Double.parseDouble(n2.getText());
                        notasT[2] = 1;

                        this.pondT = new double[3];
                        pondT[0] = Double.parseDouble(p1.getText());
                        pondT[1] = Double.parseDouble(p2.getText());
                        pondT[2] = Double.parseDouble(p3.getText());
                        calcularNotaFaltante();
                    } else {
                        op.mensajeError();
                    }
                }

                break;
            case 4:

                if (jButton1 == evt.getSource()) {
                    if (!n1.getText().equals("") && !p1.getText().equals("") && !n2.getText().equals("") && !p2.getText().equals("")
                            && !n3.getText().equals("") && !p3.getText().equals("") && !n4.getText().equals("") && !p4.getText().equals("")
                            && n1.getText().charAt(0) != '.' && p1.getText().charAt(0) != '.' && n2.getText().charAt(0) != '.' && p2.getText().charAt(0) != '.'
                            && n3.getText().charAt(0) != '.' && p3.getText().charAt(0) != '.' && n4.getText().charAt(0) != '.' && p4.getText().charAt(0) != '.') {
                        this.notasT = new double[4];
                        notasT[0] = Double.parseDouble(n1.getText());
                        notasT[1] = Double.parseDouble(n2.getText());
                        notasT[2] = Double.parseDouble(n3.getText());
                        notasT[3] = Double.parseDouble(n4.getText());
                        this.pondT = new double[4];
                        pondT[0] = Double.parseDouble(p1.getText());
                        pondT[1] = Double.parseDouble(p2.getText());
                        pondT[2] = Double.parseDouble(p3.getText());
                        pondT[3] = Double.parseDouble(p4.getText());
                        calcularProm();
                    } else {
                        op.mensajeError();
                    }
                } else if (jButton2 == evt.getSource()) {
                    if (!n1.getText().equals("") && !p1.getText().equals("") && !n2.getText().equals("") && !p2.getText().equals("")
                            && !n3.getText().equals("") && !p3.getText().equals("") && !p4.getText().equals("")
                            && n1.getText().charAt(0) != '.' && p1.getText().charAt(0) != '.' && n2.getText().charAt(0) != '.' && p2.getText().charAt(0) != '.'
                            && n3.getText().charAt(0) != '.' && p3.getText().charAt(0) != '.' && p4.getText().charAt(0) != '.') {
                        this.notasT = new double[4];
                        notasT[0] = Double.parseDouble(n1.getText());
                        notasT[1] = Double.parseDouble(n2.getText());
                        notasT[2] = Double.parseDouble(n3.getText());
                        notasT[3] = 1;
                        this.pondT = new double[4];
                        pondT[0] = Double.parseDouble(p1.getText());
                        pondT[1] = Double.parseDouble(p2.getText());
                        pondT[2] = Double.parseDouble(p3.getText());
                        pondT[3] = Double.parseDouble(p4.getText());
                        calcularNotaFaltante();
                    } else {
                        op.mensajeError();
                    }
                }

                break;

            case 5:
                if (jButton1 == evt.getSource()) {
                    if (!n1.getText().equals("") && !p1.getText().equals("") && !n2.getText().equals("") && !p2.getText().equals("")
                            && !n3.getText().equals("") && !p3.getText().equals("") && !n4.getText().equals("") && !p4.getText().equals("")
                            && !n5.getText().equals("") && !p5.getText().equals("")
                            && n1.getText().charAt(0) != '.' && p1.getText().charAt(0) != '.' && n2.getText().charAt(0) != '.' && p2.getText().charAt(0) != '.'
                            && n3.getText().charAt(0) != '.' && p3.getText().charAt(0) != '.' && n4.getText().charAt(0) != '.' && p4.getText().charAt(0) != '.'
                            && n5.getText().charAt(0) != '.' && p5.getText().charAt(0) != '.') {
                        this.notasT = new double[5];
                        notasT[0] = Double.parseDouble(n1.getText());
                        notasT[1] = Double.parseDouble(n2.getText());
                        notasT[2] = Double.parseDouble(n3.getText());
                        notasT[3] = Double.parseDouble(n4.getText());
                        notasT[4] = Double.parseDouble(n5.getText());

                        this.pondT = new double[5];
                        pondT[0] = Double.parseDouble(p1.getText());
                        pondT[1] = Double.parseDouble(p2.getText());
                        pondT[2] = Double.parseDouble(p3.getText());
                        pondT[3] = Double.parseDouble(p4.getText());
                        pondT[4] = Double.parseDouble(p5.getText());
                        calcularProm();
                    } else {
                        op.mensajeError();
                    }
                } else if (jButton2 == evt.getSource()) {
                    if (!n1.getText().equals("") && !p1.getText().equals("") && !n2.getText().equals("") && !p2.getText().equals("")
                            && !n3.getText().equals("") && !p3.getText().equals("") && !n4.getText().equals("") && !p4.getText().equals("")
                            && !p5.getText().equals("")
                            && n1.getText().charAt(0) != '.' && p1.getText().charAt(0) != '.' && n2.getText().charAt(0) != '.' && p2.getText().charAt(0) != '.'
                            && n3.getText().charAt(0) != '.' && p3.getText().charAt(0) != '.' && n4.getText().charAt(0) != '.' && p4.getText().charAt(0) != '.'
                            && p5.getText().charAt(0) != '.') {
                        this.notasT = new double[5];
                        notasT[0] = Double.parseDouble(n1.getText());
                        notasT[1] = Double.parseDouble(n2.getText());
                        notasT[2] = Double.parseDouble(n3.getText());
                        notasT[3] = Double.parseDouble(n4.getText());
                        notasT[4] = 1;

                        this.pondT = new double[5];
                        pondT[0] = Double.parseDouble(p1.getText());
                        pondT[1] = Double.parseDouble(p2.getText());
                        pondT[2] = Double.parseDouble(p3.getText());
                        pondT[3] = Double.parseDouble(p4.getText());
                        pondT[4] = Double.parseDouble(p5.getText());
                        calcularNotaFaltante();
                    } else {
                        op.mensajeError();
                    }
                }

                break;
            case 6:
                if (jButton1 == evt.getSource()) {
                    if (!n1.getText().equals("") && !p1.getText().equals("") && !n2.getText().equals("") && !p2.getText().equals("")
                            && !n3.getText().equals("") && !p3.getText().equals("") && !n4.getText().equals("") && !p4.getText().equals("")
                            && !n5.getText().equals("") && !p5.getText().equals("") && !n6.getText().equals("") && !p6.getText().equals("")
                            && n1.getText().charAt(0) != '.' && p1.getText().charAt(0) != '.' && n2.getText().charAt(0) != '.' && p2.getText().charAt(0) != '.'
                            && n3.getText().charAt(0) != '.' && p3.getText().charAt(0) != '.' && n4.getText().charAt(0) != '.' && p4.getText().charAt(0) != '.'
                            && n5.getText().charAt(0) != '.' && p5.getText().charAt(0) != '.' && n6.getText().charAt(0) != '.' && p6.getText().charAt(0) != '.') {
                        this.notasT = new double[6];
                        notasT[0] = Double.parseDouble(n1.getText());
                        notasT[1] = Double.parseDouble(n2.getText());
                        notasT[2] = Double.parseDouble(n3.getText());
                        notasT[3] = Double.parseDouble(n4.getText());
                        notasT[4] = Double.parseDouble(n5.getText());
                        notasT[5] = Double.parseDouble(n6.getText());
                        this.pondT = new double[6];
                        pondT[0] = Double.parseDouble(p1.getText());
                        pondT[1] = Double.parseDouble(p2.getText());
                        pondT[2] = Double.parseDouble(p3.getText());
                        pondT[3] = Double.parseDouble(p4.getText());
                        pondT[4] = Double.parseDouble(p5.getText());
                        pondT[5] = Double.parseDouble(p6.getText());
                        calcularProm();
                    } else {
                        op.mensajeError();
                    }
                } else if (jButton2 == evt.getSource()) {
                    if (!n1.getText().equals("") && !p1.getText().equals("") && !n2.getText().equals("") && !p2.getText().equals("")
                            && !n3.getText().equals("") && !p3.getText().equals("") && !n4.getText().equals("") && !p4.getText().equals("")
                            && !n5.getText().equals("") && !p5.getText().equals("") && !p6.getText().equals("")
                            && n1.getText().charAt(0) != '.' && p1.getText().charAt(0) != '.' && n2.getText().charAt(0) != '.' && p2.getText().charAt(0) != '.'
                            && n3.getText().charAt(0) != '.' && p3.getText().charAt(0) != '.' && n4.getText().charAt(0) != '.' && p4.getText().charAt(0) != '.'
                            && n5.getText().charAt(0) != '.' && p5.getText().charAt(0) != '.' && p6.getText().charAt(0) != '.') {
                        this.notasT = new double[6];
                        notasT[0] = Double.parseDouble(n1.getText());
                        notasT[1] = Double.parseDouble(n2.getText());
                        notasT[2] = Double.parseDouble(n3.getText());
                        notasT[3] = Double.parseDouble(n4.getText());
                        notasT[4] = Double.parseDouble(n5.getText());
                        notasT[5] = 1;
                        this.pondT = new double[6];
                        pondT[0] = Double.parseDouble(p1.getText());
                        pondT[1] = Double.parseDouble(p2.getText());
                        pondT[2] = Double.parseDouble(p3.getText());
                        pondT[3] = Double.parseDouble(p4.getText());
                        pondT[4] = Double.parseDouble(p5.getText());
                        pondT[5] = Double.parseDouble(p6.getText());
                        calcularNotaFaltante();
                    } else {
                        op.mensajeError();
                    }
                }
                break;

            case 7:
                if (jButton1 == evt.getSource()) {
                    if (!n1.getText().equals("") && !p1.getText().equals("") && !n2.getText().equals("") && !p2.getText().equals("")
                            && !n3.getText().equals("") && !p3.getText().equals("") && !n4.getText().equals("") && !p4.getText().equals("")
                            && !n5.getText().equals("") && !p5.getText().equals("") && !n6.getText().equals("") && !p6.getText().equals("")
                            && !n7.getText().equals("") && !p7.getText().equals("")
                            && n1.getText().charAt(0) != '.' && p1.getText().charAt(0) != '.' && n2.getText().charAt(0) != '.' && p2.getText().charAt(0) != '.'
                            && n3.getText().charAt(0) != '.' && p3.getText().charAt(0) != '.' && n4.getText().charAt(0) != '.' && p4.getText().charAt(0) != '.'
                            && n5.getText().charAt(0) != '.' && p5.getText().charAt(0) != '.' && n6.getText().charAt(0) != '.' && p6.getText().charAt(0) != '.'
                            && n7.getText().charAt(0) != '.' && p7.getText().charAt(0) != '.') {
                        this.notasT = new double[7];
                        notasT[0] = Double.parseDouble(n1.getText());
                        notasT[1] = Double.parseDouble(n2.getText());
                        notasT[2] = Double.parseDouble(n3.getText());
                        notasT[3] = Double.parseDouble(n4.getText());
                        notasT[4] = Double.parseDouble(n5.getText());
                        notasT[5] = Double.parseDouble(n6.getText());
                        notasT[6] = Double.parseDouble(n7.getText());

                        this.pondT = new double[7];
                        pondT[0] = Double.parseDouble(p1.getText());
                        pondT[1] = Double.parseDouble(p2.getText());
                        pondT[2] = Double.parseDouble(p3.getText());
                        pondT[3] = Double.parseDouble(p4.getText());
                        pondT[4] = Double.parseDouble(p5.getText());
                        pondT[5] = Double.parseDouble(p6.getText());
                        pondT[6] = Double.parseDouble(p7.getText());
                        calcularProm();
                    } else {
                        op.mensajeError();
                    }
                } else if (jButton2 == evt.getSource()) {
                    if (!n1.getText().equals("") && !p1.getText().equals("") && !n2.getText().equals("") && !p2.getText().equals("")
                            && !n3.getText().equals("") && !p3.getText().equals("") && !n4.getText().equals("") && !p4.getText().equals("")
                            && !n5.getText().equals("") && !p5.getText().equals("") && !n6.getText().equals("") && !p6.getText().equals("")
                            && !p7.getText().equals("")
                            && n1.getText().charAt(0) != '.' && p1.getText().charAt(0) != '.' && n2.getText().charAt(0) != '.' && p2.getText().charAt(0) != '.'
                            && n3.getText().charAt(0) != '.' && p3.getText().charAt(0) != '.' && n4.getText().charAt(0) != '.' && p4.getText().charAt(0) != '.'
                            && n5.getText().charAt(0) != '.' && p5.getText().charAt(0) != '.' && n6.getText().charAt(0) != '.' && p6.getText().charAt(0) != '.'
                            && p7.getText().charAt(0) != '.') {
                        this.notasT = new double[7];
                        notasT[0] = Double.parseDouble(n1.getText());
                        notasT[1] = Double.parseDouble(n2.getText());
                        notasT[2] = Double.parseDouble(n3.getText());
                        notasT[3] = Double.parseDouble(n4.getText());
                        notasT[4] = Double.parseDouble(n5.getText());
                        notasT[5] = Double.parseDouble(n6.getText());
                        notasT[6] = 1;

                        this.pondT = new double[7];
                        pondT[0] = Double.parseDouble(p1.getText());
                        pondT[1] = Double.parseDouble(p2.getText());
                        pondT[2] = Double.parseDouble(p3.getText());
                        pondT[3] = Double.parseDouble(p4.getText());
                        pondT[4] = Double.parseDouble(p5.getText());
                        pondT[5] = Double.parseDouble(p6.getText());
                        pondT[6] = Double.parseDouble(p7.getText());
                        calcularNotaFaltante();
                    } else {
                        op.mensajeError();
                    }
                }
                break;
            case 8:
                if (jButton1 == evt.getSource()) {
                    if (!n1.getText().equals("") && !p1.getText().equals("") && !n2.getText().equals("") && !p2.getText().equals("")
                            && !n3.getText().equals("") && !p3.getText().equals("") && !n4.getText().equals("") && !p4.getText().equals("")
                            && !n5.getText().equals("") && !p5.getText().equals("") && !n6.getText().equals("") && !p6.getText().equals("")
                            && !n7.getText().equals("") && !p7.getText().equals("") && !n8.getText().equals("") && !p8.getText().equals("")
                            && n1.getText().charAt(0) != '.' && p1.getText().charAt(0) != '.' && n2.getText().charAt(0) != '.' && p2.getText().charAt(0) != '.'
                            && n3.getText().charAt(0) != '.' && p3.getText().charAt(0) != '.' && n4.getText().charAt(0) != '.' && p4.getText().charAt(0) != '.'
                            && n5.getText().charAt(0) != '.' && p5.getText().charAt(0) != '.' && n6.getText().charAt(0) != '.' && p6.getText().charAt(0) != '.'
                            && n7.getText().charAt(0) != '.' && p7.getText().charAt(0) != '.' && n8.getText().charAt(0) != '.' && p8.getText().charAt(0) != '.') {
                        this.notasT = new double[8];
                        notasT[0] = Double.parseDouble(n1.getText());
                        notasT[1] = Double.parseDouble(n2.getText());
                        notasT[2] = Double.parseDouble(n3.getText());
                        notasT[3] = Double.parseDouble(n4.getText());
                        notasT[4] = Double.parseDouble(n5.getText());
                        notasT[5] = Double.parseDouble(n6.getText());
                        notasT[6] = Double.parseDouble(n7.getText());
                        notasT[7] = Double.parseDouble(n8.getText());

                        this.pondT = new double[8];
                        pondT[0] = Double.parseDouble(p1.getText());
                        pondT[1] = Double.parseDouble(p2.getText());
                        pondT[2] = Double.parseDouble(p3.getText());
                        pondT[3] = Double.parseDouble(p4.getText());
                        pondT[4] = Double.parseDouble(p5.getText());
                        pondT[5] = Double.parseDouble(p6.getText());
                        pondT[6] = Double.parseDouble(p7.getText());
                        pondT[7] = Double.parseDouble(p8.getText());
                        calcularProm();
                    } else {
                        op.mensajeError();
                    }
                } else if (jButton2 == evt.getSource()) {
                    if (!n1.getText().equals("") && !p1.getText().equals("") && !n2.getText().equals("") && !p2.getText().equals("")
                            && !n3.getText().equals("") && !p3.getText().equals("") && !n4.getText().equals("") && !p4.getText().equals("")
                            && !n5.getText().equals("") && !p5.getText().equals("") && !n6.getText().equals("") && !p6.getText().equals("")
                            && !n7.getText().equals("") && !p7.getText().equals("") && !p8.getText().equals("")
                            && n1.getText().charAt(0) != '.' && p1.getText().charAt(0) != '.' && n2.getText().charAt(0) != '.' && p2.getText().charAt(0) != '.'
                            && n3.getText().charAt(0) != '.' && p3.getText().charAt(0) != '.' && n4.getText().charAt(0) != '.' && p4.getText().charAt(0) != '.'
                            && n5.getText().charAt(0) != '.' && p5.getText().charAt(0) != '.' && n6.getText().charAt(0) != '.' && p6.getText().charAt(0) != '.'
                            && n7.getText().charAt(0) != '.' && p7.getText().charAt(0) != '.' && p8.getText().charAt(0) != '.') {
                        this.notasT = new double[8];
                        notasT[0] = Double.parseDouble(n1.getText());
                        notasT[1] = Double.parseDouble(n2.getText());
                        notasT[2] = Double.parseDouble(n3.getText());
                        notasT[3] = Double.parseDouble(n4.getText());
                        notasT[4] = Double.parseDouble(n5.getText());
                        notasT[5] = Double.parseDouble(n6.getText());
                        notasT[6] = Double.parseDouble(n7.getText());
                        notasT[7] = 1;

                        this.pondT = new double[8];
                        pondT[0] = Double.parseDouble(p1.getText());
                        pondT[1] = Double.parseDouble(p2.getText());
                        pondT[2] = Double.parseDouble(p3.getText());
                        pondT[3] = Double.parseDouble(p4.getText());
                        pondT[4] = Double.parseDouble(p5.getText());
                        pondT[5] = Double.parseDouble(p6.getText());
                        pondT[6] = Double.parseDouble(p7.getText());
                        pondT[7] = Double.parseDouble(p8.getText());
                        calcularNotaFaltante();
                    } else {
                        op.mensajeError();
                    }
                }
                break;
            case 9:
                if (jButton1 == evt.getSource()) {
                    if (!n1.getText().equals("") && !p1.getText().equals("") && !n2.getText().equals("") && !p2.getText().equals("")
                            && !n3.getText().equals("") && !p3.getText().equals("") && !n4.getText().equals("") && !p4.getText().equals("")
                            && !n5.getText().equals("") && !p5.getText().equals("") && !n6.getText().equals("") && !p6.getText().equals("")
                            && !n7.getText().equals("") && !p7.getText().equals("") && !n8.getText().equals("") && !p8.getText().equals("")
                            && !n9.getText().equals("") && !p9.getText().equals("")
                            && n1.getText().charAt(0) != '.' && p1.getText().charAt(0) != '.' && n2.getText().charAt(0) != '.' && p2.getText().charAt(0) != '.'
                            && n3.getText().charAt(0) != '.' && p3.getText().charAt(0) != '.' && n4.getText().charAt(0) != '.' && p4.getText().charAt(0) != '.'
                            && n5.getText().charAt(0) != '.' && p5.getText().charAt(0) != '.' && n6.getText().charAt(0) != '.' && p6.getText().charAt(0) != '.'
                            && n7.getText().charAt(0) != '.' && p7.getText().charAt(0) != '.' && n8.getText().charAt(0) != '.' && p8.getText().charAt(0) != '.'
                            && n9.getText().charAt(0) != '.' && p9.getText().charAt(0) != '.') {
                        this.notasT = new double[9];
                        notasT[0] = Double.parseDouble(n1.getText());
                        notasT[1] = Double.parseDouble(n2.getText());
                        notasT[2] = Double.parseDouble(n3.getText());
                        notasT[3] = Double.parseDouble(n4.getText());
                        notasT[4] = Double.parseDouble(n5.getText());
                        notasT[5] = Double.parseDouble(n6.getText());
                        notasT[6] = Double.parseDouble(n7.getText());
                        notasT[7] = Double.parseDouble(n8.getText());
                        notasT[8] = Double.parseDouble(n9.getText());

                        this.pondT = new double[9];
                        pondT[0] = Double.parseDouble(p1.getText());
                        pondT[1] = Double.parseDouble(p2.getText());
                        pondT[2] = Double.parseDouble(p3.getText());
                        pondT[3] = Double.parseDouble(p4.getText());
                        pondT[4] = Double.parseDouble(p5.getText());
                        pondT[5] = Double.parseDouble(p6.getText());
                        pondT[6] = Double.parseDouble(p7.getText());
                        pondT[7] = Double.parseDouble(p8.getText());
                        pondT[8] = Double.parseDouble(p9.getText());
                        calcularProm();
                    } else {
                        op.mensajeError();
                    }
                } else if (jButton2 == evt.getSource()) {
                    if (!n1.getText().equals("") && !p1.getText().equals("") && !n2.getText().equals("") && !p2.getText().equals("")
                            && !n3.getText().equals("") && !p3.getText().equals("") && !n4.getText().equals("") && !p4.getText().equals("")
                            && !n5.getText().equals("") && !p5.getText().equals("") && !n6.getText().equals("") && !p6.getText().equals("")
                            && !n7.getText().equals("") && !p7.getText().equals("") && !n8.getText().equals("") && !p8.getText().equals("")
                            && !p9.getText().equals("")
                            && n1.getText().charAt(0) != '.' && p1.getText().charAt(0) != '.' && n2.getText().charAt(0) != '.' && p2.getText().charAt(0) != '.'
                            && n3.getText().charAt(0) != '.' && p3.getText().charAt(0) != '.' && n4.getText().charAt(0) != '.' && p4.getText().charAt(0) != '.'
                            && n5.getText().charAt(0) != '.' && p5.getText().charAt(0) != '.' && n6.getText().charAt(0) != '.' && p6.getText().charAt(0) != '.'
                            && n7.getText().charAt(0) != '.' && p7.getText().charAt(0) != '.' && n8.getText().charAt(0) != '.' && p8.getText().charAt(0) != '.' 
                            && p9.getText().charAt(0) != '.') {
                        this.notasT = new double[9];
                        notasT[0] = Double.parseDouble(n1.getText());
                        notasT[1] = Double.parseDouble(n2.getText());
                        notasT[2] = Double.parseDouble(n3.getText());
                        notasT[3] = Double.parseDouble(n4.getText());
                        notasT[4] = Double.parseDouble(n5.getText());
                        notasT[5] = Double.parseDouble(n6.getText());
                        notasT[6] = Double.parseDouble(n7.getText());
                        notasT[7] = Double.parseDouble(n8.getText());
                        notasT[8] = 1;

                        this.pondT = new double[9];
                        pondT[0] = Double.parseDouble(p1.getText());
                        pondT[1] = Double.parseDouble(p2.getText());
                        pondT[2] = Double.parseDouble(p3.getText());
                        pondT[3] = Double.parseDouble(p4.getText());
                        pondT[4] = Double.parseDouble(p5.getText());
                        pondT[5] = Double.parseDouble(p6.getText());
                        pondT[6] = Double.parseDouble(p7.getText());
                        pondT[7] = Double.parseDouble(p8.getText());
                        pondT[8] = Double.parseDouble(p9.getText());
                        calcularNotaFaltante();
                    } else {
                        op.mensajeError();
                    }
                }
                break;
                
        }
    }
    
    //instancia un objeto de la clase simple y calcula el promedio del ramo
    void calcularProm() {
        //Simple s = new Simple();
        if ((op.sumPond(this.pondT) <= 100 && op.sumPond(this.pondT) >= 99.96) && op.validarPond(this.pondT) && op.validarNota(this.notasT) == true) {
            double a = op.truncarNum(op.calcPromedioSimple(this.notasT, this.pondT));

            if (a >= 3.95) {
                prom.setForeground(Color.black);
                prom.setText(String.valueOf(a));
                jLabel10.setForeground(Color.yellow);
                jLabel10.setText("APROBRADO!!");
            }
            if (a <= 3.94) {
                prom.setForeground(Color.red);
                prom.setText(String.valueOf(a));
                jLabel10.setForeground(Color.red);
                jLabel10.setText("REPROBADO!!");
            }
        } else if (op.sumPond(this.pondT) != 100) {
            JOptionPane.showMessageDialog(null, "Ponderacion no suma 100",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (!op.validarNota(this.notasT)) {
            JOptionPane.showMessageDialog(null, "Ingresar nota menor a 7 y/o mayor a 0",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }else if (!op.validarPond(this.pondT)) {
            JOptionPane.showMessageDialog(null, "Ingresar ponderacion mayor a 0",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //instancia un objeto de la clase simple y calcula la nota faltante para el 4 o para examen
    void calcularNotaFaltante() {

        //Simple s = new Simple();
        if ((op.sumPond(this.pondT) <= 100 && op.sumPond(this.pondT) >= 99.96) && op.validarNota(this.notasT) && op.validarPond(this.pondT)&& this.notasT.length >= 2) {
         
            double a = op.truncarNum(op.calcNotaFaltante(notasT, pondT));
            double b = op.truncarNum(op.calcNotaPExamen(notasT, pondT));

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
                JOptionPane.showMessageDialog(null, "Con la nota minima (1.0) En la última evaluacion pasas es ramo",
                        "NOTA FALTANTE", JOptionPane.WARNING_MESSAGE);
            } else if (a > 1 && b <= 1) {
                JOptionPane.showMessageDialog(null, "Para aprobar la asignatura con un 4 necesitas un : |" + String.valueOf(a)
                        + "|, En la última evaluacion\n y \n con la nota minima (1.0) En la última evaluacion pudes dar examen",
                        "NOTA FALTANTE", JOptionPane.WARNING_MESSAGE);
            }
        } else if (op.sumPond(this.pondT) != 100) {
            JOptionPane.showMessageDialog(null, "Ponderacion no suma 100",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (!op.validarNota(this.notasT)) {
            JOptionPane.showMessageDialog(null, "Ingresar nota menor a 7 y/o mayor a 0",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (this.notasT.length < 2) {
            JOptionPane.showMessageDialog(null, "Cantidad de notas debe se superior a 1",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }else if (!op.validarPond(this.pondT)) {
            JOptionPane.showMessageDialog(null, "Ingresar ponderacion mayor a 0",
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
            java.util.logging.Logger.getLogger(interfazSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazSimple().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel Panel_Superior;
    private javax.swing.JLabel cantEv;
    private javax.swing.JButton home2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelHoras;
    private javax.swing.JLabel labelNivel;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField n3;
    private javax.swing.JTextField n4;
    private javax.swing.JTextField n5;
    private javax.swing.JTextField n6;
    private javax.swing.JTextField n7;
    private javax.swing.JTextField n8;
    private javax.swing.JTextField n9;
    private javax.swing.JLabel nombreAsign;
    private javax.swing.JTextField p1;
    private javax.swing.JTextField p2;
    private javax.swing.JTextField p3;
    private javax.swing.JTextField p4;
    private javax.swing.JTextField p5;
    private javax.swing.JTextField p6;
    private javax.swing.JTextField p7;
    private javax.swing.JTextField p8;
    private javax.swing.JTextField p9;
    private javax.swing.JTextField prom;
    private javax.swing.JLabel tipoAprob;
    // End of variables declaration//GEN-END:variables
}

package vista;

import controlador.EncriptaHash;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.UIManager;

public class GUI_Cliente extends javax.swing.JFrame {

    static BufferedReader entrada;
    static PrintWriter salida;
    static final String IPSERVER = "localhost";
    public  Hashtable tabla = new Hashtable<String, String>();
    public EncriptaHash encripta = new EncriptaHash();

    public GUI_Cliente() {
        this.setUndecorated(true);
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        encripta.crearHashTable(tabla);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txtLogo = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel11 = new javax.swing.JPanel();
        jPanelMensajes = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel12 = new javax.swing.JPanel();
        jpanelUsuariosConectados = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInputTexto = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        btnEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        txtLogo.setBackground(new java.awt.Color(255, 255, 255));
        txtLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo_tutoriasOnline.png"))); // NOI18N
        txtLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel9.add(txtLogo);

        jPanel4.add(jPanel9);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        btnClose.setBackground(new java.awt.Color(0, 51, 102));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        btnClose.setToolTipText("Cerrar programa");
        btnClose.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exitSelected.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel8.add(btnClose);

        jPanel4.add(jPanel8);

        jPanel1.add(jPanel4);

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel7.setLayout(new java.awt.CardLayout());

        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane3.setBackground(new java.awt.Color(0, 51, 102));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mensajes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setLayout(new java.awt.CardLayout());

        jPanelMensajes.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMensajes.setLayout(new javax.swing.BoxLayout(jPanelMensajes, javax.swing.BoxLayout.Y_AXIS));
        jPanel11.add(jPanelMensajes, "card2");

        jScrollPane3.setViewportView(jPanel11);

        jPanel10.add(jScrollPane3);

        jScrollPane4.setBackground(new java.awt.Color(0, 51, 102));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuarios conectados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setLayout(new java.awt.CardLayout());

        jpanelUsuariosConectados.setBackground(new java.awt.Color(153, 0, 51));
        jpanelUsuariosConectados.setLayout(new javax.swing.BoxLayout(jpanelUsuariosConectados, javax.swing.BoxLayout.Y_AXIS));
        jPanel12.add(jpanelUsuariosConectados, "card2");

        jScrollPane4.setViewportView(jPanel12);

        jPanel10.add(jScrollPane4);

        jPanel7.add(jPanel10, "card3");

        jPanel1.add(jPanel7);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        txtInputTexto.setColumns(20);
        txtInputTexto.setRows(5);
        txtInputTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInputTextoKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtInputTexto);

        jPanel6.add(jScrollPane2);

        jPanel2.add(jPanel6);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridLayout(1, 1));

        btnEnviar.setBackground(new java.awt.Color(0, 51, 102));
        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/send.png"))); // NOI18N
        btnEnviar.setToolTipText("Enviar mensaje");
        btnEnviar.setOpaque(false);
        btnEnviar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sendSelected.png"))); // NOI18N
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel5.add(btnEnviar);

        jPanel2.add(jPanel5);

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?") == 0) {
            this.dispose();
            System.exit(0);
        }

    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        enviarTexto();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtInputTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputTextoKeyTyped
        char c = evt.getKeyChar();

        if (c == KeyEvent.VK_ENTER) {
            txtInputTexto.setText(txtInputTexto.getText().substring(0, txtInputTexto.getText().length() - 1));
            enviarTexto();
        }
    }//GEN-LAST:event_txtInputTextoKeyTyped

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUI_Cliente().setVisible(true);
                    Socket socket = new Socket(IPSERVER, 9001);
                    entrada = new BufferedReader(new InputStreamReader(
                            socket.getInputStream()));
                    salida = new PrintWriter(socket.getOutputStream(), true);

                    while (true) {
                        String line = entrada.readLine();
                        if (line.startsWith("INGRESARNOMBRE")) {
                            salida.println(obtenerName());
                            break;
                        }
                    }
                    new Thread() {
                        public void run() {
                            while (true) {
                                try {
                                    String line = entrada.readLine();
                                    if (line.startsWith("MESSAGE")) {
                                        StringTokenizer st = new StringTokenizer(line);
                                        st.nextToken();
                                        String nombreUsuario = st.nextToken();
                                        VentanaMensaje mensaje = new VentanaMensaje(nombreUsuario, line.substring(8 + nombreUsuario.length()),false);
                                        mensaje.setSize(jPanelMensajes.getWidth(), mensaje.getHeight());
                                        jPanelMensajes.add(mensaje);
                                        jPanelMensajes.revalidate();
                                        jPanelMensajes.repaint();
                                    } else {
                                        if (line.startsWith("ONLINES")) {
                                            jpanelUsuariosConectados.removeAll();
                                            StringTokenizer st = new StringTokenizer(line);
                                            st.nextToken();
                                            
                                            while (st.hasMoreTokens()) {
                                               jpanelUsuariosConectados.add(new UsuarioConectado(st.nextToken()));
                                                
                                            }
                                            
                                        }else{
                                            if (line.startsWith("OUT")){
                                                StringTokenizer st = new StringTokenizer(line);
                                                st.nextToken();
                                                String nombreUsuario = st.nextToken();
                                                VentanaMensaje mensaje = new VentanaMensaje(nombreUsuario, line.substring(4 + nombreUsuario.length()),true);
                                                mensaje.setSize(jPanelMensajes.getWidth(), mensaje.getHeight());
                                                jPanelMensajes.add(mensaje);
                                                jPanelMensajes.revalidate();
                                                jPanelMensajes.repaint();
                                            }else{
                                                if (line.startsWith("NOMBREACEPTADO")){
                                                StringTokenizer st = new StringTokenizer(line);
                                                st.nextToken();
                                                String nombreUsuario = st.nextToken();
                                                VentanaMensaje mensaje = new VentanaMensaje(nombreUsuario, line.substring(15 + nombreUsuario.length()),true);
                                                mensaje.setSize(jPanelMensajes.getWidth(), mensaje.getHeight());
                                                jPanelMensajes.add(mensaje);
                                                jPanelMensajes.revalidate();
                                                jPanelMensajes.repaint();
                                                }
                                            }
                                        }
                                    }
                                } catch (IOException ex) {
                                    Logger.getLogger(GUI_Cliente.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }

                        }
                    }.start();

                } catch (IOException ex) {
                    Logger.getLogger(GUI_Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private static String obtenerName() {
        return JOptionPane.showInputDialog(null, "Nombre que se mostrará a los demás usuarios", "Elegir un nombre de usuario:", JOptionPane.PLAIN_MESSAGE);
    }

    public void enviarTexto() {
        if (txtInputTexto.getText().trim().isEmpty()) {
            txtInputTexto.setText("");
        } else {
            salida.println(encripta.encriptar(txtInputTexto.getText()));
            txtInputTexto.setText("");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private static javax.swing.JPanel jPanelMensajes;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private static javax.swing.JPanel jpanelUsuariosConectados;
    private static javax.swing.JTextArea txtInputTexto;
    private javax.swing.JLabel txtLogo;
    // End of variables declaration//GEN-END:variables
}

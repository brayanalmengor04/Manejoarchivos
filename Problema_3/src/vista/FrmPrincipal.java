
package vista;

import Dato.Usuario;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.table.DefaultTableModel;

public class FrmPrincipal extends javax.swing.JFrame {
    
    ArrayList<String> elementos = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();
    private static  File archivo = new File("archivo.txt");
    Usuario usuario;
    
      public FrmPrincipal() {
        initComponents();   
        JOptionPane.showMessageDialog(null, "Dato :Pasar encima de los botones! Verfica campos a llenar.");
        eventsActionListener();
        componentsDefaul();
        this.setLocationRelativeTo(null);
    }
     
    public void eventsActionListener(){
        btnInsert.addMouseListener(new MouseAdapter(){ 
           Color background = btnInsert.getBackground();
            @Override
            public void mouseEntered(MouseEvent e) {  
                btnInsert.setBackground(Color.LIGHT_GRAY); 
                btnInsert.setForeground(background); 
                txtfldUser.setBackground(Color.LIGHT_GRAY); 
                txtfldPassword.setBackground(Color.LIGHT_GRAY);
                txtfldName.setBackground(Color.LIGHT_GRAY);
                txtfldGmail.setBackground(Color.LIGHT_GRAY); 
                txtfldState.setBackground(Color.LIGHT_GRAY); 
            }
            @Override 
            public void mouseExited(MouseEvent e){ 
                btnInsert.setBackground(background);
                btnInsert.setForeground(Color.WHITE); 
                txtfldUser.setBackground(background); 
                txtfldPassword.setBackground(background);
                txtfldName.setBackground(background);
                txtfldGmail.setBackground(background); 
                txtfldState.setBackground(background);
            } 
          
        });
        
        btnMostrar.addMouseListener(new MouseAdapter(){
            Color background = btnMostrar.getBackground();
            @Override 
            public void mouseEntered(MouseEvent e){
                btnMostrar.setBackground(Color.LIGHT_GRAY); 
                btnMostrar.setForeground(background); 
            }
            @Override  
            public void mouseExited(MouseEvent e){
                btnMostrar.setBackground(background); 
                btnMostrar.setForeground(Color.WHITE); 
            }
        });
        
        btnBuscar.addMouseListener(new MouseAdapter(){ 
           Color background =btnBuscar.getBackground();
            @Override
            public void mouseEntered(MouseEvent e) {  
                btnBuscar.setBackground(Color.LIGHT_GRAY); 
                btnBuscar.setForeground(background); 
                txtfldUser.setBackground(Color.LIGHT_GRAY); 
            }
            @Override 
            public void mouseExited(MouseEvent e){
                btnBuscar.setBackground(background); 
                btnBuscar.setForeground(Color.WHITE); 
                txtfldUser.setBackground(background); 
            } 
          
        }); 
        
        btnModificar.addMouseListener(new MouseAdapter(){ 
           Color background = btnModificar.getBackground();
            @Override
            public void mouseEntered(MouseEvent e) { 
                btnModificar.setBackground(Color.LIGHT_GRAY); 
                btnModificar.setForeground(background); 
                txtfldUser.setBackground(Color.LIGHT_GRAY);  
                txtUserMOD.setBackground(Color.LIGHT_GRAY);
                txtfldPassword.setBackground(Color.LIGHT_GRAY);
                txtfldName.setBackground(Color.LIGHT_GRAY);
                txtfldGmail.setBackground(Color.LIGHT_GRAY); 
                txtfldState.setBackground(Color.LIGHT_GRAY);
            }
            @Override 
            public void mouseExited(MouseEvent e){
                btnModificar.setBackground(background); 
                btnModificar.setForeground(Color.WHITE); 
                txtfldUser.setBackground(background); 
                txtUserMOD.setBackground(background);
                txtfldPassword.setBackground(background);
                txtfldName.setBackground(background);
                txtfldGmail.setBackground(background); 
                txtfldState.setBackground(background);
            } 
          
        });
        
        btnDelete.addMouseListener(new MouseAdapter(){ 
           Color background = btnDelete.getBackground();
            @Override
            public void mouseEntered(MouseEvent e) {  
                btnDelete.setBackground(Color.LIGHT_GRAY); 
                btnDelete.setForeground(background); 
                txtUserMOD.setBackground(Color.LIGHT_GRAY);
            }
            @Override 
            public void mouseExited(MouseEvent e){
                btnDelete.setBackground(background); 
                btnDelete.setForeground(Color.WHITE); 
                txtUserMOD.setBackground(background);
            } 
          
        });
        
        btnValidar.addMouseListener(new MouseAdapter(){ 
           Color background = btnValidar.getBackground();
            @Override
            public void mouseEntered(MouseEvent e) {  
                btnValidar.setBackground(Color.LIGHT_GRAY); 
                btnValidar.setForeground(background); 
                txtfldUser.setBackground(Color.LIGHT_GRAY); 
                txtfldPassword.setBackground(Color.LIGHT_GRAY);
            }
            @Override 
            public void mouseExited(MouseEvent e){
                btnValidar.setBackground(background); 
                btnValidar.setForeground(Color.WHITE); 
                txtfldUser.setBackground(background);
                txtfldPassword.setBackground(background);
            } 
          
        });
        
        
    }
    public void componentsDefaul (){
        tabbedpane.setEnabledAt(1, false);
    }
    public void resertComponentsInsert(){
        txtUserMOD.setText("");
        txtfldPassword.setText("");
        txtfldName.setText("");
        txtfldGmail.setText("");
        txtfldState.setText("");
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
        tabbedpane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUserMOD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtfldName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtfldGmail = new javax.swing.JTextField();
        txtfldState = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnValidar = new javax.swing.JButton();
        txtfldPassword = new javax.swing.JPasswordField();
        btnModificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtfldUser = new javax.swing.JTextField();
        panelMostrar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulacion Base de Datos");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        tabbedpane.setBackground(new java.awt.Color(48, 47, 47));
        tabbedpane.setForeground(new java.awt.Color(255, 255, 255));
        tabbedpane.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        tabbedpane.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tabbedpane.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");

        txtUserMOD.setBackground(new java.awt.Color(62, 62, 62));
        txtUserMOD.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtUserMOD.setForeground(new java.awt.Color(204, 204, 204));
        txtUserMOD.setBorder(null);
        txtUserMOD.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUserMOD.setOpaque(true);
        txtUserMOD.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtUserMOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserMODActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        txtfldName.setBackground(new java.awt.Color(62, 62, 62));
        txtfldName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtfldName.setForeground(new java.awt.Color(255, 255, 255));
        txtfldName.setBorder(null);
        txtfldName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtfldName.setOpaque(true);
        txtfldName.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Correo");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado");

        txtfldGmail.setBackground(new java.awt.Color(62, 62, 62));
        txtfldGmail.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtfldGmail.setForeground(new java.awt.Color(255, 255, 255));
        txtfldGmail.setBorder(null);
        txtfldGmail.setCaretColor(new java.awt.Color(255, 255, 255));
        txtfldGmail.setOpaque(true);
        txtfldGmail.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        txtfldState.setBackground(new java.awt.Color(62, 62, 62));
        txtfldState.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtfldState.setForeground(new java.awt.Color(255, 255, 255));
        txtfldState.setBorder(null);
        txtfldState.setCaretColor(new java.awt.Color(255, 255, 255));
        txtfldState.setOpaque(true);
        txtfldState.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        btnInsert.setBackground(new java.awt.Color(62, 62, 62));
        btnInsert.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("Insertar");
        btnInsert.setToolTipText("Llene todos los campos Excepto (Usuario MD)");
        btnInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsert.setOpaque(true);
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(62, 62, 62));
        btnBuscar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("Llene el campo (Usuario)");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(62, 62, 62));
        btnMostrar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("Mostrar");
        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrar.setOpaque(true);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(62, 62, 62));
        btnDelete.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Eliminar");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnValidar.setBackground(new java.awt.Color(62, 62, 62));
        btnValidar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnValidar.setForeground(new java.awt.Color(255, 255, 255));
        btnValidar.setText("Validar");
        btnValidar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        txtfldPassword.setBackground(new java.awt.Color(62, 62, 62));
        txtfldPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtfldPassword.setBorder(null);
        txtfldPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        txtfldPassword.setOpaque(true);
        txtfldPassword.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        btnModificar.setBackground(new java.awt.Color(62, 62, 62));
        btnModificar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setToolTipText("Ingrese el Campo (md, usuario,pass,nombre,correo y estado)");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Usuario MD");

        txtfldUser.setBackground(new java.awt.Color(62, 62, 62));
        txtfldUser.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtfldUser.setForeground(new java.awt.Color(255, 255, 255));
        txtfldUser.setBorder(null);
        txtfldUser.setCaretColor(new java.awt.Color(255, 255, 255));
        txtfldUser.setOpaque(true);
        txtfldUser.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtfldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfldState, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfldGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfldName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtfldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserMOD, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnValidar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtfldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtUserMOD, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtfldName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtfldGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtfldState, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedpane.addTab("Registro Usuario", jPanel2);

        panelMostrar.setBackground(new java.awt.Color(43, 41, 41));
        panelMostrar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelMostrar.setForeground(new java.awt.Color(255, 255, 255));
        panelMostrar.setEnabled(false);

        tablaUsuario.setBackground(new java.awt.Color(204, 204, 204));
        tablaUsuario.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaUsuario);

        javax.swing.GroupLayout panelMostrarLayout = new javax.swing.GroupLayout(panelMostrar);
        panelMostrar.setLayout(panelMostrarLayout);
        panelMostrarLayout.setHorizontalGroup(
            panelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMostrarLayout.setVerticalGroup(
            panelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        tabbedpane.addTab("Mostrar Usuario", panelMostrar);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Simulacion Base Datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(tabbedpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedpane, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here: 
        tabbedpane.setEnabledAt(1, true);
        usuario = new Usuario();
        modelo = usuario.buscarUsuario(archivo, txtfldUser.getText());
        tablaUsuario.setModel(modelo);
        tabbedpane.setSelectedIndex(1); 
        resertComponentsInsert();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:    
        tabbedpane.setEnabledAt(1, true);
       
        usuario = new Usuario();
        modelo = usuario.mostrarUsuarios(archivo); 
        tablaUsuario.setModel(modelo);
        tabbedpane.setSelectedIndex(1); 
        resertComponentsInsert();
    
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here: 
        
        char[] password = txtfldPassword.getPassword(); 
         
        try {
            if (!txtfldUser.getText().equals("") && !String.valueOf(txtfldPassword.getPassword()).equals("") 
                    &&!txtfldName.getText().equals("") && !txtfldGmail.getText().equals("") &&
                    !txtfldState.getText().equals("")
                    ) {
                     usuario = new Usuario(txtfldUser.getText(),String.valueOf(password)
                    ,txtfldName.getText(),txtfldGmail.getText(),Integer.parseInt(txtfldState.getText()));
            
                                   
                    if(usuario.insertarUsuario(archivo)) JOptionPane.showMessageDialog(null, "Se ha Ingresado un Usuario!");
                     else JOptionPane.showMessageDialog(null,"No se ha Ingresado el Usuario!");
           
            }
            else JOptionPane.showMessageDialog(null, "Llene los campos Vacios");
    
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        resertComponentsInsert();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here: 
        
        char[] password = txtfldPassword.getPassword();
        try { 
             
            
        if (!txtfldUser.getText().equals("") && !String.valueOf(txtfldPassword.getPassword()).equals("") 
                    &&!txtfldName.getText().equals("") && !txtfldGmail.getText().equals("") &&
                    !txtfldState.getText().equals("")&& !txtUserMOD.getText().equals("")
                    ) {
            
            usuario = new Usuario(txtfldUser.getText(),String.valueOf(password)
                    ,txtfldName.getText(),txtfldGmail.getText(),Integer.parseInt(txtfldState.getText()));
           
            FileWriter escribir = new FileWriter(archivo,true); 
            BufferedWriter vfEscribir = new BufferedWriter(escribir);
            RandomAccessFile accesfile = new RandomAccessFile(archivo,"rw");  
            elementos =usuario.modificarUsuario(archivo, txtUserMOD.getText(), usuario);  
            
            accesfile.setLength(0);  
            
            for (String elemento : elementos) { 
                System.out.println(elemento); 
                  vfEscribir.write(elemento); 
                  vfEscribir.newLine();
            }   
            
            accesfile.close();
            vfEscribir.close(); 
            escribir.close();
           
         }
        else JOptionPane.showMessageDialog(null, "Llene los campos Vacios");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtUserMODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserMODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserMODActionPerformed

    private void txtfldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldUserActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here: 
        try {
            if(!txtUserMOD.getText().equals("")){
                 
            FileWriter escribir = new FileWriter(archivo,true); 
            BufferedWriter vfEscribir = new BufferedWriter(escribir);
            RandomAccessFile accesfile = new RandomAccessFile(archivo,"rw");  
            elementos =usuario.eliminarUsuario(archivo, txtUserMOD.getText());  
            
            accesfile.setLength(0);  
            
            for (String elemento : elementos) { 
                System.out.println(elemento); 
                  vfEscribir.write(elemento); 
                  vfEscribir.newLine();
            }   
            accesfile.close();
            vfEscribir.close(); 
            escribir.close();
                
            }
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null,"Ha ocurrido un Error!"+e.getMessage());
        } 
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        // TODO add your handling code here:
        tabbedpane.setEnabledAt(1, true);
        usuario = new Usuario();
        modelo = usuario.validarUsuario(archivo, txtfldUser.getText(), String.valueOf(txtfldPassword.getPassword()));
        tablaUsuario.setModel(modelo);
        tabbedpane.setSelectedIndex(1); 
        
    }//GEN-LAST:event_btnValidarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new MetalLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnValidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMostrar;
    private javax.swing.JTabbedPane tabbedpane;
    private javax.swing.JTable tablaUsuario;
    private javax.swing.JTextField txtUserMOD;
    private javax.swing.JTextField txtfldGmail;
    private javax.swing.JTextField txtfldName;
    private javax.swing.JPasswordField txtfldPassword;
    private javax.swing.JTextField txtfldState;
    private javax.swing.JTextField txtfldUser;
    // End of variables declaration//GEN-END:variables
}

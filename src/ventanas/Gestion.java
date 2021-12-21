/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import clases.Conexiones;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Andres
 */
public class Gestion extends javax.swing.JFrame {

    //Creamos las variables de interfaz
    public static String user = "";
    String pass = "";

    public Gestion() {
        initComponents();

        setSize(400, 550);
        setResizable(false);
        setTitle("Configuracion");
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //Walpaper dos
        ImageIcon wallpaper = new ImageIcon("src/imagenes/wallpaperPrincipal.png");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

        //Logo
        ImageIcon wallpaper_logo = new ImageIcon("src/imagenes/configuracion.png");
        Icon icono_logo = new ImageIcon(wallpaper_logo.getImage().getScaledInstance(Jlabel_logo.getWidth(), Jlabel_logo.getHeight(), Image.SCALE_DEFAULT));
        Jlabel_logo.setIcon(icono_logo);
        this.repaint();

    }
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/quiz.png"));
        return retValue;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_user = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        Jlabel_logo = new javax.swing.JLabel();
        jButon_Acceder = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_user.setBackground(new java.awt.Color(153, 51, 255));
        txt_user.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_user.setForeground(new java.awt.Color(255, 255, 255));
        txt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_user.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 330, 210, -1));

        txt_password.setBackground(new java.awt.Color(153, 51, 255));
        txt_password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 370, 210, -1));
        getContentPane().add(Jlabel_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 220, 190));

        jButon_Acceder.setBackground(new java.awt.Color(153, 51, 255));
        jButon_Acceder.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButon_Acceder.setForeground(new java.awt.Color(255, 255, 255));
        jButon_Acceder.setText("Acceder");
        jButon_Acceder.setBorder(null);
        jButon_Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButon_AccederActionPerformed(evt);
            }
        });
        getContentPane().add(jButon_Acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 420, 210, 35));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void jButon_AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButon_AccederActionPerformed
        //Programacion de acceder

        //Recuperamos los datos
        user = txt_user.getText().trim();
        pass = txt_password.getText().trim();

        //Validacion 
        if (!user.equals("") || !pass.equals("")) {

            try {
                Connection conec = Conexiones.connect();
                PreparedStatement pst = conec.prepareStatement(
                        "select tipo_nivel, estatus from usuarios where username ='" + user
                        + "' and password = '" + pass + "'");
                
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()) {
                    String tipo_nivel = rs.getString("tipo_nivel");
                    String estatus = rs.getString("estatus");
                    
                    if (tipo_nivel.equalsIgnoreCase("Administrador") && estatus.equalsIgnoreCase("Activo")) {
                        dispose();
                        new Administrador().setVisible(true);
                    }
                    
                } else{
                    JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos.");
                    txt_user.setText("");
                    txt_password.setText("");
                }

            } catch (Exception e) {
                System.err.println("Error en Acceder" + e);
                JOptionPane.showMessageDialog(null, "!!Error al iniciar sesión!!, contacte al administrador");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        }
    }//GEN-LAST:event_jButon_AccederActionPerformed

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
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel_logo;
    private javax.swing.JButton jButon_Acceder;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}

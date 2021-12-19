/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
//importamos las librerias para la db
import java.sql.*;
import clases.Conexiones;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class RegistrarPreguntas extends javax.swing.JFrame {
    
    String user = "";
    
    public RegistrarPreguntas() {
        user = Gestion.user;
        initComponents();
        
        setSize(630, 380);
        setResizable(false);
        setTitle("Preguntas Y Respuestas. sesion de " + user);
        setLocationRelativeTo(null);
        
        ImageIcon wallpaper = new ImageIcon("src/imagenes/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmb_categoria = new javax.swing.JComboBox<>();
        cmb_ronda = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_Pregunta = new javax.swing.JTextField();
        txt_respuestaVerdadera = new javax.swing.JTextField();
        txt_respuestaFalsaUno = new javax.swing.JTextField();
        txt_respuestaFalsaDos = new javax.swing.JTextField();
        txt_respuestaFalsaTres = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pregunta:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Respuesta correcta:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Respuesta falsa:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Respuesta falsa:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Respuesta falsa:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        cmb_categoria.setForeground(new java.awt.Color(255, 255, 255));
        cmb_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Historia", "Ciencia", "Entretenimiento", "Geografia", "Deportes" }));
        getContentPane().add(cmb_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 150, 30));

        cmb_ronda.setForeground(new java.awt.Color(255, 255, 255));
        cmb_ronda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ronda 1", "Ronda 2", "Ronda 3", "Ronda 4", "Ronda 5" }));
        getContentPane().add(cmb_ronda, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 150, 30));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingresar pregunta");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 120, 70));

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("jButton2");
        jButton2.setBorder(null);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 120, 70));

        txt_Pregunta.setBackground(new java.awt.Color(153, 51, 255));
        txt_Pregunta.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txt_Pregunta.setForeground(new java.awt.Color(255, 255, 255));
        txt_Pregunta.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_Pregunta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_Pregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PreguntaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 300, 50));

        txt_respuestaVerdadera.setBackground(new java.awt.Color(153, 51, 255));
        txt_respuestaVerdadera.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txt_respuestaVerdadera.setForeground(new java.awt.Color(255, 255, 255));
        txt_respuestaVerdadera.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_respuestaVerdadera.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_respuestaVerdadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 210, -1));

        txt_respuestaFalsaUno.setBackground(new java.awt.Color(153, 51, 255));
        txt_respuestaFalsaUno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txt_respuestaFalsaUno.setForeground(new java.awt.Color(255, 255, 255));
        txt_respuestaFalsaUno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_respuestaFalsaUno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_respuestaFalsaUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 210, -1));

        txt_respuestaFalsaDos.setBackground(new java.awt.Color(153, 51, 255));
        txt_respuestaFalsaDos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txt_respuestaFalsaDos.setForeground(new java.awt.Color(255, 255, 255));
        txt_respuestaFalsaDos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_respuestaFalsaDos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_respuestaFalsaDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 210, -1));

        txt_respuestaFalsaTres.setBackground(new java.awt.Color(153, 51, 255));
        txt_respuestaFalsaTres.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txt_respuestaFalsaTres.setForeground(new java.awt.Color(255, 255, 255));
        txt_respuestaFalsaTres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_respuestaFalsaTres.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_respuestaFalsaTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 210, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Categoria:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ronda:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_PreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PreguntaActionPerformed

    //Vamos a ingresar las preguntas a la base de datos
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Necesitamos las variables donde se van a guardar los datos necesarios.

        int categoria_cmb, ronda_cmb, bandera = 0;
        String pregunta, respuestaVerdadera, respuestaFalsaUno, respuestaFalsaDos, respuestaFalsaTres;
        String categoria_string = "", ronda_string = "";
        
        pregunta = txt_Pregunta.getText().trim();
        respuestaVerdadera = txt_respuestaVerdadera.getText().trim();
        respuestaFalsaUno = txt_respuestaFalsaUno.getText().trim();
        respuestaFalsaDos = txt_respuestaFalsaDos.getText().trim();
        respuestaFalsaTres = txt_respuestaFalsaTres.getText().trim();
        categoria_cmb = cmb_categoria.getSelectedIndex() + 1;
        ronda_cmb = cmb_ronda.getSelectedIndex() + 1;

        //Hacemos la validacion de datos
        if (pregunta.equals("")) {
            txt_Pregunta.setBackground(Color.red);
            bandera++;
        }
        if (respuestaVerdadera.equals("")) {
            txt_respuestaVerdadera.setBackground(Color.red);
            bandera++;
        }
        if (respuestaFalsaUno.equals("")) {
            txt_respuestaFalsaUno.setBackground(Color.red);
            bandera++;
        }
        if (respuestaFalsaDos.equals("")) {
            txt_respuestaFalsaDos.setBackground(Color.red);
            bandera++;
        }
        if (respuestaFalsaTres.equals("")) {
            txt_respuestaFalsaTres.setBackground(Color.red);
            bandera++;
        }

        //validamos los CMB categoria
        if (categoria_cmb == 1) {
            categoria_string = "Historia";
        } else if (categoria_cmb == 2) {
            categoria_string = "Ciencia";
        } else if (categoria_cmb == 3) {
            categoria_string = "Entretenimiento";
        } else if (categoria_cmb == 4) {
            categoria_string = "Geografia";
        } else if (categoria_cmb == 5) {
            categoria_string = "Deportes";
        }

        //Validamos  los CMB ronda
        if (ronda_cmb == 1) {
            ronda_string = "Ronda 1";
        } else if (ronda_cmb == 2) {
            ronda_string = "Ronda 2";
        } else if (ronda_cmb == 3) {
            ronda_string = "Ronda 3";
        } else if (ronda_cmb == 4) {
            ronda_string = "Ronda 4";
        } else if (ronda_cmb == 5) {
            ronda_string = "Ronda 5";
        }
        
        if (bandera == 0) {
            try {
                //Creo la connection con la clase conectar
                Connection conec = Conexiones.connect();
                PreparedStatement pst = conec.prepareStatement(
                        "insert into preguntas values(?,?,?,?,?,?,?,?)");
                
                pst.setInt(1, 0);
                pst.setString(2, pregunta);
                pst.setString(3, respuestaVerdadera);
                pst.setString(4, respuestaFalsaUno);
                pst.setString(5, respuestaFalsaDos);
                pst.setString(6, respuestaFalsaTres);
                pst.setString(7, categoria_string);
                pst.setString(8, ronda_string);
                
                pst.executeUpdate();
                conec.close();
                
                clean();
                
            } catch (SQLException e) {
                System.err.println("Error en registrar pregunta.");
                JOptionPane.showMessageDialog(null,  "<html> <p style = \"color:red \">  ¡¡ERRROR!! Contacte al administrador. </p> </html>", "Notificacion",
                                 JOptionPane.INFORMATION_MESSAGE);
            }
        } else{
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
                    
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPreguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_categoria;
    private javax.swing.JComboBox<String> cmb_ronda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_Pregunta;
    private javax.swing.JTextField txt_respuestaFalsaDos;
    private javax.swing.JTextField txt_respuestaFalsaTres;
    private javax.swing.JTextField txt_respuestaFalsaUno;
    private javax.swing.JTextField txt_respuestaVerdadera;
    // End of variables declaration//GEN-END:variables

    //Creamos una escoba:)
    public void clean(){
        txt_Pregunta.setText("");
        txt_respuestaFalsaDos.setText("");
        txt_respuestaVerdadera.setText("");
        txt_respuestaFalsaTres.setText("");
        txt_respuestaFalsaUno.setText("");
        cmb_categoria.setSelectedIndex(0);
        cmb_ronda.setSelectedIndex(0);
        
    }
}

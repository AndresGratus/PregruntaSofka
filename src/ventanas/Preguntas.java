/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.*;
import clases.Conexiones;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Preguntas extends javax.swing.JFrame {

    String ronda;
    int ID = 0;
    boolean paso;
    int aux = 0;
    int bandera = 1;

    /**
     * Creates new form Preguntas
     */
//    private PreguntaDate RondaUno[];
//    private PreguntaDate RondaDos[];
//    private PreguntaDate RondaTres[];
//    private PreguntaDate RondaCuatro[];
//    private PreguntaDate RondaCinco[];
    //Creamos una variable auxiliar para comporbar los jradibu
    public Preguntas() {

//        RondaUno = new PreguntaDate[1];
//        RondaDos = new PreguntaDate[5];
//        RondaTres = new PreguntaDate[5];
//        RondaCuatro = new PreguntaDate[5];
//        RondaCinco = new PreguntaDate[5];
        initComponents();

        setSize(400, 400);
        setResizable(false);
        setTitle("Preguntas y Respuestas");
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/imagenes/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_selecion = new javax.swing.ButtonGroup();
        jLabel_Nombre6 = new javax.swing.JLabel();
        txt_pregunta = new javax.swing.JTextField();
        Boton_juego = new javax.swing.JButton();
        jRadioButton_uno = new javax.swing.JRadioButton();
        jRadioButton_dos = new javax.swing.JRadioButton();
        jRadioButton_tres = new javax.swing.JRadioButton();
        jRadioButton_cuatro = new javax.swing.JRadioButton();
        boton_comprobar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Nombre6.setBackground(new java.awt.Color(153, 51, 255));
        jLabel_Nombre6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Nombre6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Nombre6.setText("Pregunta.");
        getContentPane().add(jLabel_Nombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 200, 30));

        txt_pregunta.setBackground(new java.awt.Color(0, 0, 255));
        txt_pregunta.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_pregunta.setForeground(new java.awt.Color(255, 255, 255));
        txt_pregunta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_pregunta.setText("¿Listo?, Elige una opcion y Da en Jugar ");
        txt_pregunta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_pregunta.setEnabled(false);
        txt_pregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_preguntaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 380, 60));

        Boton_juego.setText("Jugar");
        Boton_juego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_juegoActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 90, 60));

        jRadioButton_uno.setBackground(new java.awt.Color(0, 51, 255));
        grupo_selecion.add(jRadioButton_uno);
        jRadioButton_uno.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_unoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton_uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jRadioButton_dos.setBackground(new java.awt.Color(0, 51, 255));
        grupo_selecion.add(jRadioButton_dos);
        jRadioButton_dos.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jRadioButton_dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jRadioButton_tres.setBackground(new java.awt.Color(0, 51, 255));
        grupo_selecion.add(jRadioButton_tres);
        jRadioButton_tres.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jRadioButton_tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jRadioButton_cuatro.setBackground(new java.awt.Color(0, 51, 255));
        grupo_selecion.add(jRadioButton_cuatro);
        jRadioButton_cuatro.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jRadioButton_cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        boton_comprobar.setText("comprobar");
        boton_comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_comprobarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_comprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 100, 60));

        jButton3.setText("Surrender :(");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 100, 60));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_preguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_preguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_preguntaActionPerformed

    private void Boton_juegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_juegoActionPerformed

        if (ID == 1) {
            Boton_juego.setText("Next");
        }
        //Validamos el ID
        if (ID >= 0 && ID <= 5) {
            ronda = "Ronda 1";
        } else if (ID >= 6 && ID <= 10) {
            ronda = "Ronda 2";
        } else if (ID >= 11 && ID <= 15) {
            ronda = "Ronda 3";
        } else if (ID >= 16 && ID <= 20) {
            ronda = "Ronda 4";
        } else if (ID >= 21 && ID <= 25) {
            ronda = "Ronda 5";
        }

        ID++;
        try {
            Connection cn = Conexiones.connect();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from preguntas where ronda = '" + ronda
                    + "' and id_pregunta = '" + ID + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                ID = rs.getInt("id_pregunta");

                txt_pregunta.setText(rs.getString("pregunta"));
                int num = (int) (Math.random() * (7));

                if (num == 0) {
                    jRadioButton_uno.setText(rs.getString("op_verdadera"));
                    jRadioButton_dos.setText(rs.getString("op_falsa_uno"));
                    jRadioButton_tres.setText(rs.getString("op_falsa_dos"));
                    jRadioButton_cuatro.setText(rs.getString("op_falsa_tres"));
                } else if (num == 1) {
                    jRadioButton_uno.setText(rs.getString("op_falsa_uno"));
                    jRadioButton_dos.setText(rs.getString("op_verdadera"));
                    jRadioButton_tres.setText(rs.getString("op_falsa_dos"));
                    jRadioButton_cuatro.setText(rs.getString("op_falsa_tres"));
                } else if (num == 2) {
                    jRadioButton_uno.setText(rs.getString("op_falsa_uno"));
                    jRadioButton_dos.setText(rs.getString("op_falsa_dos"));
                    jRadioButton_tres.setText(rs.getString("op_verdadera"));
                    jRadioButton_cuatro.setText(rs.getString("op_falsa_tres"));
                } else if (num == 3) {
                    jRadioButton_uno.setText(rs.getString("op_falsa_uno"));
                    jRadioButton_dos.setText(rs.getString("op_falsa_dos"));
                    jRadioButton_tres.setText(rs.getString("op_falsa_tres"));
                    jRadioButton_cuatro.setText(rs.getString("op_verdadera"));
                } else if (num == 4) {
                    jRadioButton_uno.setText(rs.getString("op_falsa_uno"));
                    jRadioButton_dos.setText(rs.getString("op_verdadera"));
                    jRadioButton_tres.setText(rs.getString("op_falsa_tres"));
                    jRadioButton_cuatro.setText(rs.getString("op_falsa_dos"));
                } else if (num == 5) {
                    jRadioButton_uno.setText(rs.getString("op_verdadera"));
                    jRadioButton_dos.setText(rs.getString("op_falsa_dos"));
                    jRadioButton_tres.setText(rs.getString("op_falsa_tres"));
                    jRadioButton_cuatro.setText(rs.getString("op_falsa_uno"));
                } else if (num == 6) {
                    jRadioButton_uno.setText(rs.getString("op_falsa_tres"));
                    jRadioButton_dos.setText(rs.getString("op_verdadera"));
                    jRadioButton_tres.setText(rs.getString("op_falsa_dos"));
                    jRadioButton_cuatro.setText(rs.getString("op_falsa_uno"));
                } else if (num == 7) {
                    jRadioButton_uno.setText(rs.getString("op_falsa_tres"));
                    jRadioButton_dos.setText(rs.getString("op_falsa_dos"));
                    jRadioButton_tres.setText(rs.getString("op_verdadera"));
                    jRadioButton_cuatro.setText(rs.getString("op_falsa_uno"));
                }
                aux = num;

            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error");
            JOptionPane.showMessageDialog(null, "!!Error contacte al administrador!!");
        }
        bandera = 0;

        Boton_juego.getText();

    }//GEN-LAST:event_Boton_juegoActionPerformed

    private void jRadioButton_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_unoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_unoActionPerformed
    int puntos = 0;

    private void boton_comprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_comprobarActionPerformed
        Boton_juego.setText("Next");
        Preguntas preguntas = new Preguntas();

        if (jRadioButton_uno.isSelected() == true || jRadioButton_dos.isSelected() == true || jRadioButton_tres.isSelected() == true || jRadioButton_cuatro.isSelected() == true) {
            if (aux == 0 && jRadioButton_uno.isSelected()) {
                puntos++;
                JOptionPane.showMessageDialog(null, "Opcion correcta");

                grupo_selecion.clearSelection();

            } else if (aux == 1 && jRadioButton_dos.isSelected()) {
                puntos++;
                JOptionPane.showMessageDialog(null, "Opcion correcta");

                grupo_selecion.clearSelection();

            } else if (aux == 2 && jRadioButton_tres.isSelected()) {
                puntos++;
                JOptionPane.showMessageDialog(null, "Opcion correcta");

                grupo_selecion.clearSelection();

            } else if (aux == 3 && jRadioButton_cuatro.isSelected()) {
                puntos++;
                JOptionPane.showMessageDialog(null, "Opcion correcta");

                grupo_selecion.clearSelection();
            } else if (aux == 4 && jRadioButton_dos.isSelected()) {
                puntos++;
                JOptionPane.showMessageDialog(null, "Opcion correcta");

                grupo_selecion.clearSelection();
            } else if (aux == 5 && jRadioButton_uno.isSelected()) {
                puntos++;
                JOptionPane.showMessageDialog(null, "Opcion correcta");

                grupo_selecion.clearSelection();
            } else if (aux == 6 && jRadioButton_dos.isSelected()) {
                puntos++;
                JOptionPane.showMessageDialog(null, "Opcion correcta");

                grupo_selecion.clearSelection();
            } else if (aux == 7 && jRadioButton_tres.isSelected()) {
                puntos++;
                JOptionPane.showMessageDialog(null, "Opcion correcta");

                grupo_selecion.clearSelection();
            } else {
                //Final del juego
                grupo_selecion.clearSelection();
                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                JOptionPane.showMessageDialog(null, "el total de puntos:" + puntos);

            }

        }


    }//GEN-LAST:event_boton_comprobarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


    }//GEN-LAST:event_jButton3ActionPerformed
    String texto = "";

//    public void listar() {
//        for (int i = 0; i < 1; i++) {
//            PreguntaDate pregu = RondaUno[i];
//            texto += (1 + i) + pregu.getCategoria() + "  " + pregu.getRonda();
//        }
//        JOptionPane.showMessageDialog(null, "El areglo tiene " + texto);
//    }
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
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Preguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_juego;
    private javax.swing.JButton boton_comprobar;
    private javax.swing.ButtonGroup grupo_selecion;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel_Nombre6;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JRadioButton jRadioButton_cuatro;
    private javax.swing.JRadioButton jRadioButton_dos;
    private javax.swing.JRadioButton jRadioButton_tres;
    private javax.swing.JRadioButton jRadioButton_uno;
    private javax.swing.JTextField txt_pregunta;
    // End of variables declaration//GEN-END:variables

    //metodo ramdon
//    public void ramdom() {
//        int num = (int) (Math.random() * (10));
//
//        if (num == 0) {
//            jRadioButton_uno.setText(rs.getString("op_verdadera"));
//            jRadioButton_dos.setText(rs.getString("op_falsa_uno"));
//            jRadioButton_tres.setText(rs.getString("op_falsa_dos"));
//            jRadioButton_cuatro.setText(rs.getString("op_falsa_tres"));
//        }
//    }
    public void clean() {
        jRadioButton_uno.setSelected(false);
        jRadioButton_dos.setSelected(false);
        jRadioButton_tres.setSelected(false);
        jRadioButton_cuatro.setSelected(false);
    }

    public void llenar() {
        if (ID >= 0 && ID <= 5) {
            ronda = "Ronda 1";
        } else if (ID >= 6 && ID <= 10) {
            ronda = "Ronda 2";
        } else if (ID >= 11 && ID <= 15) {
            ronda = "Ronda 3";
        } else if (ID >= 16 && ID <= 20) {
            ronda = "Ronda 4";
        } else if (ID >= 21 && ID <= 25) {
            ronda = "Ronda 5";
        }

        if (bandera == 1) {
            try {
                Connection cn = Conexiones.connect();
                PreparedStatement pst = cn.prepareStatement(
                        "select * from preguntas where ronda = '" + ronda
                        + "' and id_pregunta = '" + ID + "'");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    ID = rs.getInt("id_pregunta");

                    txt_pregunta.setText(rs.getString("pregunta"));
                    int num = (int) (Math.random() * (7));

                    if (num == 0) {
                        jRadioButton_uno.setText(rs.getString("op_verdadera"));
                        jRadioButton_dos.setText(rs.getString("op_falsa_uno"));
                        jRadioButton_tres.setText(rs.getString("op_falsa_dos"));
                        jRadioButton_cuatro.setText(rs.getString("op_falsa_tres"));
                    } else if (num == 1) {
                        jRadioButton_uno.setText(rs.getString("op_falsa_uno"));
                        jRadioButton_dos.setText(rs.getString("op_verdadera"));
                        jRadioButton_tres.setText(rs.getString("op_falsa_dos"));
                        jRadioButton_cuatro.setText(rs.getString("op_falsa_tres"));
                    } else if (num == 2) {
                        jRadioButton_uno.setText(rs.getString("op_falsa_uno"));
                        jRadioButton_dos.setText(rs.getString("op_falsa_dos"));
                        jRadioButton_tres.setText(rs.getString("op_verdadera"));
                        jRadioButton_cuatro.setText(rs.getString("op_falsa_tres"));
                    } else if (num == 3) {
                        jRadioButton_uno.setText(rs.getString("op_falsa_uno"));
                        jRadioButton_dos.setText(rs.getString("op_falsa_dos"));
                        jRadioButton_tres.setText(rs.getString("op_falsa_tres"));
                        jRadioButton_cuatro.setText(rs.getString("op_verdadera"));
                    } else if (num == 4) {
                        jRadioButton_uno.setText(rs.getString("op_falsa_uno"));
                        jRadioButton_dos.setText(rs.getString("op_verdadera"));
                        jRadioButton_tres.setText(rs.getString("op_falsa_tres"));
                        jRadioButton_cuatro.setText(rs.getString("op_falsa_dos"));
                    } else if (num == 5) {
                        jRadioButton_uno.setText(rs.getString("op_verdadera"));
                        jRadioButton_dos.setText(rs.getString("op_falsa_dos"));
                        jRadioButton_tres.setText(rs.getString("op_falsa_tres"));
                        jRadioButton_cuatro.setText(rs.getString("op_falsa_uno"));
                    } else if (num == 6) {
                        jRadioButton_uno.setText(rs.getString("op_falsa_tres"));
                        jRadioButton_dos.setText(rs.getString("op_verdadera"));
                        jRadioButton_tres.setText(rs.getString("op_falsa_dos"));
                        jRadioButton_cuatro.setText(rs.getString("op_falsa_uno"));
                    } else if (num == 7) {
                        jRadioButton_uno.setText(rs.getString("op_falsa_tres"));
                        jRadioButton_dos.setText(rs.getString("op_falsa_dos"));
                        jRadioButton_tres.setText(rs.getString("op_verdadera"));
                        jRadioButton_cuatro.setText(rs.getString("op_falsa_uno"));
                    }
                    aux = num;
                    ID++;

                }
                cn.close();

            } catch (SQLException e) {
                System.err.println("Error");
                JOptionPane.showMessageDialog(null, "!!Error contacte al administrador!!");
            }
            bandera = 0;
        }
        Boton_juego.setText("Solucion");
    }
}

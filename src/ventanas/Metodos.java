package ventanas;

import java.sql.*;
import clases.Conexiones;
import javax.swing.JOptionPane;

public class Metodos {

    private PreguntaDate RondaUno[];
    private PreguntaDate RondaDos[];
    private PreguntaDate RondaTres[];
    private PreguntaDate RondaCuatro[];
    private PreguntaDate RondaCinco[];

    int id;
    String pregunta, respuesta, falsaUno, falsados, falsaTres, categoria, ronda;
    String text = "";

    public Metodos() {
        RondaUno = new PreguntaDate[5];
        RondaDos = new PreguntaDate[5];
        RondaTres = new PreguntaDate[5];
        RondaCuatro = new PreguntaDate[5];
        RondaCinco = new PreguntaDate[5];
    }

    public void ingresarArreglo(int n) {

        if (n == 1) {
            int aux = 1;
            for (int i = 0; i < 5; i++) {
                try {
                    Connection conec = Conexiones.connect();
                    PreparedStatement pst = conec.prepareCall(
                            "select * from preguntas where id_pregunta ='" + aux + "'");
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        id = rs.getInt("id_pregunta");
                        pregunta = rs.getString("pregunta");
                        respuesta = rs.getString("op_verdadera");
                        falsaUno = rs.getString("op_falsa_uno");
                        falsados = rs.getString("op_falsa_dos");
                        falsaTres = rs.getString("op_falsa_tres");
                        categoria = rs.getString("categoria");
                        ronda = rs.getString("ronda");
                    }
                    conec.close();
                } catch (SQLException e) {
                    System.err.println("Error en cargar usuario. " + e);
                    JOptionPane.showMessageDialog(null, "Error al cargar contacte al Administrador. ");
                }

                RondaUno[i] = new PreguntaDate(id, pregunta, ronda, falsaUno, falsaUno, falsaTres, categoria, ronda);
                aux++;
            }

        } else if (n == 2) {
            int aux = 6;
            for (int i = 0; i < 5; i++) {
                try {
                    Connection conec = Conexiones.connect();
                    PreparedStatement pst = conec.prepareCall(
                            "select * from preguntas where id_pregunta ='" + aux + "'");
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        id = rs.getInt("id_pregunta");
                        pregunta = rs.getString("pregunta");
                        respuesta = rs.getString("op_verdadera");
                        falsaUno = rs.getString("op_falsa_uno");
                        falsados = rs.getString("op_falsa_dos");
                        falsaTres = rs.getString("op_falsa_tres");
                        categoria = rs.getString("categoria");
                        ronda = rs.getString("ronda");
                    }
                    conec.close();
                } catch (SQLException e) {
                    System.err.println("Error en cargar usuario. " + e);
                    JOptionPane.showMessageDialog(null, "Error al cargar contacte al Administrador. ");
                }

                RondaDos[i] = new PreguntaDate(id, pregunta, ronda, falsaUno, falsaUno, falsaTres, categoria, ronda);
                aux++;
            }
        } else if (n == 3) {
            int aux = 11;
            for (int i = 0; i < 5; i++) {
                try {
                    Connection conec = Conexiones.connect();
                    PreparedStatement pst = conec.prepareCall(
                            "select * from preguntas where id_pregunta ='" + aux + "'");
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        id = rs.getInt("id_pregunta");
                        pregunta = rs.getString("pregunta");
                        respuesta = rs.getString("op_verdadera");
                        falsaUno = rs.getString("op_falsa_uno");
                        falsados = rs.getString("op_falsa_dos");
                        falsaTres = rs.getString("op_falsa_tres");
                        categoria = rs.getString("categoria");
                        ronda = rs.getString("ronda");
                    }
                    conec.close();
                } catch (SQLException e) {
                    System.err.println("Error en cargar usuario. " + e);
                    JOptionPane.showMessageDialog(null, "Error al cargar contacte al Administrador. ");
                }

                RondaTres[i] = new PreguntaDate(id, pregunta, ronda, falsaUno, falsaUno, falsaTres, categoria, ronda);
                aux++;
            }
        }
        //Variable de prueba 

    }

    public void mostra() {

        for (int i = 0; i < RondaUno.length; i++) {
            PreguntaDate preguntaDate = RondaUno[i];
            text += (1 + i) + "Id pregunta" + preguntaDate.getCont() + " -  pregunta" + preguntaDate.getPregunta();
        }

        System.out.println(" " + text);
    }

}

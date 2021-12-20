/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofka;

/**
 *
 * @author Andres
 */
//Comentario

public class Sofka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ID=2;
        String ronda="";
        
        if (ID >=0 && ID <=5) {
            ronda = "Ronda 1";
        } else if (ID >= 6 && ID <=10) {
            ronda = "Ronda 2";
        } else if (ID >= 11 && ID <=15) {
            ronda ="Ronda 3";
        }
        System.out.println(ronda);
    }
    
}

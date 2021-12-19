
package clases;

//Creamos la conexion a la base de datos local que creamos 

import java.sql.*;

public class Conexiones {
    //Creamos la Conexion local del hosting
    
    public static Connection connect(){
        try {
            //Conectamo a la direcion del localhost
            Connection conec = DriverManager.getConnection("jdbc:mysql://localhost/bd_preg", "root", "");
            return conec;
        } catch (SQLException e) {
            System.err.println("Error en la conexion local" + e);
        }
        return null;
    }
    
}

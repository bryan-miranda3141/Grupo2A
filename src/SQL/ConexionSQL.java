
package SQL;

import java.sql.*;

public class ConexionSQL {
    
    
    public static Connection getConexion(){
        
        /*String conexionUrl  = "jdbc:sqlserver://192.168.1.100:60078;" +
     "databaseName=usuariosDB;user=user1;password=user1" +
     "encrypt=true;trustServerCertificate=true";*/
        String conexionUrl  = "jdbc:sqlserver://localhost:60078;" +
     "databaseName=usuariosDB;"
                + "user=sa;"
                + "password=itr2023;" +
     "encrypt=true;trustServerCertificate=true";
        
        
        try{
            Connection conn = DriverManager.getConnection(conexionUrl) ;
            return conn;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            System.out.println("llegaaaaaaaaaaaa");
            return null;
        }
        
    }
    
}

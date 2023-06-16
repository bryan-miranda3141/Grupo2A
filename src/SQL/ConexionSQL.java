
package SQL;

import java.sql.*;

public class ConexionSQL {
    
    
    public static Connection getConexion(){
                String conexionUrl  = "jdbc:sqlserver://localhost:58075;" 
                +"databaseName=usersDB;"
                + "user=sa;"
                + "password=itr2023;" +
     "encrypt=true;trustServerCertificate=true";
        
        
        try{
            Connection conn = DriverManager.getConnection(conexionUrl) ;
            return conn;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
        
    }
    
}

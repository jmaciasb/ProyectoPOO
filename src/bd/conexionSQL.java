/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.*;

/**
 *
 * @author Juan Ortega
 */
public class conexionSQL {
    
    Connection conectar=null;
    
    public Connection conexion(){
    
    try { 
    
    Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bd_impuesto", "root", "");
} catch (Exception e){
    
}
    return conectar;
    }
    
}
    
    
    
          
            
                
                
                  
    
        
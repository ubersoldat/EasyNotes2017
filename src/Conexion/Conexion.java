/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class Conexion {
    
    static final String DB_URL = "jdbc:mysql://localhost/easynotes1";
    // usuario y contraseña de la base de datos
    static final String USER = "root";
    static final String PASS = "copito";
    
    public static Connection Enlace(Connection cn) throws SQLException {

       return DriverManager.getConnection(DB_URL, USER, PASS);
    }  
    
}

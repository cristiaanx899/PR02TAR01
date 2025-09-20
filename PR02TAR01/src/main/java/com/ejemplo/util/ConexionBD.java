package com.ejemplo.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {
    public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/chalet";
        String user = "root";
        String password = "tu_contraseña"; // Cambia por tu contraseña real
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, password);
    }
}
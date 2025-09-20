package com.ejemplo.dao;

import com.ejemplo.model.Producto;
import com.ejemplo.util.ConexionBD;
import java.sql.*;
import java.util.*;

public class ProductoDAO {
    public List<Producto> obtenerTodosLosProductos() {
        List<Producto> lista = new ArrayList<>();
        try (Connection con = ConexionBD.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM productos")) {
            while (rs.next()) {
                Producto p = new Producto(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("descripcion"),
                    rs.getDouble("precio")
                );
                lista.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void eliminarProducto(int id) {
        try (Connection con = ConexionBD.getConnection();
             PreparedStatement ps = con.prepareStatement("DELETE FROM productos WHERE id=?")) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
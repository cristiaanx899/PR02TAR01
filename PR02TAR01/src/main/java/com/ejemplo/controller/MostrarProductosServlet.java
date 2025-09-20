package com.ejemplo.controller;

import com.ejemplo.dao.ProductoDAO;
import com.ejemplo.model.Producto;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class MostrarProductosServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductoDAO dao = new ProductoDAO();
        List<Producto> productos = dao.obtenerTodosLosProductos();
        String json = new Gson().toJson(productos);

        response.setContentType("application/json");
        response.getWriter().write(json);
    }
}
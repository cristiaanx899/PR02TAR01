package com.ejemplo.controller;

import com.ejemplo.dao.ProductoDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class EliminarProductoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        ProductoDAO dao = new ProductoDAO();
        dao.eliminarProducto(id);

        response.setContentType("application/json");
        response.getWriter().write("{\"mensaje\":\"Producto eliminado correctamente\"}");
    }
}
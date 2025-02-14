package com.product.controllers;

import com.product.model.Product;
import com.product.dao.ProductDAO;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import java.io.IOException;

public class UpdateProductServlet extends HttpServlet {

    private static long serialVerisonIUD = 1L;

    ProductDAO productDAO = null;

    public void init () {
        productDAO = new ProductDAO();
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException
    {
        // get product by id
        int productId = Integer.parseInt(req.getParameter("id"));
        Product product = productDAO.getProductById( productId );
        req.setAttribute("product", product );
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("jsp/update.jsp");
        requestDispatcher.forward(req, res);
    }

    public void doPost ( HttpServletRequest req, HttpServletResponse res )
        throws ServletException, IOException
    {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        int qty = Integer.parseInt(req.getParameter("qty"));
        double unitPrice = Double.parseDouble(req.getParameter("unitPrice"));
        String category = req.getParameter("category");

        Product product = new Product(id, name, description, qty, unitPrice, category);

        productDAO.updateProduct(product);
        res.sendRedirect("/stock-system");
    }

}

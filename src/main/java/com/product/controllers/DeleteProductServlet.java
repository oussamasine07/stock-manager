package com.product.controllers;

import com.product.dao.ProductDAO;
import com.product.model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

public class DeleteProductServlet extends HttpServlet {
    static final long serialVersionUID = 1L;
    ProductDAO productDAO = null;

    public void init() {
        productDAO = new ProductDAO();
    }

    public void doPost ( HttpServletRequest req, HttpServletResponse res )
        throws ServletException, IOException
    {
        int productId = Integer.parseInt(req.getParameter("id"));
        // delete product
        productDAO.deleteProduct( productId );
        res.sendRedirect("/stock-system");
    }
}

package com.product.controllers;

import com.product.dao.ProductDAO;
import com.product.model.Product;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NewProductServlet extends HttpServlet {
    private static long serialVersionUID = 1L;

    private ProductDAO productDAO;

    public void init() {
        productDAO = new ProductDAO();
    }

    public void doGet ( HttpServletRequest req, HttpServletResponse  res )
            throws ServletException, IOException
    {
        RequestDispatcher dispatcher = req.getRequestDispatcher("jsp/create.jsp");
        dispatcher.forward(req, res);
    }

    public void doPost ( HttpServletRequest req, HttpServletResponse res )
        throws ServletException, IOException
    {

    }

}

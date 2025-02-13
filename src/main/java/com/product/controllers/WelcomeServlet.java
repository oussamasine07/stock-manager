package com.product.controllers;

import com.product.dao.ProductDAO;
import com.product.model.Product;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class WelcomeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private ProductDAO productDAO;

    public void init () {
        productDAO = new ProductDAO();
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException
    {
        List<Product> productList = productDAO.getProducts();

//       productList.forEach(product -> System.out.println(product.getName()));

        req.setAttribute("productList", productList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("jsp/index.jsp");
        dispatcher.forward(req, res);


    }

}

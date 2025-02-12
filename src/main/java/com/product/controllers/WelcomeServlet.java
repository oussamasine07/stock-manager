package com.product.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class WelcomeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException
    {

//        req.setAttribute();
        RequestDispatcher dispatcher = req.getRequestDispatcher("jsp/index.jsp");
        dispatcher.forward(req, res);


    }

}

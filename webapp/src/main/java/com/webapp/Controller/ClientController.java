package com.webapp.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapp.Model.Client;

@WebServlet(urlPatterns = {"/register"})
public class ClientController extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String inputName = req.getParameter("Name");
        String inputEmail = req.getParameter("Email");
        Client clientDefault = new Client(inputName, inputEmail);
        
        clientDefault.save();
        
    }
    
}

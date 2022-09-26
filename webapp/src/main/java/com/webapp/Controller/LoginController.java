package com.webapp.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapp.Model.User;

@WebServlet(urlPatterns = {"/login"})
public class LoginController extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User userDefault = new User("Dudzz", "Dudu", "123456");
         
        String inputUsername = req.getParameter("Username");
        String inputPassword = req.getParameter("Password");
        
                                                                                                            
        

        if(inputUsername.equals(userDefault.getUsername()) && inputPassword.equals(userDefault.getPassword()))
        {
                 req.getSession().setAttribute("Username", userDefault.getUsername());
                 resp.sendRedirect(req.getContextPath()+"/index.jsp");
                 return;

        }

        String msgError = "Erro no login";
        req.setAttribute("msgError", msgError);
        RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
        dispatcher.forward(req, resp);
        
    }
    
}

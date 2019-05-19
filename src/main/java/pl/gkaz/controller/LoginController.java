package pl.gkaz.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginPanel" , value = "/login")
public class LoginController extends HttpServlet {

    private static final String user = "user";
    private static final String password = "pass";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String enteredUserName = req.getParameter("login");
        String enteredPassword = req.getParameter("password");

        if (user.equals(enteredUserName) && password.equals(enteredPassword)){
            req.getSession().setAttribute("user", user);
            resp.sendRedirect("/");
        } else req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }
}


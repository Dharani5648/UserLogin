package com.codeWithDharani.controller;

import com.codeWithDharani.dao.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterController extends HttpServlet {
    private UserDao userDao;
    public RegisterController() {
        userDao=new UserDao();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email=req.getParameter("email");
        String password=req.getParameter("password");
        String name=req.getParameter("name");
        userDao.register(email, password, name);
        RequestDispatcher rs = req.getRequestDispatcher("index.jsp");
        rs.forward(req, resp);
    }
}

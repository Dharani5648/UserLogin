package com.codeWithDharani.controller;

import com.codeWithDharani.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class HomeController extends HttpServlet {
    private UserDao userDao;
    public HomeController() {
      userDao=new UserDao();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("dharani");
        String id = req.getParameter("id");
        System.out.println(id);
        HttpSession httpSession = req.getSession();
        int loggedInUser= (int) httpSession.getAttribute("id");
        System.out.println(id);
        if (id != null) {
            System.out.println("zara");
        }
        doPost(req, resp);
    }

}

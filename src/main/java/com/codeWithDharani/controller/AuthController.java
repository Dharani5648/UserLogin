package com.codeWithDharani.controller;

import com.codeWithDharani.dao.UserDao;
import com.codeWithDharani.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AuthController extends HttpServlet {
    private UserDao userDao;
    public AuthController() {
        userDao=new UserDao();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email=req.getParameter("email");
        String password=req.getParameter("password");
        User loggedInUser = userDao.loginUser(email, password);
        if (loggedInUser != null) {
            HttpSession httpSession = req.getSession();
            httpSession.setAttribute("id", loggedInUser.getId());
            RequestDispatcher rs = req.getRequestDispatcher("home.jsp");
            User userDetail = UserDao.userDetail(loggedInUser.getId());
             req.setAttribute("user",userDetail);
//            List<Product> products = productDao.selectAllProducts();
//            req.setAttribute("products", products);

            rs.forward(req, resp);
        } else {
            req.setAttribute("error", true);
            RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
            rd.forward(req, resp);
        }
    }
}

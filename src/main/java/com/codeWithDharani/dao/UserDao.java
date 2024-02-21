package com.codeWithDharani.dao;

import com.codeWithDharani.database.Database_db;
import com.codeWithDharani.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private static Connection con;

    public UserDao() {
        con = Database_db.getConnection();
    }
    private String selectSQL = "SELECT id, email, password FROM User WHERE email=? and password=?";
    private String RegisterSQL="INSERT INTO User(email,password,name)VALUES(?,?,?);";

//    private static String selectAllUser = "SELECT * FROM User WHERE id = ?";

    public User loginUser(String email, String password) {
        User user = null;
        try {
            PreparedStatement ps = con.prepareStatement(selectSQL);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setId(Integer.parseInt(rs.getString("id")));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public void register(String email, String password,String name) {
        try {
            PreparedStatement rt= con.prepareStatement(RegisterSQL);
            rt.setString(1, email);
            rt.setString(2, password);
            rt.setString(3,name);
            rt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static User userDetail(int id) {
        User user = null;

        try {
            String selectUserById = "SELECT * FROM User WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(selectUserById);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle or log the exception as needed
        } finally {
            // Close resources (ResultSet, PreparedStatement) in reverse order
            // Add appropriate closing statements here
        }

        return user;
    }



}

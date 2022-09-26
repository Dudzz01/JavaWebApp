package com.webapp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.webapp.Model.Client;

public class ClientDAO {
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/webappjava";
    private String user = "root";
    private String password = "Eduardo12345678!";

    private Connection connectMySql(){
        Connection con = null;
        try {
             Class.forName(driver);
             con = DriverManager.getConnection(url, user, password);
             return con;
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
            return null;
        }
    }

    public void save(Client client){
        String create = "insert into client (nameClient, emailClient) values (?,?)";

        try {
            Connection con = connectMySql();
            PreparedStatement pst = con.prepareStatement(create);
            pst.setString(1, client.getNameClient());
            pst.setString(2, client.getEmail());
            pst.executeUpdate();
            con.close();
            System.out.println(client.getNameClient());
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }

    
}

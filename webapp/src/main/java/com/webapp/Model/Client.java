package com.webapp.Model;

import com.webapp.DAO.ClientDAO;

public class Client {
    private String nameClient;
    private String email;

    
    public Client(String nameClient, String email) {
        this.nameClient = nameClient;
        this.email = email;
    }

    public String getNameClient() {
        return nameClient;
    }
    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void save(){
        ClientDAO clientDAO = new ClientDAO();
        clientDAO.save(this);
        
    }
}

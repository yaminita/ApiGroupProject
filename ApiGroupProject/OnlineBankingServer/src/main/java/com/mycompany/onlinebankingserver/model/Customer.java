/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebankingserver.model;

/**
 *
 * @author User
 */
public class Customer {
    
    private int id;
    private String name;
    private String address;
    private String email;
    private int password;
    
    public Customer(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }


    public Customer(int id, String name, String address, String email, int password){
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.password = password;
    }
    
}

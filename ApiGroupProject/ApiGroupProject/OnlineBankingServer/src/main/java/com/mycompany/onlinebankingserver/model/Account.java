/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebankingserver.model;

import java.util.List;

/**
 *
 * @author User
 */
public class Account {
    private String sortCode;
    private int accountNum;
    private Double currentBalance;
    private String accountType;
    private int customerId;
    
    
    public Account(){
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    
    public Account (String sortCode, int accountNum, Double currentBalance, String accountType, int customerId){
        this.sortCode = sortCode;
        this.accountNum = accountNum;
        this.currentBalance = currentBalance;
        this.accountType = accountType;
        this.customerId = customerId;
    
    }
}

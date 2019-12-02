package com.mycompany.onlinebankingserver.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Transaction { @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    public enum TransactionType {
        LODGEMENT, WITHDRAWAL, TRANSFER
    }

    private TransactionType type;
    private int accountId;
    private String cardNumber;
    private int cardCVV;
    private String cardExpiry;
    private boolean processed;
    private Double amount;
    private int toAccountId;


    public Transaction () {}

    public Transaction(TransactionType type, int accountId, String cardNumber, int cardCVV, String cardExpiry, Double amount, int toAccountId) {
        this.type = type;
        this.accountId = accountId;
        this.cardNumber = cardNumber;
        this.cardCVV = cardCVV;
        this.cardExpiry = cardExpiry;
        this.processed = false;
        this.amount = amount;
        this.toAccountId = toAccountId;
    }
    
        public int getToAccountId() {
        return toAccountId;
    }

    public void setToAccountId(int toAccountId) {
        this.toAccountId = toAccountId;
    }
    
    
    public int getId() {
        return id;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardCVV() {
        return cardCVV;
    }

    public void setCardCVV(int cardCVV) {
        this.cardCVV = cardCVV;
    }

    public String getCardExpiry() {
        return cardExpiry;
    }

    public void setCardExpiry(String cardExpiry) {
        this.cardExpiry = cardExpiry;
    }
    
    public boolean isProcessed() {
        return processed;
    }
    
    public void setIsProcessed(boolean p) {
        this.processed = p;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
    
    
}

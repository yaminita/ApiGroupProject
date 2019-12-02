/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebankingserver.database;

import com.mycompany.onlinebankingserver.model.Account;
import com.mycompany.onlinebankingserver.model.Customer;
import com.mycompany.onlinebankingserver.model.Transaction;
import com.mycompany.onlinebankingserver.model.Transaction.TransactionType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Database {
    
    public static List<Customer> customerDB = new ArrayList<>();
    public static List<Account> accountDB = new ArrayList<>();
    public static List<Transaction> transactionDB = new ArrayList<>();
    public static boolean init = true;
     
    // Lets create a constructor for the class
    public Database () {
      if (init) {
        //Transaction t1 = new Transaction (int accountId, String cardNumber, int cardCVV, String cardExpiry, Double amount, int toAccountId);  
//        Transaction t1 = new Transaction ("", 2345,"123AA12",4574,"0520",100,1);
//        Transaction t2 = new Transaction (2346,"123AA13",4573,"0620",50,2);
//        Transaction t3 = new Transaction (2347,"123AA14",2221,"0720",40,3);
//        transactionDB.add(t1);
//        transactionDB.add(t2);
//        transactionDB.add(t3);
//          
          
          
        // Lets create some customers
        Customer c1 = new Customer (1,"Carlos Alvarado","Portmarnock","carlosAlvarado@gmail.com",1234);  
        Customer c2 = new Customer (2,"Julian Kelly","Kilbarrack","julianRxs@gmail.com",4573);
        Customer c3 = new Customer (3,"Sol Gorman","Portmarnock","carlosAlvarado@gmail.com",2221);
        
        customerDB.add(c1);
        customerDB.add(c2);
        customerDB.add(c3);
        
        // Lets add those comments to each of the messages. 
        // Keep in mind ALL messages will contain same list of seeded comments!!!
        //Account (String sortCode, int accountNum, Double currentBalance, String accountType, int customerId)
        Account m1 = new Account("BOIF",2345,1234.23,"Saving", 1);
        Account m2 = new Account("BOIF",2346,1234.23,"Saving", 2);        
        Account m3 = new Account("BOIF",2347,1234.23,"Saving", 3);
        
        accountDB.add(m1);
        accountDB.add(m2);
        accountDB.add(m3);

        init = false;
     }
    }
    
    public static List<Account> getAccountsDB() {
        return accountDB;
    }
    
    public static List<Customer> getCustomersDB() {
        return customerDB;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebankingserver.resource;

import com.mycompany.onlinebankingserver.service.CustomerService;
import com.mycompany.onlinebankingserver.model.Customer;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author User
 */
@Path("/customer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {
     CustomerService cust = new CustomerService();
    

    
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Customer> listCustomer() {
        return cust.retrieveCustomers();
    }
    
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("/user/{id}")
    public Customer getCustomer(@PathParam("id") int id) {
        return cust.retrieveCustomer(id);
    }
    
//    @POST
//    @Path("/create")
//    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
////    public Customer createCust(String c) {
//        System.out.println(c);
//        Customer jobj = new Gson().fromJson(c, Customer.class);
//        Customer customer = new Customer(jobj.getName(),jobj.getAddress(),jobj.getEmail(),jobj.getPassword());
//        
//        return cust.createCustomer(customer);
////    }
//        public Customer createCustomer(Customer c) {
//	return customerService.createCustomer(c);
//    }
    
}

    


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discount.strategy;

import Customer.CustomerManager;
import DataSource.Customer;
import Customer.FakeDatabase;
import TransactionService.NewSale;
import TransactionService.TransactionService;
import java.util.Scanner;

/**
 *
 * @author Michele
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /*Start a transaction - pass on hard coded customer number to the
        transaction*/
        
        
       TransactionService transaction = new NewSale("C100");
       
       
       //System.out.println(customer.toString());
       //System.out.println(customer.viewCustomerCart());
    }
}

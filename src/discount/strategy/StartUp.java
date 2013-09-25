/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discount.strategy;


import DataSource.DataSource;
import DataSource.FakeDatabase;
import TransactionService.NewWebSale;
import TransactionService.TransactionService;

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
        
       DataSource dataSource = new FakeDatabase();
       TransactionService transaction = new NewWebSale(dataSource, "C101");
       transaction.startTransaction();
       
       //System.out.println(customer.toString());
       //System.out.println(customer.viewCustomerCart());
    }
}

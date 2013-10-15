/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package startup;


import datasourcestrategy.DataSource;
import datasourcestrategy.FakeDatabase;
import transactionservice.WebSale;
import transactionservice.TransactionService;

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
        
       DataSource dataSource = datasourcestrategy.DataSourceFactory.getFakeDatebaseDataSource();
       TransactionService transaction = new WebSale(dataSource, "C101");
       
       transaction.addItemToCart("GBFY10", 2);
       transaction.addItemToCart("GBFY30", 1);
       transaction.checkOut();

       transaction = new WebSale(dataSource, "C100");
       transaction.addItemToCart("GBFY20", 2);
       transaction.addItemToCart("GBFY30", 10);
       transaction.checkOut();

       //System.out.println(customer.toString());
       //System.out.println(customer.viewCustomerCart());
    }
}

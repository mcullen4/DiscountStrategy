/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discount.strategy;

import Customer.CustomerManager;
import Customer.Customers;
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
        Scanner keyboard = new Scanner(System.in);
        String customerNo;
        Customers customer;
        String productNo;
        int quantity;
        boolean continueShopping;
        
        //String custNo = "C100", "C101", "C102";
        
       CustomerManager customerManager = new FakeDatabase();
       System.out.println("Enter customer number");
       customerNo = keyboard.next();
       customer=customerManager.retrieveCustomer(customerNo);
       customer.addItemToShoppingTrip("GBFY10", 2);
       customer.addItemToShoppingTrip("GBFY20", 1);
//       System.out.println("Would you like to add an item?");
//       //validation that its Yes or No
//       continueShopping = keyboard.nextBoolean();
//       
//       do{
//       System.out.println("Enter product number of item");
//       //validation that its valid product number
//       productNo = keyboard.next();
//       System.out.println("Enter quantity of items");
//       //validation that its greater than 0
//       quantity = keyboard.nextInt();
//       customer.addItemToShoppingTrip(productNo, quantity);
//       System.out.println("Would you like to add an item?");
//       //validation that its Yes or No
//       continueShopping = keyboard.nextBoolean();
//       
//       }while (continueShopping == true);
       
       
       //customer.addItemToShoppingTrip(customerNo, quantity);
       
       TransactionService transaction = new NewSale(customer);
       
       
       System.out.println(customer.toString());
       System.out.println(customer.viewCustomerCart());
    }
}

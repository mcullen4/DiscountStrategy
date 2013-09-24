/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discount.strategy;

import Customer.CustomerManager;
import Customer.Customers;
import Customer.FakeDatabase;
import Product.FakeProductDatabase;
import Product.ProductManager;
import ProductSelection.Cart;
import ProductSelection.ProductSelectionManager;
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
        String customerNo = null;
        Customers customer = new Customers();
        String productNo;
        int quantity;
        
        //String custNo = "C100", "C101", "C102";
        
       CustomerManager customerManager = new FakeDatabase();
       System.out.println("Enter customer number");
       customerNo = keyboard.next();
       customer=customerManager.retrieveCustomer(customerNo);
       
       System.out.println("Enter product number of first item");
       
       
       
       
       
       //customer.addItemToShoppingTrip(customerNo, quantity);
       
       System.out.println(customer.toString());
    }
}

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

/**
 *
 * @author Michele
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String custNo = "C100";
        //Customers customer;
        CustomerManager customerManager = new FakeDatabase();
        ProductManager productManager = new FakeProductDatabase();
        Customers c1 = new Customers("Joe","Smith","1234");
        c1.setProductSelectionManager(new Cart());
        
        Cart cart = new Cart();
        cart.addItem("GBFY10", 2);
        System.out.println(cart.getSelectedItems());
        //customer=customerManager.retrieveCustomer(custNo);
        //System.out.println(customer.getfName());
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import DataSource.Customer;
import ProductSelection.Cart;
import ProductSelection.ProductSelectionManager;

/**
 *
 * @author Michele
 */
public class FakeDatabase implements CustomerManager {
    
    private ProductSelectionManager cart = new Cart();
    
    private Customer [] customer = {new Customer("C100","Joe","Smith", cart),
    new Customer("C101","Michele","Cullen", cart),new Customer("C102",
            "John","Doe", cart)};
           
       
    @Override
    public void addCustomer() {
    }

    @Override
    public Customer retrieveCustomer(String custNo) {
        if(custNo == null){
            throw new IllegalArgumentException("Invalid Customer Number");
        }
        
        Customer activeCustomer = null;
        
        for (Customer c : customer){
        if (c.getCustomerNo().equalsIgnoreCase(custNo)){
            activeCustomer = c;
            break;
        }
        }
    return activeCustomer;
    }

    @Override
    public void deleteCustomer() {
    
    }
    
}

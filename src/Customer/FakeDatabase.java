/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import ProductSelection.Cart;
import ProductSelection.ProductSelectionManager;

/**
 *
 * @author Michele
 */
public class FakeDatabase implements CustomerManager {
    
    private ProductSelectionManager cart = new Cart();
    
    private Customers [] customer = {new Customers("C100","Joe","Smith", cart),
    new Customers("C101","Michele","Cullen", cart),new Customers("C102",
            "John","Doe", cart)};
           
       
    @Override
    public void addCustomer() {
    }

    @Override
    public Customers retrieveCustomer(String custNo) {
        if(custNo == null){
            throw new IllegalArgumentException("Invalid Customer Number");
        }
        
        Customers activeCustomer = null;
        
        for (Customers c : customer){
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

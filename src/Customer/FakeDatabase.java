/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

/**
 *
 * @author Michele
 */
public class FakeDatabase implements CustomerManager {
    
    
    
    private Customers [] customer = {new Customers("C100","Joe","Smith"),
    new Customers("C101","Michele","Cullen"),new Customers("C102",
            "John","Doe")};
           
       
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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

/**
 *
 * @author Michele
 */
public interface CustomerManager {
    
    public abstract void addCustomer();
    public abstract Customers retrieveCustomer(String custNo);
    public abstract void deleteCustomer();
    
}

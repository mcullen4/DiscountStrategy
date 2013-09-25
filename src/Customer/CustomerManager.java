/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import DataSource.Customer;

/**
 *
 * @author Michele
 */
public interface CustomerManager {
    
    public abstract void addCustomer();
    public abstract Customer retrieveCustomer(String custNo);
    public abstract void deleteCustomer();
    
}

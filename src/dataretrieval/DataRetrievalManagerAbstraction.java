
package dataretrieval;

import datasourcestrategy.Customer;
import datasourcestrategy.Product;

/**
 * This is an interface that defines the methods necessary for different
 * data retrieval objects.
 * @author:  Michele Cullen
 * @version:  1.0
 */
public interface DataRetrievalManagerAbstraction {
    
    /**
     * This method should retrieve a Customer object from a data source 
     * utilizing the customer number
     * @param customerNo defines a customer number
     * @return returns a Customer object 
     */
    public abstract Customer retrieveCustomer(String customerNo);
    
    /**
     * This method should retrieve a Product object from a data source utilizing
     * the product number
     * @param productNo defines the product number
     * @return returns a Product object
     */
    public abstract Product retrieveProduct(String productNo);
}

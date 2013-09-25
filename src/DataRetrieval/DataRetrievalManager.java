/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataRetrieval;

import DataSource.Customer;
import DataSource.Product;

/**
 *
 * @author Michele
 */
public interface DataRetrievalManager {
    public abstract Customer retrieveCustomer(String customerNo);
    public abstract Product retrieveProduct(String productNo);
}

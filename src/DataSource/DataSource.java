/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataSource;

/**
 *
 * @author Michele
 */
public interface DataSource {
  
    
    public abstract Customer[] getCustomer();

    public abstract void setCustomer(Customer[] customer);

    public abstract Product[] getProduct();

    public abstract void setProduct(Product[] product);
    
    
    
    
}

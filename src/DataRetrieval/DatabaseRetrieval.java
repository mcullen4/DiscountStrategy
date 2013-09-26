/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataRetrieval;

import DataSource.Customer;
import DataSource.DataSource;
import DataSource.Product;

/**
 *
 * @author Michele
 */
public class DatabaseRetrieval implements DataRetrievalManager {
    
    private DataSource ds;
    
    
    //Constructor requires a DataSource to be passed in
    
    public DatabaseRetrieval(DataSource ds){
          
    this.ds = ds;
    }
    
    
    
    
    @Override
    public Customer retrieveCustomer(String customerNo){
    Customer customer[] = ds.getCustomer();
        
    
    if(customerNo == null){
            throw new IllegalArgumentException("Invalid Customer Number");
        }
        Customer activeCustomer=null;
              
        for (Customer c : customer){
        if (c.getCustomerNo().equalsIgnoreCase(customerNo)){
            activeCustomer = c;
            break;
        }
        }
    return activeCustomer;
        
    }
    
    @Override
    public Product retrieveProduct(String productNo){
        Product product[] = ds.getProduct();
        
        if(productNo == null){
            throw new IllegalArgumentException("Invalid Product Number");
        }
        
        Product currentProduct=null;
        
        for (Product p: product){
        if (p.getProductNumber().equalsIgnoreCase(productNo)){
            currentProduct = p;
            //System.out.println(currentProduct.getProductDiscountDescription());
            break;
            
        }   
        }
        
        return currentProduct;
    }
    
//    public String [] retrieveCartItems(Customer customer){
//        String [] cartItems = customer.getCartItems();
//        return cartItems;
//    }
//    
//    public int [] retrieveCartQuantities(Customer customer){
//        int [] quantities = customer.getQuantities();
//        return quantities;
//    
//    }

    public DataSource getDs() {
        return ds;
    }

    public void setDs(DataSource ds) {
        this.ds = ds;
    }
    
    
    
    
    
}

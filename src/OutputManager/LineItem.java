/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OutputManager;

import Product.FakeProductDatabase;
import Product.ProductManager;

/**
 *
 * @author Michele
 */
public class LineItem  {
    
    private String productNumber;
    private ProductManager productManager = new FakeProductDatabase();
    

    
    public LineItem(String prodNo){
    productNumber = prodNo;
}
    
    
    
    
    
    
    
    
    
}
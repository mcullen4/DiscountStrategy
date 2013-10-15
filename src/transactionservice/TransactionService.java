/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transactionservice;

import productselection.CartItem;

/**
 *
 * @author Michele
 */
public interface TransactionService {
    
      
    public abstract void startTransaction();
    public abstract void addItemToCart(String productNo, int quantity);
    public abstract void saveCartForLater();
    public abstract void checkOut();
   
    
}

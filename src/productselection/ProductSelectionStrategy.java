/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package productselection;

/**
 *
 * @author Michele
 */
public interface ProductSelectionStrategy {
    public abstract void addItem(CartItem cartItem);
    public abstract void deleteItem();
    public abstract void clearAllItems();
    public CartItem [] getCartItems();
    
    
}

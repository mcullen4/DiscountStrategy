/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package productselection;

/**
 *
 * @author Michele
 */
public class WishList implements ProductSelectionStrategy {

    @Override
    public void addItem(CartItem cartItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clearAllItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    //Just have this out there to show that there could be multiple 
    //product selection devices

    @Override
    public CartItem[] getCartItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
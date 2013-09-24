/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductSelection;

/**
 *
 * @author Michele
 */
public class WishList implements ProductSelectionManager {
    
    
    //Just have this out there to show that there could be multiple 
    //product selection devices
    

    @Override
    public void addItem(String productID, int quantity) {
        
    }

    @Override
    public void deleteItem() {
        
    }

    @Override
    public void clearAllItems() {
        
    }

    @Override
    public String[] getProductNumbers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] getQuantities() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

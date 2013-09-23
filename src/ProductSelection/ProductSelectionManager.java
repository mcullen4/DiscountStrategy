/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductSelection;

/**
 *
 * @author Michele
 */
public interface ProductSelectionManager {
    public abstract void addItem(String productNo, int quantity);
    public abstract void deleteItem();
    public abstract void clearAllItems();
    
}

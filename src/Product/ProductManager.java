/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

/**
 *
 * @author Michele
 */
public interface ProductManager {
    public abstract void addProduct();
    public abstract String[] retrieveProduct();
    public abstract void deleteProduct();
}

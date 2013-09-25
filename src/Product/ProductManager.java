/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import DataSource.Product;

/**
 *
 * @author Michele
 */
public interface ProductManager {
    public abstract void addProduct();
    public abstract Product retrieveProduct(String prodNo);
    public abstract void deleteProduct();
}

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
public class FakeProductDatabase implements ProductManager {
    
    private Product [] product = {new Product("GBFY10","Packer Hat",19.95,
            new DiscountManager.NoDiscount()),
    new Product("GBFY20","Packer Jersey",49.95,new DiscountManager.GrandOpeningDiscount()),
    new Product("GBFY30","Packer Bumper Stickers",3.95,new DiscountManager.QuantityDiscount())};

    @Override
    public void addProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product retrieveProduct(String prodNo) {
        if(prodNo == null){
            throw new IllegalArgumentException("Invalid Product Number");
        }
        
        Product currentProduct=null;
        
        for (Product p  : product){
        if (p.getProductNumber().equalsIgnoreCase(prodNo)){
            currentProduct = p;
            break;
        }
        }
    return currentProduct;
    }
    

    @Override
    public void deleteProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;



/**
 *
 * @author Michele
 */
public class FakeProductDatabase implements ProductManager {
    
    private Products [] product = {new Products("GBFY10","Packer Hat",19.95,
            new DiscountManager.NoDiscount()),
    new Products("GBFY20","Packer Jersey",49.95,new DiscountManager.GrandOpeningDiscount()),
    new Products("GBFY30","Packer Bumper Stickers",3.95,new DiscountManager.QuantityDiscount())};

    @Override
    public void addProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] retrieveProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

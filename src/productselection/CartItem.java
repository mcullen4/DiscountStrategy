/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package productselection;

/**
 *
 * @author Michele
 */
public class CartItem {
    
    private String productNumber;
    private int quantity;
    
    public CartItem(String prodNo, int quant){
    this.productNumber=prodNo;
    this.quantity=quant;
    
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OutputManager;

import DataSource.Product;

/**
 *
 * @author Michele
 */
public class LineItem  {
    
    
    
    private int quantity;
    private double productSubtotal;
    private double discountAmount;
    private double productTotal;
    private Product product;
    
    
    public LineItem(Product product, int quantity){
    this.quantity=quantity;
    this.product=product;
        
    }
    public double getProductSubtotal(){
        productSubtotal=product.getUnitCost()*quantity;
    return productSubtotal;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscountAmount() {
        discountAmount=(productSubtotal*product.getProductDiscount())*-1;
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getProductTotal() {
        productTotal=productSubtotal+discountAmount;
        return productTotal;
    }

    public void setProductTotal(double productTotal) {
        this.productTotal = productTotal;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    @Override
    public String toString(){
    String str = product.getProductNumber() + "     "+product.getDescription()+
            "     "+quantity+"     "+"$"+product.getUnitCost()+"     "+
            productSubtotal+"     "+discountAmount+"     "+productTotal;
    
    return str;
    }

    
    
    
    
    
    
    
    
    
}
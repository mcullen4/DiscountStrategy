/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OutputManager;

import DataSource.Product;
import java.text.DecimalFormat;

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
    private DecimalFormat df = new DecimalFormat("#.00");
    
    
    public LineItem(Product product, int quantity){
    this.quantity=quantity;
    this.product=product;
    this.productSubtotal=Double.parseDouble(df.format(product.getUnitCost()*quantity));
    this.discountAmount=Double.parseDouble(df.format((productSubtotal*product.getProductDiscount())*-1));
    this.productTotal=Double.parseDouble(df.format(productSubtotal+discountAmount));
        
    }
    public double getProductSubtotal(){
        productSubtotal=Double.parseDouble(df.format(product.getUnitCost()*quantity));
    return productSubtotal;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscountAmount() {
        Double.parseDouble(df.format((productSubtotal*product.getProductDiscount())*-1));
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getProductTotal() {
        productTotal=Double.parseDouble(df.format(productSubtotal+discountAmount));
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
    String str = product.getProductNumber() + "\t" +product.getDescription()+
            "\t\t"+quantity+"\t\t"+"$"+product.getUnitCost()+"\t\t"+"$"+
            productSubtotal+"\t\t"+discountAmount+"\t\t"+"$"+productTotal;
    
    return str;
    }

    
    
    
    
    
    
    
    
    
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscountManager;

/**
 *
 * @author Michele
 */
public class QuantityDiscount implements DiscountManager {
    
    
    private double discount=.10;
    private static final String DISCOUNT_DESCRIPTION="Quantity Discount";
    
    public QuantityDiscount()
    {
        
    }

    public void setDiscount(double discount) {
        //validation that discount is not less than 0
           
        
        this.discount = discount;
    }

       
    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public String getDiscountDescription() {
    return DISCOUNT_DESCRIPTION;
    }
    
}
    


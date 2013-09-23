/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscountManager;

/**
 *
 * @author Michele
 */
public class GrandOpeningDiscount implements DiscountManager {

    private double discount;
    private final String DISCOUNT_DESCRIPTION="Grand Opening Discount";
    
    public GrandOpeningDiscount()
    {
        discount = .10;
    }

    public void setDiscount(double discount) {
        //validation that discount is not less than 0 or more than 1.0
            
        this.discount = discount;
    }

    
    
    @Override
    public double getDiscount(int quantity) {
        return discount;
    }

    @Override
    public String getDiscountDescription() {
    return DISCOUNT_DESCRIPTION;
    }
    
}
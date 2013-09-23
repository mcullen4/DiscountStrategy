/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscountManager;

/**
 *
 * @author Michele
 */
public class NoDiscount implements DiscountManager{
    
    private final double DISCOUNT=0.00;
    private final String DISCOUNT_DESCRIPTION="No discount applies";
    
        
    @Override
    public double getDiscount(int quantity) {
        return DISCOUNT;
    }

    @Override
    public String getDiscountDescription() {
    return DISCOUNT_DESCRIPTION;
    }
    
}
    
    


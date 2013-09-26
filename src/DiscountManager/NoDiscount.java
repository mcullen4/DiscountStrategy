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
    
    private static final double DISCOUNT=0.00;
    private static final String DISCOUNT_DESCRIPTION="No discount applies";
    
    public NoDiscount(){
        
}
    
        
    @Override
    public double getDiscount() {
        return DISCOUNT;
    }

    @Override
    public String getDiscountDescription() {
    return DISCOUNT_DESCRIPTION;
    }
    
}
    
    


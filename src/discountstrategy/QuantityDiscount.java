/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Michele
 */
public class QuantityDiscount implements DiscountStrategy {
    
    
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

    @Override
    public double getDiscountAmount(double unitCost, int quantity) {
        double discountAmount;
        if(quantity>5){
            discountAmount=(unitCost*quantity)*discount;
        }
        else{
        discountAmount=0;
        }
        
        
        
        return discountAmount;
    }
    
}
    


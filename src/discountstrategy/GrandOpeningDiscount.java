/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Michele
 */
public class GrandOpeningDiscount implements DiscountStrategy {

    private double discount;
    private static final String DISCOUNT_DESCRIPTION="Grand Opening Discount";
    
    public GrandOpeningDiscount()
    {
      this.discount=.10; 
    }

    public void setDiscount(double discount) {
        //validation that discount is not less than 0 or more than 1.0
            
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
        double discountAmount = (unitCost*quantity)*discount;
        return discountAmount;
    }
    
}

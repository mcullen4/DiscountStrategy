/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Michele
 */
public interface DiscountStrategy {
    
    public abstract double getDiscount();
    public abstract String getDiscountDescription();
    public abstract double getDiscountAmount(double unitCost, int quantity);
}

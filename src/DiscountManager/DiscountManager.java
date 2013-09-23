/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscountManager;

/**
 *
 * @author Michele
 */
public interface DiscountManager {
    
    public abstract double getDiscount(int quantity);
    public abstract String getDiscountDescription();
    
}

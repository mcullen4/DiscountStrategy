/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxstrategy;

/**
 *
 * @author Michele
 */
public class WiTax implements TaxManager {
    
    private double taxPercentage = .055;
    private String taxDescription = "WI State Tax";

    @Override
    public double getTaxPercentage() {
        return taxPercentage;
    }

    @Override
    public String getTaxDescription() {
      return taxDescription;  
    }
    
}

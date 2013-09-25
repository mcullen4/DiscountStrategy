/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OutputManager;

/**
 *
 * @author Michele
 */
public interface OutputManager {
    
    public abstract String outputCustomerInformation();    
    public abstract LineItem outputLineItems();
    public abstract double outputSubTotal();
    public abstract double outputTaxAmount();
    public abstract double outputGrandTotal();
    public abstract void printReceipt();
    
}

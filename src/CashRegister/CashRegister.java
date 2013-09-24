/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CashRegister;

import OutputManager.OutputManager;
import OutputManager.Receipt;
import ProductSelection.ProductSelectionManager;

/**
 *
 * @author Michele
 */
public class CashRegister {
    
   private String[] productNumbers;
   private int[] quantities;
   private String [] lineItems;
     
   private double subtotal;
   private double total;
   private OutputManager = new Receipt();
    
    
    
    
    public CashRegister(String[] productNumbers, int[] quantities){
      this.productNumbers=productNumbers;
      this.quantities=quantities;
     
    }
    
    public void addLineItemToOutput(){
    
    }
    
    
}

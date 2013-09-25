/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OutputManager;

import DataSource.Customer;

/**
 *
 * @author Michele
 */
public class Receipt implements OutputManager {
    
    private Customer customer;
    private LineItem [] lineItems;
    
    public Receipt(Customer customer,LineItem[]lineItems ){
    this.customer=customer;
    this.lineItems = lineItems;
    
    }

    @Override
   public void printReceipt(){
        String customerInfo = customer.toString();
   System.out.println(customerInfo);
   }

    @Override
    public double outputSubTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double outputTaxAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double outputGrandTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String outputCustomerInformation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LineItem outputLineItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

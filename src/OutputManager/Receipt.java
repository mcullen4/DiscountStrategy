/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OutputManager;

import DataSource.Customer;
import java.text.DecimalFormat;
import java.util.Calendar;

/**
 *
 * @author Michele
 */
public class Receipt implements OutputManager {
    
    private Customer customer;
    private LineItem [] lineItems;
    private double grandTotal=0;
    private double totalDiscount=0;
    private DecimalFormat df = new DecimalFormat("#.00");
    
    
    public Receipt(Customer customer,LineItem[]lineItems ){
    this.customer=customer;
    this.lineItems = lineItems;
    
    }

    @Override
   public void printReceipt(){
        
   calculateTotals();
   
  // String customerInfo = customer.toString();
   System.out.println(customer.toString());
   System.out.println("======================================================"
           + "===================================================");
   
   //print the line items
   for(int a=0;a<lineItems.length;a++){
   System.out.println(lineItems[a].toString());
   }
   System.out.println("======================================================"
           + "===================================================");
   
   System.out.println("\t\t\t\t\t\t\t\t\t\t"+"Grand Total     "+grandTotal);
   System.out.println("\t\t\t\t\t\t\t\t\t\t"+"You Saved       "+totalDiscount);
   
   }

private void calculateTotals(){
for(int a = 0; a<lineItems.length;a++){

grandTotal+=lineItems[a].getProductTotal();
totalDiscount+=lineItems[a].getDiscountAmount();

//format the fields to round to 2 places
grandTotal=Double.parseDouble(df.format(grandTotal));
totalDiscount=Double.parseDouble(df.format(totalDiscount));
}
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

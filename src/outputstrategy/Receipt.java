/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package outputstrategy;

import dataretrieval.DataRetrievalManagerAbstraction;
import dataretrieval.DatabaseRetrievalManager;
import datasourcestrategy.Customer;
import datasourcestrategy.DataSource;
import datasourcestrategy.Product;
import java.text.DecimalFormat;
import java.util.Calendar;
import michele.cullen.date.util.CalendarUtilities;
import michele.cullen.date.util.JodaUtilities;
import productselection.CartItem;

/**
 *
 * @author Michele
 */
public class Receipt implements OutputManager {
    
    private Customer customer;
    private LineItem [] lineItems=new LineItem[0];
    private double grandTotal=0;
    private double totalDiscount=0;
    private DecimalFormat df = new DecimalFormat("#.00");
    private DataRetrievalManagerAbstraction dataRetrieve;
    private DataSource datasource;
    
    
    public Receipt(DataSource ds,Customer customer){
    this.datasource = ds;
    this.customer=customer;
    
    this.dataRetrieve = new DatabaseRetrievalManager(ds);
    
    }
    
    
    @Override
    public void createLineItemArray(CartItem[] cartItems) {
    
        
        /*for each item in the cartItem array, it will get the product
        and pass the product and quantity through to create a line item.*/
        for (int a = 0;a<cartItems.length;a++)
        {
        
        Product product = dataRetrieve.retrieveProduct(cartItems[a].getProductNumber());
        int quantity = cartItems[a].getQuantity();
                       
        LineItem [] temp = new LineItem[lineItems.length+1];
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
        temp[temp.length-1] = new LineItem(product,quantity);
        lineItems = temp;
        //lineItems[lineItems.length-1]= lineItem;
        //lineItems [lineItems.length-1] = new LineItem(product,quantity);
        //System.out.println(lineItems[lineItems.length-1].toString());
        }
        
        
        }
    @Override
   public void printReceipt(){
        
   calculateTotals();
   
  // String customerInfo = customer.toString();
   Calendar date = Calendar.getInstance();
   System.out.println(CalendarUtilities.convertDateToStringAndReturn(date));
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

public LineItem[] createLineItemArray(){

return lineItems;}




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

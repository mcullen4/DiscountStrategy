/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TransactionService;

import DataRetrieval.DataRetrievalManager;
import DataSource.Customer;
import DataSource.DataSource;
import DataSource.FakeDatabase;
import DataSource.Product;
import OutputManager.LineItem;
import OutputManager.OutputManager;
import OutputManager.Receipt;

/**
 *
 * @author Michele
 */
public class NewWebSale implements TransactionService{
   
    private String customerNo;
    private DataSource ds;
    private DataRetrievalManager dataRetrieve;
    private Customer customer;
    private String [] cartItems;
    private int [] quantities;
    private LineItem [] lineItems = new LineItem[0];
    
    
    
    public NewWebSale(DataSource ds, String customerNo){
    this.ds=ds;
    this.customerNo = customerNo;
    
    if (ds instanceof FakeDatabase){
        dataRetrieve = new DataRetrieval.DatabaseRetrieval(ds);
    }
    /*this needs an else statement that allows for different datasources to
     * use different retrieval methods
     */
    }
    
    
    
    @Override
    public void startTransaction(){
        
        customer = retrieveCustomer(customerNo);
        addItemToCart("GBFY10",2);
        addItemToCart("GBFY20",3);
        addItemToCart("GBFY30",7);
        checkOut();
    }  

    private Customer retrieveCustomer(String customerNo) {
        customer=dataRetrieve.retrieveCustomer(customerNo);
       return customer;
    }

    private void addItemToCart(String productNo, int quantity) {
        customer.addItemToShoppingTrip(productNo, quantity);
    }
    
    
    private void checkOut(){
        cartItems=customer.getCartItems();
        quantities = customer.getQuantities();
        createLineItemArray(cartItems, quantities);
        OutputManager receipt = new Receipt(customer,lineItems);
        receipt.printReceipt();
    }

    private void createLineItemArray(String[] cartItems, int[] quantities) {
        /*for each item in the cartItem array, it will get the product
        and pass the product and quantity through to create a line item.*/
        for (int a = 0;a<cartItems.length;a++)
        {
        Product product = dataRetrieve.retrieveProduct(cartItems[a]);
        int quantity = quantities[a];
        
        LineItem lineItem = new LineItem(product,quantity);
        
        
        
        //copy the array so that each line item can be added
        if(lineItems!=null){
        LineItem [] temp = new LineItem[lineItems.length+1];
        System.arraycopy(lineItems, 0, temp, 0, 0);
        lineItems = temp;
        lineItems[lineItems.length-1]=lineItem;
        }else
        {
            lineItems[0] = lineItem;
        }
        
        
        }
    }
   
}
    
//    private Customer activeCustomer;
//    
//    private String [] cartItems;
//    private int [] itemQuantities;
//    private CashRegister cashRegister;
//    private String receipt;
//    
//    
//    
//    public NewWebSale(String customerNo){
//    activeCustomer=customer;    
//    cartItems  = activeCustomer.getCartItems();
//    itemQuantities = activeCustomer.getQuantities();
//    cashRegister = new CashRegister(cartItems, itemQuantities);
//    
//    }
//    
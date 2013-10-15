/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transactionservice;

import dataretrieval.DataRetrievalManagerAbstraction;
import datasourcestrategy.Customer;
import datasourcestrategy.DataSource;
import outputstrategy.OutputManager;
import outputstrategy.Receipt;
import dataretrieval.DatabaseRetrievalManager;
import productselection.CartItem;

/**
 *
 * @author Michele
 */
public class WebSale implements TransactionService{
   
    private String customerNo;
    private DataSource ds;
    private DataRetrievalManagerAbstraction dataRetrieve;
    private Customer customer;
    private CartItem [] cartItems;
    
    
    
    
    
    public WebSale(DataSource ds, String customerNo){
    this.ds=ds;
    this.customerNo = customerNo;
    dataRetrieve=new DatabaseRetrievalManager(ds);
    customer=dataRetrieve.retrieveCustomer(customerNo);

    }
    
    
    
    @Override
    public void startTransaction(){
        //this is where the 
        customer = retrieveCustomer(customerNo);
        
        checkOut();
    }  

    private Customer retrieveCustomer(String customerNo) {
        customer=dataRetrieve.retrieveCustomer(customerNo);
       return customer;
    }

    
    
    
    @Override
    public void addItemToCart(String productNo, int quantity) {
        
        customer.addItemToShoppingTrip(productNo, quantity);
    }
    
    
    @Override
    public void checkOut(){
        CartItem cartItems[]=customer.getCartItems();
        OutputManager receipt = new Receipt(ds,customer);
        receipt.createLineItemArray(cartItems);
        receipt.printReceipt();
    }


    @Override
    public void saveCartForLater() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
   

    

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TransactionService;

import CashRegister.CashRegister;
import DataSource.Customer;

/**
 *
 * @author Michele
 */
public class NewSale implements TransactionService{
   
    private String customerNo;
    
    public NewSale(String customerNo){
    this.customerNo = customerNo;
    }
    
    @Override
    public void startTransaction(){
        
        retrieveCustomer();
        addItemsToCart();
        goToCheckOut();
    }  

    private void retrieveCustomer() {
       
    }

    private void addItemsToCart() {
        
    }

    private void goToCheckOut() {
        
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
//    public NewSale(String customerNo){
//    activeCustomer=customer;    
//    cartItems  = activeCustomer.getCartItems();
//    itemQuantities = activeCustomer.getQuantities();
//    cashRegister = new CashRegister(cartItems, itemQuantities);
//    
//    }
//    
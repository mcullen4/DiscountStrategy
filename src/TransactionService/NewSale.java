/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TransactionService;

import CashRegister.CashRegister;
import Customer.Customers;

/**
 *
 * @author Michele
 */
public class NewSale {
    
    private Customers activeCustomer;
    
    private String [] cartItems;
    private int [] itemQuantities;
    private CashRegister cashRegister;
    
    
    
    public NewSale(Customers customer){
    activeCustomer=customer;    
    cartItems  = activeCustomer.getCartItems();
    itemQuantities = activeCustomer.getQuantities();
    cashRegister = new CashRegister(cartItems, itemQuantities);
    
    }
    
    //private checkOut(){
    //CashRegister cashRegister = new CashRegister();
    //}
    
}   

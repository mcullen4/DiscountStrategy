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
public class NewSale implements TransactionService{
    
    private Customers activeCustomer;
    
    private String [] cartItems;
    private int [] itemQuantities;
    private CashRegister cashRegister;
    private String receipt;
    
    
    
    public NewSale(Customers customer){
    activeCustomer=customer;    
    cartItems  = activeCustomer.getCartItems();
    itemQuantities = activeCustomer.getQuantities();
    cashRegister = new CashRegister(cartItems, itemQuantities);
    
    }
    @Override
    public void processTransaction(
            
            
            
            ){}
    
    @Override
    public String outputTransaction(){
    return receipt;
    }
    
}   

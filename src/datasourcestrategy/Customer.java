/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasourcestrategy;

import productselection.CartItem;
import productselection.ProductSelectionStrategy;

/**
 *
 * @author Michele
 */
public class Customer {
    
    private String customerNo;
    private String fName;
    private String lName;
    private ProductSelectionStrategy productSelection;
    
    

    public Customer(String customerNo, String fName, String lName, 
        ProductSelectionStrategy productSelection) {
        this.setCustomerNo(customerNo);
        this.setfName(fName);
        this.setlName(lName);
        this.setProductSelection(productSelection);
        
             
    }

    public Customer() {
        
    }
    
    public CartItem[] getCartItems(){
    return productSelection.getCartItems();
    }
    
    
    
    public void addItemToShoppingTrip(String productNo, int quantity){
    CartItem cartItem = new CartItem(productNo, quantity);  
    productSelection.addItem(cartItem);
    
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
    
    public void setProductSelection(ProductSelectionStrategy pSM){
        this.productSelection = pSM;
        
    }

    public ProductSelectionStrategy getProductSelectionManager() {
        return productSelection;
    }
    
    @Override
    public String toString(){
    String str = "Customer Number:  "+customerNo+
            "\nCustomer Name:  "+fName+" "+lName; 
        return str;
    }
    
    public String viewCustomerCart(){
        String str = productSelection.toString();
        return str;
    }
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import ProductSelection.ProductSelectionManager;

/**
 *
 * @author Michele
 */
public class Customers {
    
    private String customerNo;
    private String fName;
    private String lName;
    private ProductSelectionManager productSelectionManager;
    
    

    public Customers(String customerNo, String fName, String lName, 
        ProductSelectionManager productSelectionManager) {
        this.setCustomerNo(customerNo);
        this.setfName(fName);
        this.setlName(lName);
        this.setProductSelectionManager(productSelectionManager);
        
             
    }

    public Customers() {
        
    }
    
    public String[] getCartItems(){
    return productSelectionManager.getProductNumbers();
    }
    
    public int[] getQuantities(){
    return productSelectionManager.getQuantities();
    }
    
    public void addItemToShoppingTrip(String productNo, int quantity){
        
    productSelectionManager.addItem(productNo, quantity);
    
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
    
    public void setProductSelectionManager(ProductSelectionManager pSM){
        this.productSelectionManager = pSM;
        
    }

    public ProductSelectionManager getProductSelectionManager() {
        return productSelectionManager;
    }
    
    @Override
    public String toString(){
    String str = "Customer Number:  "+customerNo+
            "\nCustomer Name:  "+fName+" "+lName; 
        return str;
    }
    
    public String viewCustomerCart(){
        String str = productSelectionManager.toString();
        return str;
    }
    
    
}

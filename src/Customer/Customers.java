/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import ProductSelection.Cart;
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

    public Customers(String customerNo, String fName, String lName) {
        setCustomerNo(customerNo);
        setfName(fName);
        setlName(lName);
        
        //Default the productSelectionManager to a cart
        productSelectionManager = new Cart();
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
    
    
    
    
}

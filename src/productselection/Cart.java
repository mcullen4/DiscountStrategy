/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package productselection;

/**
 *
 * @author Michele
 */
public class Cart implements ProductSelectionStrategy{
    
    
   

    private CartItem[] cartItems = new CartItem[0];
    
    
    @Override
    public void addItem(CartItem cartItem) {
        
        //validation that String is not null and that quant is not 0
        
        
             if(cartItem!=null){
//                 
             CartItem [] tempItems = new CartItem[cartItems.length+1];
             System.arraycopy(cartItems, 0, tempItems, 0, cartItems.length);
             cartItems=tempItems;
             
             cartItems[cartItems.length-1]=cartItem;
             
             
        }
        
    }  

   



    @Override
    public void deleteItem() {
        
        
        //not important right now - code if there is time
        
    }

    @Override
    public void clearAllItems() {
        
        //not important right now - code if there is time
        
    }

    @Override
    public CartItem[] getCartItems() {
        return cartItems;
    }

    public void setCartItems(CartItem[] cartItems) {
        this.cartItems = cartItems;
    }

   
    }
    
   

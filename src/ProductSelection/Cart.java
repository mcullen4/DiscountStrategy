/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductSelection;

/**
 *
 * @author Michele
 */
public class Cart implements ProductSelectionManager{
    
    
   

    private String[] selectedItems = new String[0];
    private int [] quantity = new int[0];
    
    @Override
    public void addItem(String productNo,int quant) {
        
        //validation that String is not null and that quant is not 0
        
        //wanted to have this stored in one multi dimension array but could
        //not get the arraycopy to work - researched quite a bit on the net
        //but did not find a workable solution
        
        if (selectedItems.length > 0){
             String [] tempItems = new String[selectedItems.length+1];
             int [] tempQuantities = new int[quantity.length+1];
             System.arraycopy(selectedItems, 0, tempItems, 0, selectedItems.length);
             System.arraycopy(quantity, 0, tempQuantities, 0, quantity.length);
             selectedItems=tempItems;
             quantity=tempQuantities;
             selectedItems[selectedItems.length-1]=productNo;
             quantity[quantity.length-1]=quant;
             
        }
        else{
            selectedItems[0]=productNo;
            quantity[0]=quant;
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

    public String[]getSelectedItems() {
        return selectedItems;
    }
    
    public int[]getQuantity(){
        return quantity;
    }
    
}

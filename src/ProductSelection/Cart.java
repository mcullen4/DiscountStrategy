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
    
    
   private int columns=1;
   private int rows=0;

    private String[][] selectedItems = new String[rows][columns];
    
    @Override
    public void addItem(String productNo,int quantity) {
        
        //if(selectedItems.length>0){
        
        String[] product = new String[];
        String quant = Integer.toString(quantity);
        
        String[][] temp = new String[selectedItems.length+1][columns];
        for (int i = 0; i<selectedItems.length;i++)
        {
                for (int a = 0; a<selectedItems[i].length;a++){
                temp[i][a]=selectedItems[i][a];
            }
        //System.arraycopy(selectedItems[i],0,temp[i],0,selectedItems[i].length);
        //temp [i][0] = selectedItems [i][0];
        //temp [i][1] = selectedItems [i][1];
        
        }
        selectedItems=temp;
        
       selectedItems[selectedItems.length-1][0] = product;
       selectedItems[selectedItems.length-1][1] = quant;
        
    //}   else{
        //selectedItems[0][0] = productNo;
        //selectedItems[0][1] = Integer.toString(quantity);
        //}
    }
        




    @Override
    public void deleteItem() {
        
        
        //not important right now - code if there is time
        
    }

    @Override
    public void clearAllItems() {
        
    }

    public String[][] getSelectedItems() {
        return selectedItems;
    }
    
}

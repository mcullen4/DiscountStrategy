/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import DiscountManager.DiscountManager;

/**
 *
 * @author Michele
 */
public class Products {
    
    private String productNumber;
    private String description;
    private double unitCost;
    private DiscountManager dm;
    
    public Products(String prodNo, String desc, double uCost, DiscountManager
            discMan){
    this.setProductNumber(prodNo);
    this.setDescription(desc);
    this.setUnitCost(uCost);
    this.setDm(discMan);
    
    
    
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public DiscountManager getDm() {
        return dm;
    }

    public void setDm(DiscountManager dm) {
        this.dm = dm;
    }
    
}

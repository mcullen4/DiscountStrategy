/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasourcestrategy;

import discountstrategy.DiscountStrategy;

/**
 *
 * @author Michele
 */
public class Product {
    
    private String productNumber;
    private String description;
    private double unitCost;
    private DiscountStrategy dm;
    
    
    public Product(String prodNo, String desc, double uCost, DiscountStrategy
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

    public DiscountStrategy getDm() {
        return dm;
    }

    public void setDm(DiscountStrategy dm) {
        this.dm=dm;
    }
    public double getProductDiscount(){
        double discount=dm.getDiscount();
        return discount;
    }
    public String getProductDiscountDescription(){
        String desc = dm.getDiscountDescription();
        return desc;
    }
    
    
}

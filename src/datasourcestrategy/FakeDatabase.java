/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasourcestrategy;

/**
 *
 * @author Michele
 */
public class FakeDatabase implements DataSource {

    //create an array of customer objects
    
    private Customer[] customer = {new Customer("C100", "Joe", "Smith",
        new productselection.Cart()), new Customer("C101", "Michele",
        "Cullen", new productselection.Cart()), new Customer("C102",
        "John", "Doe", new productselection.Cart())};
    
    
    //create an array of product objects
    
    private Product[] product = {new Product("GBFY10", "Packer Hat", 19.95,
        new discountstrategy.NoDiscount()), new Product("GBFY20", "Packer "
        + "Jersey", 49.95, new discountstrategy.GrandOpeningDiscount()),
        new Product("GBFY30", "Bumper Stickers", 3.95, new 
        discountstrategy.QuantityDiscount())};
    
    
    
    


    @Override
    public Customer[] getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer[] customer) {
        this.customer = customer;
    }

    @Override
    public Product[] getProduct() {
        return product;
    }

    @Override
    public void setProduct(Product[] product) {
        this.product = product;
    }
    
    
    
    
    
    
}

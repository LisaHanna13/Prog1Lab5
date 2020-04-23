/**
* Lisa Hanna
* 21 April, 2020
* Step 4 of Lab5 -- This is exercise #56 in the textbook It creates a class for a television set.
*/
package prog1lab5;

/**
 *
 * @author lisa-
 */
public class Number56 {
    /**
     * Creating attributes
     */
    String brand;
    double price;
    
    /**
     * This constructor initializes the brand and price of TVs
     * @param brand
     * @param price 
     */
    public Number56(String brand, double price){
        this.brand = brand;
        this.price = price;
    }
    
    /**
     * This accessor gets the brand name
     * @return brand name
     */
    public String getBrand(){
        return brand;
    }
    
    /**
     * This accessor gets the price
     * @return price
     */
    public double getPrice(){
        return price;
    }
    
    /**
     * This method allows to set a brand value
     * @param brand 
     */
    void setBrand(String brand){
        this.brand = brand;
    }
    
    /**
     * This method allows to set a price value
     * @param price 
     */
    void setPrice(double price){
        this.price = price;
    }
    
    /**
     * 
     * @param other
     * @return Bollean value that compares two TVs
     */
    public boolean equals(Number56 other){
        return (brand.equals(other.brand)) && (price == (other.price));
    }
    
    /**
     * 
     * @return a print statement cleanly
     */
    public String toString(){
        return "--------------------------------------" +
                "\nTHE TV BRAND IS: " + brand + 
                "\nTHE TV PRICE IS: " + price +
                "\n-------------------------------------";
        
    }
}

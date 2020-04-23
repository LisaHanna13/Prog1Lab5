/**
* Lisa Hanna
* 21 April, 2020
* Step 4 of Lab5 -- This file tests everything exercise #56 in the textbook
*/
package prog1lab5;

/**
 *
 * @author lisa-
 */
public class Number56Client {
    
    /**
     * This main method tests for everything in Number56
     * @param args 
     */
    public static void main(String[] args) {
        /**
         * Create TV objects
         */
        Number56 tv1 = new Number56("TCL", 205.60);
        Number56 tv2 = new Number56("TCL", 210.99);
        Number56 tv3 = new Number56("Roku", 300.85);
        Number56 tv4 = new Number56("Sony", 350.99);
        Number56 tv5 = new Number56("TCL", 205.60);
        /**
         * Use mutator method
         */
        tv3.setBrand("RokuUpgraded");
        tv4.setPrice(339.99);
        
        //Test the constructor, accessor, mutator, and toString method
        System.out.println("The tv's brand is " + tv3.brand + " and the price is " + tv3.price);
        System.out.println("The tv's brand is " + tv4.getBrand() + " and the price is " + tv4.getPrice());
        System.out.println("\n" +tv2);
        
        /**
         * Test the equals method
         */
        System.out.println("Are TV1 and TV2 equal?: " + tv1.equals(tv2));
        System.out.println("Are TV1 and TV5 equal?: " + tv1.equals(tv5));
    }
}

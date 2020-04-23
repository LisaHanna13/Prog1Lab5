/**
* Lisa Hanna
* 21 April, 2020
* Step 3 of Lab5 -- Program that tests everything in the book file 
*/
package prog1lab5;

/**
 *
 * @author lisa-
 */
public class Client {
        /**
         * This main method tests everything defined in the book file
         * @param args 
         */
    public static void main(String[] args) {
        /**
         * Create books (objects) based on the constructor that contains all non-static attributes
         */
        Book one = new Book("And Then There Were None", "Agatha Christie", "195-243", 1939); 
        /**
         * Since there is one new object, increment the amountOfBooks
         */
        one.increment();
        
        Book two = new Book("Hunger Games", "Suzanne Collins", "199-783", 2008);
        two.increment();
        
        Book three = new Book("How to Survive Quarantine", "Lisa Hanna", "200-138", 2020);
        three.increment();
        
        Book four = new Book("And Then There Were None", "Agatha Christie", "195-243", 1939);
        four.increment();
        
        /**
         * Test the mutator by setting one of the years to a negative value, and changing one of the publishers
         */
        three.setYear(-2020);
        one.setPublisher("Collins Crime Club");
        
        
        /**
         * Start printing things out to test more methods
         * This tests the toString method to make sure it works, and it tests the mutator by seeing the warning
         */
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        
        /**
         * This tests the increment method, and the accessor for the amount of books
         */
        System.out.println("There is a total of " + four.getAmountOfBooks()+ " books");
        
        /**
         * This tests the equals method
         */
        System.out.println("\nFYI, Are books one and four the same?: " + one.equals(four));
        System.out.println("FYI, Are books two and three the same?: " + two.equals(three));
        
        /**
         * Finally, this tests if two objects have the same publisher and amountOfBooks
         */
        if (two.getAmountOfBooks() == three.getAmountOfBooks() && two.getPublisher() == three.getPublisher()){
            System.out.println("\nBooks #2 and #3 share the same publisher and amount of books.");
        }else{
            System.out.println("Books #2 and #3 do not share the same publisher and amount of books.");
        }
        
        if (one.getAmountOfBooks() == three.getAmountOfBooks() && one.getPublisher() == three.getPublisher()){
            System.out.println("Books #1 and #3 share the same publisher and amount of books.");
        }else{
            System.out.println("Books #1 and #3 do not share the same publisher and amount of books.");
        }
        
        System.out.println("\nThanks for using!");
    }
}

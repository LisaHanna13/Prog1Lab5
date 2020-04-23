/**
* Lisa Hanna
* 21 April, 2020
* Step 4 of Lab5 -- This file checks that everything works for #57 in the textbook. 
*/
package prog1lab5;

/**
 *
 * @author lisa-
 */
public class Number57Client {
     /**
     * This main method tests for everything in Number56
     * @param args 
     */
    public static void main(String[] args) {
        /**
         * Create course grade objects
         */
        Number57 one = new Number57("Maths", 'M');
        Number57 two = new Number57("English", 'M');
        Number57 three = new Number57("Maths", 'M');
        Number57 four = new Number57("Spanish", 'D');
        Number57 five = new Number57("Programming", 'P');
        /**
         * Use the mutators
         */
        two.setCourseName("Game Programming");
        four.setLetter('S');
        
        //Test the constructor, accessor, mutator, and toString method
        System.out.println("The course name is " + four.courseName + " and the letter is " + four.letter);
         System.out.println("The course name is " + five.getCourseName() + " and the letter is " + five.getLetter());
        System.out.println("\n" + three);
        
        /**
         * Test the equals method
         */
        System.out.println("\nAre course 1 and course 2 the same?: " + one.equals(two));
        System.out.println("Are course 1 and course 3 the same?: " + one.equals(three));
    }
}

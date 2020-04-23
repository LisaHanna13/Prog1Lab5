/**
*Lisa Hanna
*21 April, 2020
*Step 2 of Lab5 -- Program that computes the greatest common divisor of two integers
*/
package prog1lab5;
import java.util.Scanner;
/**
 *
 * @author lisa-
 */
public class GreatCommonDivisor {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
        /**
         * Create a Scanner for user input
         */
        Scanner keyboard = new Scanner(System.in);
        /**
         * Create variables
         */
        int num1, num2, gcd = 0;
        
        
        /**
         * Print instructions for user
         */
        System.out.print("Hello! Please input two integers: ");
        
        /**
         * Make sure it's an int
         */
        while (!keyboard.hasNextInt()){
            System.out.print("Sorry, the first value is not an integer. Please enter two integers again: ");
            keyboard.nextLine();
        }
        /**
         * Store the data
         */
        num1 = keyboard.nextInt();
        /**
         * Make sure it's an int
         */
        while (!keyboard.hasNextInt()){
            System.out.print("Sorry, the second value is not an integer! Please enter ONE integer: ");
            keyboard.nextLine();
        }
        /**
         * Store the data
         */
        num2 = keyboard.nextInt();
        
        /**
         * Use a for loop to do the calculation
         */
        for (int i = 1; i <= num1 || i <= num2; i++){
            if (num1 %i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd);
    }
}

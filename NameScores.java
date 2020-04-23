/**
* Lisa Hanna
* 21 April, 2020
* Step 1 of Lab5 -- Program that reads file, and outputs highest & lowest score,
* total amount of grades, and average score of multiple names.
*/
package prog1lab5;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * @author lisa
 */
public class NameScores {
/**
 * 
 * @param args
 * @throws FileNotFoundException 
 */
    public static void main(String[] args) throws FileNotFoundException {
        /**
         * Create a scanner that reads a file
         */
        File inFile = new File("NameScoreList.txt");
        Scanner keyboard = new Scanner(inFile);
        
        /**
         * Create variables necessary
         */
        int max = 0, min = 100000, counter = 0, total = 0, score;
        String name = "", maxName = "", minName = "";
        
        /**
         * Create a loop that reads each line until the line "END"
         */
        while (keyboard.hasNext()){
            /**
             * Get the string, make sure it's not the end
             */
            name = keyboard.next();
            if (name.equals("END")){
                break;
            }else{
                score = keyboard.nextInt();
                /**
                 * Increment the counter
                 */
                counter++;
                
                /**
                 * Determine if max needs to be update
                 */
                if (max < score){
                    max = score;
                    maxName = name;
                }
                
                /**
                 * Determine if min needs to be update
                 */
                if (min > score){
                    min = score;
                    minName = name;
                }
                
                /**
                 * Add the score to the total
                 */
                total += score;
            }
        }
        /**
         * Calculate the average of grades
         */
        double average = (double)total/counter;
        
        /**
         * Print the results required
         */
        System.out.println("The maximum grade obtained was by " + maxName);
        System.out.println("The minimum grade obtained was by " + minName);
        System.out.println("There was a total of " + counter + " grades.");
        System.out.println("The average grade was " + String.format("%.2f",average));
    }  
}

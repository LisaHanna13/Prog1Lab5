/**
* Lisa Hanna
* 21 April, 2020
* Step 4 of Lab5 -- This is the class that tests #55 in the textbook
*/
package prog1lab5;

/**
 *
 * @author lisa-
 */
public class Number55Client {
    /**
     * This main method tests everything contained in exercise #55.
     * @param args 
     */
    public static void main(String[] args) {
        /*
        * Create team objects
        */
        Number55 team1 = new Number55("Eagles");
        Number55 team2 = new Number55("Philly");
        Number55 team3 = new Number55("Eagles");
        Number55 team4 = new Number55("Canadians");
        //Use mutator
        team4.setTeamName("Rangers");
        
        /*
        * Test the constructor, the accessor, mutator method and the toString method
        */
        System.out.println("This team's name is " + team1.teamName);
        System.out.println(team2);
        System.out.println("The fourth's team's name is " + team4.getTeamName());
        
        /*
        * Test the equals method
        */
        System.out.println("Are teams 1 and 4 the same?: " + team1.equals(team4));
        System.out.println("Are teams 1 and 3 the same?: " + team1.equals(team3));
        
    }
    
}

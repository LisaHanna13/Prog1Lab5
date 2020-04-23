/**
* Lisa Hanna
* 21 April, 2020
* Step 4 of Lab5 -- This is exercise #55 in the textbook It creates a class for a team.
*/
package prog1lab5;
/**
 *
 * @author lisa-
 */
public class Number55 {

    /**
     * Creating attributes
     */
    String teamName;
    
    /**
     * This constructor initializes the teamName
     * @param teamName 
     */
    public Number55(String teamName){
        this.teamName = teamName;
    }
    
    /**
     * This accessor returns the team name
     * @return teamName
     */
    public String getTeamName(){
        return teamName;
    }
    
    /**
     * This mutator can be used to set a teamName
     * @param teamName 
     */
    void setTeamName(String teamName){
        this.teamName = teamName;
    }
    
    /**
     * This method compares two team names
     * @param other
     * @return boolean value comparing two teamNames
     */
    public boolean equals(Number55 other){
        return (teamName.equals(other.teamName));
    }
    
    /**
     * This method prints a statement with the team name.
     * @return the team name
     */
    public String toString(){
        return ("The team name is " + this.teamName);
    }
}
/**
* Lisa Hanna
* 21 April, 2020
* Step 4 of Lab5 -- This file is for #57 in the textbook. 
*/
package prog1lab5;

/**
 *
 * @author lisa-
 */
public class Number57 {
    /**
     * Creating attributes
     */
    String courseName;
    char letter;
    
    /**
     * This constructor initializes the attributes for a course grade
     * @param courseName
     * @param letter 
     */
    public Number57(String courseName, char letter){
        this.courseName = courseName;
        this.letter = letter;
    }
    
    /**
     * This accessor gets the course name
     * @return courseName
     */
    public String getCourseName(){
        return courseName;
    }
    
    /**
     * This accessor gets the letter
     * @return letter
     */
    public char getLetter(){
        return letter; 
    }
    
    /**
     * This mutator allows to set a course name
     * @param courseName 
     */
    void setCourseName(String courseName){
        this.courseName = courseName;
    }
    
    /**
     * This mutator allows to set a letter
     * @param letter 
     */
    void setLetter (char letter){
        this.letter = letter;
    }
    
    /**
     * @return a clean printed statement
     */
    public String toString(){
        return "COURSE GRADE" +
                "\n------------------------------------" +
                "\nCourse Name  : " + courseName + 
                "\nCourse Letter: " + letter + 
                "\n------------------------------------";
    }
    
    /**
     * This method allows to compare two course grades
     * @param other
     * @return boolean value comparing two course grades
     */
    public boolean equals(Number57 other){
        return (courseName.equals(other.courseName)) && letter == (other.letter);
    }
}

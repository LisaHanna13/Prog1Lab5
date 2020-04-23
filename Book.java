/**
* Lisa Hanna
* 21 April, 2020
* Step 3 of Lab5 -- Program that encapsulates the concept of a book (has various
* attributes and methods).
*/
package prog1lab5;

/**
 * @author lisa-
 */
public class Book {
    /**
     * Creating the attributes
     */
    String title, author, ISBN;
    int yearPublish;
    static String publisher = "Vanier";
    static int amountOfBooks = 0;
    
    /**
     * Create a constructor for the basic attributes
     * @param title is the title of the book
     * @param author is the author of the book
     * @param ISBN is the International Standard Book Number
     * @param yearPublish is the year of publication of the book
     */
    public Book(String title, String author, String ISBN, int yearPublish){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublish = yearPublish;   
        setYear(yearPublish);
    }
    
    /**
     * Call this method to increment the amount of books by one
    */
    public void increment(){
    amountOfBooks++;
    }   
    
    /**
     * Use this method to compare two ISBN'S
     * @return two ISBN values 
     */
    public boolean equals(Book other){
        return (ISBN.equals(other.ISBN));
    }

    /**Use a mutator to set the year
     * 
     * @param yearPublish 
     */
    void setYear (int yearPublish){
        this.yearPublish = yearPublish;
        if (yearPublish <= 0){
            System.out.println("ATTENTION: There is a negative Year value.");
        }
    }
    
    /**
     * Use a mutator to set a new publisher
     * @param publisher
     */
    void setPublisher (String publisher){
        this.publisher = publisher;
    }
    
    /**Use an accessor to get the publisher of the book 
     * 
     * @return publisher
     */
    public String getPublisher(){
    return publisher;
    }
    
    /**Use an accessor to get the amountOfBooks
     * 
     * @return amountOfBooks
     */
    public int getAmountOfBooks(){
        return amountOfBooks;
    }
    
    /**Use the toString method to print neatly
     * 
     * @return title, author, ISBN, year published, publisher
     */
    public String toString(){
        return "\nTHE BOOK SELECTED IS: " + this.title + 
                "\n---------------------------------------------------" +
                "\n The author is:             " + this.author + 
                "\n The ISBN is:               " + this.ISBN + 
                "\n The book was published in: " + this.yearPublish +
                "\n The publisher is:          " + this.publisher +
                "\n---------------------------------------------------"; 
    }
}

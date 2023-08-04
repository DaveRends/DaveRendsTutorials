package exam.Q9;


/**
 * The class Book models a book on a shelf in a library
 * @ M250 MT 
 * @version 1.0
 */

 public class Book
 {
     private String title;   // the title of the book
     private String author;  // the book's author (name)
     private int thickness;  // the book's thickness
   
 
     /**
      * Constructor for a Book object, title, author and thickness     
      */   
     public Book(String aTitle, String anAuthor, int aThickness)
     {   
        title = aTitle;
        author = anAuthor;
        thickness = aThickness;    
     }   
    
     // getters
 
     /**
      * @return the title of this book
      */
     public String getTitle()
     {
        return title;
     }
    
     /**
      * @return the author of this book
      */
     public String getAuthor()
     {
        return author;
     }
   
     /**
      * @return the thickness of this book
      */ 
     public int getThickness()
     {
        return thickness;
     }   
 
     /**
      *  Returns true if the parameter object has the same author and title as this 
      *  book object, and false otherwise
      *  @param the object with which to compare
      *  @return true if this object is the same as the obj argument; false otherwise.
      */   
     public boolean equals(Object obj)
     {
        if(this == obj) {
            return true; 
        }
        
        if(!(obj instanceof Book)) {
            return false;
        }
 
        Book other = (Book) obj;
        return author.equals(other.author) &&
            title.equals(other.title);
     }
 
     public int compareTo(Book anotherBook)
     {
         if(title.equals(anotherBook.title)) {
           return author.compareTo(anotherBook.author);
         }
           
         return title.compareTo(anotherBook.title);
     }
 
     public int hashCode()
     {
        return author.hashCode() + title.hashCode();
     }
   
     /**
      * @return a String description of this book object.
      */   
     public String toString()
     {
        return author + " wrote " + title + " thickness: " + thickness;
     }
 }
    
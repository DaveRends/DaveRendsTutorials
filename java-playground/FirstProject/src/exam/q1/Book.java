package exam.q1;

import java.util.Objects;

public class Book
{
   private String title; 
   private Author author;
   private int price; 
   
   public Book()
   {
      title = "";
      author = null;
      price = 0;
   }
   
   public Book(String aTitle, Author theAuthor, int aPrice)
   {
      title = aTitle;
      author = theAuthor;
      price = aPrice;
    }
   
   public boolean equals(Object obj)
   {
      if(this == obj)
        return true;
      if (obj instanceof Book) {
        Book anotherBook = (Book) obj;
        return title.equals(anotherBook.title) && author.equals(anotherBook.author);
        }
       return false;
    }
    
    public int hashCode()
    {
      return Objects.hash(title, author);
    }   
}

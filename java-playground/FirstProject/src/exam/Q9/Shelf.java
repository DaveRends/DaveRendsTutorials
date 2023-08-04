package exam.Q9;

import java.util.*;
import java.util.TreeSet;


public class Shelf implements Comparable<Shelf> { 
    public static final int SHELF_LENGTH = 10; 
    private String id;
    // Q9 a i) 
    private TreeSet<Book> books;

    // Q9 a ii)
    public Shelf(String shelfID)
    {
        id = shelfID;
        books = new TreeSet<>();
    }

    // Q9 a iii)
    public TreeSet<Book> getBooks()
    {
        return books;
    }

    // Q9 a iv)
    public String firstBook()
    {
        if (!books.isEmpty())
        {
            return books.first().getTitle();
        }
        else
        {
            return "No books on this shelf";
        }
    }

    // Q9 a v)
    public void addBook(Book aBook)
    {
        // Get space left on shelf
        int spaceLeft = SHELF_LENGTH;
        for (Book b : books)
        {
            spaceLeft = spaceLeft - b.getThickness();
        }
        // If book thickness is less than space remaining, add book
        if (aBook.getThickness() < spaceLeft)
        {
            books.add(aBook);
        }
    }

    // Q9 a vi)
    public int compareTo(Shelf s)
    {
        return id.compareTo(s.getId());
    }

    
    public String getId() 
    {
        return id;
    }
    
    public int hashCode() 
    { 
       return id.hashCode(); 
    } 
    
    public boolean equals(Object o) 
    { 
        Shelf s = (Shelf) o; 
        return s.id.equals(this.id); 
    }

    

     
 }

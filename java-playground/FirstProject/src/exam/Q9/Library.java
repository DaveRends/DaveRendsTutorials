package exam.Q9;
import java.util.*;

public class Library { 

    // Q9 b i)
    public ArrayList<Shelf> shelves; 

    public ArrayList<Shelf> getShelves() 
    { 
       return shelves; 
    }

    // Q9 b ii)
    public Library ()
    {
        shelves = new ArrayList<Shelf>();
    }

    // Q9 b iii)
    public void addShelf(Shelf aShelf)
    {
        shelves.add(aShelf);
    }

    // Q9 b iv)
    public HashMap<String, ArrayList<Book>> shelfMap()
    {
        HashMap<String, ArrayList<Book>> aShelfMap = new HashMap<String, ArrayList<Book>>();
        // Need a temporary Treeset to hold the books in here

        // Loop through each shelf in shelves
        for (Shelf s : shelves)
        {
            ArrayList<Book> theBooks = new ArrayList<>();
            for (Book b : s.getBooks())
            {
                theBooks.add(b);
            }
            aShelfMap.put(s.getId(), theBooks);
        }

        return aShelfMap;
    }

 }

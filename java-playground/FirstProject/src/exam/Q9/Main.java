package exam.Q9;

public class Main {

    public static void main(String[] args) throws Exception 
    {
        Shelf s42 = new Shelf("History44");
        Shelf t99 = new Shelf("Science200");
        Book book1 = new Book("FunHouse", "Cornwell", 5);
        Book book2 = new Book("boreHouse", "Cornwell", 5);
        Book book3 = new Book("GreyFace", "Cornwell", 5);
        Book book4 = new Book("TimeLapse", "Cornwell", 5);
        // Test book stuff
        System.out.println(book1.getAuthor() + " " + book1.getTitle() + " " + book1.getThickness());
        System.out.println("Book 1 == book 1? " + book1.equals(book1));
        System.out.println("Book 1 == book 4? " + book1.equals(book4));
        System.out.println("Hashcode book 1 = " + book1.hashCode());
        // Test shelf stuff
        s42.addBook(book4);
        s42.addBook(book3);
        s42.addBook(book2);
        s42.addBook(book1);
        System.out.println("Get the books " + s42.getBooks());
        // System.out.println
        // System.out.println
        // System.out.println
        // System.out.println
        // System.out.println
        // System.out.println
        // System.out.println

    }

    
}

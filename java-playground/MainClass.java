import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Main Class running 4");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name :");
        String name = scan.nextLine();
        System.out.println("Hi  " + name);
        scan.close();
    }
}

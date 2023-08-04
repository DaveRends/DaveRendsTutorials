package Child;
import java.awt.Color;


//import com.sun.prism.paint.Color;

public class Main 
{
    //private static final java.awt.Color WHITE = null;

    public static void main(String[] args) throws Exception 
    {
        System.out.println("Make a nickname");
        Child dave = new Child("Dave", "Rendell");  
        System.out.println(dave.getNickname());
        System.out.println("Test all getter methods from person superClass");
        System.out.println("First name - " + dave.getFirstName());
        System.out.println("Last name - " + dave.getLastName());
        System.out.println("Money - " + dave.getMoney());
        System.out.println("Friends - " + dave.getNumFriends());
        System.out.println("Shirt colour - " +  dave.getShirtColour().toString());
        System.out.println("Is this white - " +  (dave.getShirtColour().toString().equals(Color.WHITE.toString())));
        System.out.println("Buy a snack for £5");
        dave.buySnack(5);
        System.out.println("Money left - " + dave.getMoney());
        System.out.println("Print bye for 5 friends:");
        dave.setNumFriends(5);
        dave.goHome();
        System.out.println("Am I playing");
        System.out.println(dave.isPlaying());
        System.out.println("My shirt is " + dave.getShirtColour());
        System.out.println("Setting shirt to Black");
        Color black = new Color(0,0,0);
        Color salmon = new Color(250,128,114);
        dave.setShirtColour(black);
        System.out.println("My shirt is " + dave.getShirtColour());
        dave.setShirtColour(salmon);
    }
}

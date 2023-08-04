package musicHall;

public class Main 
{

    public static void main(String[] args) throws Exception 
    {
        System.out.println("Starting tests");
        System.out.println("Create the gig");
        Concert gig1 = new Concert("1988-07-14", "RendsFest");
        Concert bandFest = new Concert("1990-07-14", "CulzFest");
        System.out.println("Get concert duration");
        gig1.getConcertLength();
        System.out.println("Compare concert names - negative means the first object comes first"); 
        System.out.println(bandFest.compareTo(gig1));
        // Child dave = new Child("Dave", "Rendell");  
        // System.out.println(dave.getNickname());
        // System.out.println("Test all getter methods from person superClass");
        // System.out.println("First name - " + dave.getFirstName());
        // System.out.println("Last name - " + dave.getLastName());
        // System.out.println("Money - " + dave.getMoney());
        // System.out.println("Friends - " + dave.getNumFriends());
        // System.out.println("Shirt colour - " +  dave.getShirtColour().toString());
        // System.out.println("Is this white - " +  (dave.getShirtColour().toString().equals(Color.WHITE.toString())));
        // System.out.println("Buy a snack for £5");
        // dave.buySnack(5);
        // System.out.println("Money left - " + dave.getMoney());
        // System.out.println("Print bye for 5 friends:");
        // dave.setNumFriends(5);
        // dave.goHome();
        // System.out.println("Am I playing");
        // System.out.println(dave.isPlaying());
        // System.out.println("My shirt is " + dave.getShirtColour());
        // System.out.println("Setting shirt to Black");
        // Color black = new Color(0,0,0);
        // Color salmon = new Color(250,128,114);
        // dave.setShirtColour(black);
        // System.out.println("My shirt is " + dave.getShirtColour());
        // dave.setShirtColour(salmon);
    }
}

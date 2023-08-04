package sportsClub;

public class Main {

    public static void main(String[] args) throws Exception 
    {
        System.out.println("Make a sports club");
        SportsClub dave = new SportsClub("Dave", 15, true);  
        System.out.println(dave.getName());
        System.out.println(dave.getMinAge());
        System.out.println(dave.getLocation());
        System.out.println(dave.isAdventureClub());
        dave.addActivity("Climbing");
        System.out.println("Added Climbing");
        
        System.out.println("Adding Surfing");
        dave.addActivity("Surfing");
        System.out.println("Adding Climbing");
        dave.addActivity("Climbing");
        System.out.println("Printing all activities");
        System.out.println(dave.getActivities());
        System.out.println("Totl activities = " + dave.countActivities());

        System.out.println("Adding Walking");
        dave.addActivity("Walking");
        System.out.println("Totl activities = " + dave.countActivities());
        System.out.println("Removing Walking");
        dave.removeActivity("Walking");
        System.out.println("Totl activities = " + dave.countActivities());
        System.out.println("Trying to remove ninja");
        dave.removeActivity("ninja");
        System.out.println(dave.toString());

        System.out.println("Testing equals. Creating daveDup");
        SportsClub daveDup = new SportsClub("Dave", 15, true); 
        System.out.println(dave.equals(daveDup));
        System.out.println("Testing equals. Creating new club");
        SportsClub newClub = new SportsClub("Culls", 18, false); 
        System.out.println(dave.equals(newClub));

        // System.out.println("Test all getter methods from person superClass");
        // System.out.println("First name - " + dave.getFirstName());
        // System.out.println("Last name - " + dave.getLastName());

    }
}

package sportsClub;

import java.util.*;

/**
 * @author M250 Module Team
 * @version v1
 */
public abstract class Club
{
    private String name;
    private int minAge;
    private ArrayList<String> activities;
    
    /**
     * Constructor for class Club
     * 
     * @param aName The club's name
     * @param aMinAge The minimum age for participation
     */
    public Club(String aName, int aMinAge)
    {
        name = aName;
        minAge = aMinAge;
        activities = new ArrayList<String>();
    }

    /**
     * @return The name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name The club name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return The minAge
     */
    public int getMinAge()
    {
        return minAge;
    }

    /**
     * @param aMinAge The min age to set
     */
    public void setMinAge(int aMinAge)
    {
        minAge = aMinAge;
    }  
    
    /**
     * Return the list of activities at this club
     * @return activities
     */
    public ArrayList<String> getActivities()
    {
        return activities;
    }
    
    /**
     * @return the number of items in activities
     */
    public int countActivities()
    {
        return activities.size();
    }    
    
    /**
     * 
     * @return A String representation of the club
     */    
    @Override
    public String toString()
    {
        return "Club " + name + " Minimum age " + minAge;
    }
    
    /** 
     * @param obj The object to compare to the received object
     * @return true if name is the same for both objects
     * and they are the same class
     */
    @Override
    public boolean equals(Object obj)
    {
        Club club = (Club) obj;
        
        if (club.getClass().equals(getClass()))
        {
           return  name.equals(club.name);
        }
        
        return false;
    }
    
    /**
     * @return a hashCode based on the club name and minimum age
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(name, minAge);
    }
    
    /**
     * Sorts activities 
     */
    public void sortActivities()
    {
        Collections.sort(activities);
    }    
}
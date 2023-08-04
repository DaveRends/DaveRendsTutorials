package exam.Q7;
import java.util.ArrayList;

/**
 * Abstract class Route for various kinds of routes,
 * such as walking or cycling routes.
 * @author (c) M250 Module Team
 * @version 10/02/23
 */
public abstract class Route
{
    private String routeName;
    private String startPlace;
    private int distance; 
    private int difficulty; 
    private ArrayList<String> landmarks;

    /** 
     * Constructor for a Route with a name, a start place, a distance and a difficulty.
     * @param aRouteName The name of the route
     * @param aStartPlace The starting place
     * @param aDistance The distance in miles
     * @param aDifficulty The difficulty level, 1 being lowest.
     */    
    public Route(String aRouteName, String aStartPlace, int aDistance, int aDifficulty)
    {
        routeName = aRouteName;
        startPlace = aStartPlace;        
        distance = aDistance;
        difficulty = aDifficulty;
        landmarks = new ArrayList<>();
    }
    
    public ArrayList<String> getLandmarks() {     
        return landmarks;
    }

    /**
     * Getter for the route's name.
     * @return the routeName
     */
    public String getRouteName()
    {
        return routeName;
    }

    /**
     * Setter for the route's name.
     * @param routeName the routeName to set
     */
    public void setRouteName(String routeName)
    {
        this.routeName = routeName;
    }

    /**
     * Getter for the route start place.
     * @return the startPlace
     */
    public String getStartPlace()
    {
        return startPlace;
    }

    /**
     * Setter for the route start place.
     * @param startPlace the startPlace to set
     */
    public void setStartPlace(String startPlace)
    {
        this.startPlace = startPlace;
    }

    /**
     * Getter for the route distance.
     * @return the distance
     */
    public int getDistance()
    {
        return distance;
    }

    /**
     * Setter for the route's distance.
     * @param distance the distance to set
     */
    public void setDistance(int distance)
    {
        this.distance = distance;
    }

    /**
     * Getter for the route's difficulty.
     * @return the difficulty
     */
    public int getDifficulty()
    {
        return difficulty;
    }

    /**
     * Setter for the route's difficulty.
     * @param difficulty the difficulty to set
     */
    public void setDifficulty(int difficulty)
    {
        this.difficulty = difficulty;
    }

    /**
     * String representation of a Route object.
     * @return String The string representation of the route
     */
    public String toString()
    {
        return "Route " + routeName + " starting from " + startPlace  + ", distance: "
        + distance + "," + " difficulty (1-5): " + difficulty;
    }

    /**
     * Return true if the received object should be considered equal to this
     * object, otherwise return false.
     * @param o The object to be compared to
     */
    public boolean equals(Object o)
    {       
        if (o.getClass().equals(getClass())) 
        {
            Route r = (Route) o;

            return  r.getRouteName().equals(getRouteName());
        }

        return false;
    }

    /**
     * Returns a string relating to a dog warning on the route
     */
    public abstract String dogWarning();

    /**
     * Returns true if the route is considered difficult.
     */
    public abstract boolean isDifficult();


}

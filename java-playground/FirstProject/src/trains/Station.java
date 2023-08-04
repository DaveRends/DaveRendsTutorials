package trains;


/**
 * The class Station models a station on a branch line, 
 * including its name and its distance from the departure station.
 * 
 * @author M250 MT
 * @version 1.0
 */
public class Station
{
    private String name;
    private double distance; //in miles

    /**
     * Constructor for a Station object allowing the user to 
     * set its name and distance.
     */
    public Station(String aName, double aDistance)
    {
        name = aName;
        distance = aDistance;
    }

    // getters

    public String getName()
    {
        return name;
    }

    public double getDistance()
    {
        return distance;
    }

    /**
     * Returns true if this Station is equal to the given Station 
     * object, false otherwise
     */
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Station))
        {
            return false;
        }

        Station s = (Station) obj;  
        
        return this.name.equals(s.name)  
               && this.distance == s.distance;
    } 
}
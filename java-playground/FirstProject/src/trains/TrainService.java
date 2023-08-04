package trains;
import java.util.*;
/**
 * The class TrainService models a train service 
 * on a branch line. Complete the class according 
 * to the instructions in part (a)
 */
class TrainService implements Comparable<TrainService>
{
    private int hour;
    private int minute;
    private ArrayList<Station> stations;

    public TrainService(int anHour, int aMinute)
    {
        hour = anHour;
        minute = aMinute;
        stations = new ArrayList<>();
    }

    public int getHour()
    {
        return hour;
    }

    public int getMinute()
    {
        return minute;
    }

    public ArrayList<Station> getStations()
    {
        return stations;
    }

    // TO DO? The below method my need a -1, from working with length no index?

    public Station lastStation()
    {
        return stations.get(stations.size() - 1);
    }

    public void printStations()
    {
        // Print final station
        System.out.println(stations.get(stations.size() - 1).getName() + " " + stations.get(stations.size() - 1).getDistance() + " miles");
        // Print other stations
        for (int i = 0; i <= (stations.size() - 1); i++)
        {
            System.out.println(stations.get(i).getName());
        } 
    }

    public boolean equals(Object o)
    {
        TrainService ts = (TrainService) o;
        return (this.hour == ts.hour) 
               && (this.minute == ts.minute);
    }
   
    public int hashCode()
    {
        return hour * minute; 
    }

    public int compareTo(TrainService t)
    {
        return ((this.hour * 60) + this.minute) - ((t.getHour() * 60) + t.getMinute());
    }
}

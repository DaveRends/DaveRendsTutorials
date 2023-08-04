package trains;
import java.util.*;

/**
 * The class StationControl models the management of 
 * train services on a  line. Complete the class according 
 * to the instructions in part (b)
 */
class StationControl
{
    private String name;
    private TreeSet<TrainService> trainServices; 
    public static int MAX_TRAINSERVICES = 10;

    public StationControl(String aName)
    {
        name = aName;
        // TO DO I am unsure what collection type is suitable?
        trainServices = new TreeSet<TrainService>();
    }

    public void addTrainService(TrainService aService)
    {
        if (trainServices.size() < MAX_TRAINSERVICES)
        {
            trainServices.add(aService);
        }
    }

    // public TreeMap<Integer,TreeSet<Integer>> trainTimes()
    // {
    //     TreeMap<Integer,TreeSet<Integer>> services = new TreeMap<>();
    //     return services;
    // }
    
    // (b)(iii) 
    // map sorted hours to sorted sets of minutes of departures
    public TreeMap<Integer, TreeSet<Integer>> trainTimes() 
    { 
        // create map
        TreeMap<Integer, TreeSet<Integer>> tempMap = new TreeMap<>();
        
        //  iterate over services
        for (TrainService aTrainService : trainServices) {
            
            // add new keys with empty sets 
            if (!tempMap.containsKey(aTrainService.getHour())) {
                tempMap.put(aTrainService.getHour(), new TreeSet<>());
            }
            
            // add minutes to values
            tempMap.get(aTrainService.getHour()).add(aTrainService.getMinute());            
        }

        return tempMap;
    }

    public String getName()
    {
        return name;
    }
    
    public TreeSet<TrainService> getTrainServices()
    {
        return trainServices;
    }
}
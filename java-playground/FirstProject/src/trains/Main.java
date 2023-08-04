package trains;

public class Main {
    public static void main(String[] args) throws Exception 
    {
        //Tests trainTimes (b)(iii)
TrainService ts2 = new TrainService(16, 03);
TrainService ts1 = new TrainService(15, 20);
TrainService ts3 = new TrainService(16, 15);
TrainService ts4 = new TrainService(15, 20);
StationControl sc = new StationControl("New Street");
sc.addTrainService(ts1);
sc.addTrainService(ts2);
sc.addTrainService(ts3);
sc.addTrainService(ts4);
System.out.println(sc.trainTimes());
    }
}

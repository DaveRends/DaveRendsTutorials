package exam.Q7;

public class Main {
    public static void main(String[] args) throws Exception 
    {
        Walk w144 = new Walk("Snowdon", "Mountain", 20, 1, false);
        System.out.println(w144.dogWarning());
        //w144.setPassesSheep(true);
        System.out.println(w144.dogWarning());
        System.out.println(w144.toString());
        System.out.println("Landmarks = " + w144.getLandmarks());
        w144.addLandmark("Post office");
        w144.addLandmark("Pub");
        w144.addLandmark("Brothel");
        w144.addLandmark("Ocean");
        w144.addLandmark("Restrooms");
        System.out.println("Landmarks = " + w144.getLandmarks());
        w144.removeLandmark("Pub");
        System.out.println("Landmarks = " + w144.getLandmarks());
        System.out.println("Difficult? " + w144.isDifficult());
        //Route routeTest = new Route();
        System.out.println(w144.hashCode());
        w144.getLandmarks().sort(null);
        System.out.println("Landmarks = " + w144.getLandmarks());
    }
}

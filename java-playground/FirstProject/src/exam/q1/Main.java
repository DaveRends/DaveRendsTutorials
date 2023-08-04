package exam.q1;

public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        Ball a = new Ball();
        System.out.println(a.getDiameter());
        System.out.println(a.getColour());
        a.pump();
        System.out.println(a.getDiameter());
        System.out.println(a.toString());
    }
}

package equalsAndHashCode;

public class Main {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Creating two different objects, obj1 and obj2");
        EqualsAndHashCode obj1 = new EqualsAndHashCode(1, "one");
        EqualsAndHashCode obj2 = new EqualsAndHashCode(2, "two");
        System.out.println("Creating the same again, called obj3 and obj4");
        EqualsAndHashCode obj3 = new EqualsAndHashCode(1, "one");
        EqualsAndHashCode obj4 = new EqualsAndHashCode(2, "two");
        System.out.println("Test 1 vs 2");
        System.out.println(obj1.equals(obj2));
        System.out.println("Test 2 vs 3");
        System.out.println(obj2.equals(obj3));
        System.out.println("Test 1 vs 3");
        System.out.println(obj1.equals(obj3));
        System.out.println("Testing hashcodes");
        System.out.println(obj1.equals(obj3));
        System.out.println("Compare 2 to 1, should be 1 - answer: " + obj2.compareTo(obj1));
        System.out.println("Compare 2 to 1, should be 1 - answer: " + obj2.compareTo(obj4));
    }
 
}

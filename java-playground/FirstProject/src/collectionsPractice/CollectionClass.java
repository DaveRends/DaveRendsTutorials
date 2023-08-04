package collectionsPractice;

import java.util.*;

public class CollectionClass {


    // For each collection type, make it a class field AND instantiate it in the constructor
    private List<String> anArrayList;
    private HashSet<String> aHashSet; 
    private TreeSet<String> stringTreeSet;
    private TreeSet<Integer> intTreeSet;
    private Map<String, Integer> vehicles;

    public CollectionClass()
    {
        anArrayList = new ArrayList<>();
        aHashSet = new HashSet<String>();
        stringTreeSet = new TreeSet<String>();
        intTreeSet = new TreeSet<>();
        vehicles = new HashMap<>();

    }
    
    // ArrayList methods
    public void arrayListMethods()

    {
        System.out.println("--------------------------- In the ARRAYLIST method ---------------------------");
        System.out.println("Array List Size - " + anArrayList.size());
        System.out.println("Adding 5 Strings and printing them with a for loop");
        anArrayList.add("I");
        anArrayList.add("love");
        anArrayList.add("licking");
        anArrayList.add("Jo's");
        anArrayList.add("fanny!");
        for (String aString : anArrayList)
        {
            System.out.println(aString);
        }
        System.out.println("Printing them with an iterator");
        Iterator itr = anArrayList.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("Adding at a specified index and printing with a new iterator");
        anArrayList.add(1, "REALLY");
        Iterator itr2 = anArrayList.iterator();
        while (itr2.hasNext())
        {
            System.out.println(itr2.next());
        }
        System.out.println("Return the array object");
        System.out.println(anArrayList);
        System.out.println("Print ArrayList size, and index count");
        System.out.println("Size : " + anArrayList.size());
        for (int i = 0; i < anArrayList.size(); i++)
        {
            System.out.println("Index : " + i + " " + anArrayList.get(i));
        }
        System.out.println("--------------------------- End the ARRAYLIST method ---------------------------");
    }

    public void hashSetMetthods()
    {
        System.out.println("--------------------------- In the HASHSET method ---------------------------");
        System.out.println("Hash set size - " + aHashSet.size());
        System.out.println("Adding content twice");
        aHashSet.add("I");
        aHashSet.add("love");
        aHashSet.add("licking");
        aHashSet.add("Jo's");
        aHashSet.add("fanny!");
        System.out.println("Hash set size first adding- " + aHashSet.size());
        aHashSet.add("I");
        aHashSet.add("love");
        aHashSet.add("licking");
        aHashSet.add("Jo's");
        aHashSet.add("fanny!");
        System.out.println("Hash set size second adding- " + aHashSet.size());
        System.out.println("Print the hashset on one line");
        for (String s : aHashSet)
        {
            System.out.print(s + " ");
        }
        System.out.println("");
        System.out.println("Clearing the hashset");
        aHashSet.clear();
        System.out.println("Hash set size - " + aHashSet.size());
        System.out.println("Now lets create an arrayList, and add everything in it to the HashSet");
        ArrayList<String> dummyList = new ArrayList<String>();
        dummyList.add("Kiss ");
        dummyList.add("my ");
        dummyList.add("BALLS ");
        System.out.println("\nPrinting arrayList while adding to hashSet");
        for (String s : dummyList)
        {
            System.out.print(s);
            aHashSet.add(s);
        }
        System.out.println("\nPrinting the hashSet \n");
        for (String s : aHashSet)
        {
            System.out.print(s);
            aHashSet.add(s);
        }
        System.out.println("\n--------------------------- End the HASHSET method ---------------------------");

    }

    public void stringTreeSetMethod()
    {
        System.out.println("--------------------------- In the stringTreeSet method ---------------------------");
        System.out.println("String TreeSet size - " + stringTreeSet.size());
        System.out.println("Adding content in no order");
        stringTreeSet.add("i");
        stringTreeSet.add("love");
        stringTreeSet.add("licking");
        stringTreeSet.add("jo's");
        stringTreeSet.add("fanny!");
        System.out.println("stringTreeSet size first adding- " + stringTreeSet.size());
        System.out.println(stringTreeSet.toString());
    }

    public void hashMapMethods()
    {
        // This is how we add simple, single key-value pairs
        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);

        // Iterate over all vehicles, printing them using the keySet method.
        for (String key : vehicles.keySet())
        {
            System.out.println(key + " - " + vehicles.get(key));
            System.out.println();
        }
        
        String searchKey = "Audi";
        if (vehicles.containsKey(searchKey))
        {
            System.out.println("Found total " + vehicles.get(searchKey) + " " + searchKey + " cars!\n");
        }
 
        // Clear all values.
        vehicles.clear();
 
        // Equals to zero.
        System.out.println("After clear operation, size: " + vehicles.size());
    }
}

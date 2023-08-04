package equalsAndHashCode;

import java.util.Objects;

public class EqualsAndHashCode implements Comparable<EqualsAndHashCode>{
    
    private int id1;
    private String id2;


    public EqualsAndHashCode(int anId, String anotherId)
    {
        id1 = anId;
        id2 = anotherId;
    }

    // Here we can create objects, and assign them two unique field values, Id1 and Id2.
    // Equals method tells us if two objects can be considered the same 9hold the same values), NOT if the refer to the same object.
    
    @Override
    public boolean equals(Object obj)
    {
        // First check if the two objects are even the same class
        if (obj instanceof EqualsAndHashCode)
        {
            EqualsAndHashCode checkerObj = (EqualsAndHashCode) obj;
            return id1 == checkerObj.id1 && id2.equals(checkerObj.id2);
        }
        return false;
    }

    /*
     * IMPORTANT - when overriding equals, you should override hashcode as well
     * Objects with content equality should return the same hashCode
     * Otherwise you can run into issues when using some collections
     */

     @Override 
     public int hashCode()
     {
        return Objects.hash(id1, id2);
     }

    @Override
    public int compareTo(EqualsAndHashCode o) 
    {
        if (id1 < o.id1)
        {
            return -1;
        }
        else if (id1 > o.id1)
        {
            return 1;
        }
        else 
        {
            return 0;
        }          
    }

     /* Now for the compareTo method
      * This is for determining ordering of objects, for example
      * If we wanted to order these objects by the int id1, we need to override the compareTo method. This way, if the objects are in 
      * a sorted array or map, Java will know how to order them.
      You need the class to implement Comparable<the Object Type>
      */

}

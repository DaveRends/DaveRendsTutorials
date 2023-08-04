package tests;

public class Test
{  
    private int[] nums;
    
    public Test(int[] vals)
    {
        nums = vals;
    }
    
    // Write your printMin(int, int) method here
    public void printMin(int intA, int intB)
    {
        int lowest = nums[intA];
        for (int i = intA; i < intB; i++)
        {
            if (nums[i] < lowest)
            {
                lowest = nums[i];
            }
            System.out.println("Min is " + lowest);


        }
    }
}
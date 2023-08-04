package concatenateThese;

public class Test
{  
    private int[] nums;
    public Test(int[] vals)
    {
        nums = vals;
    }
    // Write your concatenateThese(int, int) method here
    /*
     * This methoud should print out a new string, made of of the elements of the array field, between the index number supplied in the method call
     */
    public void concatenateThese(int int1, int int2)
    {
        StringBuilder concat = new StringBuilder();
        for (int i = int1; i <= int2; i++)
        {
            //System.out.println("Adding " + nums[i]);
            concat.append(nums[i]);
        }
        System.out.println(concat.toString());
    }
}
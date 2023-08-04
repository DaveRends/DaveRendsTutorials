package camelCaseStringSplitter;
public class Main 
{
    public static void main(String[] args) throws Exception 
    {
       Solution s = new Solution();
       System.out.println("1 - the-stealth-warrior");
       s.toCamelCase("the-stealth-warrior");
       System.out.println("2 - The_Stealth_Warrior");
       s.toCamelCase("The_Stealth_Warrior");
       System.out.println("3 - The_Stealth-Warrior");
       s.toCamelCase("The_Stealth-Warrior");
    } 
}

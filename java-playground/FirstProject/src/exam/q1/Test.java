package exam.q1;

public class Test
{   
    private String template = "68b9f4";

    // Write your erAd45(char[] toMatch) method here
    public void erAd45(char[] toMatch)
    {
        // Check if characters in toMatch MATCH a character at THE SAME POSITION in the template
        for (int i = 0; i < template.length(); i++)
        {
            if (template.charAt(i) == toMatch[i])
            {
                System.out.print(template.charAt(i));
            }
        }
    }
}

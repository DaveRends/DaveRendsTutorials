package camelCaseStringSplitter;

import java.lang.StringBuilder;

class Solution{

  public String toCamelCase(String s)
  {
    // Split the string by 2 delimiters
    String[] tokens = s.split("[-_]+");
    StringBuilder str = new StringBuilder();

    // Camel case all except the first word
    for (int i = 0; i < tokens.length; i++)
    {
        if (i == 0)
        {
            str.append(tokens[i]);
        }
        else
        {
        String theWord = Character.toUpperCase(tokens[i].charAt(0)) + tokens[i].substring(1).toLowerCase();
        str.append(theWord);
        }

    }
    // Concatenate them to a single string
    System.out.println(str.toString());
    return str.toString();
    
  }
}
package codeWars.smashWords;
import java.util.Arrays;

public class SmashWords {

	public static String smash(String... words) {
    // TO DO Write your code below this comment please
    // Create a stringbuilder
    StringBuilder tempString = new StringBuilder();
    // add to it for each word in the array, with a space in between
    for (String s : words)
    {
        tempString.append(s);
        tempString.append(" ");
    }
    // Trim any start of end space

    // Return StringBuilder tostring
    return tempString.toString().trim();
  }


  // MUCH simpler method 
  public static String smash2(String... words) {
    return String.join(" ", words);
  }
}
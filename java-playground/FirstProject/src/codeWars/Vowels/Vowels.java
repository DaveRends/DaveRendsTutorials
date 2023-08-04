package codeWars.Vowels;

//import java.util.ArrayList;

public class Vowels {

    public static int getCount(String str) {
        int vowelCount = 0;
        
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            for (char v : vowels)
            if (v == c)
            {
                vowelCount++;
            }
        }
        return vowelCount;
    }
  
  }

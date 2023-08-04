package codeWars.nameToInitials;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
      
      String[] parts = name.split(" ");
      return parts[0].toUpperCase().charAt(0) + "." + parts[1].toUpperCase().charAt(0);
    }
  }

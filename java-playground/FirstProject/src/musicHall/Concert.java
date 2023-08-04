package musicHall;
import java.util.*;

class Concert implements Comparable<Concert>
{
   private String concertName;
   private String date; // in "yyyy-mm-dd" format
   public static final int MAX_LENGTH = 120;
   private List<Music> programme;

   public Concert(String aDate, String aName)
   {
    concertName = aName;
    date = aDate;
    programme = new ArrayList<Music>();
   }


   /**
    * Getter for the date of the concert. 
    */
   public String getDate()
   {
      return date;
   }
   
   /**
    * Getter for the name of the concert.
    */
   public String getConcertName()
   {
      return concertName;
   }

   /**
    * Getter for the programme of the concert. 
    */
    public List<Music> getProgramme()
    {
       return programme;
    }

    public int getConcertLength()
    {
        int totalTime = 0; 
        for (Music track : programme)
        {
            totalTime += track.getPerformanceTime();
        }
        return totalTime;
    }

    public void addProgrammeItem(Music track)
    {
        if (this.getConcertLength() + track.getPerformanceTime() <= MAX_LENGTH)
        {
            programme.add(track);
        }
        else
        {
            System.out.println("Running time exceeded");
        }
    }

    public int compareTo(Concert c)
    {
        return this.getConcertName().compareTo(c.getConcertName());
    }
   
   /**
    * A simple equals method.
    */
   public boolean equals(Object o)
   {
      Concert c = (Concert) o;
      
      return date.equals(c.date) && 
             concertName.equals(c.concertName);
   }
   
   /**
    * Return a hash code for this concert based on its date and name.
    */
   public int hashCode()
   {
      return date.hashCode() + concertName.hashCode();
   }
}

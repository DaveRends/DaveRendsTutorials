package musicHall;
import java.util.*;

class ConcertHall
{
    // Add code for ConcertHall here
    public SortedMap<String, TreeSet<String>> whatsOn;
    
    public ConcertHall()
    {
        Map<String, TreeSet<String>> whatsOn = new HashMap<>();
    }

    public void addConcert(Concert aConcert)
    {
        for (Music music : aConcert.getProgramme())
        {
            String composer = music.getComposer();
            TreeSet<String> pieces; // pieces by the current composer

            // If the whatson map contains the key for this composer
            if (whatsOn.containsKey(composer))
            {
                // create a local variable, pieces, to point at that matched TreeSet 
                pieces = whatsOn.get(composer);
                // add that piece to the sortedSet
                pieces.add(music.getTitle());
            }
            else
            {
                // The composer does not yet exist as a key
                // create a new treeset for the music tracks
                pieces = new TreeSet<>(); 
                // add the tracks
                pieces.add(music.getTitle());
                // add the composer, and thier related tracks
                whatsOn.put(composer, pieces);
            }


        }
    }
}
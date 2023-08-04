package Child;
import java.awt.Color;

public class Child extends Person 
{
    private boolean playing;

    public Child(String aFirstName, String aLastName)
    {
        super(aFirstName, aLastName);
        setMoney(10);
        playing = true;
    }

    public boolean isPlaying()
    {
        return playing;
    }

    public void play()
    {
        playing = true;
        setNumFriends(getNumFriends() + 1);
    }

    public void work()
    {
        playing = false;
        setNumFriends(getNumFriends() - 1);
    }

    public String getNickname()
    {
        StringBuilder nick = new StringBuilder();
        for (int i = 0; i < 3; i++)
        {
            nick.append(getFirstName().charAt(i));
        }

        for (int j = getLastName().length() - 3; j < getLastName().length(); j++)
        {
            nick.append(getLastName().charAt(j));
        }
        return nick.toString();
    }

    public void buySnack(int snackCost)
    {
        if (getMoney() >= snackCost)
        {
            spendMoney(snackCost);   
        }
        else
        {
            System.out.println("I need money");
        }
    }

    public void goHome()
    {
        if (getNumFriends() <= 0)
        {
            System.out.println("I'm going home");
        }
        else 
        {
            for (int i = 0; i < getNumFriends(); i++)
            System.out.println("Bye");
        }
    }

    public void setShirtColour(Color aColour)
    {	
        if (!playing)
        {
            super.setShirtColour(aColour);
        }
        else
        {
            Color white = new Color(255,255,255);
            
	        if (getShirtColour().equals(white))
	        {
	            System.out.println("I'm changing now");
	            super.setShirtColour(aColour);
	        }
	        else
	        {
	            System.out.println("I'm wearing play clothes already");
	        }
        }
    }


    
}

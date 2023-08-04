package exam.Q7;

// Q7 a)
public class Walk extends Route {
    
    // Q7 b)
    private boolean passesSheep;

    // Q7 c)
    public Walk(String aRouteName, String aStartPlace, int aDistance, int aDifficulty, boolean doesPassSheep)
    {
        super(aRouteName, aStartPlace, aDistance, aDifficulty);
        passesSheep = doesPassSheep;
    }

    // Q7 d)
    public boolean getPassesSheep()
    {
        return passesSheep;
    }

    public void setPassesSheep(boolean doesItPassSheep)
    {
        passesSheep = doesItPassSheep;
    }

    // Q7 e)
    public void addLandmark(String aLandmark)
    {
        super.getLandmarks().add(aLandmark);
    }

    // Q7 f)
    public boolean isDifficult()
    {
        if (getDifficulty() >= 4)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Q7 g)
    public String dogWarning()
    {
        if (passesSheep)
        {
            return " and dogs must be on a lead.";
        }
        else
        {
            return ".";
        }
    }

    // Q7 h)
    @Override
    public String toString()
    {
        if (isDifficult())
        {
            return super.toString() + " is difficult" + dogWarning();
        }
        else
        {
        return super.toString() + " is not difficult" + dogWarning();
        }
    }

    // Q7 i)
    public boolean removeLandmark(String aLandmark)
    {
        boolean  removalsMade = false;
        if (super.getLandmarks().contains(aLandmark))
        {
            super.getLandmarks().remove(aLandmark);
            removalsMade = true;
        }
        return removalsMade;
    }


}

package sportsClub;

public class SportsClub extends Club
{
    private boolean adventureClub;
    private String location;

    public SportsClub(String aName, int minAge, boolean adClub)
    {
        super(aName, minAge);
        adventureClub = adClub;
        location = "unknown";
    }

    public String getLocation()
    {
        return location;
    }
    public void setLocation(String aLocation)
    {
        location = aLocation;
    }

    public boolean isAdventureClub()
    {
        return adventureClub;
    }

    public void setAdventureClub(boolean isAdClub)
    {
        adventureClub = isAdClub;
    }

    public void addActivity(String acName)
    {
        if (super.getActivities().contains(acName))
        {
            System.out.println("Activity " + acName + " already offered");
        }
        else
        {
            super.getActivities().add(acName);
        }
    }

    public void removeActivity(String anActivity)
    {
        if (super.getActivities().contains(anActivity))
        {
            super.getActivities().remove(anActivity);
            System.out.println("Activity " + anActivity + " removed");
        }
        else
        {
            System.out.println("Activity " + anActivity + " not offered");
        }
    }
    @Override
    public String toString()
    {
        StringBuilder returnString = new StringBuilder();
        returnString.append("Club " + this.getName() + " Minimum age " + this.getMinAge() + " Location " + this.getLocation() + "\n");
        String isAdvent = "Is an adventure club \nActivities offered\n";
        String isNotAdvent = "Is not an adventure club \nActivities offered\n";
        if (!isAdventureClub())
        {
            returnString.append(isNotAdvent);
        }
        else
        {
            returnString.append(isAdvent);
        }
        
        for (String activity : super.getActivities())
        {
            returnString.append(activity + "\n");
        }
        return returnString.toString();
    }

    //@Override
    public boolean equals(Object obj)
    {
        if (obj.getClass().equals(this.getClass()))
        {
            SportsClub aSClub = (SportsClub) obj;
            if (this.getName().equals(aSClub.getName()) && this.getMinAge() == aSClub.getMinAge() && this.getLocation().equals(aSClub.getLocation()))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    else
    {
        return false;
    }
    }

}

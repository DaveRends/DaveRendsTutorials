package exam.q1;

// Q5 a)
public class Ball {
    
    // Q5 b)
    private int diameter;
    private String colour;
    private static final int MAX_DIAM = 3492;

    //Q5 c)
    public Ball(String aColour, int aDiameter)
    {
        diameter = aDiameter;
        colour = aColour;
    }

    // Q5 d)
    public Ball()
    {
        diameter = 1643;
        colour = "yellow";
    }

    //Q5 e)
    public int getDiameter()
    {
        return diameter;
    }

    public String getColour()
    {
        return colour;
    }

    // Q5 f)
    public void setDiameter(int aDiameter)
    {
        if (aDiameter > 1 && aDiameter <= MAX_DIAM)
        {
            diameter = aDiameter;
        }
    }

    // Q5 g)
    public void pump()
    {
        if (diameter < MAX_DIAM)
        {
            diameter++;
        }
    }

    // Q5 h)
    @Override
    public String toString()
    {
        return "" + this.getColour() + " ball diameter " + this.getDiameter(); 
    }


    
}

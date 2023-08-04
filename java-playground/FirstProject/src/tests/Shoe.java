package tests;

public class Shoe {
    
    private String style;
    private int size;
    private boolean hasLaces;

    public Shoe(String aStyle, int aSize)
    {
        style = aStyle;
        size = aSize;
        hasLaces = true;
    }

    public int getSize()
    {
        return size;
    }
    public void setSize(int aSize)
    {
        size = aSize;
    }

    public String getStyle()
    {
        return style;
    }

    public void setStyle(String aStyle)
    {
        style = aStyle;
    }

    @Override
    public String toString()
    {
        return "A " +   style + " shoe size " + size + " has laces " + hasLaces;
    }

    
    public boolean equals(Shoe aShoe)
    {
        if (this.getSize() == aShoe.getSize() && this.getStyle().equals(aShoe.getStyle()))
        {
            return true;
        }
        return false;

    }
}

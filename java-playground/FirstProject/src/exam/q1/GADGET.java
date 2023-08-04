package exam.q1;

public class GADGET
{
   private boolean isX;
   final static private int Y;

    public void GADGET(boolean aBoolean)
    {
       isX = aBoolean;
    }
    public boolean getIsX()
    {
       return isX;
    }
    public boolean setIsX(Boolean aBoolean)
    {
       if(isX.equals(true))
       {
          isX = aBoolean;
          return true;
       }
       return false;
    }
 }

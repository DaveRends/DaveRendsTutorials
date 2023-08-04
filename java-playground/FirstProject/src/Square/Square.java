package Square;

public class Square {    
    public static boolean isSquare(int n) {
      /*
       * Is it a square number?
       * Pass it an int, and if that int is greater than 0...
       * Multiple i by i, from 0, until it reaches the number
       */
      if (n >= 0)
        {
      for (int i = 0; i <= n; i++)
        {
        if ((i * i) == n)
          {
          return true;
        }
      }
      }
      return false;
    }
}
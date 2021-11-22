public class throww {
    public static void main(String[] args)
    {
     // Use of unchecked Exception
     try {
      // double x=3/0;
      throw new ArithmeticException("This message will print in the console");
     }
     catch (ArithmeticException e)
     {
        System.out.print(e);
     }
    }
  }

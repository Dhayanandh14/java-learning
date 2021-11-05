import java.util.Scanner;

public class primeNumber {

  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    int num = kbd.nextInt();
     int i = 2;
    boolean flag = true;
    while (i <= num/2) {
      if (num % i == 0) {
        flag = false;
        break;
      }

      ++i;
    }

    if (flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}

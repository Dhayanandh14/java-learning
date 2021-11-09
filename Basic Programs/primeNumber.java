import java.util.Scanner;

public class primeNumber {

  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    int num = kbd.nextInt();

    boolean flag = true;
   for(int i = 2; i<=num/2;i++){
      if (num % i == 0) {
        flag = false;
        break;
      }

      i++;
    }

    if (flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}

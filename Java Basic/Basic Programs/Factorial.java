
import java.util.*;
public class Factorial {
   public static int fact(int a){
	   if(a>0){
		   return a*fact(a-1);
	   }
	   else {
		   return 1;
	   }
   }
	public static void main(String[] args) {
//		Factorial kuruvi = new Factorial();
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter number: ");
        int f = kbd.nextInt();
        System.out.print(fact(f));
        kbd.close();
	}

}//5 * fact(4)
//5*4*fact(3)
//5*4*3*fact(2)
//5*4*3*2*fact(1)
//5*4*3*2*1*fact(0)

import java.util.*;
public class Pattern {
  public static void BackSideLeftAngleTriangle(){
    Scanner kbd = new Scanner(System.in);
   int a,k,j;
   System.out.print("Enter Number of line: ");
   a = kbd.nextInt();
   System.out.print("Enter Character: ");
   String b = kbd.next();
   int space = 1;
   for(int i=a;i>0;i--){
     for(j=0;j<i;j++){
        System.out.print(" "+b);
      }
      System.out.println();
      for(k=0;k<space;k++){
        System.out.print(" ");
      }
      space = space +1;
    }
    System.out.println();
}
  public static void main(String args[]){

    BackSideLeftAngleTriangle();
  }
}

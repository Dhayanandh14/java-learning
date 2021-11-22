import java.io.*;
public class throwss{
   public static void method()throws IOException{
  System.out.print("test");
 }
   public static void main(String args[]){
    try{
      method();
    }catch(Exception e){System.out.println("exception handled");}

    System.out.println("normal flow...");
  }
}

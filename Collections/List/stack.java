import java.util.*;
public class stack {
  public static void main(String args[]){
    Stack<String> stack = new Stack<String>();
    stack.push("Ananya");
    stack.push("Karthick");
    stack.push("Ajith");
    stack.push("Sulaiman");
    stack.push("Gayathri B");
    Iterator<String> itr=stack.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
    System.out.println("POP the value from stack:");
    System.out.print(stack.pop());
  }
}

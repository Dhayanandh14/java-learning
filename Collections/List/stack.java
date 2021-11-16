import java.util.*;
public class stack {
  public static void main(String args[]){
    Stack<String> stack_object = new Stack<String>();
    stack_object.push("Ananya");
    stack_object.push("Karthick");
    stack_object.push("Ajith");
    stack_object.push("Sulaiman");
    stack_object.push("Gayathri B");
    Iterator<String> itr=stack_object.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
    System.out.println("POP the value from stack:");
    System.out.print(stack_object.pop());
  }
}

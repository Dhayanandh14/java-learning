import java.util.*;
public class priorityQueue {
  public static void main(String args[]){
    PriorityQueue<String> queue=new PriorityQueue<String>();
    queue.add("Ananya");
    queue.add("Dhayanandh");
    queue.add("Karthick");
    queue.add("Madhan");
    System.out.println("head:"+queue.element());  // Retrieves, but does not remove, the head of this queue.
    System.out.println("head:"+queue.peek());  //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty
    System.out.println("iterating the queue elements:");
    Iterator itr=queue.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
    queue.remove();  //Retrieves and removes the head of this queue.
    queue.poll();  // 	Retrieves and removes the head of this queue, or returns null if this queue is empty.
    System.out.println("after removing two elements:");
    Iterator<String> itr2=queue.iterator();
    while(itr2.hasNext()){
     System.out.println(itr2.next());
    }
  }
}

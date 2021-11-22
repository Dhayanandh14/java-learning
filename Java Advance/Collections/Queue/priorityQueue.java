import java.util.*;
public class priorityQueue {
  public static void main(String args[]){
    PriorityQueue<String> queue_object=new PriorityQueue<String>();
    queue_object.add("Ananya");
    queue_object.add("Dhayanandh");
    queue_object.add("Karthick");
    queue_object.add("Madhan");
    System.out.println("head:"+queue_object.element());  // Retrieves, but does not remove, the head of this queue.
    System.out.println("head:"+queue_object.peek());  //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty
    System.out.println("iterating the queue elements:");
    Iterator itr=queue_object.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
    queue_object.remove();  //Retrieves and removes the head of this queue.
    queue_object.poll();  // 	Retrieves and removes the head of this queue, or returns null if this queue is empty.
    System.out.println("after removing two elements:");
    Iterator<String> itr2=queue_object.iterator();
    while(itr2.hasNext()){
     System.out.println(itr2.next());
    }
  }
}

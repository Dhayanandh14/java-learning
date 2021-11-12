import java.util.LinkedList;
public class linkedList {

	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<String>();
		animals.add("dog");
		animals.add("cow");
		animals.add("goat");
		animals.addFirst("this is the first element of the linked list");
		animals.addLast("this is the last element of the linked list");
		System.out.println(animals);
		System.out.println(animals.getFirst());
		System.out.println(animals.getLast());
		System.out.println(animals);
		animals.removeLast();
		System.out.print(animals);
	}

}

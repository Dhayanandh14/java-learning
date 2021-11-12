import java.util.ArrayList;
public class arraylist {

public static void main(String[] args) {
    ArrayList<String> animals = new ArrayList<String>();
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Horse");
    System.out.println(animals.getClass());
    System.out.println(animals.get(0));// we can take the element like this
    animals.set(1, "Cow");//we can set element like this
    System.out.println(animals);
    animals.remove(0); // we can remove element using animal.remove method
    System.out.print(animals);
  }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class listInCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list1 = new ArrayList();
		List list2 = new LinkedList();
		list1.add("Hello");
		list1.add(55);
		System.out.println(list1.get(0) + " " + list1.get(1));
	}

}

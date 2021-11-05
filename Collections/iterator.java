import java.util.Iterator;
import java.util.ArrayList;
public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> car = new ArrayList<String>();
		car.add("Baleno");
		car.add("Atroz");
		car.add("Punch");
		Iterator<String> it = car.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}

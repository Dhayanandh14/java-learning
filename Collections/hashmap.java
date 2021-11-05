import java.util.HashMap;
public class hashmap {
	public static void main(String args[]) {
		HashMap<String , String> jsonobject = new HashMap<String , String>();
		jsonobject.put("Name", "Ananya");
		jsonobject.put("Place", "Chennai");
		jsonobject.put("Team", "G-10");
		System.out.print(jsonobject.get("Team"));
	}
}

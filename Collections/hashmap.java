import java.util.HashMap;
public class hashmap {
	public static void main(String args[]) {
		HashMap<String , String> jsonobject = new HashMap<String , String>();
		jsonobject.put("Name", "Demo");
		jsonobject.put("Place", "Chennai");
		jsonobject.put("Team", "G");
		System.out.print(jsonobject.get("Team"));
	}
}

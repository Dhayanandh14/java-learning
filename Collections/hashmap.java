import java.util.HashMap;
public class hashmap {
	public static void main(String args[]) {
		HashMap<String , String> hashmap_object = new HashMap<String , String>();
		hashmap_object.put("Name", "Demo");
		hashmap_object.put("Place", "Chennai");
		hashmap_object.put("Team", "G");
		System.out.print(hashmap_object.get("Team"));
		System.out.print(hashmap_object);
	}
}

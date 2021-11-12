import java.util.HashMap;
public class hashmap {
	public static void main(String args[]) {
		HashMap<String , String> hm = new HashMap<String , String>();
		hm.put("Name", "Demo");
		hm.put("Place", "Chennai");
		hm.put("Team", "G");
		System.out.print(hm.get("Team"));
		System.out.print(hm);
	}
}

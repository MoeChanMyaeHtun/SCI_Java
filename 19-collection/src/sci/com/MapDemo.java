package sci.com;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(null, null);
		map.put(3, "Apple");
		map.put(3, "Orange");
		map.put(2, "Mango");
		map.put(1, "Orange");
		System.out.println(map);
		System.out.println(map.get(null));
		System.out.println(map.get(1));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+""+entry.getValue());
		}
	}

}

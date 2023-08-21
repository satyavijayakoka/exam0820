package exam0820;

import java.util.HashMap;

public class q11hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String,Integer> names = new HashMap<>();
		names.put("satya",25);
		names.put("madhu",28);
		names.put("shiva",26);
		names.put("hagan",24);
		names.put("sai",23);
		System.out.println(names);
		
		for(String key : names.keySet()) {
			System.out.println(key);
		}
		for(int value: names.values()) {
			System.out.println(value);
		}
		
		
	}

}

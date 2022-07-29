package oops.Map;
import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap map =new HashMap();
		map.put(3,'a');
		map.put(2, 'b');
		map.put(8, 'c');
		map.put(6, 'd');
		
		System.out.println(map);
	
		HashMap <String,String > cityAndPin =new HashMap<String,String>();
		cityAndPin.put("bengaluru", "4365432667");
		cityAndPin.put("gadag", "582101");
		cityAndPin.put("hubbli", "580023");
		cityAndPin.put("dharwad","562756");
		
		System.out.println(cityAndPin);
		
		System.out.println("pincode of gadag is :"+cityAndPin.get("gadag"));
		
		System.out.println("code is empty :"+cityAndPin.get("gadag").isEmpty());

		System.out.println("length of code is  :"+cityAndPin.get("gadag").length());
		
		
		System.out.println("pincode of gadag is  :"+cityAndPin.get("gadag").concat("123").isEmpty());
		
		
		for(Map.Entry<String, String>entry:cityAndPin.entrySet()) {
         System.out.println(entry);
		
	}
	
}
}

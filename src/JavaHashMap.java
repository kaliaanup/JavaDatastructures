import java.util.HashMap;
import java.util.Map;


public class JavaHashMap {
	
	private static final int MASK = 0x7FFFFFFF; //2^32 -1
	private static final int CAPACITY = 101; //2^32 -1
	
	private static int printHashCode(String word)
	{
		return(word.hashCode());
	}
	
	private static int hash(Object object)
	{
		return (object.hashCode() & MASK) % CAPACITY;
	}

	public static void main(String args[])
	{
		Map map = new HashMap();
		map.put("Rad", "day");
		map.put("Uhr", "hat");
		map.put("Ohr", "clock");
		map.put("Tor", "wheel");
		map.put("Hut", "ear");
		map.put("Tag", "gate");
		
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(printHashCode("Rad"));
		System.out.println(printHashCode("Uhr"));
		
		System.out.println(hash("Rad"));
		System.out.println(hash("Uhr"));
	}
}

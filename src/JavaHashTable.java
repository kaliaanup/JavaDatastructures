import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;


public class JavaHashTable {
	
	private static final int MASK = 0x7FFFFFFF; // 2^32-1
	private static int CAPACITY = 101;
	private static int size = 0;
	private static float load = 0.75F;
	private static LinkedList[] buckets;
	
	JavaHashTable()
	{
		buckets = new LinkedList[CAPACITY];
		for(int i=0; i<CAPACITY; i++)
		{
			buckets[i] = new LinkedList();
		}
	}
	
	JavaHashTable(int capacity, float load)
	{
		this();
		this.CAPACITY = capacity;
		this.load = load;		
	}
	
	private void put(Object key, Object value)
	{
		int h = (key.hashCode() & MASK) % CAPACITY;
		LinkedList bucket = buckets[h];
		HashEntry entry = null;
		for(ListIterator it = (ListIterator) bucket.iterator(); it.hasNext();)
		{
			entry = (HashEntry) it.next();
			if(entry.getKey().equals(key))
			{
				break;
			}
		}
		if(entry == null)
		{
			bucket.add(new HashEntry(key,value));
		}
		else //if entry is not null
		{
			if(entry.getKey().equals(key))
			{
				entry.setValue(value);
			}
			else
			{
				bucket.add(new HashEntry(key,value));
			}
		}
		
	}
	private Object get(Object key)
	{
		int h = (key.hashCode() & MASK) % CAPACITY;
		LinkedList bucket = buckets[h];
		HashEntry entry = null;
		for(ListIterator it = (ListIterator) bucket.iterator(); it.hasNext();)
		{
			entry = (HashEntry) it.next();
			if(entry.getKey().equals(key))
			{
				break;
			}
		}
		if(entry.getKey().equals(key))
		{
			return entry.getValue();
		}
		
		return null;
	}
	
	
	public static void main(String args[])
	{
		JavaHashTable obj = new JavaHashTable();
		obj.put("1", "sky");
		obj.put("1", "water");
		obj.put("3", "fire");
		obj.put("4", "earth");
		obj.put("5", "metal");
		obj.put("6", "sun");
		obj.put("7", "river");
		obj.put("8", "sea");
		
		System.out.println(obj.get("8"));
		
	}
}

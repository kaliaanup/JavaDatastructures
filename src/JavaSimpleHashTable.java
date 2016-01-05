
public class JavaSimpleHashTable {

	private static final int MASK = 0x7FFFFFFF; //2^32 -1
	private static final int CAPACITY = 101; //2^32 -1
	private static HashEntry[] table;
	
	JavaSimpleHashTable()
	{
		table = new HashEntry[CAPACITY];
		for(int i=0; i<CAPACITY; i++)
		{
			table[i] = null;
		}
	}
	
	//addition through linear probing
	public static void put(Object key, Object value)
	{
		int h = (key.hashCode() & MASK) % CAPACITY;
		while(table[h] !=null && table[h].getKey() != key)
		{
			h = (h+1)%CAPACITY;
		}
		table[h] = new HashEntry(key, value);
	}
	
	public static Object get(Object key)
	{
		int h = (key.hashCode() & MASK) % CAPACITY;
		while(table[h] !=null && table[h].getKey() != key)
		{
			h = (h+1)%CAPACITY;
		}
		if(table[h] == null)
		{
			return null;
		}
		else
		{
			return table[h].getValue();
		}
	}
	
	public static void main(String args[])
	{
		JavaSimpleHashTable obj = new JavaSimpleHashTable();
		obj.put("1", "sky");
		obj.put("2", "water");
		
		System.out.println(obj.get("2"));
		
	}
	
}

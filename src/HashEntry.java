
public class HashEntry {

	private Object key;
	private Object value;
	
	HashEntry(Object key2, Object value2)
	{
		this.key = key2;
		this.value = value2;
	}
	
	public Object getKey()
	{
		return key;
	}
	
	public Object getValue()
	{
		return value;
	}
	
	public void setValue(Object value)
	{
		this.value = value;
	}
	
}

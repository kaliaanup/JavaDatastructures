
public class LinkedQueue {
	private NodeBi head = null;
	private NodeBi tail = null;
	private int size;
	
	public int remove()
	{
		if(size==0)
		{
			throw new java.util.EmptyStackException();
		}
		int elem = head.data;
		head = head.next;
		size --;
		return elem;
	}
	
	public int size()
	{
		return size;              
	}
	
	public void add(int data)
	{
		NodeBi curr = new NodeBi(data);
		if(head == null)
		{
			head = new NodeBi(data);
			tail = head;
			size++;
		}
		else
		{
			tail.next = curr;
			curr.prev = tail;
			tail = curr;
			size++;
		}
	}
	
	public static void main(String args[])
	{
		LinkedQueue obj = new LinkedQueue();
		obj.add(23);
		obj.add(24);
		obj.add(25);
		obj.add(26);
		
		System.out.println(obj.head.data);
		System.out.println(obj.head.next.data);
		System.out.println(obj.head.next.next.data);
		System.out.println(obj.head.next.next.next.data);
		
		
		obj.remove();
		System.out.println(obj.head.data);
		obj.remove();
		System.out.println(obj.head.data);
		
	}
}

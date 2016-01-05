
public class JavaRing {
	private NodeBi head = null;
	private NodeBi tail = null;
	
	private int size;
	
	public void remove(int data)
	{
		if(size==0)
		{
			throw new java.util.EmptyStackException();
		}
		for(NodeBi p=head; p.next!=null; p=p.next)
		{
			if(p.next.data == data)
			{
				p.next = p.next.next;
				size --;
				break;
			}
		}
	}
	
	public int size()
	{
		return size;              
	}
	
	public void add(int data)
	{
		NodeBi curr = new NodeBi(data);
		if(tail == null)
		{
			//since circular head and tail are the same
			tail = new NodeBi(data);
			head = tail;
			size++;
		}
		else
		{
			//update tail
			tail.next = curr;
			curr.prev = tail;
			tail = curr;
			
			//maintain circularity
			head.prev = tail;
			tail.next = head;
			size++;
		}
	}
	
	public static void main(String args[])
	{
		JavaRing obj = new JavaRing();
		obj.add(23);
		obj.add(24);
		obj.add(25);
		obj.add(26);
		
		System.out.println(obj.head.data);
		System.out.println(obj.head.next.data);
		System.out.println(obj.head.next.next.data);
		System.out.println(obj.head.next.next.next.data);
		System.out.println(obj.head.next.next.next.next.data);
		
		obj.remove(23);
		System.out.println(obj.head.data);
		System.out.println(obj.head.next.data);
		System.out.println(obj.head.next.next.data);
		System.out.println(obj.head.next.next.next.data);
		System.out.println(obj.head.next.next.next.next.data);
		
		
	}
}

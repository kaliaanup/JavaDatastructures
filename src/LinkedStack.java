
public class LinkedStack {

	private NodeBi head = new NodeBi();
	private int size;
	
	public int pop()
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
	
	public void push(int data)
	{
		NodeBi curr = new NodeBi(data);
		head.prev = curr;
		curr.next = head;
		head = curr;
		size++;
	}
	
	public static void main(String args[])
	{
		LinkedStack obj = new LinkedStack();
		obj.push(23);
		obj.push(24);
		obj.push(25);
		obj.push(26);
		
		System.out.println(obj.head.data);
		System.out.println(obj.head.next.data);
		System.out.println(obj.head.next.next.data);
		System.out.println(obj.head.next.next.next.data);
		
		
		obj.pop();
		System.out.println(obj.head.data);
		obj.pop();
		System.out.println(obj.head.data);
		
	}
}

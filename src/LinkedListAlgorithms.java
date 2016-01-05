
public class LinkedListAlgorithms {

	public static Node printLinkedList(Node start)
	{
		for(Node p=start; p!=null; p=p.next)
		{
			System.out.println(p.data);
		}
		
		return start;
	}
	public static Node insertLinkedList(Node start, int x)
	{
		Node temp=null;
		Node aNode = new Node(x);
		for(Node p=start; p.next!=null; p=p.next)
		{
			
			if(p.next.data > x)
			{
				aNode.next = p.next;
				p.next = aNode;
				break;
			}
		}
		
		return start;
	}
	
	public static Node deleteLinkedList(Node start, int x)
	{
		if(start.data == x)
		{
			return start.next;
		}
		
		for(Node p=start; p.next!=null; p=p.next)
		{
			if(p.next.data == x)
			{
				p.next=p.next.next;
				break;
			}
		}
		return start;
	}
	public static void main(String args[])
	{
		Node start = new Node(22);
		Node first = new Node(33);
		Node second = new Node(44);
		Node third = new Node(55);
		Node fourth = new Node(66);
		
		//create a chain
		start.next = first;
		first.next = second;
		second.next=third;
		third.next=fourth;
		fourth.next=null;
		
		//printLinkedList(start);
		//insertLinkedList(start,50);
		//printLinkedList(start);
		start = deleteLinkedList(start,22);
		printLinkedList(start);
	}
}


public class NodeBi {

	int data;
	NodeBi next;
	NodeBi prev;
	
	NodeBi()
	{
		this.next = this.prev = this;
	}
	
	NodeBi(int data)
	{
		this.data=data;
	}
}

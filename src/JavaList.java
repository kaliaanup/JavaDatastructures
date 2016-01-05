import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


public interface JavaList {

	
	public static void main(String args[])
	{
		List<String> list = new ArrayList<String>();
		Collections.addAll(list, "GB", "DE", "FR", "ES");
		System.out.println(list);
		System.out.println(list.subList(1, 3));
		
		ListIterator<String> it = list.listIterator();
		System.out.println(it.next());
		System.out.println(it.nextIndex());
		
		System.out.println(it.next());
		System.out.println(it.nextIndex());
	}
}

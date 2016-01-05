import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingQueue;


public class JavaCollections {

	public static enum Month{JAN, FEB, MAR, APR, JUN, JUL, AUG, SEP, OCT, NOV, DEC};
	
	public static void main(String args[])
	{
		Set<String> set = new HashSet<String>();
		Collections.addAll(set, "CN", "BR", "BR", "AD", "UY", "RD", "QW");
		System.out.println(set);
		System.out.println(set.size());
		
		NavigableSet<String> set1 = new TreeSet<String>();
		Collections.addAll(set1, "CN", "BR", "BR", "AD", "UY", "RD", "QW");
		System.out.println(set1);
		
		EnumSet<Month> spring = EnumSet.range(Month.FEB, Month.APR);
		System.out.println(spring);
		System.out.println(EnumSet.complementOf(spring));
		
		Queue<String> queue = new LinkedBlockingQueue<String>();
		Collections.addAll(queue, "CN", "BR", "AD", "UY", "RD", "QW");
		System.out.println(queue);
		String firstOut = queue.remove();
		System.out.println(queue);
		System.out.println(firstOut);
		String secondOut = queue.peek();
		System.out.println(queue);
		System.out.println(secondOut);
		String thirdOut = queue.poll();
		System.out.println(queue);
		System.out.println(thirdOut);
		
		Queue<String> queue1 = new PriorityQueue<String>();
		Collections.addAll(queue1, "CN", "BR", "AD", "UY", "RD", "QW");
		System.out.println(queue1);
		String firstOut1 = queue1.remove();
		System.out.println(firstOut1);
		String secondOut1 = queue1.remove();
		System.out.println(secondOut1);
		String thirdOut1 = queue1.remove();
		System.out.println(thirdOut1);
		
		Deque<String> deque = new ArrayDeque<String>();
		Collections.addAll(deque, "CN", "BR", "AD", "UY", "RD", "QW");
		System.out.println(deque);
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 22, 33, 44, 55, 66);
		System.out.println(list);
		
		
	}
}

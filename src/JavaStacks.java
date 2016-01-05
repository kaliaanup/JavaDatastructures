import java.util.ArrayDeque;
import java.util.Deque;


public class JavaStacks {

	
	public static void main(String args[])
	{
		Deque<String> stack = new ArrayDeque<String>();
		stack.push("GB");
		stack.push("DE");
		stack.push("FR");
		stack.push("ES");
		
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		
	}
}

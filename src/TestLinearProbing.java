
public class TestLinearProbing {

	private static final int MASK = 0x7FFFFFFF; // 2^32-1
	private static final int CAPACITY = 11;
	private static int size = 0;
	private static boolean[] used = new boolean[CAPACITY];
	
	private static void printHash(String word)
	{
		System.out.printf("hash(%s) = %d, load = %d%%%n",word, quadraticHash(word), 100*size/CAPACITY);
	}
	//linear probing
	private static int linearHash(Object object)
	{
		++size;
		int h = (object.hashCode() & MASK) % CAPACITY;
		while(used[h])
		{
			System.out.println(h);
			h = (h+1)% CAPACITY;
		}
		used[h] = true;
		return h;
	}
	//quadratic probing
	//goes to infinite loop
	private static int quadraticHash(Object object)
	{
		++size;
		int h = (object.hashCode() & MASK) % CAPACITY;
		if(used[h])
		{
			int h0=h;
			int jump=1;
			while(used[h])
			{
				System.out.println(h);
				h = (h0+jump*jump)% CAPACITY;
				++jump;
			}
		}
		used[h] = true;
		return h;
	}
	public static void main(String args[])
	{
		printHash("Rad");
		printHash("Uhr");
		printHash("Ohr");
		printHash("Tor");
		printHash("Hut");
		printHash("Tag");
		printHash("Eis");
		printHash("Ast");
		printHash("Zug");
		/*printHash("Hof");
		printHash("Mal");*/
		
	}
}

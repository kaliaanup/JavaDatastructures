import java.util.HashMap;


public class JavaTrie {

	private JavaTrieNode root;
	
	public JavaTrie()
	{
		root = new JavaTrieNode();
	}
	
	public void insert(String word)
	{
		HashMap<Character, JavaTrieNode> children = root.children;
		
		for(int i=0; i<word.length();i++)
		{
			JavaTrieNode t;
			char c=word.charAt(i);
			if(children.containsKey(c)){
				t = children.get(c);
			}
			else
			{
				t = new JavaTrieNode(c);
				children.put(c, t);
			}
			children = t.children;
			if(i==word.length()-1)
			{
				t.isLeaf = true;
			}
		 }
	 }
	 public boolean search(String word)
	 {
		 JavaTrieNode t = searchNode(word);
		 if(t!=null && t.isLeaf)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
	 
	 public JavaTrieNode searchNode(String str)
	 {
		 HashMap<Character, JavaTrieNode> children = root.children;
		 JavaTrieNode t=null;
		 for(int i=0; i<str.length();i++)
		 {
			 char c = str.charAt(i);
			 if(children.containsKey(c)){
				 t=children.get(c);
				 children = t.children;
			 }
			 else
			 {
				return null; 
			 }
		 }
		 
		 return t;
	 }
	 
	 public static void main(String args[])
	 {
		 JavaTrie obj = new JavaTrie();
		 obj.insert("all");
		 obj.insert("along");
		 obj.insert("alone");
		 
		 System.out.println(obj.search("alonge"));
	 }
	
}

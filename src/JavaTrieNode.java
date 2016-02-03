import java.util.HashMap;


public class JavaTrieNode {
	char c;
	
	//keys are usually strings
	//all descendants have common prefix
	//root is associated with the empty string
	//the word come from "re'trie'val"
	//insertion or finding a can be done in O(L) where L=level
	HashMap<Character, JavaTrieNode> children = new HashMap<Character, JavaTrieNode>();
	boolean isLeaf;
	public JavaTrieNode(){}

	public JavaTrieNode(char c)
	{
		this.c = c;
	}
}

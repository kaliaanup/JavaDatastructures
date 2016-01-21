
public class JavaBinaryTree {
	protected String data;
	protected JavaBinaryTree left, right, parent;
	protected int size;
	
	public JavaBinaryTree()
	{
		
	}
	
	public JavaBinaryTree(String data)
	{
		this.data = data;
		JavaBinaryTree left=null;
		JavaBinaryTree right=null;
		size =1;
	}
	
	public int size()
	{
		return size;
	}
	
	public JavaBinaryTree(String data, JavaBinaryTree left, JavaBinaryTree right)
	{
		this.data=data;
		if(left!=null)
		{
			this.left = left;
			size += left.size();
		}
		
		if(right!=null)
		{
			this.right = right;
			size += right.size();
		}
	}
	
	public static void preOrderTraversal(JavaBinaryTree root)
	{
		System.out.println(root.data);
		if(root.left != null)
		{
			//System.out.println(root.left.data);
			preOrderTraversal(root.left);
		}
		if(root.right !=null)
		{
			//System.out.println(root.right.data);
			preOrderTraversal(root.right);
		}
	}
	
	public static void postOrderTraversal(JavaBinaryTree root)
	{
		//System.out.println(root.data);
		if(root.left != null)
		{
			//System.out.println(root.left.data);
			postOrderTraversal(root.left);
		}
		if(root.right !=null)
		{
			//System.out.println(root.right.data);
			postOrderTraversal(root.right);
		}
		System.out.println(root.data);
	}
	public static void inOrderTraversal(JavaBinaryTree root)
	{
		//System.out.println(root.data);
		if(root.left != null)
		{
			//System.out.println(root.left.data);
			inOrderTraversal(root.left);
		}
		System.out.println(root.data);
		if(root.right !=null)
		{
			//System.out.println(root.right.data);
			inOrderTraversal(root.right);
		}
		
	}
	
	public static void main(String args[])
	{
		/*JavaBinaryTree g = new JavaBinaryTree("G");
		JavaBinaryTree d = new JavaBinaryTree("D",null,g);
		JavaBinaryTree e = new JavaBinaryTree("E");
		JavaBinaryTree b = new JavaBinaryTree("B",d,e);
		JavaBinaryTree h = new JavaBinaryTree("H");
		JavaBinaryTree i = new JavaBinaryTree("I");
		JavaBinaryTree f = new JavaBinaryTree("F",h,i);
		JavaBinaryTree c = new JavaBinaryTree("C",f,null);
		JavaBinaryTree a = new JavaBinaryTree("A",b,c);*/
		
		//symmetric binary tree
		//leaves 
		JavaBinaryTree c1 = new JavaBinaryTree("3");
		JavaBinaryTree c2 = new JavaBinaryTree("4");
		JavaBinaryTree d1 = new JavaBinaryTree("3");
		JavaBinaryTree d2 = new JavaBinaryTree("4");
		
		//internal nodes
		JavaBinaryTree b1 = new JavaBinaryTree("2", c1, c2);
		JavaBinaryTree b2 = new JavaBinaryTree("2", d1, d2);
		
		//root
		JavaBinaryTree a = new JavaBinaryTree("1", b1, b2);
		
		//unbalanced binary tree
		JavaBinaryTree c11 = new JavaBinaryTree("3");
		JavaBinaryTree d11 = new JavaBinaryTree("3");
		
		JavaBinaryTree b11 = new JavaBinaryTree("2",null,c11);
		JavaBinaryTree b12 = new JavaBinaryTree("2",null,d11);
		
		JavaBinaryTree a1 = new JavaBinaryTree("1",b11,b12);
		
	
		
		//System.out.printf("%s", a);
		
		//preOrderTraversal(a);
		//postOrderTraversal(a);
		inOrderTraversal(a1);
		
	}
}

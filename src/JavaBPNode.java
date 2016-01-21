
public class JavaBPNode {

		private int[] key;
		private JavaBPNode[] node;
		boolean isLeaf;
		private int n;
		private int T;//ranges from T-1(min) to 2T-1(max)
		
		public JavaBPNode(int t)
		{
			this.T=t;
			this.isLeaf = true;
			this.key = new int[2*this.T-1];
			this.node = new JavaBPNode[2*T];
			this.n=0;
		}
		
		public void insert(int newKey)
		{
			
		}
}

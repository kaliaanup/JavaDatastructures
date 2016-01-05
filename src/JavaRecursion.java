
public class JavaRecursion {

	
	public static int fact(int n)
	{
		//basis stops recursion
		if(n == 0)
		{
			return 1;
		}
		
		//recursive part
		return n * fact(n-1);
	}
	
	public static int fib(int n)
	{
		if(n < 2)
		{
			return n;
		}
		return fib(n-1) + fib(n-2);
	}
	
	public static int search(int[] a, int x)
	{
		return search(a, 0, a.length-1, x);
	}
	
	public static int search(int[] a, int lo, int hi, int x)
	{
		//base
		if(lo>hi)
		{
			return -1;
		}
		int i = (lo+hi)/2;
		
		if(a[i] == x)
		{
			return i;
		}
		else if(a[i]<x)
		{
			return search(a, i+1, hi, x);
		}
		else
		{
			return search(a, lo, i-1, x);
		}
	}
	
	public static int binomialCoeff(int n, int k)
	{
		if(k==0 || k==n)
		{
			return 1;
		}
		return binomialCoeff(n-1,k-1)+binomialCoeff(n-1,k);
	}
	
	public static int gcd(int m, int n)
	{
		if(m==n)
		{
			return n;
		}
		else if(m<n)
		{
			return gcd(m, n-m);
		}
		else
		{
			return gcd(m-n, n);
		}
	}
	
	public static void main(String args[])
	{
		System.out.println(fact(6));
		System.out.println(fib(7));
		int[] a={22, 33, 44, 55, 66};
		
		System.out.println(search(a, 44));
		
	}
}

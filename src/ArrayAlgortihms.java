import java.util.ArrayList;
import java.util.Arrays;


public class ArrayAlgortihms {

	public static int sequentialSearch(int a[], int x)
	{
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == x)
			{
				return 0;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int a[], int x)
	{
		int low = 0;
		int high = a.length;
		int mid = 0;
		while (low < high)
		{
			mid = (low + high)/2;
			if(a[mid] == x)
			{
				return 0;
			}
			else if(a[mid] < x)
			{
				low = mid + 1;
			}
			else if(a[mid] > x)
			{
				high = mid;
			}
		}
		
		
		return -1;
	}
	//Order is not preserved
	public static int[] removeDuplicates(int a[])
	{
		Arrays.sort(a);
		//int b[] =new int[a.length];
		
		int aNo=a[0];
		int count =0;//count duplicates
		for(int i=1;i<a.length;i++)
		{
			if(a[i] == aNo)
			{
				count++;
			}
			else
			{
				aNo=a[i];
			}
		}
		System.out.println(count);
		int b[] =new int[a.length - count];
		aNo=a[0];
		b[0]=a[0];
		int j=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i] != aNo)
			{
				j++;
				
				b[j]=a[i];
				aNo=a[i];
				//System.out.println(b[j]);
			}
			
		}
		return b;		
	}
	//Order is Preserved
	public static int[] removeDuplicatesO(int a[])
	{
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(!temp.contains(a[i]))
			{
				temp.add(a[i]);
			}
		}
		int count =0;
		int b[] =new int[temp.size()];
		for(int i=0; i<temp.size();i++)
		{
			b[i]=temp.get(i);
		}
		
		return b;
	}
	
	public static int[] reverse(int a[])
	{
		int mid = (a.length+1)/2;
		int last = a.length-1;
		int temp=0;
		for(int i=0; i<mid;i++)
		{
			if(mid<last)
			{
				temp = a[i];
				a[i]=a[last];
				a[last]=temp;
				last--;
			}
		}
		return a;
	}
	public static int[] insertPosn(int a[], int x, int pos)
	{
		int b[]=new int[a.length+1];
		int j=0;
		int index = pos -1;
		
		for(int i=0; i<a.length;i++)
		{
			
			if(i == index)
			{
				
				b[j] = x;
				b[j+1]=a[i];
				j=j+2;
			}
			else
			{
				b[j] = a[i];
				j++;
			}			
		}
		
		return b;
	}
	public static int[] deletePosn(int a[], int pos)
	{
		int b[]=new int[a.length-1];
		int j=0;
		int index = pos -1;
		
		for(int i=0; i<a.length;i++)
		{
			
			if(i == index)
			{				
				b[j] = a[i+1];
				//j=j+2;			
			}
			else
			{
				b[j] = a[i];
				j++;
			}			
		}
		
		return b;
	}
	public static void main(String args[])
	{
		//int a[] = {22, 33, 44, 44, 55, 55, 55, 66, 77};
		//int a []={};
		int a[] = {33, 22, 44, 55, 44, 55, 66, 55, 77};
		int ret = 0;
		
		ret = sequentialSearch(a, 46);
		ret = binarySearch(a, 44);
		int b[]=removeDuplicatesO(a);
		//reverse(a);
		int c[]=insertPosn(a,53,1);
		c=deletePosn(a,1);
		for(int i=0; i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
	}
	
}

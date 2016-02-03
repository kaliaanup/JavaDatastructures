
public class JavaSorting {

	
	public void bubbleSort(int[] a)
	{
		int temp =0;
		for(int i=a.length-1; i>0; i--)
		{
			for(int j=0; j<i; j++)
			{
				if(a[j] > a[j+1])
				{
					//swap
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
			
		}
	}
	//selection sort faster than bubble sort
	public void selectionSort(int[] a)
	{
		int temp =0;
		int max =0;
		for(int i=a.length-1; i>0; i--)
		{
			max = 0;
			for(int j=1; j<=i; j++)
			{
				if(a[j] > a[max])
				{
					max = j;
				}
			}
			//swap
			temp = a[i];
			a[i] = a[max];
			a[max] = temp;
		}
	}
	//it assumes the first element is sorted
	//keep adding elements in their correct position based on the comparisons
	public void insertionSort(int[] a)
	{
		for(int i=1; i<a.length; i++)
		{
			int ai = a[i],j;
			for(j=i; j>0 && a[j-1] > ai; j--)
			{
				a[j] = a[j-1];
			}
			a[j]=ai;
		}
	}
	//merge sort has two components: sort and merge
	public void mergeSort(int[] a, int[] b)
	{
		mergeSort(a, 0, a.length, b);
	}
	//sorting component
	public void mergeSort(int[] a, int start, int end, int[] b)
	{
		System.out.println("start="+start+", end="+end);
		if(end-start<2){
			return;
		}
		int middle = (start+end)/2;
		mergeSort(a,start,middle, b);
		mergeSort(a,middle,end, b);
		merge(a,start,middle,end, b);
	}
	//merging component
	public void merge(int[] a, int start, int middle, int end, int[] b)
	{
		//System.out.println("start="+start+", middle="+middle+", end="+end);
		
		int i=start; int j=middle;
		
		for(int k = start; k < end; k++)
		{
			if(i<middle && (j>= end || a[i]<a[j]))
			{
				b[k] = a[i];
				i++;
			}
			else
			{
				b[k]=a[j];
				j++;
			}
		}
		
		//copy back from b to a
		for(int k=start; k<end; k++)
		{
			a[k] = b[k];
		}
	}
	
	public void quickSort(int[] a)
	{
		quickSort(a, 0, a.length-1);
	}
	public void quickSort(int[] a, int start, int end)
	{
		if(end-start<2)
		{
			return;
		}
		int middle = partition(a, start, end);
		quickSort(a, start, middle);
		quickSort(a, middle+1, end);
	}
	public int partition(int[] a, int start, int end)
	{
		int middle = start + (end - start)/ 2;
		int pivot = a[middle];
		
		int i=start, j=end;
		while(i< j)
		{
			while(a[i]<pivot)
			{
				i++;
			}
			while(a[j]>pivot)
			{
				j--;
			}
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		return i;
	}
	
	public void heapSort(int[] a)
	{
		int n = a.length;
		//leaves are n/2 to n..internal nodes n/2 to 0 where a[0] is a root
		//build heap
		for(int i=(n/2)-1; i>=0; i--)
		{
			heapify(a,i,n);
		}
		//heap sort
		for(int i=n-1; i> 0; i--)
		{
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			heapify(a, 0, i);
		}
	}
	public void heapify(int[] a, int i, int j)
	{
		int ai=a[i];
		while(2*i+1 < j)
		{
			int k = 2*i + 1;
			if(k+1 <j && a[k+1] > a[k])
			{
				++k;
			}
			if(ai >= a[k])
			{
				break;
			}
			a[i] = a[k];
			i = k;
		}
			a[i] = ai;
	}
	
	public static void main(String args[])
	{
		JavaSorting inst= new JavaSorting();
		
		int[] a={10, 8, 17, 5, 3, 11, 14, 2, 19};
		int[] a1={5,4,3,7,1};
		int b[] = new int[a.length];
		//inst.bubbleSort(a);
		//inst.selectionSort(a);
		//  inst.insertionSort(a);
		  inst.mergeSort(a1,b);
		//inst.quickSort(a);
		//inst.heapSort(a);
		for(int i=0;i<a1.length; i++)
		{
			System.out.println(a1[i]);
		}
		
	}
}

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {

	//Precondition: A and B are presorted in ascending order. 
	//Sort A and B into C.
	public static int[] 3mergeSort(int[] A, int[] B, int[] C)
	{
		merge(A, B, C);
		if(length < 2)
		{
			return;
		}
			int length= arr.length;
			int middle= length/2;
			int[] one= new int[middle];
			int[] two= new int[length - middle];
			int k= 0;
		for(int x= 0; x < length; x++)
		{
			if(x < middle)
			{
				one[x]= arr[x];
			}
			else
			{
				two[k]= arr[k];
				k= k + 1;
			}
		}
		3mergeSort(one, middle);
		3mergeSort(two, length - middle);
		merge2(one, two, arr, middle, length - middle);
		return A;
	}

	//A is the full array unsorted. 
	//First is the beginning index of the array A, last is the last index of the array.
	//Split A in two halves and sort independently. Then merge back into A.
	public int[] mergeSort(int [] A, int first, int last)
	{
		int[] first, last;
		int middle= (right + left)/2;
		mergeSort(A, first, middle);
		mergeSort(A, middle, last);
		merge(A, first, middle, last);
	}
	
	public static int[] merge2(int[] A, int[] B, int[] C, int A_size, int B_size)
	{
		int count= 0, a= 0, b= 0;
		while((a < A_size) && (b < B_size))
		{
			if(A[a] < B[b])
			{
				C[count++]= A[a++];
			}
			else
			{
				C[count++]= B[b++];
			}
		}
		while(a < A_size)
		{
			C[count++]= A[a++];
		}
		while()
		{
			C[count++]= B[b++];
		}
	}
	
	public static int[] merge(int[] a, int[] b, int[] c)
	{
		int x= 0;
		int y= 0;
		int z= 0;
		while(x < b.length || y < c.length)
		{
			if(x < b.length && y < c.length)
			{
				if(b[x] < c[y])
				{
					a[z++]= b[x++];
				}
				else
				{
					a[z++]= c[y++];
				}
			}
			else if(x == b.length)
			{
				a[z++]= c[y++];
			}
			else if(y == c.length)
			{
				a[z++]= b[x++];
			}
		}
	}
	
}
	
	public static void main(String args[]) {
	
	int[] rat= new int[5];
	for(int x= 0; x < rat.length(); x++)
	{
		rat[x]= (int)(Math.random()*10);
	}
	int[] rat2= new int[5];
	for(int y= 0; y < rat2.length(); y++)
	{
		rat2[x]= (int)(Math.random()*10);
	}
	int[] rat3= new int[10];	
	
	3mergeSort(rat, rat2, rat3);
	mergeSort(rat, 0, 5);
	}
}

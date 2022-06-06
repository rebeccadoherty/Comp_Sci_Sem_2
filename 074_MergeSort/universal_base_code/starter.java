import pkg.*;
import java.util.*;


class starter {
	public static int[] mergeSort(int [] A, int first, int last)
	{
		if(last <= first)
		{
			return A;
		}
		if(first < last)
		{
			int middle= (first + last)/2;
			mergeSort(A, first, middle);
			mergeSort(A, middle + 1, last);
			merge(A, first, middle, last);
		}
		return A;
	}
	
	public static int[] merge(int[] arr, int left, int middle, int right)
	{
		int n1= middle - left + 1;
		int n2= right - middle;
		
		int[] L= new int[n1];
		int[] R= new int[n2];
		
		for(int x= 0; x < n1; x++)
		{
			L[x]= arr[left + x];
		}
		for(int y= 0; y < n2; y++)
		{
			R[y]= arr[middle + 1 + y];
		}
		
		int rightindex= 0;
		int leftindex= 0;
		
		for(int x= left; x < right + 1; x++)
		{
			if(leftindex < L.length && rightindex < R.length)
			{
				if(L[leftindex ]< R[rightindex])
				{
					arr[x]= L[leftindex];
					leftindex++;
				}
				else
				{
					arr[x]= R[rightindex];
					rightindex++;
				}
			}
			else if(leftindex < L.length)
			{
				arr[x]= L[leftindex];
				leftindex++;
			}
			else if(rightindex < R.length)
			{
				arr[x]= R[rightindex];
				rightindex++;
			}
		}
		return arr;
	}
	
	public static void main(String args[]) {
		
		int[] rat= new int[10];
		for(int x= 0; x < rat.length; x++)
		{
			rat[x]= (int)(Math.random()*10);
		}
		
		mergeSort(rat, 0, rat.length);
		System.out.println(rat);
	}
}

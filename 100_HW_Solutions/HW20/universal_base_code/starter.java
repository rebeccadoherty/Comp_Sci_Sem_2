import java.util.*;

class starter {
	
	public static void bubbleSort(int[] arr)
	{
		for(int outer= 0; outer < arr.length - 1 ; outer++)
		{
			for(int inner= 0; inner < arr.length - outer - 1; inner++)
			{
				if(arr[inner] > arr[inner + 1])
				{
					int temp= arr[inner];
					arr[inner]= arr[inner + 1];
					arr[inner + 1]= temp;
				}
			}
		}
	}
	
	public static void insertionSort(int[] arr)
	{
		int inner, outer, key;
		for(outer= 1; outer < arr.length; outer++)
		{
			key= arr[outer];
			inner= outer - 1;
			while((inner >= 0) && (arr[inner] > key))
			{
				arr[inner + 1]= arr[inner];
				inner= inner - 1;
			}
			arr[inner + 1]= key;
		}
	}
	
	public static void selectionSort(int[] arr)
	{
		for(int x= 0; x < arr.length - 1; x++)
		{
			int index= x;
			for(int y= x + 1; y< arr.length; y++)
			{
				if(arr[y] < arr[index])
				{
					index= y;
				}
			}
			int smallest= arr[index];
			arr[index]= arr[x];
			arr[x]= smallest;
		}	
	}
	
	public static double findMedian(int[] arr)
	{
		double median;
		int total= arr.length;
		int sum= arr[total/2] + arr[total/2 - 1];
		median= sum/2;
		return median;
	}
	
	public static void main(String args[]) {
		
		int[] rat= new int[100];
		for(int x= 0; x < rat.length; x++)
		{
			rat[x]= (int)(Math.random()*100);
		}
		
		int[] rat2= new int[100];
		for(int x= 0; x < rat2.length; x++)
		{
			rat2[x]= (int)(Math.random()*100);
		}
	
		int[] rat3= new int[100];
		for(int x= 0; x < rat3.length; x++)
		{
			rat3[x]= (int)(Math.random()*100);
		}
		
		selectionSort(rat);
		insertionSort(rat);
		bubbleSort(rat);
		for(int x= 0; x < rat.length; x++)
		{
			System.out.println(rat[x]);
		}
		System.out.println("median: " + findMedian(rat));
		
		
		bubbleSort(rat2);
		insertionSort(rat2);
		selectionSort(rat2);
		for(int x= 0; x < rat2.length; x++)
		{
			System.out.println(rat2[x]);
		}
		System.out.println("median: " + findMedian(rat2));
		
		insertionSort(rat3);
		bubbleSort(rat3);
		selectionSort(rat3);
		for(int x= 0; x < rat3.length; x++)
		{
			System.out.println(rat3[x]);
		}
		System.out.println("median: " + findMedian(rat3));
	}
}

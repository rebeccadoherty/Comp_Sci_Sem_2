import pkg.*;
import java.util.Scanner;
import java.util.Random;


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
		for(int y= 0; y < arr.length; y++)
		{
			System.out.println(arr[y]);
		}
	}
	
	public static void main(String args[]) {
		// Your code goes below here
	int[] rat= new int[100];
	for(int x= 0; x < rat.length; x++)
	{
		rat[x]= (int)(Math.random()*100);
	}

	bubbleSort(rat);
	}
}

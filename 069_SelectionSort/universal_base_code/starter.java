import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
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
	
	public static void main(String args[]) {
		// Your code goes below here
		int[] rat= new int[200];
		for(int x= 0; x < rat.length; x++)
		{
			rat[x]= (int)(Math.random()*10);
		}

		selectionSort(rat);
		for(int b= 0; b < rat.length; b++)
		{
			System.out.println(rat[b]);
		}
	}
}

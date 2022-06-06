import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class starter {
	
	public static void toStringArray(ArrayList<Integer> arr)
	{
		for(int a= 0; a < arr.size(); a++)
		{
			System.out.print(arr.get(a) + " ");
		}
	}
	public static int getArrayListAverage(ArrayList<Integer> arr)
	{
		int sum= 0;
		for(int x= 0; x < arr.size(); x++)
		{
			sum= sum + arr.get(x);
		}
		int average= sum/arr.size();
		return average;
	}
	public static int getArrayListMax(ArrayList<Integer> arr)
	{
		int max= 0;
		for(int z= 1; z < arr.size(); z++)
		{
			if(arr.get(z) > max)
			{
				max= arr.get(z);				
			}
		}
		return max;
	}
	public static int getArrayListMin(ArrayList<Integer> arr)
	{
		int min= 100;
		for(int r= 1; r < arr.size(); r++)
		{
			if(arr.get(r) < min)
			{
				min= arr.get(r);
			}
		}
		return min;
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc= new Scanner(System.in);
		
		while(true)
		{
			System.out.println("How many values do you want?");
			int answer= sc.nextInt();
			ArrayList<Integer> rat= new ArrayList<Integer>(answer);
			for(int x= 0; x < answer; x++)
			{
				int meh= (int)(1 + (Math.random()*100));
				rat.add(x, meh);
				System.out.println(rat.get(x));
			}

			toStringArray(rat);
			System.out.println(getArrayListMax(rat));
			System.out.println(getArrayListMin(rat));
			System.out.println(getArrayListAverage(rat));
		}
	}
}

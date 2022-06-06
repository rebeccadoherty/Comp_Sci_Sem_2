import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

class starter {
	public static void printArrayList(ArrayList<Integer> arr)
	{
		for(int x= 0; x < arr.size(); x++)
		{
			System.out.println(arr.get(x));
		}
	}
	
	public static void addValuesArrayList(int n, ArrayList<Integer> arr)
	{
		for(int y= 0; y < n; y++)
		{
			arr.add(0);
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc=  new Scanner(System.in);
		ArrayList<Integer> rat= new ArrayList<Integer>();
		System.out.println("How many values do you want to add?");
		int answer= sc.nextInt();
		addValuesArrayList(answer, rat);
		printArrayList(rat);
	}
}

import pkg.*;
import java.util.Scanner;
import java.util.*;

class starter {
	
	public static int fibonacci(int a)
	{
		if(a <= 1)
		{
			return a;
		}
		else
		{
			return fibonacci(a - 1) + fibonacci(a - 2);
		}
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc= new Scanner(System.in);
		System.out.println("How many values of the Fibonacci sequence would you like to print out?");
		int answer= sc.nextInt();

		for(int x= 0; x < answer; x++)
		{
			System.out.println(fibonacci(x));
		}
	}
}

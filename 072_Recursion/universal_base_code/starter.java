import pkg.*;
import java.util.*;

class starter {
	public static int factorial(int n)
	{
		if(n <= 1)
		{
			return 1;
		}
		else
		{
			return n * factorial(n - 1);
		}
	}
	
	public static int recurPower(int base, int n)
	{
		if(n != 0)
		{
			return(base * recurPower(base, n - 1));
		}
		else
		{
			return 1;
		}
	}	

	public static void main(String args[]) {
		
		System.out.println(factorial(5));
		System.out.println(recurPower(3, 4));
	}
}

import java.util.*;
import java.util.ArrayList;
import java.util.Random;

class starter {
	
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		removeDup(arr1);		//Create this method.
		System.out.println();
		System.out.println();
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add((int)(Math.random()*10));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}

	public static void removeDup(ArrayList<Integer> arr)
	{
		for(int x= 0; x < arr.size(); x++)
		{
			for(int y= x + 1; y < arr.size(); y++)
			{
				if(arr.get(x) == arr.get(y))
				{
					arr.remove(y);
					y--;
				}
			}
		}
	}
	
}

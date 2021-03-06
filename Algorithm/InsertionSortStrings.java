/*
Algorithm Programs: Program 7

@author : Vaishali Gupta(QT8)
*/

import utility.UtilityClass;
import java.util.Scanner;
class InsertionSortStrings
{
	public static void main(String args[])
	{
		
		String[] sortedArray = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the data to be sorted");
		int size = sc.nextInt();

		String[] arr = new String[size];
		System.out.println("Enter the elements");
		for(int i=0; i< size;i++)
		 arr[i]= sc.next(); 

		System.out.println("Original array: ");
		for(String s: arr)
			System.out.print(s+ "  ");

		sortedArray = UtilityClass.doInsertionSort(arr);
		System.out.println("Sorted Array:  ");
		for(String s: sortedArray)
			System.out.print(s + "  ");
	}
}

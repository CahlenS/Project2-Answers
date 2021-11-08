package Driver;

import AnswersPackage.BubbleSort;
import AnswersPackage.EvenOddCheck;
import AnswersPackage.FibonacciNumbers;
import AnswersPackage.ReverseString;
//import java.io.*;
import java.util.*;
import AnswersPackage.Factorial;
import AnswersPackage.Substring;
import AnswersPackage.ComparatorSort;
import AnswersPackage.ComparatorSortByName;
import AnswersPackage.Palindromes;
import AnswersPackage.PrimeCheck;
import AnswersPackage.MinimumTenerary;

public class Driver {
	
	public static void main(String args[]) {
		
		//Q1
		BubbleSort ob = new BubbleSort();
		int arr[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4,};
		ob.Sort(arr);
		System.out.println("Q1: ");
		ob.Print(arr);
		
		//Q2
		FibonacciNumbers fn = new FibonacciNumbers();
		System.out.println("Q2: ");
		for(int i = 0; i <= 25; i++)
			System.out.print(fn.fib(i) + " ");
		
		//Q3
		ReverseString rever = new ReverseString();
		String x = "YensiD";
		System.out.println("\nQ3: ");
		System.out.print("Original Word: " + x  + " Reversed Word: " + rever.Reversal(x));
		
		//Q4
		Factorial Fa = new Factorial();
		int Num = 10;
		System.out.println("\nQ4: ");
		System.out.println("Factorial of " + Num + " is " + Fa.Fact(Num));
		
		//Q5
		//Thought the way you did Q5 was better than my original attempt may make edits later
		System.out.println("Q5: ");
		Substring.TestSubstring(9);
		
		//Q6
		System.out.println("Q6: ");
		EvenOddCheck.Num(Num);
		
		//Q7
		ArrayList<ComparatorSort> CS = new ArrayList<ComparatorSort>();
		CS.add(new ComparatorSort(3, "kreg", "Austria"));
		CS.add(new ComparatorSort(9, "erza", "Britain"));
		CS.add(new ComparatorSort(5, "miku", "Japan"));
		CS.add(new ComparatorSort(7, "idean", "Canada"));
		CS.add(new ComparatorSort(4, "dreg", "Germany"));
		
		System.out.println("Q7: ");
		System.out.println("Unsorted: ");
		for(int i = 0; i < CS.size(); i++) {
			System.out.println(CS.get(i));
		}
		
		System.out.println("Sorted By Name: ");
		Collections.sort(CS, new ComparatorSortByName());
		for(int i = 0; i < CS.size(); i++) {
			System.out.println(CS.get(i));
		}
		
		//Q8
		//System.out.println("Q8: ");
		
		//Q9
		PrimeCheck pc = new PrimeCheck();
		//For the sake of my sanity(and testing), 1-20 for now may edit later
		int arr2[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println("Q9: ");
		System.out.println("Prime Numbers: ");
		pc.Prime(arr2);
		
		//Q10
		MinimumTenerary mt = new MinimumTenerary();
		System.out.println("Q10: ");
		mt.Ten();
	}

}

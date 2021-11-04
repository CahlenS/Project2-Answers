package Driver;

import AnswersPackage.BubbleSort;
import AnswersPackage.FibonacciNumbers;
import AnswersPackage.ReverseString;
//import java.io.*;
//import java.util.Scanner;
import AnswersPackage.Factorial;
import AnswersPackage.Substring;

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
		System.out.print("Factorial of " + Num + " is " + Fa.Fact(Num));
		
		//Q5
		Substring str = new Substring();
		String y ="Sol1 2Badguy";
		System.out.println("\nQ5: ");
		str.Sub(y);
		
	}

}

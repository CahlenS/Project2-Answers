package Driver;

import AnswersPackage.BubbleSort;
import AnswersPackage.EvenOddCheck;
import AnswersPackage.FibonacciNumbers;
import AnswersPackage.ReverseString;
//import java.io.*;
import java.util.*;
import AnswersPackage.Factorial;
import AnswersPackage.Substring;
import AnswersPackage.SwitchCase;
import AnswersPackage.ComparatorSort;
import AnswersPackage.ComparatorSortByName;
import AnswersPackage.Palindromes;
import AnswersPackage.PrimeCheck;
import AnswersPackage.Q13;
import AnswersPackage.Q15_exe;
import AnswersPackage.MinimumTenerary;
import AnswersPackage.FloatVariableOne;
import AnswersPackage.Interest;
import SecondFloatPackage.FloatVariableTwo;
import AnswersPackage.EvenOrOdd;
import AnswersPackage.StringCharacters;

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
		System.out.println("Q8: ");
		Palindromes pa = new Palindromes();
		pa.Palindrome();
		
		//Q9
		PrimeCheck pc = new PrimeCheck();
		//For the sake of my sanity(and testing), 1-20 for now may edit later
		int arr2[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println("Q9: ");
		System.out.println("Prime Numbers: ");
		pc.Prime(arr2);
		
		//Q10
		System.out.println("\nQ10: ");
		MinimumTenerary mt = new MinimumTenerary();
		mt.Ten();
		
		//Q11
		System.out.println("Q11: ");
		System.out.println("Float Variable One in Answers Package: ");
		FloatVariableOne fvo = new FloatVariableOne();
		fvo.First();
		System.out.println("Float Variable Two in Second Float Package: ");
		FloatVariableTwo fvt = new FloatVariableTwo();
		fvt.Second();
		
		//Q12
		EvenOrOdd eoo = new EvenOrOdd();
		int arr3[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
		System.out.println("Q12: ");
		eoo.Even(arr3);
		
		//Q13
		System.out.println("\nQ13: ");
		Q13.PrintTriangle(4);
		
		//Q14
		System.out.println("Q14: ");
		SwitchCase.SwitchCases(1);
		SwitchCase.SwitchCases(2);
		SwitchCase.SwitchCases(3);
		
		//Q15
		System.out.println("Q15: ");
		Q15_exe ex = new Q15_exe();
		ex.Interfaces();
		
		//Q16
		System.out.println("Q16: ");
		StringCharacters sc = new StringCharacters();
		sc.Sen();
		
		//Q17
		System.out.println("Q17: ");
		Interest in = new Interest();
		in.inter();
		
		//Q18: in Driver18 Class
		
		//Q19: EvenAndOdd Class
		
		//Q20: Q20 Class
	}

}

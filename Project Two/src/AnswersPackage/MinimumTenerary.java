package AnswersPackage;

import java.util.*;

public class MinimumTenerary {
	
	public void Ten() {
		
		int num1, num2, result;
		
		Scanner in = new Scanner(System.in);
		System.out.print("First Number: ");
		num1 = in.nextInt();
		System.out.print("Second Number: ");
		num2 = in.nextInt();
		
		result = num1<num2 ? num1:num2;
		System.out.println("Smallest Number: " + result);
	}

}

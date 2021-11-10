package AnswersPackage;

import java.util.*;

public class Interest {
	
	public void inter() {
		
		int Time;
		float Prince, rate;
		double Interest;
		
		Scanner ter = new Scanner(System.in);
		System.out.print("Enter your principal: ");
		Prince = ter.nextFloat();
		System.out.print("Enter your Time: ");
		Time = ter.nextInt();
		System.out.print("Enter your rate: ");
		rate = ter.nextFloat();
		
		Interest = Prince * Time * rate;
		
		System.out.print("Your Interest is: " + Interest);
	}

}

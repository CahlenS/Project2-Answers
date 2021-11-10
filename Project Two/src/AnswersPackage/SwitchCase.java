package AnswersPackage;

import java.time.LocalDate;

public class SwitchCase {
	
	public static void SwitchCases(int option) {
		
		int aNumber = 25;
		
		switch(option) {
		
			case 1:
				System.out.println("The square root of a number " + aNumber + " is " + Math.sqrt(aNumber));
				break;
				
			case 2:
				System.out.println("Today's Date is " + LocalDate.now());
				break;
				
			case 3:
				String whole = "I am learning core Java";
				String[] parts = whole.split(" ");
				
				for(String s : parts)
					System.out.println(s);
				break;
		}
	}

}

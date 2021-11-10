package AnswersPackage;

public class Q13 {
	
	public static void PrintTriangle(int size) {
		
		int characterIteration = 0;
		
		//Iterate through each row
		for(int i = 0; i<size; ++i) {
			for(int j = 0; j<i + 1; ++j) {
				System.out.print( (characterIteration % 2) + " ");
				++characterIteration;
			}
			System.out.println();
		}
	}

}

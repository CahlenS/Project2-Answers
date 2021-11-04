package AnswersPackage;

public class Factorial {
	
	public static int Fact(int fac) {
		
		if (fac == 0) {
			return 1;
		}return fac*Fact(fac-1);
	}

}

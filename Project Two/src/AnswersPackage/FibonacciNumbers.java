package AnswersPackage;

public class FibonacciNumbers {
	
	public static int fib(int f) {
		
		if(f <= 1)
			return f;
		return fib(f-1) + fib(f-2);
		
	}
	
	public static void main(String args[]) {
		
		FibonacciNumbers fn = new FibonacciNumbers();
		for(int i = 0; i <= 25; i++)
			System.out.println(fn.fib(i));
	}

}

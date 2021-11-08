package AnswersPackage;

public class PrimeCheck {
	
	public void Prime(int arr2[]) {
		
		for(int p = 1; p<arr2.length; p++) {
			boolean isPrime = true;
			
			for(int n = 2; n<p; n++) {
				
				if(p%n == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				
				System.out.print(p + " ");
				
			}
		}
		
	}

}

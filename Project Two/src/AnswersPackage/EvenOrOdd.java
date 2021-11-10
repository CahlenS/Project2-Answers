package AnswersPackage;

public class EvenOrOdd {
	
	public void Even(int arr3[]) {
		
		for(int e : arr3) {
			boolean isEven = true;
			
			if(e%2 != 0) {
				isEven = false;
			}
			
			if(isEven) {
				
				System.out.print(e + " ");
				
			}
		}
		
	}

}

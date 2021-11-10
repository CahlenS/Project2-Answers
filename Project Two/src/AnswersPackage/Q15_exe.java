package AnswersPackage;

public class Q15_exe {
	
	public void Interfaces() {
		
		Interface q15 = new Q15_impl();
		
		Result(q15);
	}
	
	public void Result(Interface q15) {
		System.out.println(q15.addition(5, 10));
	}

}

package AnswersPackage;

public class ReverseString {
	
	public String Reversal(String RE){
		
		String ER = "";
		char KH;
		
		for(int i = 0; i<RE.length(); i++) {
			
			KH = RE.charAt(i);
			ER = KH+ER;
		}
		return ER;
	}

}

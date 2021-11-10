package AnswersPackage;

public class Q18_2 extends Q18{
	
	public Q18_2 (String inp) {
		this.inp = inp;
	}

	@Override
	public boolean isUpperCase() {
		String lowerString = inp.toLowerCase();

        boolean equal = lowerString.equals(inp);


        if(equal){
            return false;
        }else{

            return true;
        }
	}

	@Override
	public String convertToUpper() {

		return inp.toUpperCase();
	}

	@Override
	public int convertToInt() {
		int num = 10;
        //since a string is scanned to add an integer to the string
        //type cast character by character
        for(int i = 0; i<inp.length();i++){
            num = num + (int)inp.charAt(i);
        }
        return num;
	}
	
	

}

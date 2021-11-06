package AnswersPackage;

public class Substring {
	
	static String Substring(String str, int idx) {
		
		char[] charArray = str.toCharArray();
		char[] substringArray = new char[idx];
		
		for (int i = 0; i<idx; ++i) {
			substringArray[i] = charArray[i];
		}
		
		return new String(substringArray);
	}
	
	static String testString = "Sol1 2Badguy";
	
	public static void TestSubstring(int idx) {
		System.out.println(Substring(testString, idx));
	}

}

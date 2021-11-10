package AnswersPackage;

import java.util.*;

public class StringCharacters {
	
	public void Sen() {
		
		int chanum;
		String sent;
		
		Scanner cc = new Scanner(System.in);
		System.out.print("Type out your String: ");
		sent = cc.nextLine();
		
		chanum = sent.length();
		
		System.out.println("Length of String: " + chanum);
	}

}

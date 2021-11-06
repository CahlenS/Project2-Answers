package AnswersPackage;

import java.io.*;
import java.lang.*;
import java.util.*;

public class ComparatorSort {
	
	int ID;
	String Name, Address;
	
	public ComparatorSort(int ID, String Name, String Address) {
		
		this.ID = ID;
		this.Name = Name;
		this.Address = Address;
		
	}
	
	public String toString(){
		
		return this.ID + " " + this.Name + " " + this.Address;
	}

}

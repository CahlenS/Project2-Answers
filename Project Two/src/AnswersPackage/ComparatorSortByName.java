package AnswersPackage;

import java.util.Comparator;

public class ComparatorSortByName implements Comparator<ComparatorSort> {

	public int compare(ComparatorSort a, ComparatorSort b) {

		return a.Name.compareTo(b.Name);
	}
	
}

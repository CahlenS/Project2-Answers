package AnswersPackage;

public class BubbleSort {
	
	public void Sort(int arr[]) {
		
		int s = arr.length;
		for (int c = 0; c < s-1; c++)
			for (int z = 0; z < s-c-1; z++)
				if (arr[z] > arr[z+1]) {
					
					int temp = arr[z];
					arr[z] = arr[z+1];
					arr[z+1] = temp;
					
				}
	}
	
	public void Print(int arr[]) {
		
		int p = arr.length;
		for (int d = 0; d < p; ++d)
			System.out.print(arr[d] + " ");
		System.out.println();
		
	}
	
	public static void main(String args[]){
		
		BubbleSort ob = new BubbleSort();
		int arr[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4,};
		ob.Sort(arr);
		System.out.println("Q1: ");
		ob.Print(arr);
		
	}

}

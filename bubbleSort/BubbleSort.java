package bubbleSort;

public class BubbleSort {

	public static void main(String args[]) {
		
		int[] num = {6, 82, 12, 1, 4, 59, -32, 61};
		bubbleSort(num);
		
		//printing the sorted array
		for(int i = 0; i < num.length; i++) {
		System.out.print(num[i] + " ");
		}
	}

// method for sorting an array of integers, given as a parameter 
public static void bubbleSort(int[] num) {

	//loop one time for each element of the array
	for(int i = 0; i < num.length; i++) {
		//each loop goes through all the elements of the array
		for(int j = 0; j < num.length-1; j++) {
			//and swap the places of the two elements if they are
			//in the wrong places 
			if(num[j] > num[j+1]) {
				int temp = num[j];
				num[j] = num[j+1];
				num[j+1] = temp;
			}
		}
	}

}

}

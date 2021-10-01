package bubbleSort;
/*the optimized version of the bubble sort does not go through the elements 
 * that are already sorted and uses a boolean variable to indicate 
 * if there is no need to go through the array again, once it is already 
 * sorted. All of that does not change the Big O notation of the algorithm.
 */
public class OptimizedBubbleSort {

	public static void main(String args[]) {
		
		int[] num = {6, 82, 12, 1, 4, 59, -32, 61};
		bubbleSort(num);
		
		for(int i = 0; i < num.length; i++) {
		System.out.print(num[i] + " ");
		}
	}


public static void bubbleSort(int[] num) {

	for(int i = 0; i < num.length; i++) {
		boolean hasSwap = false;
		//after each iteration the number of elements the loop goes through is 
		//being reduced (num.length-1-i)
		for(int j = 0; j < num.length-1-i; j++) {
			if(num[j] > num[j+1]) {
				int temp = num[j];
				num[j] = num[j+1];
				num[j+1] = temp;
				
				//rise a flag that there was a swap
				hasSwap = true;
			}
		}
		//if there were no swaps, that means the arary has been 
		//sorted and we break the loop
		if(!hasSwap) {
			break;
		}
	}

}

}




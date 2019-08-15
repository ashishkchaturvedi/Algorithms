package algo.quicksort;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] a = {12,14,16,1,8,6,45,12,65,3,78};
		quickSort(a,0,a.length-1);
		
		for(int i = 0; i<a.length;i++){
			System.out.println(a[i]);
		}

	}
	
	public static void quickSort(int[] inputArray, int start, int end){
		
		if(start < end){
			int q = partition(inputArray, start, end);
			quickSort(inputArray, start, q-1);
			quickSort(inputArray, q+1, end);
		}
	
	}
	
	public static int partition(int[] a, int start, int end){
		int i=start-1;
		//int j = start;
		int pivot = a[end];
		//int n = a.length;
		
		for(int j = start; j<=end-1;j++){
			
			if(a[j]<=pivot){
				i++;
				int  temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			
		}
		
		int temp = a[i+1];
		a[i+1] = pivot;
		a[end] = temp;
		return i+1;
	}

}

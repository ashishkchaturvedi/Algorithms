package algo.sorting;

public class BubbleSort {
	
	public static void sort(int a[]){
		int n = a.length;
		int swap = 0;
		for(int i = 0; i < n-1; i++){
			for(int j = 0; j < n-i-1; j++){
				if(a[j] > a[j + 1]){
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swap++;
				}
			}
		}
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("\nTotal number of swaps are: "+swap);
	}

	public static void main(String[] args) {
		int a[] = {5, 1, 4, 2, 8, 9};
		sort(a);
	}

}

package algo.insertionsort;

public class App {

	public static void main(String[] args) {
		int [] myArray = insertionSort(new int[]{21,12,2,6,18,45,16,8});
		for(int i = 0; i<myArray.length;i++){
			System.out.println(myArray[i]);
		}

	}
	
	public static int[] insertionSort(int [] a){
		
		int n  = a.length-1;
		for (int i=1;i<=n;i++){
			int key = a[i];
			int j = i-1;
			while(j>=0 && a[j]>key){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
		return a;
		
	}

}

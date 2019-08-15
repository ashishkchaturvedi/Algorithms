package algo.selectionsort;

public class App {

	public static void main(String[] args) {
		int [] myArray = selectionSort(new int[]{12,2,45,67,1,8,6});
		for(int i=0;i<myArray.length;i++){
			System.out.println(myArray[i]);
		}

	}
	
	public static int [] selectionSort(int a[]){
		int n  = a.length-1;
		for(int i = 0; i<=n ;i++){
			int min = i;
			for(int j=i+1; j<=n; j++){
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp  =a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		
		return a;
	}

}

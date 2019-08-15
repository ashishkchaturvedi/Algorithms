package algo.mergesort;

public class App {

	public static void main(String[] args) {
		
		int a[] = {18,17,12,1,9,14,15,3,8,10};
		MergeSort ms = new MergeSort();
		ms.sort(a);
		
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
			
		}

	}

}

package algo.searching;

public class BinarySearch {
	
	public int search(int a[], int  key){
		int low = 0;
		int high = a.length-1;
		//int mid = (low+high)/2;
		
		while(low<=high){
			int mid = (low+high)/2;
					
			if(a[mid]>key){
				high = mid-1;
			}
			else if(a[mid]<key) {
				low = mid+1;
			}
			else return mid;
		}
		return -1;
		
	}
	
	public int recursiveSearch(int a[], int p, int r, int x){
		
		if (p>r){
			return -1;
		}
		
		else {
			int q = (p+r)/2;
			
			if(a[q]==x){
				return q;
			} else if(a[q]>x){
				return recursiveSearch(a,p,q-1,x);
			} else {
				return recursiveSearch(a,q+1,r,x);
			}
			
		}
	}

	public static void main(String[] args) {
		
		int index;
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		BinarySearch bs = new BinarySearch();
		//index = bs.search(a, 16);
		int n = a.length-1;
		//
		index = bs.recursiveSearch(a, 0, n, 16);
		System.out.println(index==-1?"Element not found":"Element found at index: "+index);

	}

}

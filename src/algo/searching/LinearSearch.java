package algo.searching;

public class LinearSearch {
	
	static int answer;
	
	public LinearSearch(){
		this.answer = -1;
	}
	
	public int search(int a[], int key){
		
		for (int i=0;i<a.length;i++){
			if(a[i] == key){
				answer=i;
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int index;
		LinearSearch ls = new LinearSearch();
		int a[] = {11,12,16,1,8,6,78,9,3,75,42,83,96,78,23,12,11};
		index = ls.search(a, 16);
		System.out.println(index == -1?"Element not found":"Elementfound at index: "+index);
	}

}

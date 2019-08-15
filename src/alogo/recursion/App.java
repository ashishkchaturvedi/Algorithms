package alogo.recursion;

public class App {
	
	public static void reduceByOne(int n){
		if(n!=0){reduceByOne(n-1);}
		System.out.println("Completed Call: "+n);
	}
	
	public static int recursiveLinearSearch(int a[], int i, int x){
			
		
		
		if(i>a.length){
			return -1;
		}
		else if(a[i]==x){
			return i;
		} else {
			//System.out.println("Index at: "+i);
			return recursiveLinearSearch(a,i+1,x);
		}
		
	}

	public static void main(String[] args) {
		//reduceByOne(10);
		//App a = new App();
		int a[] ={1,7,2,6,9,12,11,45,25,36,45,78,41} ;
		System.out.println(recursiveLinearSearch(a,0,45));

	}


}

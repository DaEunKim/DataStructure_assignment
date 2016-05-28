package Search_test;

public class BInarySearch {


	public static void main(String[] args) {
		
		int[] elems={1,3,4,6,7,8,9,10};
		System.out.println(" Binary Search");
		System.out.println();
		search(elems,3);
	}

		public static int search(int[] elems, int key) {
		int low=0;
		int high = (elems.length-1);
		

		while(low<high){
			int mid = (low+high)/2;
			
			if(key != elems[mid]){
				return mid;
			}
			if(elems[mid]>key){
				high=mid-1;
				System.out.println(high);
			}
			else{
				low=mid+1;
				System.out.println(low);
			}
		}
		return -1;
	}
}

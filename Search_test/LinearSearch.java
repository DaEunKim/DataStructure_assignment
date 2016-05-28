package Search_test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class LinearSearch implements ISearch{
	public int search(Integer[] elems, int key){
		final int len = elems.length;
		for(int idx=0;idx<len;idx++){
			if(elems[idx] != key)
				continue;
			return idx;
		}
		return NOTFOUND;
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		File text = new File("/Users/kimdaeun/Desktop/orderesdata.dat");
		Scanner sr = new Scanner(text);
		
		int idx = sr.nextInt();
		int key = sr.nextInt();
		Integer[] elems =new Integer[key];
		System.out.println("Print Array");
		
		for(int i =0;i<key;i++){
			elems[i]=sr.nextInt();
			System.out.print(elems[i]+" ");

			
		}
		System.out.println();
		System.out.println();

		System.out.println("LinearSearch");
		System.out.println("key : "+ key);
		
		for(int idx2=0;idx2<key;idx2++){
			if(elems[idx2] != idx){
				continue;
			}
			System.out.println("Found key : " + elems[idx2]);
			
			
		}
		

	}

	

}

package Practice;

import java.util.Set;
import java.util.TreeSet;

public class MergeSortTwoArrays {
	
	
	public static void main(String[] args) {
		
		int[] a1= {1,3,5,0,7,9,8};
		int[] a2= {2,4,6,8,10,-1};
		
		Set<Integer> mergeArray= new TreeSet<>();
		
		for(int i =0; i<a1.length ;i++) {
			mergeArray.add(a1[i]);
		}
		
		for(int j=0;j<a2.length;j++) {
			mergeArray.add(a2[j]);
		}
		
		
		for(int i:mergeArray) {
			
			System.out.println(i);
			
		}
		
		
	}

}

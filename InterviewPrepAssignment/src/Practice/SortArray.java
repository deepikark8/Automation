package Practice;

import java.util.HashSet;

//[5,7,8,0,1,0,34,51,0]



public class SortArray {

	public static void main(String[] args) {
		
		int a[] = {5,7,8,0,1,0,34,51,0};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			hs.add(a[i]);
		}
		
		System.out.println(hs);
		
		
	}
}

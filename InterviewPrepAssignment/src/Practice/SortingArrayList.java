package Practice;
import java.util.ArrayList;


public class SortingArrayList {
	
	public static void main(String[] args) {
		
		
		int a[] = {5,7,8,0,1,0,34,51,0};
		ArrayList<Integer> hs = new ArrayList<Integer>();
		
		
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i] == 0) {
			hs.add(a[i]);
			}
		}
		
		for(int i=0;i<a.length;i++) {
		
			if(a[i] !=0) {
				hs.add(a[i]);
			}
			
		}
		
		System.out.println(hs);
		
		
	}

}

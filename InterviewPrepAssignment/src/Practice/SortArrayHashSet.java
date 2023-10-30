package Practice;
import java.util.Arrays;
import java.util.HashSet;



public class SortArrayHashSet {

	
	public static void main(String[] args) {
		
		
		int a[] = {5,7,8,0,1,0,34,51,0};
		
		int size = a.length;
		int temp;
		
		for(int i=0; i<size;i++) {
			
			for(int j=i+1; j<size;j++) {
				
				if(a[i] >a[j]) {
				
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
				}
				
			}
			
		}
		System.out.println(Arrays.toString(a));
	
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			//if(a[i]== 0) {
				hs.add(a[i]);
			//}else {
				//hs.add(a[i]);
			//}
			
		}
		
		System.out.println(hs);
		
		
		
		
	}
}

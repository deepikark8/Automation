package Day7;

import java.util.HashSet;
import java.util.TreeSet;

/*
 * Sorted Array can't hold null value
 * 
 * Always gives output in ascending order
 * 
 */



public class TreeConcept {
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(52);
		ts.add(85);
		ts.add(79);
		ts.add(33);
		ts.add(85);
		//ts.add(null);
		
		for(Integer num:ts) {
			//System.out.println(num);
		}
		
		
		TreeSet<String> tsStr = new TreeSet<String>();
		tsStr.add("Apple");
		tsStr.add("Banana");
		tsStr.add("Orange");
		tsStr.add("Apricot");
		tsStr.add("Guava");
		tsStr.add("Grapes");
		
		for(String str:tsStr) {
			//System.out.println(str);
		}

		//- It does not allow heterogeneous object because it must compare to sort order
		 /*
		
		TreeSet hst = new TreeSet();
		hst.add("hi");
		hst.add(10);
		//hst.add(null);
		hst.add(13.09);
		for(Object each:hst) {
			
			System.out.println(each);
		}
		
		*/
		
		
	}

}

package Day7;

import java.util.HashSet;
import java.util.Iterator;

public class SetConcept {
	
	public static void main(String[] args) {
		
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(52);
		hs.add(85);
		hs.add(79);
		hs.add(33);
		hs.add(85);
		hs.add(null);
		hs.add(null);
		
		
		for(Integer num:hs) {
			//System.out.println(num);
		}
		
		HashSet<String> hsStr = new HashSet<String>();
		hsStr.add("Deepika");
		hsStr.add("Ram");
		hsStr.add("Harsh");
		hsStr.add("Harshi");
		
		
		for(String str:hsStr) {
			//System.out.println(str);
		}

		
		//Creates an empty HashSet with an initial capacity of 16 and a load factor of 0.75.


		HashSet hst = new HashSet();
		hst.add("hi");
		hst.add(10);
		hst.add(null);
		hst.add(13.09);
		for(Object each:hst) {
			
			System.out.println(each);
		}
		
		
		/*Iterator itr =  hst.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		
		
		
	}

}

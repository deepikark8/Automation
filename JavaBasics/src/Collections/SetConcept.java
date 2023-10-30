package Collections;

import java.util.HashSet;
import java.util.TreeSet;

/*
 * Set cannot contain duplicate elements
 * 
 * 	-HashSet
 * 	-TreeSet
 * 	-LinkedHashSet
 * 
 */

public class SetConcept {
	
	public static void main(String[] args) {
		
		int count[] = {34, 22,10,60,30,22};
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<count.length;i++) {
				set.add(count[i]);
		}
		System.out.println(set);
		
		
		TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
		System.out.println("The sorted list is "+ sortedSet);
		System.out.println("The first element is "+sortedSet.first());
		System.out.println("The last element is "+sortedSet.last());
		
	}

}

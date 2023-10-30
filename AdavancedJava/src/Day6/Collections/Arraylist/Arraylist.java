package Day6.Collections.Arraylist;
import java.util.ArrayList;
import java.util.Iterator;


/*
 * Get data from Collection using
 * for loop
 * Iterator
 * for each loop
 * 
 */

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Declare the collection
		 * Add values to collection - ArrayList
		 * COlelctions can hold Heterogeneous data
		 * It maintains insertion order.
		 * It can hold Duplicate values
		 * It  holds null value
		 * Remove by index 
		 * Length of ArrayList is size()
		 * Replace the element set(1,"newString")
		 */

		ArrayList newArray = new ArrayList();
		newArray.add(8);
		newArray.add("Deepika");
		newArray.add(2);
		newArray.add(15);
		newArray.add(25.0);
		newArray.add("Test");
		newArray.remove(3);
		newArray.add(3, 111);
		newArray.set(1, "Harsh");
		newArray.add(null);
		newArray.add(null);
		
		//System.out.println("Size of Array :" +newArray.size() );
		
		//newArray.clear();
	/*	for(int i=0; i<newArray.size();i++) {
			System.out.println(newArray.get(i));
		}
		*/
		
		Iterator itr =  newArray.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	/*	//Looping with for each
		
		for(Object each:newArray) {
			
			System.out.println(each);
			
			
		}
		*/
		
	}

	

}

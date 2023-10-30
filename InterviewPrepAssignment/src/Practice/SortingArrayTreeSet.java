package Practice;
import java.util.TreeSet;

public class SortingArrayTreeSet {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,5,6};
		int b[] = {1,6,7,4,8,9};
		
		TreeSet<Integer> ts = new TreeSet<>();


		for (int element : a) {
			ts.add(element);
		}
		for (int element : b) {
			ts.add(element);
		}

		System.out.println(ts);
		
		
	}
}


package Day7;

import java.util.Stack;

public class StackConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack<String> stk = new Stack<String>();
		stk.add("Apple");
		stk.add("Banana");
		stk.add("Orange");
		stk.add("Coconut");
		//Peek(don't remove) and Pop(remove)
		
		//System.out.println(stk.pop());
		//System.out.println(stk.peek());
		
		for(String str:stk) {
			
			System.out.println(str);
		}
		
		
	}

}

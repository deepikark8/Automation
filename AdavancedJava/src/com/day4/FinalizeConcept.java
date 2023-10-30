package com.day4;
/*
 * Finalize is a method
 * 
 * Finalize method should always be protected.
 * Garbage Collection - its is a process which Java JVM will take care
 * 
 * System.gc(); - is to call garbage Collection.
 * before calling the Garbage Collection manually or through JVM then we need to put that code in finalize method
 *   
 * 
 * Finalize method is always called before garbage Collection - System.gc()
 * 
 */

public class FinalizeConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalizeConcept obj = new FinalizeConcept();
		System.out.println(obj.hashCode());
		obj = null;
		System.gc();
	}
	
	protected void finalize() {
		System.out.println("Im the Finalized method");
	}

}

package com.Java.Hackathon;

public class Q33Person implements Comparable<Q33Person> {
	
	 int height;
	    int weight;

	    public Q33Person(int height, int weight) {
	        this.height = height;
	        this.weight = weight;
	    }

	    @Override
	    public String toString() {
//	        return "Person{" +
//	                "height=" + height +
//	                ", weight=" + weight +
//	                '}';
	    	
	    	return "{" +
            "" + height +
            "," + weight +
            '}';
	    	
	    }

	    @Override
	    public int compareTo(Q33Person p) {
	        if(this.height>p.height) {
	            return 1;
	        } else if(this.height < p.height) {
	            return -1;
	        } else {
	            return 0;
	        }
	    }
	

}

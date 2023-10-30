package JavaCoding;

public class AddTwoArrray {
	
	public static int[] addTwoNumbers(int[] l1, int[] l2) {
	       int[] arr = new int[l1.length];
	       int temp=0;
	       for(int i=0;i<l1.length;i++){
	           
	           
	               
	               int a = l1[i]+l2[i];
	               
	               if(a == 10){
	                   arr[i] = 0;
	                   temp =1;
	               }else{
	                 
	                  
	                   arr[i]=a+temp;
	                   temp=0;
	               }
	              
	               
	           
	       }
	        return arr;
	    }

	    public static void main(String[] args){
	        int[] l1 = {2,4,3};
	        int[] l2 = {5,6,4};
	        int[] resultArr = addTwoNumbers(l1,l2);

	    for(int i=0; i<resultArr.length;i++){
	        System.out.println("Result : "+resultArr[i]);
	    }
	    }

}

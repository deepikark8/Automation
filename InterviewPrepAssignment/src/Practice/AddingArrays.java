package Practice;

public class AddingArrays {
	
	public static void main(String[] args) {
	
	
	int[] a = {3, 4, 3};
    int[] b ={4,6,4};
    int[] c = new int[a.length];
    int temp = 0;
    for(int i=a.length-1; i>=0;i--){
    
   // for(int i=0;i<a.length;i++) {
    
        int num = a[i] + b[i] + temp;
        
        if(num > 9){
            int reminder = num / 10;
            int carryOver = num % 10;
             c[i] = carryOver;
             temp = reminder;
             
        }else{
             c[i] = num;
        }
             
            
        
    }
    for(int x=0;x<c.length;x++){
    System.out.println(c[x]);
    }
}

}

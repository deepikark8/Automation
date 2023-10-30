package Practice;

public class ArraySorting {

	
	public static void main(String[] args) {
		
		String[] strArray = {"flower", "flow", "floight"};
		int temp = 0 ;
		String str0 = strArray[0];
		char[] chArr0 = str0.toCharArray();
		String str1 = strArray[1];
		char[] chArr1 = str1.toCharArray();
		String str2 = strArray[2];
		char[] chArr2 =str2.toCharArray();
		
		for(int i=0;i<strArray.length;i++) {
			
			String str = strArray[0];
			
			for(int j=0; j<str.length();j++) {
				
				
				
					for(int k=0; k<chArr1.length;k++) {
				
					for(int l=0;l<chArr2.length;l++) {
						
						if(chArr0[j] == chArr1[k] && chArr0[j] == chArr2[l]) {
							//System.out.println(j);
							temp =j;
						}
					}
					
					
					
					
				}
				
			}
			
			
			
		}
		
		//System.out.println("temp "+ temp);
		if(temp > 0) {
			System.out.println(str0.substring(0, temp));
		}else {
			System.out.println("No common text");
		}
		
	}
	
}




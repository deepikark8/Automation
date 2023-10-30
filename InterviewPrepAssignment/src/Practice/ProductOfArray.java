package Practice;
//Input=[1,2,3,4] 
//Output=[24,12,8,6].
public class ProductOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] iArr = {2,3,5,6};
		for(int i=0;i<iArr.length;i++) {
			for(int j=i+1;j<iArr.length;j++) {
				//int ans1 = iArr[i]*iArr[j];
				//System.out.println(ans1);
				for(int k=j+1;k<iArr.length;k++) {
				int ans = iArr[i]*iArr[j]*iArr[k];
				if(ans != iArr[j] && iArr[i] != iArr[j] && iArr[j] != iArr[i]) {
				System.out.println(ans);
			
					}	
				}
			}
		}

	}

}

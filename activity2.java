package activity;

public class activity2 {

	public static void main(String[] args) {
		activity2 actobj=new activity2();
		//Create integer array 
		int[]nums= {10,77,10,54,-11,10};
		int searchnum=10;
		int fixedsum=30;
		System.out.println("Result" + actobj.result (nums,searchnum,fixedsum));
		
		
		

	}

	public boolean  result (int[]nums,int searchnum,int fixedsum) {
		int tempsum=0;
		for(int number :nums ) {
			if (number== searchnum) {
				tempsum=tempsum+searchnum;
				
			}
			if(tempsum>fixedsum) {
				
				break;
			}}
			
			return fixedsum==tempsum;
		}
			
		
	
	}

		
	



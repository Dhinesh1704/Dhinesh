package For1;

public class Example16 {
	public static void main(String[]args) {
		int evenCount=0;
		int oddCount=0;
	for(int i=1;i<=10;i++) {
		if(i%2==0) {
			evenCount=evenCount+1;
		}
		else {
			oddCount=oddCount+1;
			
		}
		
	
	}
	System.out.println("even count is="+evenCount);
	System.out.println("odd count is="+oddCount);
	}

}

package For1;

public class Example23 {
	public static void main(String[]args) {
		String a="DhIneshRajA";
		String temp=a.toUpperCase();
		int uCount=0;
		int lCount=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==temp.charAt(i)) { 
				uCount=uCount+1;
				
			}
			else {
				lCount++;
			}
						
		}
		System.out.println(a.charAt(uCount));
		System.out.println(a.charAt(lCount));
	}

}

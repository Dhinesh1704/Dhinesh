package For1;

public class Example19 {
	public static void main(String[]args) {
		String a="chair";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
			
			
		}
		if(a.equalsIgnoreCase(b)) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("is not palindrome");
			
			
		}
	}

}

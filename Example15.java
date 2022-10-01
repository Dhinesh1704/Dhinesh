package For1;

public class Example15 {
	public static void main(String[]args) {
	String a="racecar";
	String b="";
	for(int i=a.length()-1;i>=0;i--) {
		b=b+a.charAt(i);
		
	}
	if(a.equals(b)) {
		System.out.println("palindrome");
		
	}
	else {
		System.out.println("is not palindrome");
	}
	}

}

package For1;

public class Example22 {
	public static void main(String[]args) {
		String a="dinesh";
		for(int i=a.length()-1;i>=0;i--) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
			System.out.println(a.charAt(i));	
			}
		}
	}

}





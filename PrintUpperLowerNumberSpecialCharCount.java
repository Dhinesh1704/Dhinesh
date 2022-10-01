package For1;

public class PrintUpperLowerNumberSpecialCharCount {
	public static void main(String[]args) {
		String a="Dhines$HRaJa1&7";
		int uCount=0;
		int lCount=0;
		int nCount=0;
		int sCount=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='a'&&a.charAt(i)<='z') {
				lCount++;
			}
			else if(a.charAt(i)>='A'&&a.charAt(i)<='Z') {
				uCount++;
		}
			else 
				if(a.charAt(i)>='0'&&a.charAt(i)<='9') {
				nCount++;
	}
			else {
				sCount++;
			}

}
		System.out.println(uCount);
		System.out.println(lCount);
		System.out.println(nCount);
		System.out.println(sCount);
		
	}
}

package For1;

public class Example12 {
	public static void main(String[]args) {
		int total=0;
		for(int i=0;i<=10;i++) {
			total=total+i;
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
	}

}

package For1;

public class Example20 {
	public static void main(String[]args) {
		int total=0;
		int totalAll=0;
		for(int i=0;i<=5;i++) {
			total=total+i;
			totalAll=totalAll+total;
			System.out.println(total);
		}
		System.out.println(totalAll);
	}

}

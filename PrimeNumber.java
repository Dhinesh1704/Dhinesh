package For1;

public class PrimeNumber {
	public static void main(String[]args) {
		int prime=29;
		boolean flag=true;
		for(int i=2;i<prime;i++) {
			if(prime%i==0) {
				flag=false;
			}
			
		}
		if(flag==true) {
			System.out.println(prime+"is a prime number");
		}
		else {
			System.out.println(prime+"is not prime number");
		}
	}

}

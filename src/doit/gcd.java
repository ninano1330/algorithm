package doit;

public class gcd {
	public static void main(String[] args) {
		int a = 36;
		int b = 51;
		
		System.out.println(a>= b ? gcd(a,b) : gcd(b,a));
	}
	
	static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		
		return gcd(b,a%b);
	}
	
	static int gcd2(int a, int b) {
		while(b!=0) {
			int tmp = a%b;
			
			a = b;
			b = tmp;
		}
		
		return a;
		
	}
}

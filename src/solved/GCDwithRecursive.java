package solved;

public class GCDwithRecursive {
	public static void main(String[] args) {
		int p= 6; 
		int q= 14;
		
		gcd(p,q);
	}

	
	
	public static int gcd(int p, int q) {
		if (q == 0) {
			System.out.println("최대공약수 : " + p);
			return p;
		}
			
		return gcd(q, p % q);
	}
}

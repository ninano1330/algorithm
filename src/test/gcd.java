package test;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 36;
		int b = 48;

		System.out.println();

	}

	// 최대공약수 : 호재법
	public static int gcd(int p, int q) {
		if (q == 0)
			return p;
		return gcd(q, p % q);
	}
}

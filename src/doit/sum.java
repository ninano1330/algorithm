package doit;

public class Sum {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(sum(n));		
	}
	
	public static int sum(int n) {
		/*
		 * 가우스 덧셈
		 * 1부터 n까지의 합
		 * n(n+1)/2
		 */
		return n*(n+1)/2;
	}

}

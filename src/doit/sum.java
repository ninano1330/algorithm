package doit;

public class sum {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(sum(n));
		
		do {
			n--;
			System.out.println("n = " + n);
		}while(n>0);
		
		
		FieldTest test = new FieldTest();
		System.out.println(test.getA());
		
		
		int[] a = new int[] {1,2,3,4,5};
		int[] b = a.clone();
		
		
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

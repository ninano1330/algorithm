
public class MathSqrtPow {

	public static void main(String[] args) {
		long n = 121;
		System.out.println(solution(n));
	}

	public static long solution(long n) {

		return (long) (Math.sqrt(n) % 1==0 ? Math.pow(Math.sqrt(n) + 1, 2) : -1);
	
	}
}

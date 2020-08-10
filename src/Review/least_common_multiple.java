package Review;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class least_common_multiple {

	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		
		System.out.println("n%m : " + n%m);
		solution(n, m);
	}

	public static int[] solution(int n, int m) {
		int mul = n * m;
		int min = n <= m ? n : m;
		int least_mul = 0;

		for (int i = 1;; i++) {
			if (n * i % m == 0) {
				least_mul = n * i;
				break;
			}
		}

		int[] answer = { mul / least_mul, least_mul };
		System.out.println(answer[0]);
		System.out.println(answer[1]);

		return answer;
	}

	//최대공약수 : 호재법
	public static int gcd(int p, int q) {
		if (q == 0)
			return p;
		return gcd(q, p % q);
	}

}

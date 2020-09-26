package solved;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerMethods {

	public static void main(String args[]) {
		String s = "-1234";
		
//		System.out.println(solution(s));
	}

	public static int solution(String s) {
		int answer = 0;
		boolean sign = false;
		
		
		System.out.println(s.indexOf('-'));
		
		if(s.indexOf('-') != -1) {
			System.out.println(" - 이 존재");
//			s.replace("-", "");
			answer = Integer.parseInt(s);
		}else {
			System.out.println(" - 이 비존재");
			answer = Integer.parseInt(s);
		}
		return answer;
	}
}

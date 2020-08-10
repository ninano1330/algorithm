import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	static int count = 0;

	public static void main(String[] args) {
//		int n= 6;
		int n =626331;
		solution(n);
	}

	public static int solution(int num) {
		return (int) collatz((long)num);
	}
	
	public static long collatz(long num) {
		if(num==1) {
			return count;
		}else if(count >=500) {
			return -1;
		}
		
		
		if(num%2==0) {
			num = num /2;
			count ++;
			System.out.println("num은 짝수. num : " + num);
			System.out.println("count : " + count);
		}else if(num%2 ==1) {
			num = (num*3) +1 ;
			count ++;
			System.out.println("num은 홀수. num : " + num);
			System.out.println("count : " + count);
		}
		return collatz(num);
	}

}

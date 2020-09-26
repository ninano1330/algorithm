package solved;

import java.util.Arrays;


public class LongToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long n = 118372;
		System.out.println(solution(n));

	}

	public static long solution(long n) {
	      
	      String s = Long.toString(n);
	 
	      String[] s_arr = s.split("");
	      Arrays.sort(s_arr);
	     
	      s = "";
	      for(int i=0; i < s_arr.length; i++) {
	    	  s += s_arr[i];
	      }
	      
	      StringBuilder sb = new StringBuilder(s);
	      s = sb.reverse().toString();
    
	      long answer = Long.parseLong(s);
	      return answer;
	 }
	
	/*
	 * 
	 * 함수 solution은 정수 n을 매개변수로 입력받습니다. 
	 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.
입출력 예
n	return
118372	873211
*/

}

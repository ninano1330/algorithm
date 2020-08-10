package Review;

public class LongReverse {

	public static void main(String[] args) {
		long n= 12345;
		System.out.println(solution(n));

	}

	 public static int[] solution(long n) {
		 
		 String s = Long.toString(n);
		 int[] answer = new int[s.length()];
		 int j = 0;
		 
		 for(int i= s.length()-1; i >= 0; i--) {
			 
			 System.out.println("idx = " + i);
			 answer[j] = Integer.parseInt(Character.toString(s.charAt(i)));
			 j++;
		 }
		
		 
//		 for(int i=0; i < s.length(); i++) {
//			 System.out.println(answer[i]);
//		 }
		 
	     return answer;
	  }
	 
	 
	 /*
	  * 
	  * String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
      return answer;
	  */
	 
}

/*
 * 
 * 자연수 뒤집어 배열로 만들기
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
n	return
12345	[5,4,3,2,1]
*/

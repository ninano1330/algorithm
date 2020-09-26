package etc;

public class Test3 {

	public static void main(String[] args) {
//		int x = 2; int n= 5;
//		int x = 4; int n = 3;
//		int x = -4; int n = 2;
		int x = 0; int n = 5;
		solution(x,n);
	}

	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i=1; i <= n; i++) {
        	answer[i-1] = (long)x *i;

        }
        
        return answer;
    }
}

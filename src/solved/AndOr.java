package solved;
import java.util.Arrays;

public class AndOr {

	public static void main(String[] args) {
//		int n = 5;
//		int[] arr1 = {9, 20, 28, 18, 11};
//		int[] arr2 = {30, 1, 21, 17, 28};
		
		int n =6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		
		solution(n, arr1, arr2);
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[arr1.length];
		
		for(int i=0; i < answer.length; i++) {
			answer[i] = makeWall(arr1[i] | arr2[i], n );
		}
		
		return answer;	
	}
	
	public static String makeWall(int a, int n) {
		String answer = "";

		for(int i= n-1; i >=0; i--) {
			if(a/(int) Math.pow(2, i) ==1){
				a = a - (int) Math.pow(2, i);
				answer += "#";
			}else {
				answer += " ";
			}
		}
		
		return answer;
	}
}

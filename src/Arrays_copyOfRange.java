import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_copyOfRange {

	public static void main(String[] args) {
		int[][] commands= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] array = {1, 5, 2, 6, 3, 7, 4}; //236
		
		solution(array, commands);
	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		
		for(int i=0; i< commands.length; i++) {
			int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(arr);
			System.out.println("3번째 숫자는 " + arr[commands[i][2]-1]);
			answer[i]= arr[commands[i][2]-1];
//			answer[i]=arr[commands[i][2]-1];
		}
		
//		for(int i=0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
			
		
		return answer;
	}

}

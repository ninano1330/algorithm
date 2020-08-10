import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_Sort {

	public static void main(String[] args) {
		int[] arr = {5,9,7,10};
		int divisor = 5;
		
//		int[] arr = {2,36,1,3};
//		int divisor = 1;
		
//		int[] arr = {3,2,6};
//		int divisor = 10;
		
		System.out.println(solution(arr,divisor));
		
		
		for(int i=0; i< solution(arr,divisor).length; i++) {
			System.out.println(solution(arr,divisor)[i]);
		}
	}

	 public static int[] solution(int[] arr, int divisor) {
		 Arrays.sort(arr);
         List<Integer> answerList = new ArrayList<Integer>();

         for(int i=0; i < arr.length ; i++) {
             if(arr[i] % divisor ==0) {
                 answerList.add(arr[i]);
             }
         }

         int[] answer;

         if(answerList.size() !=0) {
             answer = new int[answerList.size()];
             for(int i=0; i < answerList.size(); i++) {
                 answer[i] = answerList.get(i);
             }

         }else {
             answer = new int[1];
             answer[0] = -1;
         }

         return answer;
	     
	     // return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
	  }
}

/*
나누어 떨어지는 숫자 배열
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

제한사항
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.
*/

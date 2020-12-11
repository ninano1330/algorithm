package solving;

import java.util.Arrays;

public class pg_safeboat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] people = {70, 50, 80, 50};
		int limit = 100;
		
		System.out.println(solution(people,limit));
		
		int[] people2 = {70, 80, 50};
		int limit2 = 100;
		System.out.println(solution(people2,limit2));
	}

	public static int solution(int[] people, int limit) {
		Arrays.sort(people);
		
		int answer = 0;
		int minIdx = 0;
		for(int i=people.length-1; i >= minIdx; i--) {
			int sum;
			if(i == minIdx) {
				sum = people[i];
			}else {
				sum = people[minIdx] + people[i];
			}
			
			if(sum > limit) {
				answer++;
			}else {
				minIdx++;
				answer++;
			}
		}
		
		return answer;
	}

}

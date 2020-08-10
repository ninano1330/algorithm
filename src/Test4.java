import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

		solution(5,stages);
	}

	public static int[] solution(int N, int[] stages) {
		double[] fail_Probability = new double[N];
		int denominator = stages.length;
		
		Arrays.sort(stages);
		
		for(int i=1; i <= N; i++ ) {
			int molecular = 0;
			for(int j=0; j < stages.length; j++) {
				if(stages[j] == i) {
					molecular++;		
				}
				if(stages[j] > i) break;
			}
//			System.out.println("분자 : " + molecular);
//			System.out.println("분모 : " + denominator);
			fail_Probability[i-1] = ((double)molecular / (double)denominator);
//			System.out.println(fail_Probability[i-1]);
			
			denominator = denominator - molecular;	
		}
		
		int[] answer = new int[N];
		
		for(int i=0; i < fail_Probability.length; i++) {
			for(int j= i+1; j < fail_Probability.length ; j++) {
				if(fail_Probability[j] > fail_Probability[i] ) {
					double tmp = fail_Probability[i];
					fail_Probability[i] = fail_Probability[j];
					fail_Probability[j] = tmp;
				}
			}
			
			
		}
		
		for(int i=0; i< answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		return answer;
	}
}

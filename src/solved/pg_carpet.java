package solved;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/42842
 * */
public class pg_carpet {

	public static void main(String[] args) {
		int brown = 10; int yellow = 2;
		int answer[] = solution(brown,yellow);
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println();
		
		int brown2 = 8; int yellow2 = 1;
		int answer2[] = solution(brown2,yellow2);
		
		for(int i=0; i<answer2.length; i++) {
			System.out.print(answer2[i] + " ");
		}
		System.out.println();
		
		int brown3 = 24; int yellow3 = 24;
		int answer3[] = solution(brown3,yellow3);
		
		for(int i=0; i<answer3.length; i++) {
			System.out.print(answer3[i] + " ");
		}
		System.out.println();

	}

	public static int[] solution(int brown, int yellow) {
		int sum = brown + yellow;
		int[] answer = null;
		
		for(int i=1; i<=sum; i++) {
			if(sum % i !=0) {
				continue;
			}
			
			if(i < sum/i) {
				continue;
			}
			
			int length = i;
			int width = sum/i;
			
			//width : 3, legnth : 4
			int[][] carpet = new int[width][length];
			
			paintCarpet(carpet);
			
			int yellowCnt = 0;
			for(int w=0; w<carpet.length; w++) {
				for(int l=0; l<carpet[w].length; l++) {
					if(carpet[w][l] ==0) {
						yellowCnt += 1;
					}
				}
			}
			
			if(yellow == yellowCnt) {
				answer = new int[]{length, width};
		        return answer;
			}

		}
		return answer;
    }
	
	public static void paintCarpet(int[][] carpet) {
		
		for(int i=0; i<carpet[0].length; i++) {
			carpet[0][i] = 1;
		}
		
		for(int i=0; i<carpet.length; i++) {
			carpet[i][carpet[i].length-1] = 1;
		}
		
		for(int i=0; i<carpet[0].length; i++) {
			carpet[carpet.length-1][i] = 1;
		}
		
		for(int i=0; i<carpet.length; i++) {
			carpet[i][0] = 1;
		}
	}
}

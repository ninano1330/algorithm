package review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pg_HIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] citations = {3, 0, 6, 1, 5};
		solution(citations);
	}
	
	public static int solution(int[] citations) {
		List<Integer> citationsList = new ArrayList<>();
		
		for(int i=0; i<citations.length; i++) {
			citationsList.add(citations[i]);
		}
		
		Collections.sort(citationsList);
		int max = citationsList.get(citationsList.size()-1);
		
		int HIndex = 0;
	
		for(int i=0; i<=max; i++) { //인용 횟수
			int useCnt = 0;	
			for(int j=0; j<citationsList.size(); j++) { //논문 리스트
				if(citationsList.get(j) >= i) {  //i번 이상 인용됐으면
					useCnt++;
				}
			}
			
			System.out.println("인용 횟수 : " + i);
			System.out.println("인용 횟수 이상 논문 편수 " + useCnt);
			
			if(useCnt>=i) {
				if(i>=HIndex) {
					HIndex = i;
					System.out.println("HIndex : " + HIndex);
				}
			}
			
			System.out.println();
		}
		
		
        return HIndex;
    }

}

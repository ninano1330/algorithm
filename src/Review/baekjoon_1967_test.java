package review;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;


public class baekjoon_1967_test {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int caseCnt = sc.nextInt();
		
		int caseIdx = 0;
		while(caseIdx < caseCnt) {
			int docs = sc.nextInt();
			int resultIdx = sc.nextInt();
			
			LinkedList<LinkedList<Integer>> docsPriorityIdx = new LinkedList<>();
			//int[][] docsPriorityIdx = new int[docs][2];
			
			for(int i=0; i<docs; i++) {
				int priority = sc.nextInt();
				
				LinkedList<Integer> docPriorityIdx = new LinkedList<>();
				docPriorityIdx.add(priority);
				docPriorityIdx.add(i);
				
				docsPriorityIdx.add(docPriorityIdx);
			}
			
//			for(int i=0; i<docs; i++) {
//				LinkedList<Integer> docPriorityIdx = docsPriorityIdx.get(i);
//				System.out.println("priority : " + docPriorityIdx.get(0));
//				System.out.println("idx : " + docPriorityIdx.get(1));
//				System.out.println();
//			}
			
			int order = 0;
			while(docsPriorityIdx.size() !=0) {
				LinkedList<Integer> docPriorityIdx= docsPriorityIdx.get(0);
				int priority = docPriorityIdx.get(0);
				int idx = docPriorityIdx.get(1);
				
				//System.out.println("priority : " + priority);
				//System.out.println("idx : " + idx);
				
				LinkedList<Integer> maxDocsPriorityIdx = Collections.max(docsPriorityIdx, new Comparator<LinkedList<Integer>>() {
					@Override
					public int compare(LinkedList<Integer> o1, LinkedList<Integer> o2) {
						
						return o1.get(0) - o2.get(0);
					}
				});
				
				int maxPriority = maxDocsPriorityIdx.get(0);
				int maxIdx = maxDocsPriorityIdx.get(1);
				
				//System.out.println("maxPriority : " + maxPriority);
				//System.out.println("maxIdx : " + maxIdx);
				
				if(priority == maxPriority) {
					if(idx == resultIdx ) {
						order++;
						System.out.println(order);
						break;
					}else {
						docsPriorityIdx.remove(0);
						order++;
					}
				}else {
					//System.out.println("this is not max");
					docsPriorityIdx.add(docPriorityIdx);
					docsPriorityIdx.remove(0);
				}
			}
			
			caseIdx++;
		}
	}

}

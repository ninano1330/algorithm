package solved;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] progresses = { 93, 30, 55 };
//		int[] speeds = { 1, 30, 5 };
		int[] progresses = {95,90,99,99,80,99}; 
		int[] speeds = {1,1,1,1,1,1};

		solution(progresses, speeds);
	}

	public static int[] solution(int[] progresses, int[] speeds) {

		Queue<Integer> que = new LinkedList<Integer>();

		for (int i = 0; i < progresses.length; i++) {
			int days = 1;
			while (true) {
				if (100 - progresses[i] <= speeds[i] * days) {
					que.offer(days);
					break;
				}
				++days;
			}
		}

//		System.out.println("=========completedDays=========");
//		System.out.println(que);
		
		int count= 0;
		List<Integer> resultList = new LinkedList<Integer>();
		
		while(!que.isEmpty()) {
			int firstCompletedDays = que.poll();
			count++;
			while(!que.isEmpty() && firstCompletedDays >= que.peek()) {
				que.poll();
				count++;
			}
			resultList.add(count);
			count = 0;
		}

//		for(int i=0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		int[] result = new int[resultList.size()];
		
		for(int i=0; i < result.length; i++) {
			result[i] = resultList.get(i);
		}
		
		return result;
	}
}

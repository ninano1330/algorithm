package solving;

import java.util.LinkedList;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		
		solution(bridge_length, weight, truck_weights);

	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		Queue<Integer> que = new LinkedList<Integer>();
		int sec = 0;
		int sum = 0;
		
//		for(int t : truck_weights) {
//			que.offer(t);
//			System.out.println(que.size());
//		}
		
		for(int truck_weight : truck_weights) {
			while(true) {
				if(que.isEmpty()) {
					que.offer(truck_weight);
					sum += truck_weight;
					sec++;
					break;
				}else if(que.size() == bridge_length) {
					sum -= que.poll(); //다리에 가능한 트럭이 모두 올라올 시 (다리 길이가 que size와 같을 시)
				}else {
					if( sum +truck_weight > weight) {
						
					}
				}
			}
		}
		
		
		
        int answer = 0;
        return answer;
    }
}

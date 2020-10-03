package review;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_bridge {

	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		
		System.out.println(solution(bridge_length, weight, truck_weights));

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
					sec++; //트럭 진입
					break;
				}else if(que.size() == bridge_length) {
					//다리에 가능한 트럭이 모두 올라올 시 (다리 길이가 que size와 같을 시)
					//가장 먼저 진입한 트럭이 다리의 끝자락에 다다름
					sum -= que.poll(); 
				}else {
					if( sum +truck_weight > weight) {
						sec++;
						que.offer(0);
					}else {
						que.offer(truck_weight);
						sum += truck_weight;
						sec++;
						break;
					}
				}
			}
		}
		
		return sec + bridge_length; //모든 트럭들이 다리에 진입하고 이 다리를 모두 지나가야 하기 때문에 다리의 길이만큼 더한다
    }
}

package DevMatching;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> que = new PriorityQueue<>();
		
		que.offer(1);
		que.offer(5);
		que.offer(3);
		que.offer(2);
		que.offer(-1);
		
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}
	}

}

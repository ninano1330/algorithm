package study;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeTest {

	public static void main(String[] args) {
		
		Deque<Integer> deque = new LinkedList<>();
		
		for(int i=1; i<=5; i++) {
			/*
			 * 추가할 때 Last와 default와 같다
			 * deque.offer(i);
			 */
//			deque.offerLast(i);
			
//			deque.offerFirst(i);
		}
		
		while(!deque.isEmpty()) {
			/*
			 *  제거할 때 First와 default가 같다
			 *  deque.poll()); //1,2,3,4,5
			 */
			System.out.println(deque.pollFirst()); //1,2,3,4,5
			
			//System.out.println(deque.pollLast()); //5,4,3,2,1
			
		}
		
	}

}

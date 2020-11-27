package doit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Test3 {
	public static void main(String[] args) {
		Deque<Integer> arrayDeque = new ArrayDeque<>();
		Deque<Integer> linkedListDeque = new LinkedList<>();
		
		//offer과 offerLast는 동일
		arrayDeque.offer(1); 		// 1
		arrayDeque.offer(2);		// 1,2
		arrayDeque.offerFirst(3); 	// 3,1,2
		arrayDeque.offer(4);		// 3,1,2,4
		arrayDeque.offer(5);		// 3,1,2,4,5
		
		while(!arrayDeque.isEmpty()) {
			//poll과  pollFirst는 동일
			System.out.println(arrayDeque.pollFirst());		//3,1,2,4,5
		}
		
		while(!arrayDeque.isEmpty()) {
			System.out.println(arrayDeque.pollLast());		//5,4,2,1,3  
		}
	}
}

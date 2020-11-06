package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class DequeTest2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> deque = new LinkedList<>();
		
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i=0; i<cnt; i++) {
			String str = br.readLine();

			if(str.contains("push")) {
				String[] tmp = str.split(" ");
				int num = Integer.parseInt(tmp[1]);
			
				if(str.contains("front")) {
					deque.offerFirst(num);
				}else if(str.contains("back")) {
					deque.offerLast(num);
				}
			}else if(str.contains("pop")) {
				if(deque.isEmpty()) {
					System.out.println(-1);
					continue;
				}
				if(str.contains("front")) {
					System.out.println(deque.pollFirst());
				}else if(str.contains("back")) {
					System.out.println(deque.pollLast());
				}
			}else if(str.contains("size")) {
				System.out.println(deque.size());
			}else if(str.contains("empty")) {
				if(deque.isEmpty()) System.out.println(1);
				else System.out.println(0);
			}else if(str.contains("front")) {
				if(deque.isEmpty()) System.out.println(-1);
				else System.out.println(deque.peekFirst());
			}else if(str.contains("back")) {
				if(deque.isEmpty()) System.out.println(-1);
				else System.out.println(deque.peekLast());
			}
		}
		
//		while(cnt>0) {
//			String str = br.readLine();
//
//			if(str.contains("push")) {
//				String[] tmp = str.split(" ");
//				int num = Integer.parseInt(tmp[1]);
//			
//				if(str.contains("front")) {
//					deque.offerFirst(num);
//				}else if(str.contains("back")) {
//					deque.offerLast(num);
//				}
//			}else if(str.contains("pop")) {
//				if(deque.isEmpty()) {
//					System.out.println(-1);
//					continue;
//				}
//				if(str.contains("front")) {
//					System.out.println(deque.pollFirst());
//				}else if(str.contains("back")) {
//					System.out.println(deque.pollLast());
//				}
//			}else if(str.contains("size")) {
//				System.out.println(deque.size());
//			}else if(str.contains("empty")) {
//				if(deque.isEmpty()) System.out.println(1);
//				else System.out.println(0);
//			}else if(str.contains("front")) {
//				if(deque.isEmpty()) System.out.println(-1);
//				else System.out.println(deque.peekFirst());
//			}else if(str.contains("back")) {
//				if(deque.isEmpty()) System.out.println(-1);
//				else System.out.println(deque.peekLast());
//			}
//			
//			cnt--;
//		}
		
	}

}

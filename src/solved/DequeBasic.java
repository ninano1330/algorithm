package solved;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DequeBasic {
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cardCnt = Integer.parseInt(br.readLine());
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		for(int i=1; i<=cardCnt; i++) {
			deque.offerFirst(i);
			//deque.offer(i);
			//deque.offerLast(i);
		}
		
		while(!deque.isEmpty()) {
			//bw.write(String.valueOf(deque.pollLast()) + " ");
			bw.write(deque.pollLast() + " ");
			if(!deque.isEmpty()) {
				int num = deque.pollLast();
				deque.offerFirst(num);
			}

		}
		
		bw.flush();
	}

}

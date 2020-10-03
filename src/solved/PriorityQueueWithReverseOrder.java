package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueWithReverseOrder {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner scanner = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		int count = scanner.nextInt();
		int count = Integer.parseInt(br.readLine());

		
		Queue<Integer> positiveNum = new PriorityQueue<Integer>();
//		Queue<Integer> negativeNum = new PriorityQueue<Integer>();
		Queue<Integer> negativeNum = new PriorityQueue<Integer>(Collections.reverseOrder());
				
		for(int i=1; i <=count; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num !=0) {
				if(num>0) positiveNum.offer(num);
				else if(num<0) negativeNum.offer(num);
			}else if(num==0) {
				if(negativeNum.size()==0 && positiveNum.size()==0) {
					System.out.println(0);
				}else if(negativeNum.size()==0) {
					System.out.println(positiveNum.poll());
//					System.out.println("positiveNum.size() : " + positiveNum.size());
				}else if(positiveNum.size()==0) {
					System.out.println(negativeNum.poll());
//					System.out.println("negativeNum.size() : " + negativeNum.size());
				}else{
					int positiveNumAbs = Math.abs(positiveNum.peek());
					int negativeNumAbs = Math.abs(negativeNum.peek());
					if(positiveNumAbs < negativeNumAbs) {
						System.out.println(positiveNum.poll());
					}else if(positiveNumAbs >= negativeNumAbs) {
						System.out.println(negativeNum.poll());
					}
				}
			}
		}
		
		
		
//		negativeNum.offer(-1);
//		negativeNum.offer(-5);
//		negativeNum.offer(-4);
//		negativeNum.offer(-3);
//		negativeNum.offer(-2);
//		negativeNum.offer(-6);
//		negativeNum.offer(-8);
//		negativeNum.offer(-7);
//		
//		while(!negativeNum.isEmpty()) {
//			System.out.println(negativeNum.poll());
//		}
		
	}
}

/*
문제
절댓값 힙은 다음과 같은 연산을 지원하는 자료구조이다.

배열에 정수 x (x ≠ 0)를 넣는다.
배열에서 절댓값이 가장 작은 값을 출력하고, 그 값을 배열에서 제거한다. 절댓값이 가장 작은 값이 여러개일 때는, 가장 작은 수를 출력하고, 그 값을 배열에서 제거한다.
프로그램은 처음에 비어있는 배열에서 시작하게 된다.

입력
첫째 줄에 연산의 개수 N(1≤N≤100,000)이 주어진다. 다음 N개의 줄에는 연산에 대한 정보를 나타내는 정수 x가 주어진다. 만약 x가 0이 아니라면 배열에 x라는 값을 넣는(추가하는) 연산이고, x가 0이라면 배열에서 절댓값이 가장 작은 값을 출력하고 그 값을 배열에서 제거하는 경우이다. 입력되는 정수는 -231보다 크고, 231보다 작다.

출력
입력에서 0이 주어진 회수만큼 답을 출력한다. 만약 배열이 비어 있는 경우인데 절댓값이 가장 작은 값을 출력하라고 한 경우에는 0을 출력하면 된다.

예제 입력 1 
18
1
-1
0
0
0
1
1
-1
-1
2
-2
0
0
0
0
0
0
0
*/
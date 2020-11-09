package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
//위상정렬
public class TopologicalSorting {
	static int n; // 노드 갯수
	static int m; // 간선 갯수

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken()); //노드 갯수
		m = Integer.parseInt(st.nextToken()); //간선 갯수
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int[] indegree = new int[n+1];
		
		//세팅
		for(int i=0; i<n+1; i++) { //노드 갯수
			list.add(new ArrayList<Integer>()); //list 안의 리스트에 ArrayList<Integer> 선언
		}
		
		for(int i=0; i<m; i++) { //간선 갯수
			st = new StringTokenizer(br.readLine()); 
			
			int v1 = Integer.parseInt(st.nextToken()); //간선 정보 
			int v2 = Integer.parseInt(st.nextToken()); //간선 정보
			
			list.get(v1).add(v2);
			indegree[v2]++;
		}
		

		
		//문제 번호가 작은 것부터 풀어야하므로, 오름차순인 PriorityQueue 사용
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<indegree.length; i++) {
			if(indegree[i] ==0) que.offer(i);
		}
		
		while(!que.isEmpty()) {
			int node = que.poll();
			for(int i=0; i < list.get(node).size(); i++) {
				int target = list.get(node).get(i);
				indegree[target]--;
				if(indegree[target] ==0) {
					que.offer(target);
				}
			}
			
			sb.append(node + " ");
//			System.out.println(node + " ");
		}
		
		System.out.println(sb.toString().substring(0,sb.length()-1));
//		topologicalSort(indegree, list);       
	}

//	private static void topologicalSort(int[] indegree, List<List<Integer>> list) {
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//		
//		for(int i=1; i<=n; i++) { //노드 갯수
//			if(indegree[i] ==0) pq.offer(i);
//		}
//		
//		while(!pq.isEmpty()) {
//			int node = pq.poll();
//			
//			for(Integer i : list.get(node)) {
//				indegree[i]--;
//				if(indegree[i] ==0) pq.offer(i);
//			}
//			
//			System.out.print(node + " ");
//		}
//		
//		
//	}
}


/*
백준 1766번
문제
민오는 1번부터 N번까지 총 N개의 문제로 되어 있는 문제집을 풀려고 한다. 문제는 난이도 순서로 출제되어 있다. 즉 1번 문제가 가장 쉬운 문제이고 N번 문제가 가장 어려운 문제가 된다.

어떤 문제부터 풀까 고민하면서 문제를 훑어보던 민오는, 몇몇 문제들 사이에는 '먼저 푸는 것이 좋은 문제'가 있다는 것을 알게 되었다. 예를 들어 1번 문제를 풀고 나면 4번 문제가 쉽게 풀린다거나 하는 식이다. 민오는 다음의 세 가지 조건에 따라 문제를 풀 순서를 정하기로 하였다.

N개의 문제는 모두 풀어야 한다.
먼저 푸는 것이 좋은 문제가 있는 문제는, 먼저 푸는 것이 좋은 문제를 반드시 먼저 풀어야 한다.
가능하면 쉬운 문제부터 풀어야 한다.
예를 들어서 네 개의 문제가 있다고 하자. 4번 문제는 2번 문제보다 먼저 푸는 것이 좋고, 3번 문제는 1번 문제보다 먼저 푸는 것이 좋다고 하자. 만일 4-3-2-1의 순서로 문제를 풀게 되면 조건 1과 조건 2를 만족한다. 하지만 조건 3을 만족하지 않는다. 4보다 3을 충분히 먼저 풀 수 있기 때문이다. 따라서 조건 3을 만족하는 문제를 풀 순서는 3-1-4-2가 된다.

문제의 개수와 먼저 푸는 것이 좋은 문제에 대한 정보가 주어졌을 때, 주어진 조건을 만족하면서 민오가 풀 문제의 순서를 결정해 주는 프로그램을 작성하시오.

입력
첫째 줄에 문제의 수 N(1 ≤ N ≤ 32,000)과 먼저 푸는 것이 좋은 문제에 대한 정보의 개수 M(1 ≤ M ≤ 100,000)이 주어진다. 둘째 줄부터 M개의 줄에 걸쳐 두 정수의 순서쌍 A,B가 빈칸을 사이에 두고 주어진다. 이는 A번 문제는 B번 문제보다 먼저 푸는 것이 좋다는 의미이다.

항상 문제를 모두 풀 수 있는 경우만 입력으로 주어진다.

출력
첫째 줄에 문제 번호를 나타내는 1 이상 N 이하의 정수들을 민오가 풀어야 하는 순서대로 빈칸을 사이에 두고 출력한다.

예제 입력 1 
4 2
4 2
3 1
예제 출력 1 
3 1 4 2
*/
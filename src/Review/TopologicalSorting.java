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
		
//		for(int i=0; i<indegree.length; i++) {
//			System.out.println("indegree[" + i + "] : " + indegree[i]);
//		}
//		
//		for(int i=0; i<list.size(); i++) {
//			for(int j=0; j<list.get(i).size(); j++) {
//				System.out.println("list idx : " + i + " " + j);
//				System.out.println(list.get(i).get(j));
//			}
//		}
		
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

package solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
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

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Scanner scanner = new Scanner(System.in);
//		List<int[][]> list = new LinkedList<int[][]>();
//		
//		int count = scanner.nextInt();
//		int infor = scanner.nextInt();
//
//		while(infor != 0) {
//			String a = br.readLine();
//			String[] b = a.split(" ");
//			
//			int[][] c = {{Integer.parseInt(b[0]), Integer.parseInt(b[1])}};
////			System.out.println(c[0][0]);
////			System.out.println(c[0][1]);
//			list.add(c);
//			
//			infor--;
//		}
//		
//
//		
////		int[][] test = {{4,2}};
////		int[][] test2 = {{3,1}};
////		
////		list.add(test);
////		list.add(test2);
//		
//		list.sort(new Comparator<int[][]>() {
//			@Override
//			public int compare(int[][] a, int[][] b) {
//				if(a[0][0] < b[0][0]) {
//					return -1;
//				}else if ( a[0][0] > b[0][0]) {
//					return 1;
//				}else return 0;
//			}
//		});
////		StringBuilder sb = new StringBuilder();
//		
//		for(int i=0; i<list.size();i++) {
//			int[][] tmp= list.get(i);
////			sb.append(tmp[0][0] + " " + tmp[0][1] + " ");
//			System.out.print(tmp[0][0]);;
//			System.out.print(" ");
//			System.out.print(tmp[0][1]);
//			System.out.print(" ");
//		}
//		
////		System.out.println(sb.toString().substring(0,sb.toString().length()-1));
	}
}

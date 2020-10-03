package solving;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test2 {
	static int N; //정점 개수
	static int E; //간선 개수
	static ArrayList<Integer>[] nodeArray; //각 정점이 향하고 있는 정점들을 가진 리스트

	public static void main(String[] args) throws IOException {
		/*
		 * 위상정렬 : 여러가지 일 들에 순서가 정해져 있을 때 순서에 맞게 나열하는 것
		 * DAG ( 방향성이 있으며 사이클이 없는 그래프)
		 * 정점 : 할일
		 * 간선 : 순서
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] tempStr = br.readLine().split(" ");
		N = Integer.valueOf(tempStr[0]); //정점 개수
		E = Integer.valueOf(tempStr[1]); //간선 개수
		
		nodeArray = new ArrayList[N+1]; //0번지는 사용 안 함
		int[] targetedNodeCount = new  int[N+1]; //자기 자신을 가리키고 있는 정점의 개수를 저장할 배열
		ArrayList<Integer> sortedList = new ArrayList<Integer>();
		LinkedList<Integer> que = new LinkedList<Integer>();
		
		for(int i=1; i <=N; i++) { //정점 개수
			nodeArray[i] = new ArrayList<Integer>();
		}
	}

}

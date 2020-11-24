package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//백준 2667
public class DFS {
	static int N;
	static int[][] map;
	static boolean[][] visited;
	static int[][] pos = {{-1,0},{1,0},{0,-1},{0,1}};
	static int count;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		map = new int[N][N];
		visited = new boolean[N][N];
		
		for(int i=0; i<N; i++) {
			String str = scan.next();
			for(int j=0; j<N; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		
		ArrayList<Integer> resultList = new ArrayList<>();
		for(int i=0; i<N ; i++) {
			for(int j=0; j<N; j++) {
				if(map[i][j] == 1 && !visited[i][j]) {
					count = 0;
					dfs(i,j);
					resultList.add(count);
				}
			}
		}
		
		System.out.println(resultList.size());
		Collections.sort(resultList);
		
		for(Integer i : resultList) {
			System.out.println(i);
		}
		
	}
	
	static void dfs(int r, int c) {
		count++;
		visited[r][c] = true;
		
		for(int i=0; i<pos.length; i++) {
			int nr = r + pos[i][0];
			int nc = c + pos[i][1];
			
			if(nr>=0 && nr<N && nc>=0 && nc<N && map[nr][nc] ==1 && !visited[nr][nc]) {
				dfs(nr,nc);
			}
		}
	}
		
}

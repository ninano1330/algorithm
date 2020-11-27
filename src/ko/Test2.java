package ko;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {

	
	static ArrayList<Integer> resultArr;
	static int[][] idxCase = {{0,1},{0,-1},{1,0},{-1,0}};
	static boolean chanceFlag;
	static boolean[][] visited;
	static int count;
	
	public static void main(String[] args) {
		String[][] board = {{"A","B","T","T","T"},{"T","C","D","E","T"},{"T","T","T","F","T"},{"B","A","H","G","F"},{"C","D","E","F","G"}};
		
//		System.out.println((int)'A');
//		System.out.println((int)'B');
		
		visited = new boolean[board.length][board[0].length];
		
//		for(int i=0; i<visited.length; i++) {
//			System.out.println(visited[i][0]);
//		}
		
		
		solution(board);
		
		
	}
	
	
	public static int solution(String[][] board) {
		
		resultArr = new ArrayList<>();
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				visited = new boolean[board.length][board[0].length];
				//if(!visited[i][j]){
					chanceFlag = true;
					count = 0;
					dfs(i,j,board);
					resultArr.add(count);
				//}
			}
		}
		
		System.out.println(Collections.max(resultArr));
		
		int max = 0;
		for(int i=0; i<resultArr.size(); i++) {
			if(resultArr.get(i) > max) {
				max = resultArr.get(i);
			}
		}
		
		System.out.println(max);
		
		int answer = 0;
		return answer;
	}
	
	static void dfs(int x, int y, String[][] board) {
		count++;
		visited[x][y] = true;
		
		for(int i=0; i<idxCase.length; i++) {
			int rx = x + idxCase[i][0];
			int ry = y + idxCase[i][1];

			
			if(rx>=0 && rx<board.length && ry>=0 && ry<board[0].length)
					//&& (xy_char + 1 == rxy_char)) 
			{
				char xy_char = board[x][y].charAt(0);
				char rxy_char = board[rx][ry].charAt(0);
				
				if(!visited[rx][ry] && xy_char + 1 == rxy_char) {
					dfs(rx,ry,board);
				}else if(!visited[rx][ry] && chanceFlag && xy_char < rxy_char) {
					chanceFlag = false;
					dfs(rx,ry,board);
					chanceFlag = true;
				}
		
			}
//			else if(rx>=0 && rx<board.length && ry>=0 && ry<=board[0].length
//					&& !visited[rx][ry] 
//					&& chanceFlag)
//			{
//				chanceFlag = false;
//				dfs(rx,ry,board);
//			}
		}
	}
}



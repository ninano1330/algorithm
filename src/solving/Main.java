package solving;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static char[][] map;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int count1 = 0;
	static int count2 = 0;
	static Queue<dot> q = new LinkedList<dot>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		map = new char[n][n];
		visited = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			char[] str = br.readLine().toCharArray();
			for (int j = 0; j < n; j++) {
				map[i][j] = str[j];
			}
		}
		
//		for (int i = 0; i < map.length; i++) {
//			for (int j = 0; j < map[i].length; j++) {
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < n; i++) {
			char[] str = br.readLine().toCharArray();
			for (int j = 0; j < n; j++) {
				if(!visited[i][j]) {
					bfs(new dot(i,j));
					count1++;
				}
			}
		}
		
	}
	
	static void bfs(dot d) {
        char color = map[d.x][d.y];
        visited[d.x][d.y] = true;
        q.add(d);
 
 
        while(!q.isEmpty()) {
            dot t = q.remove();
            int x1 = t.x;
            int y1 = t.y;
            
            for(int i=0; i<4; i++) {
                int x2 = x1 + dx[i];
                int y2 = y1 + dy[i];
                
                if(x2>=0 && x2<n && y2>=0 && y2<n &&
                        map[x2][y2] == color && !visited[x2][y2]) {
                    q.add(new dot(x2,y2));
                    visited[x2][y2] = true;
                }
                    
            }
        }
    }

	class dot {
		int x;
		int y;

		public dot(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}

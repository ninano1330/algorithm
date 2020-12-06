package review;

public class pg_kakaofriends_dfs {

	public static void main(String[] args) {
		int m = 6; int n = 4; 
		int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
		
		solution(m,n,picture);
	}
	
	static boolean[][] visited;
	static int[][] mod = {{1,0},{-1,0},{0,1},{0,-1}};
	static int numberOfArea = 0;
	static int sizeOfOneArea = 0;
	static int maxSizeOfOneArea = 0;

	public static int[] solution(int m, int n, int[][] picture) {
		visited = new boolean[m][n];
		
		for(int i=0; i<picture.length; i++) {
			for(int j=0; j<picture[i].length; j++) {
				if(picture[i][j] != 0 && !visited[i][j]) {
					sizeOfOneArea = 1;
					dfs(i,j, picture);
					numberOfArea += 1;
					
					if(sizeOfOneArea > maxSizeOfOneArea) {
						maxSizeOfOneArea = sizeOfOneArea;
					}
				}
			}
		}
		
		int[] answer = new int[2];
		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
		return answer;
	}
	
	public static void dfs(int i, int j, int[][] picture) {
		visited[i][j] = true;
		
		for(int k=0; k<mod.length; k++) {
			int mv_i = i + mod[k][0];
			int mv_j = j + mod[k][1];
			
			if(mv_i >=0 && mv_i <visited.length && mv_j >=0 && mv_j < visited[0].length
				&& !visited[mv_i][mv_j]
				&& (picture[i][j] == picture[mv_i][mv_j])){
				sizeOfOneArea++;
				dfs(mv_i, mv_j, picture);
			}
		}	
	}

}

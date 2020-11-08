package study;

public class DFS_TEST {
	static int[] n;
	static int cnt = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		n = new int[5];
		
		n[0] = 1;
		n[1] = 2;
		n[2] = 3;
		n[3] = 4;
		n[4] = 5;
		
		dfs(0,0,"");
		
		System.out.println(cnt);
	}
	
	public static void dfs(int start, int depth, String str) {
		for(int i=start; i<n.length; i++) {
			str += n[i];
			cnt++;
			System.out.println(str);
			dfs(i+1,depth+1,str);
		}
		
	}

}

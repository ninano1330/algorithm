package solving;

public class pg_findPrime {

	public static void main(String[] args) {
		String numbers = "17";
		solution(numbers);
		numbers = "011";
		solution(numbers);
	}

	private static boolean[] visited;
	
	public static int solution(String numbers) {
		
		for(int i=0; i<numbers.length(); i++) {
			visited = new boolean[numbers.length()];
			if(numbers.charAt(i) != '0') {
				dfs(numbers, i);
			}
		}
		
		int answer = 0;
        return answer;
    }
	
	public static void dfs(String numbers, int idx) {
		visited[idx] = true;
		
	}
}

package ko;

public class Test1 {

	public static void main(String[] args) {
		int[][] v = { { 1, 4 }, { 3, 4 }, { 3, 10 } };
		solution(v);
	}

	static public int[] solution(int[][] v) {
		
		int[] result = new int[2];
		
		
		//get x
		if(v[0][0] == v[1][0]) {
			result[0] = v[2][0];
		}else {
			if(v[0][0] == v[2][0]) result[0] = v[1][0];
			else result[0] = v[0][0];
		}
		
		
		//get y
		if(v[0][1] == v[1][1]) {
			result[1] = v[2][1];
		}else {
			if(v[0][1] == v[2][1]) result[1] = v[1][1];
			else result[1] = v[0][1];
		}		

		return result;
	}

}

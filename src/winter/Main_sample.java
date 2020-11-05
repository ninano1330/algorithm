package winter;


import java.util.Arrays;
import java.util.Comparator;


public class Main_sample {
	public static void main(String[] args) {	
		int n = 7;
		int[][] delivery = {{5,6,0},{1,3,1},{1,5,0},{7,6,0},{3,7,1},{2,5,0}};
		
		solution(n,delivery);
	}
	
	public static String solution(int n, int[][] delivery) {
		int[] resultArr = new int[n+1];
		String result = "";
		
		Arrays.sort(delivery,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[2] - o1[2];
			}
		});
		
		for(int i=0; i<delivery.length; i++) {
			if(delivery[i][2] ==1) {
				resultArr[delivery[i][0]] = 1;
				resultArr[delivery[i][1]] = 1;
			}else {
				if(resultArr[delivery[i][0]] ==1) {
					resultArr[delivery[i][1]] = -1;
				}else if(resultArr[delivery[i][1]] ==1) {
					resultArr[delivery[i][0]] = -1;
				}
			}
		}
		
		for(int i=1; i<resultArr.length; i++) {
			if(resultArr[i] == 0) {
				result += "?";
			}else if(resultArr[i] ==1) {
				result += "O";
			}else {
				result += "X";
			}
		}
		
		//System.out.println(result);
		return result;
    }

}

package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DP {
	static int[] caseCnt;
	static int cnt;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		caseCnt = new int[11];
		caseCnt[0] = 1;
		caseCnt[1] = 2;
		caseCnt[2] = 4;
		
		
		while(n>0) {
			int num = Integer.parseInt(br.readLine());
			System.out.println(dp(num));
			n--;
		}
		
		//System.out.println(cnt);
		
		//cnt = 0;
	}
	
	public static int dp(int num) {
		if(num == 1) {
			return caseCnt[0];
		}else if(num ==2) {
			return caseCnt[1];
		}else if(num ==3) {
			return caseCnt[2];
		}else if (caseCnt[num] !=0) {
			return caseCnt[num];
		}
		
		return caseCnt[num] = dp(num-1) + dp(num-2) + dp(num-3);
	}
	

}

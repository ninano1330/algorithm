package test;

import java.util.*;
import java.io.*;

public class Rainy {
	static int[] map;
	static int ret, left, right;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//세로,가로
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		//빗문
		map = new int[W];
		ret = left = right =0;
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < W; i++) {
			int N = Integer.parseInt(st.nextToken());
			map[i] = N;
		}
		
		for(int i=1; i<W-1; i++) {
			left = 0;
			right =0;
			
			//인덱스 기준 왼쪽에서 가장 높은 
			for(int j=0; j<i; j++) {
				left = Math.max(map[j], left);
			}

			//인덱스 기준 오른쪽에서 가장 높은 
			for(int j=i; j<W; j++) {
				right = Math.max(map[j], right);
			}
			
			//더 낮은 건물을 기준으로 현재 인덱스에 모이는 빗물
			if(left > map[i] && right > map[i]) {
				ret += Math.min(right, left) - map[i];
			}
		}
		
		System.out.println(ret);
	}

}

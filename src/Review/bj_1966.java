package review;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_1966 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int n, m, count;
		for(int i=0; i<t; i++) {
			LinkedList<int[]> queue = new LinkedList<>();
			count = 0;
			
			n= sc.nextInt();
			m=sc.nextInt();
			
			for(int j=0; j<n; j++) {
				//중요도, 인덱스 입력 받기
				queue.add(new int[] {sc.nextInt(), j});
			}
			
			while(!queue.isEmpty()) {
				int[] now = queue.poll();
				boolean able = true;
				
				for(int[] q : queue) {
					if(q[0] > now[0]) able = false;
				}
				
				if(able) {
					count++;
					if(now[1] == m) break;
				}else {
					queue.offer(now);
				}
			}
			
			System.out.println(count);
		}
	
	}

}

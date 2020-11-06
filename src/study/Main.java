package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int idx = Integer.parseInt(br.readLine());
		int[] card = new int[idx];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<idx; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}

		
		idx = Integer.parseInt(br.readLine());
		int[][] num = new int[idx][2];
		int[] result = new int[idx];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<idx; i++) {
			num[i][0] = Integer.parseInt(st.nextToken());
			num[i][1] = i;
		}
		
		Arrays.sort(num, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		
		
		for(int i=0; i<card.length; i++) {
			int n = card[i];
			int resultIdx = binarySearch(num,n);
			
			if(resultIdx != -1) {
				result[resultIdx]++;
			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<result.length; i++) {
			bw.write(result[i] + " ");
		}
		
		bw.flush();
		
	}

	public static int binarySearch(int[][] num, int n) {
		int high = num.length-1;
		int low = 0;
		
		while(low <=high) {
			int mid = (high + low ) /2;
			
			if(num[mid][0] ==n) {
				return num[mid][1];
			}else if(num[mid][0] > n) {
				high = mid -1;
			}else {
				low = mid +1;
			}
		}
		
		return -1;
	}
}

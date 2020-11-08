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

public class baekjoon_10816 {
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int idx = Integer.parseInt(br.readLine());
		//int[] card = new int[idx];
		int[] result = new int[20000001];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<idx; i++) {
			result[Integer.parseInt(st.nextToken()) + 10000000]++;
		}

		
		idx = Integer.parseInt(br.readLine());
		//int[] num = new int[idx];
		
		
		st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<idx; i++) {
			bw.write(result[Integer.parseInt(st.nextToken()) + 10000000] + " ");
		}
		
		bw.flush();
		bw.close();
		
		//Arrays.sort(num);
		
	}
}

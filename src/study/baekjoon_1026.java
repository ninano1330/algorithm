package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon_1026 {
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int cnt = Integer.parseInt(br.readLine());
		
		Integer[] ascArr = new Integer[cnt];
		Integer[] descArr = new Integer[cnt];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int idx = 0;
		while(st.hasMoreTokens()) {
			ascArr[idx] = Integer.parseInt(st.nextToken());
			idx++;
		}
		
		Arrays.sort(ascArr);
		
		st = new StringTokenizer(br.readLine());
		idx = 0;
		while(st.hasMoreTokens()) {
			descArr[idx] = Integer.parseInt(st.nextToken());
			idx++;
		}
		
		
		Arrays.sort(descArr, Collections.reverseOrder());
		
		int sum = 0;
		for(int i=0; i<ascArr.length; i++) {
//			System.out.println("asc : " + ascArr[i]);
//			System.out.println("desc : " + descArr[i]);
			
			sum += ascArr[i] * descArr[i];
		}
		
		System.out.println(sum);
	}

}

package solved;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StingBuilderSetChar {
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count = Integer.parseInt(br.readLine());
		
		
//		System.out.println((int)'a');
//		System.out.println((int)'z');
//		System.out.println((int)'A');
//		System.out.println((int)'Z');
//		System.out.println((char)32);
		
		
		while(count>0) {
			StringBuilder sb = new StringBuilder();
			sb.append(br.readLine());
			if(sb.charAt(0) >= 'a') {
				sb.setCharAt(0, (char)(sb.charAt(0)-32));
			}
			System.out.println(sb.toString());

			count--;
		}
		
		
	}

}

package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_9012 {
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(br.readLine());
		
		
		while(cnt >0) {
			StringBuilder sb = new StringBuilder(br.readLine());
			
			//System.out.println(sb.indexOf("()"));
			while(sb.indexOf("()")!=-1) {
				//System.out.println(sb.indexOf("()"));
				sb.delete(sb.indexOf("()"), sb.indexOf("()")+2);
				//System.out.println(sb.toString());
				//System.out.println();
				//System.out.println(sb.indexOf("()"));
			}

			if(sb.length() !=0) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
			cnt--;
		}
		
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		
	}

}

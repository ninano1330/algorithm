package review;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class baekjoon_1874 {
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = Integer.parseInt(br.readLine());
		
		
		Stack<Integer> stk = new Stack<>();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int idx = 1;
		for(int i=0; i<cnt; i++) {
			int n = Integer.parseInt(br.readLine());
			
			if(stk.isEmpty() || stk.peek() < n) {
				for(;idx<=n; idx++) {
					stk.push(idx);
					//bw.write("+\n");
					sb.append("+\n");
				}
			}
			
			if(!stk.isEmpty() && stk.peek() ==n) {
				stk.pop();
				//bw.write("-\n");
				sb.append("-\n");
			}
		}
		
		if(stk.size() !=0) {
			System.out.println("NO");
		}else {
			System.out.println(sb.toString());
			//bw.flush();
		}
		
		//System.out.println("stk size : " + stk.size());
		//bw.close();
		
		
	}

}

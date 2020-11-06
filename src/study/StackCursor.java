package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackCursor {
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = br.readLine();
		
		Stack<Character> leftstk = new Stack<>();
		Stack<Character> rightstk = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			leftstk.push(str.charAt(i));
		}
		
		int cnt = Integer.parseInt(br.readLine());
		
		while(cnt>0) {
			String cmd = br.readLine();
			String[] params = cmd.split(" ");
			
			if(params[0].equals("L")) {
				if(!leftstk.isEmpty()) {
					rightstk.push(leftstk.pop());
				}
			}else if(params[0].equals("D")) {
				if(!rightstk.isEmpty()) {
					leftstk.push(rightstk.pop());
				}
			}else if(params[0].equals("B")) {
				if(!leftstk.isEmpty()) {
					leftstk.pop();
				}
			}else if(params[0].equals("P")) {
				char c = params[1].charAt(0);
				leftstk.push(c);
			}
			cnt--;
		}

		while(!leftstk.isEmpty()) {
			rightstk.push(leftstk.pop());
		}
		
		
		StringBuilder sb = new StringBuilder();
		while(!rightstk.isEmpty()) {
			sb.append(rightstk.pop());
		}
		
		System.out.println(sb.toString());
}

}

package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_basic_10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		Stack<Integer> stk = new Stack<>();

		while (cnt > 0) {
			String cmd = br.readLine();

			if (cmd.contains("push")) {
				String[] tmp = cmd.split(" ");
				int num = Integer.parseInt(tmp[1]);
				stk.push(num);
				// System.out.println(num);
			} else if (cmd.contains("pop")) {
				if (stk.isEmpty())
					System.out.println(-1);
				else
					System.out.println(stk.pop());
			} else if (cmd.contains("size")) {
				System.out.println(stk.size());
			} else if (cmd.contains("empty")) {
				if (stk.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			} else if (cmd.contains("top")) {
				if (stk.isEmpty())
					System.out.println(-1);
				else
					System.out.println(stk.peek());
			}
			cnt--;
		}
	}

}

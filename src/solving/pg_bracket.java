package solving;

import java.util.LinkedList;
import java.util.Queue;

public class pg_bracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "(()())()";
		solution(p);

		
		//System.out.println(true && false && true);
	}
	
	public static String solution(String p) {
		if(p==null || p=="") {
			return "";
		}
		//int point = p.length();
		int point = 0;
		StringBuilder sb = new StringBuilder();
		StringBuilder balanceString = new StringBuilder();
		//while(point>0) {
		while(point < p.length()) {
			boolean isRight = true;
			for(int i=0; i<point; i++) {
				//System.out.println("1번째 " + i);
				sb.append(p.charAt(i));
			}
			isRight = isRight && isRight(sb.toString());
			balanceString.append(sb + " ");
			sb.setLength(0);
			
			for(int i=point; i<p.length(); i++) {
				//System.out.println("2번째 " + i);
				sb.append(p.charAt(i));
			}
			isRight = isRight && isRight(sb.toString());
			balanceString.append(sb);
			
			
			if(isRight) {
				
			}
			
			//point--;
			point++;
		}
		
        String answer = "";
        return answer;
    }

	public static boolean isRight(String s) {
		Queue<Integer> queue = new LinkedList<>();
				
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(c=='(') {
				queue.offer(1);
			}else if(c==')') {
				if(queue.poll() ==null) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static boolean isBalance(String s) {
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(') {
				count++;
			}else if(s.charAt(i) == ')') {
				count--;
			}
		}
		
		return count ==0 ? true : false;
	}
}

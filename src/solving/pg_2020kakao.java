package solving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class pg_2020kakao {
	public static void main(String[] args) {
		String s = "aabbaccc"; 
		System.out.println(solution(s));
		s = "ababcdcdababcdcd";
		System.out.println(solution(s));
		s = "abcabcdede";
		System.out.println(solution(s));
		s = "abcabcabcabcdededededede";
		System.out.println(solution(s));
		s= "xababcdcdababcdcd";
		System.out.println(solution(s));
	}

	public static int solution(String s) {
		ArrayList<Integer> length = new ArrayList<Integer>();
		length.add(s.length());
		
		for(int i=1; i<=s.length()/2; i++) {
			Queue<String> queue = new LinkedList<>();
			
			for(int j=0; j<s.length();) {
				if(j+i>=s.length()) {
					queue.add(s.substring(j,s.length()));
					break;
				}
				
				queue.add(s.substring(j,j+i));
				j = j+i;
			}
			
//			while(!queue.isEmpty()) {
//				System.out.println(queue.poll());
//			}
			
			StringBuilder sb = new StringBuilder();
			String tmp = queue.poll();
			int count = 1;
			while(!queue.isEmpty()) {
				if(!tmp.equals(queue.peek())) {
					if(count >1) {
						sb.append(count);
					}
					sb.append(tmp);
					tmp = queue.poll();
					count = 1;
					//System.out.println(sb.toString());
				}else {
					queue.poll();
					count +=1;
				}
				
				if(queue.isEmpty()) {
					if(count>1) {
						sb.append(count);
					}
					sb.append(tmp);
				}
			}
			
//			System.out.println(i+" 압축 : " + sb.toString());
			
			length.add(sb.toString().length());
		}
		
		int answer = Collections.min(length);
		return answer;
	}
}

package winter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String encrypted_text = "qyyigoptvfb";
		String key = "abcdefghijk";
		int rotation = 3;
		
//		String encrypted_text = "hellopython";
//		String key = "abcdefghijk";
//		int rotation = 3;
		
//		System.out.println("a : " + (int) 'a');
//		System.out.println("z : " + (int) 'z');
		
		System.out.println(solution(encrypted_text,key,rotation));
	}

	public static String solution(String encrypted_text, String key, int rotation) {
		
		StringBuilder sb = new StringBuilder(encrypted_text);
		StringBuilder resultsb = new StringBuilder();
		
		if(rotation >=0) {
			for(int i=1; i<=rotation; i++) {
				char first = sb.charAt(0);
				sb.insert(sb.length(), first);
				sb.deleteCharAt(0);
				
//				System.out.println("test");
			}
		}else {
			for(int i=1; i<=Math.abs(rotation); i++) {
//				System.out.println(sb.toString());
				char last = sb.charAt(sb.length()-1);
//				System.out.println(last);
				
				sb.insert(0, last);
				sb.deleteCharAt(sb.length()-1);
			}
		}
		
//		System.out.println(sb.toString());
		
		
		for(int i=0; i<encrypted_text.length(); i++) {
			char encrypted_text_char = sb.charAt(i);
			char key_char = (char) (key.charAt(i)-96);
			
			if(encrypted_text_char - key_char <97) {
//				System.out.println((char)(encrypted_text_char - key_char));
//				System.out.println(encrypted_text_char - key_char);
//				System.out.println((char)(encrypted_text_char - key_char -'a' + 'z' +1));
//				System.out.println((int)(encrypted_text_char - key_char - 'a' + 'z' +1));
//				System.out.println();
				
//				resultsb.append((char)(encrypted_text_char - key_char+26));
				resultsb.append((char)(encrypted_text_char - key_char - 'a' + 'z' +1));
			}else {
//				System.out.println((char)(encrypted_text_char - key_char));
//				System.out.println(encrypted_text_char - key_char);
//				System.out.println();
				
				resultsb.append((char)(encrypted_text_char - key_char));
			}
//			System.out.println(sb.toString());

		}
		
//		System.out.println(sb.toString());
//		System.out.println(sb.length());
		
//		System.out.println(resultsb.toString());
		
//		System.out.println(sb.toString());
		
//		String answer = "";
//		return answer;
		
		return resultsb.toString();
	}
}

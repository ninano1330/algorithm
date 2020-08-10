
public class CalcChar {

	public static void main(String[] args) {
//		String s = "AB";
//		int n = 1;
		
//		String s = "z";
//		int n = 1;
		
		String s = "a B z";
		int n = 4;
		
//		String s = "Z Z Z";
//		int n = 10;
		
		System.out.println("A : " + (int)'A');
		System.out.println("Z : " + (int)'Z');
		System.out.println("a : " + (int)'a');
		System.out.println("z : " + (int)'z');
		System.out.println("(blank) : " + (int)' ');
		
		System.out.println(solution(s,n));
	}

	public static String solution(String s, int n) {
		String answer = "";
		char[] ch = new char[s.length()];
		//set char
		for(int i=0; i<s.length(); i++) {
			char strCh = s.charAt(i);
			if(strCh == ' ') {
				answer += " ";
				continue;
			}
			
			if(strCh >='A' && strCh <='Z') {
				if(strCh + n > 'Z') {
					strCh = (char) (strCh +n -26);
				}else {
					strCh = (char) (strCh +n );
				}
			}else if(strCh >= 'a' && strCh <='z'){
				if(strCh +n > 'z') {
					strCh = (char) (strCh +n -26);
				}else {
					strCh = (char) (strCh +n );
				}
			}
			
			answer += Character.toString(strCh);
		}
		
		return answer;
	}
	
	/*
	 *    
	String result = "";
    n = n % 26;
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (Character.isLowerCase(ch)) {
        ch = (char) ((ch - 'a' + n) % 26 + 'a');
      } else if (Character.isUpperCase(ch)) {
        ch = (char) ((ch - 'A' + n) % 26 + 'A');
      }
      result += ch;
    }
        return result;
    }
	 */

}

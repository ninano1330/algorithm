package solved;

public class CharLowUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "try hello world";
		System.out.println(solution(s));

	}

	public static String solution(String s) {
		  String answer = "";
		  int num = 0;
		  for(int i=0; i < s.length(); i++) {
			  if(s.charAt(i) == ' ') {
				  answer += " ";
				  num = 0;
				  continue;
			  }
			  if(num ==0) {
				  answer += Character.toUpperCase(s.charAt(i)); 
				  num = 1;
			  }else {
				  answer += Character.toLowerCase(s.charAt(i));
				  num = 0;
			  }
		  }
	
		  
	      return answer;
	 }
}

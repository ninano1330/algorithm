package solved;

public class AlphabetWithUnicode {

	public static void main(String[] args) {
		solution("a B z",4);
	}
	
	public static String solution(String s, int n) {
	      char[] ch = s.toCharArray();
	      String answer = "";
	      
	      for(int i=0 ; i < ch.length; i++) {
	    	  if(ch[i] == 32) {
	    		  answer += ch[i];
	    		  continue;
	    	  }
	    	  System.out.print(ch[i] + " → ");
	    	  ch[i] += n;
	    	  
	    	  if(ch[i] >= 91 && ch[i] <= 96) {
		    	  ch[i] -= 26;
		      }else if(ch[i] >= 123) {
		    	  ch[i] -= 26;
		      }
	    	  System.out.println(ch[i]);
	    	  
	    	  answer += ch[i];
	      }
	      // 속도실패
	      	      
	      return answer;
	}

}

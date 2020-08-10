
public class CharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "a1234";
		String s = "1234";
		
		
		int b = '0';
		int c = '9';
		
		System.out.println(b); 
		System.out.println(c);
		
		System.out.println(solution(s));

	}

	public static boolean solution(String s) {
	      for(int i=0 ; i< s.length(); i++) {
	    	  char c = s.charAt(i);
	    	  
	    	  if(c < '0' || c > '9') {
	    		  return false;
	    	  }
	    	 
	      }
	      
	      return s.length() == 4 || s.length() ==6;
	      
//	      if(s.length() == 4 || s.length() == 6){
//	          try{
//	              int x = Integer.parseInt(s);
//	              return true;
//	          } catch(NumberFormatException e){
//	              return false;
//	          }
//	      }
//	      else return false;
	      
	      
	}
}

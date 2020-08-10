
public class CharToInt {
	public static void main(String[] args) {
		solution(123);
	}
	
	public static int solution(int n) {
        String num = Integer.toString(n);
        int sum = 0;
       
        for(int i = 0; i < num.length(); i++) {
        	char a = num.charAt(i);
        	String b = String.valueOf(a);
 	
        	sum += Integer.parseInt(b);
        }
        
        return sum;
    }
}

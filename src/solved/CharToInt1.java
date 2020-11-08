package solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharToInt1 {
	public static void main(String[] args) {
		solution(123);
		 String[] str = {"1","2","3","4"};
		 
		 int[] num = {1,2,3,4};
		 
		List<String> al = new ArrayList<String>(Arrays.asList(str));
		List<int> al2 = new ArrayList<i>(Arrays.asList(str));
		System.out.println(al.size());
		al.remove(0);
		System.out.println(al.size());
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

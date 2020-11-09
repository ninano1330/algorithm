package review;

import java.util.Arrays;
import java.util.Comparator;
public class StringCompareTo {
	public static void main(String[] args) {
		int[] numbers = {6,10,2};
		String[] strs = {"1","hi","he"};
		char[] chars = {'a','b','c'};
		
		solution(numbers);
		
		int a = 1;
		int b = 2;
		
		String c= "abcd";
		
		System.out.println(c.indexOf("a"));
		
		
		String[] d = {"12","123","1235","567","88"};
		
		System.out.println(String.join(",", d));
		Arrays.sort(d, new Comparator<String>() {
			public int compare(String str1, String str2){
//				if(str1.length() == str2.length()) {
//					return Integer.parseInt(s)
//				}
				
				return str1.length() - str2.length();
			}
			
		});
		System.out.println(String.join(",", d));
		
	
		String tt = "1";
		char cc = tt.charAt(0);
		System.out.println((int)(cc-'0'));
	}
	
    public static String solution(int[] numbers) {
        String answer = "";
        
        String[] sarr = new String[numbers.length];
        for(int i=0; i<sarr.length; i++){
            sarr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(sarr,new Comparator<String>(){
            public int compare(String str1, String str2){
                return (str2+str1).compareTo(str1+str2);
            }
        });
        
        if(sarr[0].equals("0")){
            return sarr[0];
        }
        
        for(int i=0; i<sarr.length; i++) {
        	System.out.println(sarr[i]);
        }
        
         return String.join("",sarr);
    }
}
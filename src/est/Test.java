package est;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] card_num = {"3285-3764-9934-2453", "3285376499342453", "3285-3764-99342453", "328537649934245", "3285376499342459", "3285-3764-9934-2452"};
		
		solution(card_num);

	}
	
	static public int[] solution(String[] card_numbers) {
        int[] result = new int[card_numbers.length];
		
        int idx = 0;
		while(idx<card_numbers.length) {
			String card_number = card_numbers[idx];
			String[] s = card_number.split("-");
			
			if(!(s.length ==1 || s.length ==4)) {
				idx++;
				continue;
			}else if(s.length ==1) {
				if(card_number.length() != 16) {
					idx++;
					continue;
				}
			}else if(s.length ==4) {
				String regex = "^\\d{4}-\\d{4}-\\d{4}-\\d{4}";
				Pattern pattern = Pattern.compile(regex);	
				Matcher matcher = pattern.matcher(card_number);
						if(!matcher.find()) {
							System.out.println(matcher.find());
							idx++;
							continue;
						}
			}
	
			int result1 = 0;
			int result2 = 0;
			for(int i=0; i<s.length; i++) {
				//오른쪽부터 짝수번째 자리
				for(int j=s[i].length()-2; j>=0; j=j-2) {
					int tmp = ((int) s[i].charAt(j) - '0') * 2;
					if(tmp >=10 ) {
						tmp = 1 + tmp%10;
					}
					result1 += tmp;
				}
				
				//왼쪽부터 홀수번째 자리
				for(int j=s[i].length()-1; j>=0; j=j-2) {
					int tmp = ((int) s[i].charAt(j) - '0');
					result2 += tmp;
				}
			}
			
			if((result1+result2) % 10 ==0) {
				result[idx] = 1;
			}
			
			idx++;
		}

        return result;
    }

}

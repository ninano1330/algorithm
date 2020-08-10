
public class CharToString {

	public static void main(String[] args) {
		
		System.out.println(solution("qwery"));

	}

	
	public static String solution(String s) {
		int length = s.length();
		int idx = length / 2;
		
		String answer = "";
		
		if(length % 2 == 0) {
			answer = Character.toString(s.charAt(idx-1)) + Character.toString(s.charAt(idx));
		}else if(length % 2 != 0){
			answer = Character.toString(s.charAt(idx));
		}
		
	      return answer;
	      
	      
	    // return word.substring((word.length()-1) / 2, word.length()/2 + 1);  
	 }
}


/*
가운데 글자 가져오기
문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.


*/
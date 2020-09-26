package kakao;

public class kakao1 {

	public static void main(String[] args) {
//		String inputString = "Hello, world!";
//		String inputString = "line [plus]";
//		String inputString = "if (Count of eggs is 4.) {Buy milk.}";
		String inputString = ">_<";
		System.out.println(solution(inputString));
	}

	
	public static int solution(String inputString) {
		int acount = 0;
		int a_count = 0;
		int bcount = 0;
		int b_count = 0;
		int ccount = 0;
		int c_count = 0;
		int dcount = 0;
		int d_count = 0;
		
		int aidx = 0;
		int a_idx = 0;
		int bidx = 0;
		int b_idx = 0;
		int cidx = 0;
		int c_idx = 0;
		int didx = 0;
		int d_idx = 0;
		
		int length = inputString.length();
		
		for(int i=0; i < length ; i++) {
			if(inputString.charAt(i) == '(') {
				System.out.println("check a");
				acount ++;
				aidx = i;
				continue;
			}
			if(inputString.charAt(i) == ')') {
				System.out.println("check a_");
				a_count ++;
				a_idx = i;
				continue;
			}
			
			if(inputString.charAt(i)== '{') {
				System.out.println("check b");
				bcount ++;
				bidx = i;
				continue;
			}
			
			if(inputString.charAt(i) == '}') {
				System.out.println("check b_");
				b_count ++;
				b_idx = i;
				continue;
			}
			if(inputString.charAt(i) == '[') {
				System.out.println("check c");
				ccount ++;
				cidx = i;
				continue;
			}
			if(inputString.charAt(i) == ']') {
				System.out.println("check c_");
				c_count ++;
				c_idx = i;
				continue;
			}
			if(inputString.charAt(i) == '<') {
				System.out.println("check d");
				dcount ++;
				didx = i;
				continue;
			}
			if(inputString.charAt(i) == '>') {
				System.out.println("check d_");
				d_count ++;
				d_idx = i;
				continue;
			}
		}
		
		int answer = -1;
		
		if(acount != a_count || bcount != b_count || ccount != c_count || dcount != d_count) {
			return answer;
		}else if(aidx > a_idx || bidx > b_idx || cidx > c_idx || didx > d_idx ){
			return answer;
		}else {
			answer = acount + bcount + ccount + dcount;
		}

        return answer;
    }
}


/*
문제 설명
일상에서 괄호는 순서를 표현하거나, 부가 정보를 제공하거나, 특정 내용을 부각하는 등의 용도로 사용됩니다.
괄호는 여는 괄호와 닫는 괄호가 한 묶음을 이루어야 하는 특징을 가지고 있으며 다양한 괄호가 존재합니다.
아래의 규칙에 맞추어 임의의 문자열에 대해 다양한 괄호가 올바르게 사용되었는지 확인할 수 있는 해결법을 제시해 봅시다.

제한 사항
임의의 문자열 inputString이 입력됩니다
공백으로만 이루어진 문자열은 입력되지 않습니다
입력 문자열의 길이는 1 이상입니다
최대 길이는 명시되지 않습니다
괄호들이 정상적으로 사용되었는지 검증한 결과를 반환합니다
괄호는 아래와 같이 네 종류가 있다고 가정합니다
( ), { }, [ ], < >
괄호의 여닫는 특징만을 검증하며, 열려 있는 어떤 괄호에 대해서 짝이 다른 닫히는 괄호에 영향을 주지 않습니다
예를 들어 ([])와 ([)] 모두 잘 열고 잘 닫았기 때문에 정상입니다
정상이라면 총 괄호 쌍의 수, 비정상(괄호 쌍이 정상적인 순서로 표현되지 않은 경우)이라면 -1을 반환합니다
입출력 예
inputString	result
Hello, world!	0
line [plus]	1
if (Count of eggs is 4.) {Buy milk.}	2
>_<	-1

*/
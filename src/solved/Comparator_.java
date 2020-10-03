package solved;
import java.util.Arrays;
import java.util.Comparator;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Comparator_ {

	public static void main(String[] args) {
		String[] strings = {"sun", "bad", "car"};
		int n = 1;
		
//		String[] strings = {"abce", "abcd", "cdx"};
//		int n = 2;
		
		solution(strings, n);
		String[] result = solution(strings, n);
		
		for(String str : result) {
			System.out.println(str);
		}
	}
	
	public static String[] solution(String[] strings, int n) {
		/*
		 * Interface Comparator
		 * 정렬 가능한 클래스(Comparable 인터페이스를 구현한 클래스)들의 기본 정렬 기준과 다르게 정렬 하고 싶을 때 사용하는 인터페이스
		 * 기본적인 정렬 방법인 오름차순 정렬을 내림차순으로 정렬할 때 많이 사용한다.
		 */
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				char c1 = s1.charAt(n);
				char c2 = s2.charAt(n);
				
				if( c1 == c2) {
					/*
					 * compareTo
					 * 2개 값을 비교하고 int형 값을 반환하는 메소드
					 * A와 B가 같으면 0 반환
					 * A가 B보다 크면 양수 반환
					 * A가 B보다 크면 음수 반환
					 */
					return s1.compareTo(s2);
				}else return c1 - c2;
				
				
			}
			
		});
		return strings;
	}
}


/*
* 문자열 내 마음대로 정렬하기
문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.

제한 조건
strings는 길이 1 이상, 50이하인 배열입니다.
strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
모든 strings의 원소의 길이는 n보다 큽니다.
인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
입출력 예
strings	n	return
[sun, bed, car]	1	[car, bed, sun]
[abce, abcd, cdx]	2	[abcd, abce, cdx]

*/

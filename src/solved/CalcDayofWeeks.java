package solved;

public class CalcDayofWeeks {

	public static void main(String[] args) {
		
		solution(5,4);
	}

	public static String solution(int a, int b) {
		
		int[] dates = {31,29,31,30,31,30,31,31,30,31,30,31};
		String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
		
		int days=0;
		
		for(int i=0; i <a-1 ; i++) {
			days += dates[i];
		}
		
		days += b;
		
		System.out.println(a + "월 " + b + "일까지 " + days + "일");
		
		days = days % 7;
		
		String answer = day[days];
		return answer;
	}

}

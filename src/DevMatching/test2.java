package DevMatching;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String P = "PM 01:00:00";
		//String P = "AM 01:00:00";
		String P = "AM 11:59:59";
		//String P = "AM 00:00:00";
		int N = 200000;
//		String P = "PM 11:59:59";
//		int N = 1;
		
		System.out.println(solution(P, N));
	}
	
	public static String solution(String p, int n) {
		String result = "";
		try {
			String[] str = p.split(" ");
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			Date date = dateFormat.parse(str[1]);
			
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			
			if(str[0].equals("PM")) {
				calendar.add(Calendar.HOUR, 12);
			}
			
			calendar.add(Calendar.SECOND, n);
			
			//System.out.println(calendar.getTime());
			
			result = dateFormat.format(calendar.getTime());
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
    }
}

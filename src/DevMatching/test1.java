package DevMatching;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

public class test1 {

	public static void main(String[] args) throws ParseException {
		String a = "";
		List list = new LinkedList<>()
		
		int n = 3;
		String[] customers = {"10/01 23:20:25 30"
				, "10/01 23:25:50 26"
				, "10/01 23:31:00 05"
				, "10/01 23:33:17 24"
				,"10/01 23:50:25 13"
				, "10/01 23:55:45 20"
				, "10/01 23:59:39 03"
				, "10/02 00:10:00 10"};
		
		solution(n, customers);
//		String[] customers = {"10/01 23:22:25"};
		//도착날짜, 도착시간, 소요시간(분), 동시 도착 X
		//가장 많은 고객과 매칭되는 키오스크는 몇 며의 고객과 매칭되는지 계산
		
//		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
//		
//		que.offer(1);
//		que.offer(4);
//		que.offer(3);
//		que.offer(2);
//		
//		while(!que.isEmpty()) {
//			System.out.println(que.poll());
//		}
		
//		String from = "10/01 23:22:25";
//
//		SimpleDateFormat transFormat = new SimpleDateFormat("MM/dd HH:mm:ss");
//
//		Date to = transFormat.parse(from);
//		System.out.println(to);
//		
//		Date to2 = new Date();
//		System.out.println(to2);
//		
//		System.out.println(to.compareTo(to2));
		
		
//		boolean b = to > new Date();

		
//		for(int i=0; i<customers.length; i++) {
//			SimpleDateFormat date = new SimpleDateFormat("MM/dd HH:mm:ss");
//			System.out.println(date.parse(customers[i]));
//	 	}
	}
	
	 public static int solution(int n, String[] customers) {
		 	
		 	ArrayList<Date> al = new ArrayList<Date>();
		 	int[] useCount = new int[n]; 

		 	for(int i=0; i<n; i++) {
		 		al.add(null);
		 	}
		 	
		 	SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd HH:mm:ss");
		 	for(int i=0; i<customers.length; i++) {
		 		try {
		 			String[] str = customers[i].split(" ");
		 			String visitDate = str[0] + " " + str[1];
		 			int leadTime = Integer.parseInt(str[2]);
		 			
		 			Date date = dateFormat.parse(str[0] + " " + str[1]);
		 			
		 			Calendar cal = Calendar.getInstance ( );
		 			cal.setTime(date);
		 			cal.add(Calendar.MINUTE, leadTime);
		 			
		 			for(int j=0; j<al.size(); j++) {
		 				if(al.get(j) <= cal.getTime()) {
		 					
		 				}
		 				
		 				if(al.get(j) == null) {
		 					al.add(cal.getTime());
		 				}
		 			}
		 		}catch(Exception e){
		 			
		 		}
		 	}
		 	
		 	
	        int answer = 0;
	        return answer;
	 }
}

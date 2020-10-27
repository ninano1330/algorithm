package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Greed_meeting {
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		//int[] resultArr = new int[cnt];
		int result = 0;
		
		ArrayList<int[]> al = new ArrayList<int[]>();
		for(int i=0; i<cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int[] tmp= new int[2];
			tmp[0] = Integer.parseInt(st.nextToken());
			tmp[1] = Integer.parseInt(st.nextToken());
			
			al.add(tmp);
		}		

		al.sort(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
//				if(o1[0] == o2[0]) {
//					return o1[1] - o2[1];
//				}
//				
//				return o1[0] - o2[0];
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				
				return o1[1] - o2[1];
			}
		});
		
//		for(int i=0; i<al.size(); i++) {
//			int[] tmp = al.get(i);
//			System.out.println(tmp[0] + " " + tmp[1]);
//		}
		
		
		int max = 0;
		int[] firstMeeting = al.get(0);
		result ++;
		for(int i=1; i<al.size(); i++) {
			
			//resultArr[i]++;
			//result++;
//			for(int j=i+1; j<al.size(); j++) {
				int[] compareMeeting = al.get(i);
				
				if(firstMeeting[1] <= compareMeeting[0]) {
					result++;
					firstMeeting = al.get(i);
//					System.out.println("firstMeeting : " + firstMeeting[0][0] + " " + firstMeeting[0][1]);
				}
//			}
//			System.out.println();
		}
		
//		int max = 0;
//		for(int i=0; i<resultArr.length; i++) {
//			System.out.println(resultArr[i]);
//			if(resultArr[i] > max ) max = resultArr[i];
//		}
		
		System.out.println(result);
	}

	
//	Arrays.sort(arr,(o1,o2)->{
//
//		//종료시간이 같다면
//
//		  if(o1[1] == o2[1]){
//
//		//시작시간 순으로
//
//		    return Integer.compare(o1[0],o2[0]);
//
//		   }else{
//
//		//같지 않으면 종료시간 순으로
//
//		    retrun Integer.compare(o1[1],o2[1]);
//
//		   }
//
//		}); 
}

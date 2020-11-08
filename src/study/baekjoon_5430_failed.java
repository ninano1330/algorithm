package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;

public class baekjoon_5430_failed {
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
	
		int caseCnt = Integer.parseInt(br.readLine());
		
		while(caseCnt>0) {
			//함수
			String p = br.readLine();
			//배열 수
			int length = Integer.parseInt(br.readLine());
			//배열 문자열
			String arrStr = br.readLine();
			
			//배열 선언
			//Integer[] arr = new Integer[length];
			LinkedList<Integer> arr = new LinkedList<>();
			
			//배열 문자열 필터링
			arrStr = arrStr.substring(1, arrStr.length()-1);
			
			//배열 set
			String[] numStr = arrStr.split(",");
			for(int i=0; i<length; i++) {
				//arr[i] = Integer.parseInt(numStr[i]);
				arr.add(Integer.parseInt(numStr[i]));
				//System.out.println("arr["+i+"] : " + arr[i]);
			}
			
			//함수 실행
			int deleteCnt = 0;
			boolean reverse = true;
			boolean error =false;
			for(int i=0; i<p.length(); i++) {
				char c = p.charAt(i);	
				if(c == 'R') {
					//Arrays.sort(arr, Collections.reverseOrder());
					if(reverse) {
						Collections.sort(arr,Collections.reverseOrder());
						reverse = false;
					}else {
						Collections.sort(arr);
						reverse = true;
					}
					//System.out.println("reverse");
				}else if(c =='D') {
					if(deleteCnt > length) {
						//System.out.println("deleteCnt > length");
						System.out.println("error");
						error = true;
						break;
					}else if(arr.size()==0){
						//System.out.println("length==0");
						System.out.println("error");
						error = true;
						break;
					}
					arr.remove(0);
					deleteCnt++;
				}
			}
			
			if(error) continue;
			
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			for(int i=0; i<arr.size(); i++) {
				
				//System.out.println("arr["+i+"] : " + arr[i]);
				//System.out.println("arr["+i+"] : " + arr.get(i));
				sb.append(arr.get(i));
				sb.append(",");
			}
			
			System.out.println(sb.toString().substring(0,sb.length()-1) + "]");

			caseCnt--;
		}
	}

}

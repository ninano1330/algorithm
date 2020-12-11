package review;

import java.util.Scanner;

/*
 * 백준 1107
 */
public class bj_brokenBtn {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int channel = scanner.nextInt();
		int cnt = scanner.nextInt();
		
		int[] brokenChannelArr = new int[10]; 
		
		int idx = 0;
		while(idx < cnt) {
			int brokenBtn = scanner.nextInt();
			brokenChannelArr[brokenBtn] = -1;
			idx++;
		}
		
		int minChannel = Integer.MAX_VALUE;
		if(channel == 100) {
			System.out.println(0);
		}else {
			boolean hasBrokenBtn = false;
			int closerChannel = 100;
			for(int i=0; i<= 1000000; i++, hasBrokenBtn = false) {
				String inputChannel = i + "";
				
				for(int j=0; j<inputChannel.length(); j++) {
					if(brokenChannelArr[(int)(inputChannel.charAt(j) - '0')] == -1) {
						hasBrokenBtn = true;
						break;
					}

				}
				
				//System.out.println(i);
				if(!hasBrokenBtn) {
					if(Math.abs(i - channel) < minChannel) {
						minChannel = Math.abs(i - channel);
						//System.out.println("inputChannel : " + i);
						closerChannel = i;
					}
				}
			}
			
			int result = Math.abs(channel - closerChannel) + (closerChannel + "").length();
			int resultby100 = Math.abs(channel - 100);
			
			System.out.println(result < resultby100 ? result : resultby100);
			
			
		}
	}
}

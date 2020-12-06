package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bj_2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner scanner = new Scanner(System.in);
		
		int kg = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=0;true;i++) {
			//초기화
			count = 0;
			
			count += kg/5 -i;
			int share = kg - 5 * (kg/5 -i);
			
			if(share%3==0) {
				count += share/3;
				break;
			}
			
			if(kg/5 -i ==0) {
				count = -1;
				break;
			}
		}
		
		System.out.println(count);
		
//	 	int input = 0; 
//        int count = 0;
//        Scanner sc = new Scanner(System.in);
//        input = sc.nextInt();
//        
//        while(true) {
//            if (input % 5 ==0) {
//                System.out.println(input/5 + count);
//                break;
//            }else if(input <= 0) {
//                System.out.println(-1);
//                break;
//            }
//            input = input-3;
//            count++;
//        }
	}
	
	
	
}
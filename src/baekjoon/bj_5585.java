package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_5585 {
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		int money = 1000 - Integer.parseInt(br.readLine());
//		System.out.println(money);
		
		int[] coin = {500,100,50,10,5,1};
		
		int coinCnt = 0;
		
		for(int i=0; i< coin.length; i++) {
			coinCnt += money / coin[i];
			if(money % coin[i]==0) {
				break;
			}else {
				money = money % coin[i];
			}
		}
		
		System.out.println(coinCnt);
	}

}

package dn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test4_1 {

	public static void main(String[] args) {
		int[][] customer = {{1,1},{2,1},{3,1},{2,0},{2,1}};
		int K = 2;
		
		int[] result = solution(customer, K);
		
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]);
		}
		
		System.out.println();
		
		int[][] customer2 = {{2,1},{1,1},{3,1},{1,0},{1,1},{2,0},{2,1}};
		int K2 = 1;
//		
		int[] result2 = solution(customer2, K2);
		
		for(int i=0; i<result2.length; i++) {
			System.out.print(result2[i]);
		}
		
		System.out.println();
		
		
		int[][] customer3 = {{4, 1}, {3, 1}, {2, 1}, {4, 0}, {1, 1}, {1, 0}, {4, 1}, {4, 0}};
		int K3 = 3;
		
		int[] result3 = solution(customer3, K3);
		
		for(int i=0; i<result3.length; i++) {
			System.out.print(result3[i]);
		}
		
	}

	public static int[] solution(int[][] customer, int K) {
		int[] customers = new int[1000001];
		ArrayList<Integer> waitingList = new ArrayList<>();
		
		for(int i=0; i<customer.length; i++) {
			int customerNum = customer[i][0];
			int order = customer[i][1];
			
			if(order==1) {
				if(K>0) {
					customers[customerNum] = 1;
					K--;
				}else {
					waitingList.add(customerNum);
				}
			}else if(order==0) {
				if(waitingList.indexOf(customerNum) != -1) {
					int idx = waitingList.indexOf(i);
					waitingList.remove(idx);
				}else {
					customers[customerNum] = 0;
					
					if(waitingList.size()>0) {
						customerNum = waitingList.get(0);
						customers[customerNum] = 1;
					}else {
						K++;
					}
				}
			}
		}
	}
}

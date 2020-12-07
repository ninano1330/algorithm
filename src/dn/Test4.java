package dn;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test4 {

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
		List<Integer> roomList = new LinkedList<>();
		List<Integer> reserveList = new LinkedList<>();
		
		for(int i=0; i<customer.length; i++) {
			int memNum = customer[i][0];
			int reserve = customer[i][1];
			
			if(reserve == 1) {	//예약 신청
				if(K>0) {
					roomList.add(memNum);
					K--;
				}else {
					reserveList.add(memNum);
				}
			}else { //예약 취소
				if(roomList.indexOf(memNum) >=0) { //배정에서 예약 취소
					int idx = roomList.indexOf(memNum);
					roomList.remove(idx);
					
					if(reserveList.size() >0) { //예악리스트 있으면 배정리스트로 추가. 예약리스트 제거.
						roomList.add(reserveList.get(0));
						reserveList.remove(0);
					}else { //예약리스트 없으면 빈 방 
						K++;
					}
				}else if(reserveList.indexOf(memNum) >=0) {	//대기 리스트에서 예약 취소
					int idx = reserveList.indexOf(memNum);
					reserveList.remove(idx);
				}
			}
		}
		
		int[] result = new int[roomList.size()];
		Collections.sort(roomList);
		for(int i=0; i<roomList.size(); i++) {
			result[i] = roomList.get(i);
		}

		return result;
	}
}

/*
 * 문제 설명
K개의 빈방이 있는 호텔에서 고객들에게 예약 신청을 받아 방을 배정해 주려고 합니다. 예약을 신청한 고객들에게는 남아있는 방 중 하나가 임의로 배정됩니다. 만약 남아있는 방이 없다면 고객들은 대기자 명단에 순서대로 등록됩니다. 남은 방이 없을 때, 방을 배정받은 고객 중 한 명이 예약 취소를 한다면 자동으로 대기자 명단의 가장 앞에 있는 고객에게 방이 배정됩니다. 이때, 방을 배정받았던 고객이 예약 취소 후 다시 예약을 신청했을 때 남은 방이 없다면 대기자 명단의 가장 뒤쪽에 등록됩니다. 마찬가지로 대기자 명단에 있는 고객이 예약 취소를 한다면 해당 고객은 대기자 명단에서 삭제되며, 해당 고객의 뒤쪽에 등록되어있던 고객들의 순번이 하나씩 앞으로 이동합니다. 또한, 대기자 명단에서 삭제된 고객이 다시 방 예약을 신청하면 대기자 명단의 가장 뒤쪽에 등록됩니다.
고객들의 아이디와 각 고객이 방 예약을 신청, 취소한 내용이 순서대로 들어있는 배열 customer와 호텔의 빈방 개수 K가 매개변수로 주어질 때, 고객들의 예약 신청, 취소 요청을 순서대로 모두 처리한 후 최종적으로 방을 배정받은 고객들의 ID가 들어있는 배열을 오름차순 정렬하여 return 하도록 solution 함수를 완성해주세요. 단, 이미 예약을 신청하여 방을 배정받았거나, 대기자 명단에 있는 고객이 다시 예약을 신청하는 경우와, 방 배정 명단, 혹은 대기자 명단 어디에도 속해있지 않은 고객이 방 배정을 취소하는 경우는 입력으로 주어지지 않습니다.

제한사항
customer는 각 고객의 예약 신청, 취소 요청이 순서대로 들어있는 배열이며, 길이는 1 이상 500,000 이하입니다.
customer의 각 원소는 길이가 2인 배열로 각 고객의 예약 정보가 [고객 ID, 예약 내용] 순으로 들어있습니다.
각 고객 ID는 1 이상 1,000,000 이하의 자연수입니다. 고객 한 명당 하나씩의 아이디가 부여됩니다.
예약 내용은 0 또는 1로만 이루어져 있으며, 0은 예약 취소, 1은 예약 신청을 나타냅니다.
K는 빈방의 개수를 나타내며 1 이상 1,000 이하의 자연수입니다.
customer에 들어있는 예약 신청, 취소 내용을 배열의 첫 번째 원소부터 순서대로 전부 처리했을 때, 최종적으로 방을 배정받은 고객의 아이디를 오름차순으로 정렬하여 return 하세요.
최소 1명 이상 방을 배정받는 경우만 입력으로 주어집니다. 즉, return 하는 배열이 빈 배열인 경우는 없습니다.
입출력 예
customer	K	result
[[1,1],[2,1],[3,1],[2,0],[2,1]]	2	[1,3]
[[2,1],[1,1],[3,1],[1,0],[1,1],[2,0],[2,1]]	1	[3]
입출력 예 설명
입출력 예 #1
방의 개수는 2개입니다.

1번 고객이 방을 예약했습니다. (남은 방 1개, 대기열 0명)
2번 고객이 방을 예약했습니다. (남은 방 0개, 대기열 0명)
3번 고객이 방을 예약했습니다. (남은 방 0개, 대기열 1명 => [3])
2번 고객이 예약을 취소했습니다. 방이 하나 남게 되므로 대기열의 가장 앞에 있는 3번 고객에게 방이 배정됩니다. (남은 방 0개, 대기열 0명)
2번 고객이 방을 예약했습니다. (남은 방 0개, 대기열 1명 => [2])
주어진 요청을 모두 처리한 후 방을 배정받은 고객은 1번, 3번 고객입니다.
따라서 오름차순 정렬하여 [1, 3]을 return 합니다.

입출력 예 #2
방의 개수는 1개입니다.

2번 고객이 방을 예약했습니다. (남은 방 0개, 대기열 0명)
1번 고객이 방을 예약했습니다. (남은 방 0개, 대기열 1명 => [1])
3번 고객이 방을 예약했습니다. (남은 방 0개, 대기열 2명 => [1, 3])
1번 고객이 예약을 취소했습니다. (남은 방 0개, 대기열 1명 => [3])
1번 고객이 방을 예약했습니다. (남은 방 0개, 대기열 2명 => [3, 1])
2번 고객이 예약을 취소했습니다. 따라서 방이 하나 남게 되므로 대기열의 가장 앞에 있는 3번 고객에게 방이 배정됩니다. (남은 방 0개, 대기열 1명 => [1])
2번 고객이 방을 예약했습니다. (남은 방 0개, 대기열 2명 => [1, 2])
주어진 요청을 모두 처리한 후 방을 배정받은 고객은 3번 고객입니다.
따라서 오름차순 정렬하여 [3]을 return 합니다.
*/

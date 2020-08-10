package kakao;

public class Test4 {
	
	public static void main(String args[]) {
		String road = "111011110011111011111100011111";
		int n= 3;
		
		System.out.println(solution(road, n));
	}

	 public static int solution(String road, int n) {
	        
	        
	        System.out.println(road.indexOf("0"));
	        
	        
	        road.charAt(road.indexOf("0")) = "4";
	        
	        int answer = -1;
	        return answer;
	    }
}




/*
문제 설명
슬프게도 Cony Bank에서 장애가 발생하여 데이터베이스에서 데이터가 삭제되었습니다.
Cony Bank의 기술 담당자 브라운은 스냅숏(snapshot) 데이터와 트랜잭션 로그(transaction log)를 사용하여 데이터베이스를 복구하려 합니다.

제한 사항
[[계좌 이름, 잔액], ... ],

스냅숏 데이터 snapshots는 계좌 이름과 잔액이 문자열(String)의 배열로 입력됩니다
계좌 이름은 숫자와 대소문자가 구분되는 영문자로 구성된 최대 10자리의 문자열입니다
스냅숏 데이터의 개수는 1 이상 105 이하입니다
모든 계좌는 서로 계좌 이름이 다릅니다
잔액은 100,000보다 작고, 0보다 크거나 같은 숫자의 문자열입니다
[ID2, WITHDRAW, 계좌 이름2, 출금 금액2], ... ]

트랜잭션 로그 transactions는 ID, 종류, 계좌 이름, 출금 금액이 문자열(String)의 배열로 입력됩니다
트랙잭션 로그의 개수는 1 이상 105 이하입니다
모든 트랙잭션 로그에는 ID가 있습니다
ID는 모든 트랜잭션 로그를 각각 구분할 수 있는 고유 ID입니다
100,000보다 작고 0보다 큰 정수의 문자열입니다
트랜잭션 로그는 누락이 없도록 모든 데이터베이스에서 읽어 왔기 때문에 중복이 발생할 수 있고, ID 순서가 랜덤입니다
같은 트랜잭션이 중복 적용되지 않도록, ID를 확인하여 한 번만 적용되도록 해야 합니다
단, ID가 동일한 경우 트랜잭션 로그의 내용도 동일하다
스냅숏 데이터 이후에 추가된 계좌가 있을 수 있으므로, 스냅숏 데이터에서 존재하지 않았던 계좌가 사용될 수 있습니다
이 경우 추가된 계좌의 잔액은 0입니다
트랜잭션의 종류는 SAVE와 WITHDRAW 2가지가 있습니다
SAVE: 입금에 대한 정보로, 계좌 이름과 입금 금액 정보가 문자열 배열로 함께 입력됩니다
입금 금액은 0 이상의 정수 문자열입니다
WITHDRAW: 출금에 대한 정보로, 계좌 이름과 출금 금액 정보가 문자열 배열로 함께 입력됩니다
출금 금액은 0 이상의 정수 문자열입니다
잔액이 음수가 되는 트랜잭션은 없습니다
[계좌 이름, 잔액]

계좌의 이름과 잔액을 문자열 배열로 반환합니다
계좌의 이름을 기준으로 오름차순 정렬하여 반환합니다
잔액은 쉼표 없이 숫자로만 이루어진 문자열로 출력합니다
잔액은 100,000보다 작고, 0보다 크거나 같은 숫자의 문자열입니다
입출력 예
snapshots
[
  ["ACCOUNT1", "100"], 
  ["ACCOUNT2", "150"]
]
transactions
[
  ["1", "SAVE", "ACCOUNT2", "100"],
  ["2", "WITHDRAW", "ACCOUNT1", "50"], 
  ["1", "SAVE", "ACCOUNT2", "100"], 
  ["4", "SAVE", "ACCOUNT3", "500"], 
  ["3", "WITHDRAW", "ACCOUNT2", "30"]
]
result
[
 ["ACCOUNT1", "50"], 
 ["ACCOUNT2", "220"], 
 ["ACCOUNT3", "500"]
]









*/

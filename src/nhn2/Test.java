package nhn2;


import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] goods = {46,62,9};
		//int[] goods = {50,62,93};
		//int[] goods =  {5,31,15};
		//int[] goods = {5,3,15};
		solution(goods);

	}

	public static int solution(int[] goods){
		Arrays.sort(goods);
		
		int result = 0;
		int price = 0;
		for(int i= 0; i<goods.length; i++) {
			if(goods[i] < 50) {
				price += goods[i];
			}else if(goods[i] >= 50) {
				result += goods[i] -10;
				continue;
			}
			
			if(price >=50) {
				result += price -10;
				price = 0;
			}
		}
		
		return result+price;
    }
}


/*
1/5 기념품 행사
시간 제한 : 2초메모리 제한 : 256MB
문제 설명
세 자매가 해외여행 중 기념품 가게에 왔습니다.

 

이 기념품 가게에서는 한번에 50달러 이상 지출하면, 10달러를 할인해주는 행사를 하고 있습니다.
그녀들은 구매한 물건을 합하여 계산하면, 각자 따로 지불하는 것보다 적게 지불할 수 있다는 것을 깨달았습니다.

 

예를들어 그들이 각각 46달러, 62달러, 9달러만큼의 상품을 구입하는 경우, 46달러와 9달러를 합치는 것으로 2번의 구매를 할 수 있습니다.
이렇게 하면 55달러와 62달러로 거래하게 되어 총 20달러의 할인을 받을 수 있습니다.

 

여기 int[] goods 가 주어집니다.
int[] goods 의 각 요소는 한 명이 구매하려는 물품의 총 비용입니다.

 

세 자매가 모든 상품을 구입하는데 드는 최소 비용을 리턴하세요.

(그녀들은 위 설명처럼 합쳐서 구매할 수 있지만, 자기가 구입할 상품을 나눠서 구매하지는 않습니다.)

 

참고 / 제약 사항
goods 는 오직 3개의 요소만 가집니다.
goods 의 각 요소는 1 이상 99 이하의 정수입니다.
테스트 케이스
int[] goods = [46,62,9]리턴(정답): 97
문제 설명에 나온 예제입니다.

int[] goods = [50,62,93]리턴(정답): 175
모두 각자 계산하는 것이 가장 좋은 방법입니다.

int[] goods = [5,31,15]리턴(정답): 41
세 번의 구매를 한번에 합쳐서 해야 구매 비용을 가장 낮출 수 있습니다.

int[] goods = [5,3,15]리턴(정답): 23
할인 행사를 받을 방법이 존재하지 않습니다.

*/
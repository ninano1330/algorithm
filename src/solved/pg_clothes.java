package solved;

import java.util.HashMap;
import java.util.Map;

public class pg_clothes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		
//		System.out.println(solution(clothes));
		
		String[][] clothes2 =  {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		
		System.out.println(solution(clothes2));

	}

	public static int solution(String[][] clothes) {
		Map<String,Integer> clothesMap = new HashMap<>();
		
		for(int i=0; i<clothes.length; i++) {
			String clothKind = clothes[i][1];
			//String clothName = clothes[i][0];
			
			if(clothesMap.get(clothKind) == null) {
				clothesMap.put(clothKind, 1);
			}else {
				int cnt = clothesMap.get(clothKind);
				cnt++;	
				clothesMap.put(clothKind, cnt);
			}
		}
		
		int answer = 1;
		for(String key : clothesMap.keySet()) {
			System.out.println(clothesMap.get(key));
			//System.out.println(key + " : " + clothesMap.get(key));
			answer *= (clothesMap.get(key)+1);
		}
		
		//int answer = 0;
		return answer -1;
	}

}

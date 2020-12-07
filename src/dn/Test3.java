package dn;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] price = {4,1,4,7,6};
		int[] price = {13,7,3,7,5,16,12};
		solution(price);
	}

    public static int[] solution(int[] price) {
    	int[] result = new int[price.length];
    	
    	for(int i=0; i<price.length-1; i++) {
    		int datePrice = price[i];
    		boolean incFlag = false;
    		
    		for(int j=i+1; j<price.length; j++) {
    			if(datePrice < price[j]) {
//    				System.out.println("datePrice : " + datePrice);
//    				System.out.println("price : " + price[j]);
//    				System.out.println(i + "날짜는 차익이 있음");
//    				System.out.println(j + "날짜에서 차익 발생");
//    				System.out.println();
    				result[i] = j-i;
    				incFlag = true;
    				break;
    			}
    		}
    		
    		if(!incFlag) {
//    			System.out.println(i + "날짜는 차익이 없음");
    			result[i] = -1;
    		}
    	}
    	
    	result[result.length-1] = -1;
    	
//    	for(int i=0; i<result.length; i++) {
//    		System.out.println(result[i]);
//    	}
    	
    	
        return result;
    }
}

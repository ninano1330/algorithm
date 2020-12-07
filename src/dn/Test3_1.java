package dn;

public class Test3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] price = {4,1,4,7,6};
//		int[] price = {13,7,3,7,5,16,12};
		solution(price);
	}

    public static int[] solution(int[] price) {
        int[] result = new int[price.length];
    	
    	for(int i=0; i<price.length-1; i++) {
    		int datePrice = price[i];
    		
    		for(int j=i+1; j<price.length; j++) {
    			if(datePrice < price[j]) {
    				result[i] = j-i;
    				break;
    			}
    		}
            
            if(result[i] == 0){
                result[i] = -1;
            }
    	}
    	
        result[result.length-1] = -1;
    	
        return result;
    }
}

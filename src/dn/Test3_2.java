package dn;

import java.util.ArrayList;
import java.util.Collections;

public class Test3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] price = {4,1,4,7,6};
		int[] price = {13,7,3,7,5,16,12};
		solution(price);
	}

    public static int[] solution(int[] price) {
    	ArrayList<Integer> priceList = new ArrayList<>();
    	for(int i=0; i<price.length; i++) {
    		priceList.add(price[i]);
    	}
    	
    	int[] result = new int[price.length];
    	for(int i=0; i<priceList.size()-1; i++) {
    		int datePrice = priceList.get(i);
    		int max = Collections.max(priceList);
    		
    		if(datePrice >= max) {
    			result[i] = -1;
    			priceList.set(i, -1);
    			continue;
    		}
    		
    		boolean incFlag = false;
    		for(int j=i+1; j<priceList.size(); j++) {
    			if(datePrice < priceList.get(j)) {
    				result[i] = j-i;
    				incFlag = true;
    				break;
    			}
    		}
    	}
    }
}

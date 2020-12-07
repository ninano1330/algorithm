package dn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String[] orders = {"alex pizza pasta", "alex pizza pizza", "alex noodle", "bob pasta", "bob noodle sandwich pasta", "bob steak noodle"};
		String[] orders = {"alex pizza pasta steak", "bob noodle sandwich pasta", "choi pizza sandwich pizza", "alex pizza pasta steak"};
		String[] result = solution(orders);
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static String[] solution(String[] orders) {
		//Map<String,Set> userOrder = new HashMap<>();
		Map<String,Set> userOrder = new TreeMap<>();
		
		for(int i=0; i<orders.length; i++) {
			String[] order = orders[i].split(" ");
			
			String user = order[0];
			
			if(userOrder.get(user) ==null) {
				Set<String> menu = new HashSet<>();
				
				//Set 메뉴 추가
				for(int j=1; j<order.length;j++) {
					menu.add(order[j]);
				}
				
				//put userOrder Map
				userOrder.put(user, menu);
			}else {
				Set<String> menu = userOrder.get(user);
				
				//Set 메뉴 추가
				for(int j=1; j<order.length;j++) {
					menu.add(order[j]);
				}
				
				userOrder.put(user, menu);
			}
		}
		
		int maxOrder = 0;
		String maxOrderUser = "";
		for(String user : userOrder.keySet()) {
			Set<String> menu = userOrder.get(user);
			
			if(menu.size() > maxOrder) {
				maxOrder = menu.size();
				maxOrderUser = user;
			}else if(menu.size() == maxOrder){
				maxOrderUser += " " + user;
			}
		}
		
		String[] result = maxOrderUser.split(" ");
		Arrays.sort(result);
		
        return result;
    }
}


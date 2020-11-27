package doit;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue<Object> stack = new LinkedList<>(); //int형 queue 선언, linkedlist 이용
		Queue<Integer> queue1 = new ArrayDeque<>(); 
		Queue<Double> queue2 = new LinkedList<>(); 
		Queue<String> queue3 = new PriorityQueue<>();
		
		Queue<Object> queue = new PriorityQueue<>();
		
		/* 실패 시 false 리턴 */
//		queue.offer(1); 	//추가
//		queue.poll(); 		//삭제
//		queue.peek(); 		//검사
		
		/* 실패 시 예외 발생 */
//		queue.add(1); 		//추가 
//		queue.remove(); 	//삭제
//		queue.element(); 	//검사
//		queue.isEmpty();
//		
//		queue.offer(2);
		
		
		
		
		Stack<Object> stack = new Stack<>();
		
//		stack.push(1);	//추가. Stack 제공 메서드. 리턴값 <E>
//		stack.pop();	//stack의 가장 상단의 값 삭제
//		stack.peek();	//stack의 가장 상단의 값 읽기
//		stack.isEmpty();
//		stack.clear();
		
		stack.add(1);	//추가. List 제공 메서드. 리턴값 boolean.
		
		
//		List<Integer> list = new LinkedList<>();
//		list.get(1);
//		
		
		Set<Object> set = new HashSet<>();
		Set<Object> hashSet = new HashSet<>();					//기본
		Set<Object> treeSet = new TreeSet<>();					//오름차순
		Set<Object> linkedHashSet = new LinkedHashSet<>();		//입력된 순서대로 객체를 관리
		
		set.add(1);		//추가
		//set.remove(1);	//삭제
		/* 조회 */
//		Iterator<Object> iterator = set.iterator();
//		while(iterator.hasNext()) {
//			iterator.next();
//		}

		
		Map<Object,Object> hashMap = new HashMap<>();				//기본
		Map<Object,Object> treeMap = new TreeMap<>();				//Key 오름차순 정렬
		Map<Object,Object> linkedHashMap = new LinkedHashMap<>();	//입력된 순서대로 객체를 관리
		
		hashMap.put(1, 1);		//추가 Key,Value
		hashMap.get(1);			//Key로 Value 조회
		
		/* 전체 조회 1 : keySet 사용 */
		for(Object key : hashMap.keySet()) {
			System.out.println(key + " " + hashMap.get(key));
		}
		
		/* 전체 조회 2 : Iterator 사용 */
		Iterator iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) {
			Object key = iterator.next();
			System.out.println(key + " " + hashMap.get(key));
		}
	}
	

}

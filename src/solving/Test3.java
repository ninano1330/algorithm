package solving;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		solution(skill, skill_trees);
	}

	public static int solution(String skill, String[] skill_trees) {
		
		
//		Queue<Character> que = new LinkedList<Character>();
//		for(int i=0; i < skill.length(); i++) {
//			que.offer(skill.charAt(i));
//		}
		
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i < skill.length(); i++) {
			set.add(skill.charAt(i));
		}
		
		Set<Character> setBak = new LinkedHashSet<Character>();
		setBak.addAll(set);
		
		String[] re_skill_tress = new String[skill_trees.length];
		StringBuffer sb = new StringBuffer();
		for(int i=0; i< skill_trees.length; i++) {
			for(int j=0; j<skill_trees[i].length(); j++) {
				Iterator<Character> it = set.iterator();
				char rmValue = 0;
				while(it.hasNext()) {
					char setValue = it.next();
					
					if(skill_trees[i].charAt(j) == setValue) {
						sb.append(setValue);
						rmValue = setValue;
						break;
					}
				}
				
				if(rmValue != 0) set.remove(rmValue);
			}
			
			set.clear();
			set.addAll(setBak);
			
			re_skill_tress[i] = sb.toString();
			sb.setLength(0);
		}
		
		
		int count = 0;
		for(int i=0; i< re_skill_tress.length; i++) {
//			if(skill.indexOf(re_skill_tress[i])) {
//				System.out.println("skill : " + skill);
//				System.out.println("re_skill_tree : " + re_skill_tress[i]);
//				System.out.println();
//				//System.out.println("contains");
//				count++;
//			}
			if(skill.indexOf(re_skill_tress[i]) ==0) {
				count++;
			}
			
//			System.out.println("skill : " + skill);
//			System.out.println("re_skill_tree : " + re_skill_tress[i]);
//			System.out.println("indexOf : " + skill.indexOf(re_skill_tress[i]));
//			System.out.println();
		}
//		System.out.println(count);
		
		int answer = 0;
		return count;
	}
}

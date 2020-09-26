package solved;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetToArray {

	public static void main(String[] args) {

	//	int[] answer = { 1, 4, 4, 6, 7, 8 };
		//int[] answer = { 1, 4, 4, 6, 7, 8 };
		int[] answer = 	{1, 1, 3, 3, 0, 1, 1};

		solution(answer);

	}

	public static int[] solution(int[] arr) {
		
		Set<Integer> st = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			st.add(arr[i]);
		}
		
		int[] answer = new int[st.size()];
//		System.out.println("st.size = " + st.size());
	
		Iterator it = st.iterator();
		
		for(int j=0;it.hasNext(); j++) {
			answer[j] = (int) it.next();
		}

		for(int z=0; z < answer.length; z++) {
			System.out.println(answer[z]);
		}
		
		return answer;
	}

}

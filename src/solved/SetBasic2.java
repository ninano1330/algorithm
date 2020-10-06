package solved;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetBasic2 {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());

		Scanner scanner = new Scanner(System.in);
		
		int ele1_count = scanner.nextInt();
		int ele2_count = scanner.nextInt();
				
		Set<Integer> ele1 = new HashSet<Integer>();
		Set<Integer> ele2 = new HashSet<Integer>();
		
		for(int i=1 ; i <= ele1_count; i++) {
			ele1.add(scanner.nextInt());
		}
		
		for(int i=1 ; i <= ele2_count; i++) {
			ele2.add(scanner.nextInt());
		}
		
		Set<Integer> ele1_tmp = new HashSet<Integer>(ele1);
		Set<Integer> ele2_tmp = new HashSet<Integer>(ele2);
		
		Iterator<Integer> it = ele1_tmp.iterator();
		while(it.hasNext()) {
			ele2.remove(it.next());
		}
		
		it = ele2_tmp.iterator();
		while(it.hasNext()) {
			ele1.remove(it.next());
		}
		
		System.out.println(ele1.size() + ele2.size());
	}
}

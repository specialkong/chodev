package study.chodev.pureu.example.week1;

import java.util.ArrayList;
import java.util.List;

/**
 * for, for each, while, do while
 * @author pureu
 *
 */
public class LoopExample {

	@SuppressWarnings("serial")
	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		List<Integer> list = new ArrayList<Integer>() {
			{
				add(5);
				add(6);
				add(7);
			}
		};
		
		for(int i=0;i<a.length;i++) {
			System.out.println("for1 : " + a[i]);
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println("for2 : " + list.get(i));
		}
		
		for(int i:a) {
			System.out.println("for each1 : " + i);
		}
		
		for(int i:list) {
			System.out.println("for each2 : " + i);
		}
		
		int j=0;
		while(j<5) {
			System.out.println("j : " + j++);
			if(j==3) {
				break;
			}
		}
		
		int k=0;
		do {
			System.out.println("k : " + k++);
		} while (k<1);
	}
}

package study.chodev.pureu.problem.week2;

import java.util.List;
import java.util.Vector;

import study.chodev.common.Solution;

/**
 * 3 and 5 Multiples's sum
 * 
 * @author pureu
 * @since 2017.06.16
 * @version 1.0
 *
 */
public class Multiples35 implements Solution {

	/**
	 * business logic
	 * 
	 * @param arg
	 * @return void
	 */
	public void solve(Object[] arg) {
		
		int max = (Integer)arg[0];
		int arg1 = (Integer)arg[1];
		int arg2 = (Integer)arg[2];
		int sum = 0;
		
		for(int i=1;i<max;i++) {
			if(isMultiple(i, arg1)) {
				System.out.print(i + " ");
				sum += i;
			} else if(isMultiple(i, arg2)) {
				System.out.print(i + " ");
				sum += i;
			}
			if(i % 100 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println("sum : " + sum);
	}
	
	/**
	 * isMultiple
	 * 
	 * @param num
	 * @param devider
	 * @return boolean
	 */
	public boolean isMultiple(int num, int devider) {
		
		if(num % devider == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
//		Multiples35 multiple = new Multiples35();
//		multiple.solve(new Object[]{10, 3, 5});
//		multiple.solve(new Object[]{1000, 3, 5});
//		
//		List<String> list = new ArrayList<String>();
		List<String> list = new Vector<String>();
		
		list.add("abc");
		
		System.out.println(list.get(0));
		
		
	}
}

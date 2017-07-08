package study.chodev.pureu.problem.week2;

import study.chodev.common.Solution;

/**
 * even fibonacci's sum
 * 
 * @author pureu
 * @since 2017.06.16
 * @version 1.0
 *
 */
public class EvenFibonacci implements Solution {

	/**
	 * business logic
	 * 
	 * @param arg
	 * @return void
	 */
	public void solve(Object[] arg) {
		
		double max = (Integer)arg[0];
		double odd = 1;
		double even = 2;
		double fibonacci = 0;
		double evenSum = even;
		double idx = 1;
		
		System.out.print(odd + " " + even + " ");
		while(fibonacci < max) {
			fibonacci = odd + even;
			if(fibonacci > max) {
				break;
			}
			System.out.print(fibonacci + " ");
			if(idx++ % 2 == 1) {
				odd = fibonacci;
			} else {
				even = fibonacci;
				evenSum += even;
			}
		}
		
		System.out.println();
		System.out.println("evenSum : " + evenSum);
	}
	
	public static void main(String[] args) {
//		EvenFibonacci evenFibonacci = new EvenFibonacci();
//		evenFibonacci.solve(new Object[]{100});
//		evenFibonacci.solve(new Object[]{4000000});
//		
//		Multiples35 multiple = new Multiples35();
//		multiple.solve(new Object[]{10, 3, 5});
//		multiple.solve(new Object[]{1000, 3, 5});
		
//		Solution sol = new EvenFibonacci();
//		sol.solve(new Object[]{100});
//		
//		sol = new Multiples35();
//		sol.solve(new Object[]{10, 3, 5});
		
		printObject(new EvenFibonacci());
		printObject(new Multiples35());
	}
	
	public static void printObject(Solution sol) {
		sol.solve(new Object[]{100}); 
		
	}	
}

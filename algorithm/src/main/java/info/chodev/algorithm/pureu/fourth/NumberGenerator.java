package info.chodev.algorithm.pureu.fourth;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/challenge_codes/135
 * 
 * x만큼 간격이 있는 n개의 숫자
 * 
 * @author pureu
 * @since 2017.11.15
 *
 */
public class NumberGenerator {
	
	/**
	 * x만큼 간격이 있는 n개의 숫자
	 * 
	 * @param x
	 * @param n
	 * @return
	 */
	public int[] getNumberGenerator(int x, int n) {
		int[] array = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i] = x * (i+1);
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		NumberGenerator numberGenerator = new NumberGenerator();
		System.out.println(Arrays.toString(numberGenerator.getNumberGenerator(2, 5)));
		System.out.println(Arrays.toString(numberGenerator.getNumberGenerator(4, 3)));
	}
}

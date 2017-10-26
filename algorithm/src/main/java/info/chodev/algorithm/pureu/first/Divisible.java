package info.chodev.algorithm.pureu.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 나누어 떨어지는 숫자 배열
 * 
 * @author pureu
 * @since 2017.10.25
 *
 */
public class Divisible {

	/**
	 * 나누어 떨어지는 숫자 배열
	 * @param int[] array
	 * @param int divisor
	 * @return int[]
	 */
	public int[] divisible(int[] array, int divisor) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i:array) {
			if(i % divisor == 0) {
				list.add(i);
			}
		}
		return ArrayUtils.toPrimitive(list.toArray(new Integer[list.size()]));
	}

	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = {5, 9, 7, 10};
		System.out.println( Arrays.toString( div.divisible(array, 5) ));
	}
}

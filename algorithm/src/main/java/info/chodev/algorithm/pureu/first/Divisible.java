package info.chodev.algorithm.pureu.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

/**
 * https://programmers.co.kr/learn/challenge_codes/89
 * 
 * 나누어 떨어지는 숫자 배열
 * 
 * divisible 메소드는 int형 배열 array와 int divisor를 매개변수로 받습니다.
 * array의 각 element 중 divisor로 나누어 떨어지는 값만 포함하는 새로운 배열을 만들어서 반환하도록 divisible에 코드를 작성해 보세요.
 * 예를들어 array가 {5, 9, 7, 10}이고 divisor가 5이면 {5, 10}을 리턴해야 합니다.
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

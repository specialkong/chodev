package info.chodev.algorithm.seohae.fourth;

import java.util.Arrays;

/**
 * x만큼 간격이 있는 n개의 숫자
 * @author seohae
 * @since 2017.11.13
 */

/*
number_generator함수는 x와 n을 입력 받습니다.
2와 5를 입력 받으면 2부터 시작해서 2씩 증가하는 숫자를 5개 가지는 리스트를 만들어서 리턴합니다.
[2,4,6,8,10]

4와 3을 입력 받으면 4부터 시작해서 4씩 증가하는 숫자를 3개 가지는 리스트를 만들어서 리턴합니다.
[4,8,12]

이를 일반화 하면 x부터 시작해서 x씩 증가하는 숫자를 n개 가지는 리스트를 리턴하도록 함수 number_generator를 완성하면 됩니다.
 */
public class Interval {
	
	/**
	 * 간격에 맞는 배열생성
	 * @param a
	 * @param n
	 * @return
	 */
	public int[] result(int a, int n){
		int[] result = new int[n];
		
		result[0] = a;
		
		for(int i = 1; i<n; i++){
			result[i] = result[i-1]+a;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Interval interval = new Interval();
		
		System.out.println(Arrays.toString(interval.result(2,5)));
		System.out.println(Arrays.toString(interval.result(4,3)));
	}
}

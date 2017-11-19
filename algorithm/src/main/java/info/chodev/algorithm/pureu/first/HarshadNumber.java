package info.chodev.algorithm.pureu.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://programmers.co.kr/learn/challenge_codes/130
 * 
 * 하샤드 수를 구한다.
 * 
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
 * Harshad함수는 양의 정수 n을 매개변수로 입력받습니다. 이 n이 하샤드수인지 아닌지 판단하는 함수를 완성하세요.
 * 예를들어 n이 10, 12, 18이면 True를 리턴 11, 13이면 False를 리턴하면 됩니다.
 *
 * https://programmers.co.kr/learn/challenge_codes/117
 * 
 * 자연수를 뒤집어 리스트로 만들기 
 * 
 * digit_reverse함수는 양의 정수 n을 매개변수로 입력받습니다.
 * n을 뒤집어 숫자 하나하나를 list로 표현해주세요
 * 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴하면 됩니다.
 * 
 * @author pureu
 * @since 2017.10.22
 *
 */
public class HarshadNumber {

	/**
	 * 하샤드 수를 구한다.
	 * 
	 * @param int num
	 * @return boolean
	 */
	public boolean isHarshad(int num) {
		List<Integer> list = getPosition(num, false);
		int sumPosition = 0;
		
		for(int i=0;i<list.size();i++) {
			sumPosition += list.get(i);
		}
		
		if(num % sumPosition == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 뒤집어서 자릿수를 구한다.
	 * 
	 * @param int num
	 * @return List<Integer>
	 */
	public List<Integer> getPosition(int num) {
		return getPosition(num, true);
	}
	
	/**
	 * 자릿수를 구한다.
	 * 
	 * @param int num
	 * @param boolean direction false : reverse
	 * @return List<Integer>
	 */
	public List<Integer> getPosition(int num, boolean direction) {
		List<Integer> list = new ArrayList<Integer>();
		
		do {
			int divisor = num / 10;
			int mod = num % 10;
			list.add(mod);
			num = divisor;
			
		} while(num > 0);
		
		if(!direction) {
			Collections.reverse(list);
			System.out.println(Arrays.toString(list.toArray()));
		}
		return list;
	}
	
	public static void main(String[] args) {
		HarshadNumber harshadNumber = new HarshadNumber();
		System.out.println(harshadNumber.isHarshad(10));
		System.out.println(harshadNumber.isHarshad(12));
		System.out.println(harshadNumber.isHarshad(18));
		System.out.println(harshadNumber.isHarshad(11));
		System.out.println(harshadNumber.isHarshad(13));
		System.out.println();
		System.out.println("reverse");
		System.out.println(harshadNumber.getPosition(12345));
		System.out.println(harshadNumber.getPosition(56789));
	}

}

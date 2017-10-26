package info.chodev.algorithm.pureu.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 하샤드 수를 구한다.
 * 자연수를 뒤집어 리스트로 만든다.
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

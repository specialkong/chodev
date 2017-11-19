package info.chodev.algorithm.pureu.fifth;

import java.util.List;

import info.chodev.algorithm.pureu.first.HarshadNumber;

/**
 * https://programmers.co.kr/learn/challenge_codes/116
 * 
 * 자릿수 더하기
 * 
 * sum_digit함수는 자연수를 전달 받아서 숫자의 각 자릿수의 합을 구해서 return합니다.
 * 예를들어 number = 123이면 1 + 2 + 3 = 6을 return하면 됩니다.
 * 
 * @author pureu
 * @since 2017.11.20
 *
 */
public class SumDigit {

	private HarshadNumber harshadNumber = new HarshadNumber();
	
	public int getSumDigit(int n) {
		int sum = 0;
		List<Integer> position = harshadNumber.getPosition(n);
		for(Integer i:position) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		SumDigit sumDigit = new SumDigit();
		System.out.println(sumDigit.getSumDigit(123));
	}

}

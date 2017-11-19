package info.chodev.algorithm.pureu.fifth;

import info.chodev.algorithm.pureu.first.Collatz;

/**
 * https://programmers.co.kr/learn/challenge_codes/123
 * 
 * 짝수와 홀수
 * 
 * evenOrOdd 메소드는 int형 num을 매개변수로 받습니다.
 * num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하도록 evenOrOdd에 코드를 작성해 보세요.
 * num은 0이상의 정수이며, num이 음수인 경우는 없습니다.
 * 
 * @author pureu
 * @since 2017.11.20
 *
 */
public class EvenOrOdd {

	private Collatz collatz = new Collatz();
	
	public String checkEvenOdd(int n) {
		
		if(collatz.isEven(n)) {
			return "Even";
		} else {
			return "Odd";
		}
	}
	
	public static void main(String[] args) {
		EvenOrOdd evenOrOdd = new EvenOrOdd();
		System.out.println(evenOrOdd.checkEvenOdd(3));
		System.out.println(evenOrOdd.checkEvenOdd(2));
	}

}

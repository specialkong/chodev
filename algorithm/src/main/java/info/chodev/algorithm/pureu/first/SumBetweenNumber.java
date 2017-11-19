package info.chodev.algorithm.pureu.first;

/**
 * https://programmers.co.kr/learn/challenge_codes/92
 * 
 * 두 정수 사이의 합을 구한다.
 * 
 * adder함수는 정수 a, b를 매개변수로 입력받습니다.
 * 두 수와 두 수 사이에 있는 모든 정수를 더해서 리턴하도록 함수를 완성하세요. a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
 * 예를들어 a가 3, b가 5이면 12를 리턴하면 됩니다.
 * a, b는 음수나 0, 양수일 수 있으며 둘의 대소 관계도 정해져 있지 않습니다.
 * 
 * @author pureu
 * @since 2017.10.22
 *
 */
public class SumBetweenNumber {

	/**
	 * 두 정수 사이의 합을 구한다.
	 * 
	 * @param int a
	 * @param int b
	 * @return int
	 */
	public int adder(int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		int sum = 0;
		
		for(int i=min;i<=max;i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		SumBetweenNumber sumBetweenNumber = new SumBetweenNumber();
		System.out.println(sumBetweenNumber.adder(3,5));
		System.out.println(sumBetweenNumber.adder(-3,5));
	}

}

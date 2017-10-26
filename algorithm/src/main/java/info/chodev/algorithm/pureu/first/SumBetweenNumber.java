package info.chodev.algorithm.pureu.first;

/**
 * 두 정수 사이의 합을 구한다.
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

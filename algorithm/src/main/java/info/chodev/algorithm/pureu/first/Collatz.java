package info.chodev.algorithm.pureu.first;

/**
 * 콜라츠 추측
 * 
 * @author pureu
 * @since 2017.10.26
 *
 */
public class Collatz {

	/**
	 * 콜라츠 추측
	 * 
	 * @param int num
	 * @return int
	 */
	public int collatz(int num) {
		int answer = 0;
		
		while(num > 1) {
			if(isEven(num)) {
				num /= 2;
			} else {
				num *= 3;
				num += 1;
			}
			answer++;
			
			if(answer == 500) {
				break;
			}
		}
		
		return answer;
	}
	
	/**
	 * 짝수 체크한다.
	 * 
	 * @param String word
	 * @return boolean
	 */
	public boolean isEven(int num) {
		return num % 2 == 0;
	}

	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 6;
		System.out.println(c.collatz(ex));
	}
}

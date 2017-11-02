package info.chodev.algorithm.pureu.second;

/**
 * 피보나치 수 피보나치 수는 F(0) = 0, F(1) = 1일 때, 2 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가
 * 적용되는 점화식입니다. 2 이상의 n이 입력되었을 때, fibonacci 함수를 제작하여 n번째 피보나치 수를 반환해 주세요. 예를 들어
 * n = 3이라면 2를 반환해주면 됩니다.
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * @author pureu
 * @since 2017.10.29
 *
 */
public class Fibonacci {

	/**
	 * 피보나치 수를 구한다.
	 * 홀수, 짝수 관계를 이용한다.
	 * 
	 * @param int n
	 * @return int
	 */
	public int fibonacci(int n) {
		int odd = 1;
		int even = 2;
		int fibonacci = 0;
		
		if(n == 1) {
			return odd;
		}
		
		if(n == 2) {
			return even;
		}
		
		int idx = 3;
		while (idx <= n) {
			fibonacci = odd + even;

			if (idx++ % 2 == 1) {
				odd = fibonacci;
			} else {
				even = fibonacci;
			}
		}
		return fibonacci;
	}
	
	/**
	 * 피보나치 수를 구한다.
	 * 재귀용법을 사용한다.
	 * 
	 * @param int n
	 * @return int
	 */
	public int fibonacciBySelf(int n) {
		if(n == 1) {
			return 1;
		} else if(n == 2) {
			return 2;
		} else {
			return fibonacciBySelf(n - 1) + fibonacciBySelf(n - 2);
		}
	}

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		System.out.println("case 1");
		System.out.println(fibonacci.fibonacci(1));
		System.out.println(fibonacci.fibonacci(2));
		System.out.println(fibonacci.fibonacci(3));
		System.out.println(fibonacci.fibonacci(4));
		System.out.println(fibonacci.fibonacci(5));
		System.out.println(fibonacci.fibonacci(6));
		System.out.println("case 2");
		System.out.println(fibonacci.fibonacciBySelf(1));
		System.out.println(fibonacci.fibonacciBySelf(2));
		System.out.println(fibonacci.fibonacciBySelf(3));
		System.out.println(fibonacci.fibonacciBySelf(4));
		System.out.println(fibonacci.fibonacciBySelf(5));
		System.out.println(fibonacci.fibonacciBySelf(6));

	}
}

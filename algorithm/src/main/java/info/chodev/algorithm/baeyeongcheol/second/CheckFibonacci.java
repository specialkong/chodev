package info.chodev.algorithm.baeyeongcheol.second;

public class CheckFibonacci {

	public int fibonacci(int n) {
		
		if(n == 0) {
			return 0;
		}else if(n == 1 || n == 2) {
			return 1;
		} else {
			n = fibonacci(n-1) + fibonacci(n-2);
		}
		return n;
	}
	
	public static void main(String[] args) {
		CheckFibonacci fibonacci = new CheckFibonacci();
		System.out.println(fibonacci.fibonacci(4));
	}
	
}

package study.chodev.pureu.problem.week2;

public class EvenFibonacci {

	public void process(Object[] arg) {
		
		int max = (Integer)arg[0];
		int odd = 1;
		int even = 2;
		int fibonacci = 0;
		int evenSum = even;
		int idx = 1;
		
		System.out.print(odd + " " + even + " ");
		while(fibonacci < max) {
			fibonacci = odd + even;
			if(fibonacci > max) {
				break;
			}
			System.out.print(fibonacci + " ");
			if(idx++ % 2 == 1) {
				odd = fibonacci;
			} else {
				even = fibonacci;
				evenSum += even;
			}
		}
		
		System.out.println();
		System.out.println("evenSum : " + evenSum);
	}
	
	public static void main(String[] args) {
		EvenFibonacci evenFibonacci = new EvenFibonacci();
		evenFibonacci.process(new Object[]{100});
		evenFibonacci.process(new Object[]{4000000});
	}
}

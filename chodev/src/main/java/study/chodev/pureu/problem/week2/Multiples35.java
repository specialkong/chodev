package study.chodev.pureu.problem.week2;

public class Multiples35 {

	public void process(Object[] arg) {
		
		int max = (Integer)arg[0];
		int arg1 = (Integer)arg[1];
		int arg2 = (Integer)arg[2];
		int sum = 0;
		
		for(int i=1;i<max;i++) {
			if(isMultiple(i, arg1)) {
				System.out.print(i + " ");
				sum += i;
			} else if(isMultiple(i, arg2)) {
				System.out.print(i + " ");
				sum += i;
			}
			if(i % 100 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println("sum : " + sum);
	}
	
	public boolean isMultiple(int num, int devider) {
		if(num % devider == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Multiples35 multiple = new Multiples35();
		multiple.process(new Object[]{10, 3, 5});
		multiple.process(new Object[]{1000, 3, 5});
		
	}
}

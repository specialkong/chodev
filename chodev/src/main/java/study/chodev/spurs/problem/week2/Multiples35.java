package study.chodev.spurs.problem.week2;


/*If we list all the natural numbers below 10 that are multiples of 3 or 5, 
we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.*/

public class Multiples35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s3,s5;
		
		int sum3=0;
		for(int i=1; 3*i<1000; i++){
			s3=3*i;
			System.out.println("3의 배수 : "+s3);
			sum3=sum3+s3;
		}
		System.out.println("3의 배수 합 : "+sum3);
		
		int sum5=0;
		for(int i=1; 5*i<1000; i++){
			s5=5*i;
			System.out.println("5의 배수 : "+s5);
			sum5=sum5+s5;
		}
		System.out.println("5의 배수 합 : "+sum5);
		
		System.out.println("모든 합 : "+(sum3+sum5));
		
	}
}

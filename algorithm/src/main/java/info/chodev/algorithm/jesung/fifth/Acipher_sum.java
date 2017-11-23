package info.chodev.algorithm.jesung.fifth;

import java.util.ArrayList;
import java.util.List;

/*
 * 
sum_digit함수는 자연수를 전달 받아서 숫자의 각 자릿수의 합을 구해서 return합니다.
예를들어 number = 123이면 1 + 2 + 3 = 6을 return하면 됩니다.
sum_digit함수를 완성해보세요.
 */
public class Acipher_sum {

	public int event(int[] num){
		int sum=0;
		for(int i=0; i<num.length;i++) {
			sum+=num[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Acipher_sum re = new Acipher_sum();
		int[] numbers = {1,2,3};
		int[] numbers1 = {1,3,5};
		System.out.println(re.event(numbers));	
		System.out.println(re.event(numbers1));
	}
}

package hanyeontak.second;

import java.util.Scanner;
/**
 * 문제 설명 
 * evenOrOdd 메소드는 int형 num을 매개변수로 받습니다.
 * num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하도록 evenOrOdd에 코드를 작성해 보세요.
 * num은 0이상의 정수이며, num이 음수인 경우는 없습니다.
 * @author 한연탁
 *
 */

public class EvenOrOdd {
	String evenOrOdd(int num) {//num은 0 이상의 정수임을 어떻게 표현하는지 몰겠다.
		String result= "";
		
        if(num % 2 == 0){
        	result= "짝";
        }else{
        	result= "홀";
        }
        return result;
	}       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "1 2 3 4";
		 Scanner sc= new Scanner(str);
		 int a= sc.nextInt();
		 int b= sc.nextInt();
		 int c= sc.nextInt();
		 int d= sc.nextInt();
		 	 
	        EvenOrOdd e = new EvenOrOdd();
	        //아래는 테스트로 출력해 보기 위한 코드입니다.
	        System.out.println("결과 :" + e.evenOrOdd(a));
	        System.out.println("결과 :" + e.evenOrOdd(b));
	        System.out.println("결과 :" + e.evenOrOdd(c));
	        System.out.println("결과 :" + e.evenOrOdd(d));
	}

}

package info.chodev.algorithm.kimseohae.first;

import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for(int i = 1; i<a+1; i++){ //i는 1부터 (입력된 값의 +1 = 입력된값 줄수)
        	for(int j = i; j>0; j--){ //별을 출력해주기위함(별의 개수 = 1 -2-3-4-...)
	        	System.out.print("*");
        	}
        	System.out.println(); //별 출력이 끝나면 enter처리.
        }
        
    }
}
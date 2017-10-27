package info.chodev.algorithm.kimseohae.first;

import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 1;
        
        //짝수면 2를 나누고 홀수면 3을 곱하고 +1
        while(num != 1){
        	
	        if(num % 2 == 0){
	        	num = num / 2;
	        	n++;
	        }
	        
	        if(num % 2 != 0){
	        	num = num * 3 + 1;
	        	n++;
	
	        }

	        if(n>500){
	        	System.out.println("-1");
	        	return;
	        }
        }
        
        System.out.println(n);
    }
}
package info.chodev.algorithm.seohae.first;

import java.util.Scanner;

public class SumBetweenNumber {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int min = 0;
        int max = 0;
        
        int result = 0;
        
        if(a < b){
        	min = a;
        	max = b;
        } else{
        	min = b;
        	max = a;
        }
        for(int i = min; i < max+1; i++){
        	result +=i;
        }
        
        System.out.println(result);
        
    }
}
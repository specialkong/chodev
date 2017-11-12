package info.chodev.algorithm.seohae.first;

import java.util.Scanner;

public class DivisorMultiple {
    public static void gcdlcm(int a, int b, int max) {
        int result = 1;
        
        for(int i = 1; i <= max; i++){
        	if(a % i == 0 && b % i ==0){
        		a = a / i;
        		b = b / i;
        		result = result * i;
        	}
        }
        
        System.out.println("["+result+","+result * a * b+"]");
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int max = 0;
        
        if(a<b){
        	max = a;
        } else{
        	max = b;
        }
        
        gcdlcm(a,b,max);
    }
}


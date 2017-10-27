package info.chodev.algorithm.kimseohae.first;

import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        String su = "수";
        String bag = "박";
        
        String result = "";
        
        for(int i = 0; i < a; i++ ){
        	
        	if(i % 2 == 0){
        		//짝수이면, "수"
        		result += su;
        	}
        	
        	if(i % 2 != 0){
        		//홀수이면, "박"
        		result += bag;
        	}
        }
        
        System.out.println(result);
        
    }
}
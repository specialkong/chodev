package info.chodev.algorithm.kimseohae.first;

import java.util.Scanner;

public class MiddleString {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
       
        
        int result = 0;
        
        if(a.length() % 2 == 0){
        	result = a.length() / 2;
        	
        	System.out.println(a.substring(result-1, result) + a.substring(result, result+1));
        } else {
        	result = a.length() / 2;
        	
        	System.out.println(a.charAt(result));
        }
        
        
    }
}
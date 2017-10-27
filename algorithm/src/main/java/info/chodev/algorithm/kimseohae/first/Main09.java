package info.chodev.algorithm.kimseohae.first;

import java.util.Scanner;

public class Main09 {
    public static void gcdlcm(int a, int b, int max) {
       
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        
        String[] array = a.split(" ");
        int[] numberArray = new int[array.length];
        
        int max = 0;
        int min = 0;
        
        for(int i=0;i<array.length;i++){
        	numberArray[i] = Integer.parseInt(array[i]);
        }
        
        for(int i=0;i<numberArray.length;i++){
        	if(max < numberArray[i]){
        		max = numberArray[i];
        	}
        	if(min == 0 && min < numberArray[i]){
        		min = numberArray[i];
        	}
        	if(min != 0 && min > numberArray[i]){
        		min = numberArray[i];
        	}
        }
        
        System.out.println(min +"," +  max);

    }
}
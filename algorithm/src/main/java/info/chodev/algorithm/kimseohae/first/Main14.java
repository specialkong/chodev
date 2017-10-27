package info.chodev.algorithm.kimseohae.first;

import java.util.Arrays;
import java.util.Scanner;

public class Main14 {
    public static void gcdlcm(int a, int b, int max) {
       
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(); //숫자 입력
        int b = sc.nextInt(); //나눠지는지 확인할 숫자 입력
        
        String[] array = a.split(" "); //배열화
        int[] numberArray = new int[array.length]; //정수형 배열 선언
        int[] result = new int[array.length]; //결과저장할 배열
        String ptin = "";//결과저장 중 0을 제외하고 저장할 배열
        
        for(int i=0;i<array.length;i++){
        	numberArray[i] = Integer.parseInt(array[i]); //배열을 정수형 배열로 저장
        }
        
        for(int i = 0; i<numberArray.length; i++){
        	if(numberArray[i] % b == 0){
        		result[i] = numberArray[i];
        	}
        }
        System.out.println(Arrays.toString(result));
    }
}
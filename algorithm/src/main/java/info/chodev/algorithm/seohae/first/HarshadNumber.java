package info.chodev.algorithm.seohae.first;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(); //ex)12345 입력
        String val = "";
        int c = 0; //
        int result = 0; //결과를담을것
        
        for(int i=0;i<a.length();i++){ //입력된 문자열의 길이만큼 반복
    		String b =  String.valueOf(a.charAt(i)); //문자열의 문자 하나하나를 뽑아, 변수 b에 저장
    		c = Integer.parseInt(b); //int형으로 변환하여 int형 변수 c에 저장
    		result += c;
        }
        
        if(result % a.length() == 0){ //나눠떨어지면
        	System.out.println(true); //하이드수다
        }
        
        if(result % a.length() != 0){ //나눠서안떨어지면
        	System.out.println(false); //하이드수가 아니다
        }
        
    }
}


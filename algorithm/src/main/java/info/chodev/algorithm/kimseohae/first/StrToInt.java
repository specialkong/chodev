package info.chodev.algorithm.kimseohae.first;

import java.util.Scanner;

public class StrToInt {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(); //ex)12345 입력
        String val = "";
        int c = 0;
        
        for(int i=0;i<a.length();i++){ //입력된 문자열의 길이만큼 반복
        	if(String.valueOf(a.charAt(i)) == "-"){
        		val = "-";
        	}
        	
        	if(String.valueOf(a.charAt(i)) != "-"){
        		String b =  String.valueOf(a.charAt(i)); //문자열의 문자 하나하나를 뽑아, 변수 b에 저장
        		c = Integer.parseInt(b); //int형으로 변환하여 int형 변수 c에 저장
        	}
        }
        System.out.print(val+c);
    }
}
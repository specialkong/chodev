package info.chodev.algorithm.kimseohae.first;

import java.util.Random;
import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("seoul 안에 있는 사람 이름을 입력하세요. ,으로 구분합니다.");
        String seoul = sc.nextLine();
        
        String[] arr = seoul.split(",");
        
        Random r = new Random();   
        
        int kim = r.nextInt(arr.length+1);
        
        for(int i = 0; i<kim+1; i++){
        	if(i == kim){
        		arr[i] = "Kim";
        	}
        }
        
        for(int j = 0; j<arr.length; j++){
        	if(arr[j] == "Kim"){
        		System.out.println("김서방은 " + j +" 위치에 있습니다.");
        	}
        }
    }
}
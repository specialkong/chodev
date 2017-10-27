package info.chodev.algorithm.kimseohae.first;

import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] array = new String[a.length()];
        
        for(int i = 0; i<a.length(); i++){
        	array = a.split(""); //배열에 다 담고
        	if(i >= a.length() - 4){ //배열의 길이로 맨 뒷자리 4개를 정해서
        		System.out.print(array[i]); //보여주고
        	} else{ //그밖에 앞에 숫자들은 모두 비밀로 안보이게
        		System.out.print("*");
        	}
        }
    }
}
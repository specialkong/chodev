package info.chodev.algorithm.seohae.sixth;

import java.util.Arrays;

/**
 * 사진처럼 출력하기
 * @author seohae
 * @since 2017.11.27
 */
public class Picture {
	
	/**
	 * n x n
	 * @param a
	 * @param b
	 */
	public void Write(int a, int b){
		
		for(int i = 1; i<a+1; i++){ 
			int num = 2;
		
        	for(int j = i; j>0; j--){ 
	        	System.out.print(num++);
        	}
        	for(int z = 1; z<b-i+1; z++){
        		System.out.print(0);
        	}
        	System.out.println(); 
        }
	}

	public static void main(String[] args) {
		Picture picture = new Picture();
		int a = 5;
		int b = 5;
		picture.Write(a, b);
	}
}

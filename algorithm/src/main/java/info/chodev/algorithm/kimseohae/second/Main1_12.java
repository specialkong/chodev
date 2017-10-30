package info.chodev.algorithm.kimseohae.second;

import static org.hamcrest.CoreMatchers.containsString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 문자열 다루기 기본
 * 
 * @author 서해
 * @since 2017.10.30
 *
 */
public class Main1_12 {
	/**
	 * 입력받은 string 변수 숫자인지 확인
	 * @param String
	 * @return boolean
	 */
	public boolean numberCheck(String line) {
    		if(isStringDouble(line)){
    			return true;
    		} else{
    			return false;
    		}
	}
	
	/**
	 * 문자열 숫자인지 확인 함수
	 * @param String
	 * @return boolean
	 */
	public static boolean isStringDouble(String s) {
	    try {
	        Double.parseDouble(s);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	  }
	
	public static void main(String[] args) {
		Main1_12 str = new Main1_12();
		Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
		System.out.println(str.numberCheck(a));
	}
}


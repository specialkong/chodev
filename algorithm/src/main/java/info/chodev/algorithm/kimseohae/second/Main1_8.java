package info.chodev.algorithm.kimseohae.second;

import java.util.Arrays;

/**
 * 같은 숫자는 싫어
 * @author seohae
 * @since 2017.10.31
 *
 */
public class Main1_8 {
	
	/**
	 * 같은숫자는 싫어_문자열에서 검사
	 * @param String test
	 * @return String[]
	 */
	public String[] checkTest(String test){
		
		//첫번째 숫자는 앞 숫자와 겹치는 경우가 없으니 무조건 저장한다
		String resultOk = String.valueOf(test.charAt(0));
		
		//문자열에서 중복검사를 하자
		for(int i = 1; i<test.length(); i++){
			if(!String.valueOf(test.charAt(i-1)).equals(String.valueOf(test.charAt(i)))){ //i-1(이전 요소)와 i(현재 요소)가 다르면,
				resultOk +=  String.valueOf(test.charAt(i)); //중복이 없으므로 저장
			}
		}
		
		String[] result= check(resultOk); 
		return result;
	}
	
	/**
	 * 받은 문자열을 배열화
	 * @param String a
	 * @return String[]
	 */
	public String[] check(String a){
		String[] check = new String[a.length()];
		
		for(int i=0;i<a.length();i++){ //여기서 문자열 a는 중복을 제거한 후의 문자열인데,
			check[i] =  String.valueOf(a.charAt(i)); //이 문자열을 배열에 저장한다
		}
		
		return check;
	}
	
	public static void main(String[] args) {
		Main1_8 likes = new Main1_8();
		
		String a = "133334";
		String b = "12253241";
		String c = "11111111115";
		
		System.out.println(Arrays.toString(likes.checkTest(a)));
		System.out.println(Arrays.toString(likes.checkTest(b)));
		System.out.println(Arrays.toString(likes.checkTest(c)));
	}
}

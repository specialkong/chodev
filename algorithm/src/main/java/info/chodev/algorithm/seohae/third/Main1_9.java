package info.chodev.algorithm.seohae.third;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 문자열 내림차순으로 배치하기
 * @author seohae
 * @since 2017.11.06
 *
 */
public class Main1_9 {
	
	/**
	 * 받은 문자열을 배열화
	 * @param String a
	 * @return void
	 */
	public void check(String a){
		String[] check = new String[a.length()];
		
		for(int i=0;i<a.length();i++){ //여기서 문자열 a는 중복을 제거한 후의 문자열인데,
			check[i] =  String.valueOf(a.charAt(i)); //이 문자열을 배열에 저장한다
		}
		
		reverseStr(check);
	}
	
	/**
	 * 내림차순
	 * @param String[] str
	 * @return void
	 */
	public void reverseStr(String[] str){
		Arrays.sort(str, String.CASE_INSENSITIVE_ORDER); //정렬
		ArrayUtils.reverse(str);

		arrayToString(str);
	}
	
	/**
	 * 배열을 다시 문자열로
	 * @param String[] str
	 * @return void
	 */
	public void arrayToString(String[] str){
		String result = "";
		
		for(int i = 0; i<str.length; i++){
			result+=str[i];
		}
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Main1_9 rs = new Main1_9();
		rs.check("Zbcdefg");
	}
}

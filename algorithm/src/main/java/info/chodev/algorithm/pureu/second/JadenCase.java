package info.chodev.algorithm.pureu.second;

import org.apache.commons.lang3.StringUtils;

/**
 * JadenCase 문자열 만들기
 * Jaden_Case함수는 문자열 s을 매개변수로 입력받습니다.
 * s에 모든 단어의 첫 알파벳이 대문자이고, 그 외의 알파벳은 소문자인 문자열을 리턴하도록 함수를 완성하세요
 * 예를들어 s가 "3people unFollowed me for the last week"라면 "3people Unfollowed Me For The Last Week"를 리턴하면 됩니다.
 * 
 * @author pureu
 * @since 2017.10.29
 *
 */
public class JadenCase {

	/**
	 * JadenCase 문자열 만들기
	 * 
	 * @param String s
	 * @return String
	 */
	public String jadenCase(String s) {
		String[] array = s.split(" ");
		for(int i=0;i<array.length;i++) {
			array[i] = array[i].replace(array[i].charAt(0), Character.toUpperCase(array[i].charAt(0)));
		}
		return StringUtils.join(array, " ");
	}
	
	public static void main(String[] args) {
		JadenCase jadenCase = new JadenCase();
		System.out.println(jadenCase.jadenCase("3people unFollowed me for the last week"));
	}
}

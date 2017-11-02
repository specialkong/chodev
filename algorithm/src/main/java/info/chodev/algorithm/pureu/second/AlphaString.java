package info.chodev.algorithm.pureu.second;

import org.apache.commons.lang3.StringUtils;

/**
 * 문자열 다루기 기본
 * alpha_string46함수는 문자열 s를 매개변수로 입력받습니다.
 * s의 길이가 4혹은 6이고, 숫자로만 구성되있는지 확인해주는 함수를 완성하세요.
 * 예를들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다
 * 
 * @author pureu
 * @since 2017.11.01
 *
 */
public class AlphaString {

	/**
	 * 문자열 다루기1
	 * 
	 * @param String s
	 * @return boolean
	 * @see StringUtils
	 */
	public boolean alphaString461(String s) {
		return StringUtils.isNumeric(s) && (s.length() == 4 || s.length() == 6);
	}
	
	/**
	 * 문자열 다루기2
	 * 
	 * @param String s
	 * @return boolean
	 */
	public boolean alphaString462(String s) {
		boolean isNumeric = true;
		for(char c:s.toCharArray()) {
			if(c < '1' || c > '9') {
				isNumeric = false;
				break;
			}
		}
		return isNumeric && (s.length() == 4 || s.length() == 6);
	}
	
	/**
	 * 문자열 다루기3
	 * 정규식 이용
	 * 
	 * @param String s
	 * @return boolean
	 */
	public boolean alphaString463(String s) {
		return s.matches("^[0-9]*$") && (s.length() == 4 || s.length() == 6);
	}
	
	/**
	 * 문자열 다루기4
	 * 정규식 이용
	 * 
	 * @param String s
	 * @return boolean
	 */
	public boolean alphaString464(String s) {
		return s.matches("^[0-9]{4}$") || s.matches("^[0-9]{6}$");
	}
	
	/**
	 * 문자열 다루기5
	 * 정규식 이용
	 * 
	 * @param String s
	 * @return boolean
	 */
	public boolean alphaString465(String s) {
		return s.matches("\\d{4}") || s.matches("\\d{6}$");
	}
	
	public static void main(String[] args) {
		AlphaString alphaString = new AlphaString();
		System.out.println("-----> 1");
		System.out.println(alphaString.alphaString461("a234"));
		System.out.println(alphaString.alphaString461("a23456"));
		System.out.println(alphaString.alphaString461("1234"));
		System.out.println(alphaString.alphaString461("123456"));
		System.out.println("-----> 2");
		System.out.println(alphaString.alphaString462("a234"));
		System.out.println(alphaString.alphaString462("a23456"));
		System.out.println(alphaString.alphaString462("1234"));
		System.out.println(alphaString.alphaString462("123456"));
		System.out.println("-----> 3");
		System.out.println(alphaString.alphaString463("a234"));
		System.out.println(alphaString.alphaString463("a23456"));
		System.out.println(alphaString.alphaString463("1234"));
		System.out.println(alphaString.alphaString463("123456"));
		System.out.println("-----> 4");
		System.out.println(alphaString.alphaString464("a234"));
		System.out.println(alphaString.alphaString464("a23456"));
		System.out.println(alphaString.alphaString464("1234"));
		System.out.println(alphaString.alphaString464("123456"));
		System.out.println("-----> 5");
		System.out.println(alphaString.alphaString465("a234"));
		System.out.println(alphaString.alphaString465("a23456"));
		System.out.println(alphaString.alphaString465("1234"));
		System.out.println(alphaString.alphaString465("123456"));
	}

}

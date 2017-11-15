package info.chodev.algorithm.seohae.second;

import java.util.StringTokenizer;

/**
 * JadenCase 문자열 만들기
 * @author seohae
 * @since 2017.10.30
 *
 */
public class Main2_11 {
	
	/**
	 * 문자열 받고 대문자로 변환
	 * @param String result
	 * @return String
	 */
	public String jadencase(StringTokenizer result){
		String sentence = ""; //받아온 문장
		String sum = ""; //결과를 저장할 문장
		
		while(result.hasMoreElements()){ //받아온 문장의 토큰이 없을떄까지
			sentence = result.nextToken(); //토큰을 sentence에 저장
			//토큰의 (0,1): 첫글자를 대문자로바꿔주고(toUpperCase), 1부터 나머지 문자들은 소문자로!!
			sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1, sentence.length()).toLowerCase();
			
			sum = sum + " " +sentence;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		StringTokenizer a = new StringTokenizer("hello world");
		StringTokenizer b = new StringTokenizer("wondergirs diffrent two");
		StringTokenizer c = new StringTokenizer("2girs diffrent two");
		StringTokenizer d = new StringTokenizer("diFFRENT two");
		
		Main2_11 Jadencase = new Main2_11();
		
		System.out.println(Jadencase.jadencase(a));
		System.out.println(Jadencase.jadencase(b));
		System.out.println(Jadencase.jadencase(c));
		System.out.println(Jadencase.jadencase(d));
	}
}

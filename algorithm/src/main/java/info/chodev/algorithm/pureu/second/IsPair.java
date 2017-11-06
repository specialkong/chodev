package info.chodev.algorithm.pureu.second;

/**
 * 괄호 확인하기
 * is_pair함수는 문자열 s를 매개변수로 입력받습니다.
 * s에 괄호가 알맞게 짝지어져 있으면 True를 아니면 False를 리턴하는 함수를 완성하세요.
 * 예를들어 s가 "(hello)()"면 True이고, ")("이면 False입니다.
 * s가 빈 문자열("")인 경우는 없습니다.
 * 
 * @author pureu
 * @since 2017.10.30
 *
 */
public class IsPair {

	/**
	 * 괄호 확인하기
	 * 
	 * @param String s
	 * @return boolean
	 */
	public boolean isPair(String s) {
		int n = 0;
		for(char c:s.toCharArray()) {
			if(c == '(') {
				n++;
			} else if(c == ')') {
				n--;
			}
			if(n < 0) {
				break;
			}
		}
		if(n >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		IsPair isPair = new IsPair();
		System.out.println(isPair.isPair("(hello)()"));
		System.out.println(isPair.isPair(")("));
	}
}

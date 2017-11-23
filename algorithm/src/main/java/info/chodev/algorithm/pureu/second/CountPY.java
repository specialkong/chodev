package info.chodev.algorithm.pureu.second;

/**
 * https://programmers.co.kr/learn/challenge_codes/96
 * 
 * 문자열 내 p와 y의 개수
 * 
 * numPY함수는 대문자와 소문자가 섞여있는 문자열 s를 매개변수로 입력받습니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면
 * True, 다르면 False를 리턴하도록 함수를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 예를들어
 * s가 "pPoooyY"면 True를 리턴하고 "Pyy"라면 False를 리턴합니다.
 * 
 * @author pureu
 * @since 2017.10.29
 *
 */
enum Type {
	UPPER, LOWER
}

public class CountPY {

	/**
	 * 문자열 내 p와 y의 개수를 구한다.
	 * 대소 문자 구분 없이 구한다.
	 * 
	 * @param String s
	 * @return boolean
	 */
	public boolean isEqualCountPY(String s) {
		return getCount(s, 'p') == getCount(s, 'y');
	}
	
	/**
	 * 문자열 내 p와 y의 개수를 구한다.
	 * 대소문자 구분한다.
	 * 
	 * @param String s
	 * @param Type t
	 * @see Type
	 * @return
	 */
	public boolean isEqualCountPY(String s, Type t) {
		return getCount(s, 'p', t) == getCount(s, 'y', t);
	}

	/**
	 * 대소문자 구분 없이 문자의 개수를 센다.
	 * @param String s
	 * @param char p
	 * @return
	 */
	public int getCount(String s, char p) {
		int count = 0;
		for(char c:s.toCharArray()) {
			if(c == p || c == Character.toLowerCase(p) || c == Character.toUpperCase(p)) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * 대소문자 구분하여 문자의 개수를 센다.
	 * @param String s
	 * @param char p
	 * @param Type t
	 * @see Type
	 * @return
	 */
	public int getCount(String s, char p, Type t) {
		int count = 0;
		for(char c:s.toCharArray()) {
			if(t == Type.LOWER) {
				p = Character.toLowerCase(p);
			} else if(t == Type.UPPER) {
				p = Character.toUpperCase(p);
			}
			
			if(c == p) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		CountPY countPY = new CountPY();
		System.out.println(countPY.isEqualCountPY("pPoooyY"));
		System.out.println(countPY.isEqualCountPY("Pyy"));
		System.out.println("----- LOWER -----");
		System.out.println(countPY.isEqualCountPY("pPoooyY", Type.LOWER));
		System.out.println(countPY.isEqualCountPY("Pyy", Type.LOWER));
		System.out.println("----- UPPER -----");
		System.out.println(countPY.isEqualCountPY("pPoooyY", Type.UPPER));
		System.out.println(countPY.isEqualCountPY("Pyy", Type.UPPER));
	}

}

package info.chodev.algorithm.pureu.first;

/**
 * 핸드폰 번호 가리기
 * 
 * @author pureu
 * @since 2017.10.22
 *
 */
public class HideNumber {

	/**
	 * 핸드폰 번호 가리기
	 * 
	 * @param String number
	 * @return String
	 */
	public String hideNumber(String number) {
		int maskLength = number.length() - 4;
		return fillChar(maskLength, '*') + number.substring(maskLength, number.length());
	}

	/**
	 * 문자를 채운다.
	 * 
	 * @param int repeat
	 * @param char fillChar
	 * @return String
	 */
	public String fillChar(int repeat, char fillChar) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < repeat; i++) {
			sb.append(fillChar);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		HideNumber hideNumber = new HideNumber();
		System.out.println(hideNumber.hideNumber("01033334444"));
		System.out.println(hideNumber.hideNumber("027778888"));
	}
}

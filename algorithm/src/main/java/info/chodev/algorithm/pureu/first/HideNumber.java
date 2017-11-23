package info.chodev.algorithm.pureu.first;

/**
 * https://programmers.co.kr/learn/challenge_codes/132
 * 
 * 핸드폰 번호 가리기
 * 
 * 별이는 헬로월드텔레콤에서 고지서를 보내는 일을 하고 있습니다. 개인정보 보호를 위해 고객들의 전화번호는 맨 뒷자리 4자리를 제외한 나머지를 "*"으로 바꿔야 합니다.
 * 전화번호를 문자열 s로 입력받는 hide_numbers함수를 완성해 별이를 도와주세요
 * 예를들어 s가 "01033334444"면 "*******4444"를 리턴하고, "027778888"인 경우는 "*****8888"을 리턴하면 됩니다.
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

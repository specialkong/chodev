package info.chodev.algorithm.pureu.first;

/**
 * 단어를 입력 받아서 가운데 글자를 반환한다.
 * 
 * @author pureu
 * @since 2017.10.22
 *
 */
public class MiddleString {

	/**
	 * 단어를 입력 받아서 가운데 글자를 반환한다.
	 * 
	 * @param String word
	 * @return String
	 */
	public String getMiddle(String word) {

		int index = 0;
		if(isEven(word)) {
			index = word.length() / 2 - 1;
			return word.substring(index, index + 2);
		} else {
			index = word.length() / 2;
			return word.substring(index, index + 1);
		}
	}
	
	/**
	 * 짝수 체크한다.
	 * 
	 * @param String word
	 * @return boolean
	 */
	public boolean isEven(String word) {
		return word.length() % 2 == 0;
	}
	
	public static void main(String[] args) {
		MiddleString middleString = new MiddleString();
		System.out.println(middleString.getMiddle("power"));
		System.out.println(middleString.getMiddle("test"));
	}
}

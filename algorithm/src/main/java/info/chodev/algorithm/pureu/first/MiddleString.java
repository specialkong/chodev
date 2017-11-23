package info.chodev.algorithm.pureu.first;

/**
 * https://programmers.co.kr/learn/challenge_codes/82
 * 
 * 가운데 글자 가져오기 
 * 
 * getMiddle메소드는 하나의 단어를 입력 받습니다. 단어를 입력 받아서 가운데 글자를 반환하도록 getMiddle메소드를 만들어 보세요. 단어의 길이가 짝수일경우 가운데 두글자를 반환하면 됩니다.
 * 예를들어 입력받은 단어가 power이라면 w를 반환하면 되고, 입력받은 단어가 test라면 es를 반환하면 됩니다.
 * 
 * @author pureu
 * @since 2017.10.22
 *
 */
public class MiddleString {

	/**
	 * 가운데 글자 가져오기 
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

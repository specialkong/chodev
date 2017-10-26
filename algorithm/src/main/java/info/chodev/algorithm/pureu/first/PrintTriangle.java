package info.chodev.algorithm.pureu.first;

/**
 * 삼각형 출력하기
 * 역삼각형 출력하기
 * 
 * @author pureu
 * @since 2017.10.22
 *
 */
public class PrintTriangle {

	/**
	 * 삼각형 출력하기
	 * 
	 * @param int num
	 * @return String
	 */
	public String printTriangle(int num) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<=num;i++) {
			sb.append(fillChar(i, '*'));
			sb.append("\n");
		}
		return sb.toString();
	}
	
	/**
	 * 역삼각형 출력하기
	 * 
	 * @param int num
	 * @return String
	 */
	public String printReversedTriangle(int num) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=num;i>=1;i--) {
			sb.append(fillChar(i, '*'));
			sb.append("\n");
		}
		return sb.toString();
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
		PrintTriangle printTriangle = new PrintTriangle();
		System.out.println(printTriangle.printTriangle(3));
		System.out.println(printTriangle.printTriangle(5));
		System.out.println(printTriangle.printReversedTriangle(3));
		System.out.println(printTriangle.printReversedTriangle(5));
	}

}

package info.chodev.algorithm.pureu.first;

/**
 * 서울에서 김서방 찾기
 * 
 * @author pureu
 * @since 2017.10.26
 *
 */
public class FindKim {

	/**
	 * 서울에서 김서방 찾기
	 * 
	 * @param String[] seoul
	 * @return String
	 */
	public String findKim(String[] seoul) {
		int x = 0;
		for(String s:seoul) {
			if("Kim".equals(s)) {
				break;
			}
			x++;
		}
		
		return "김서방은 " + x + "에 있다";
	}

	public static void main(String[] args) {
		FindKim kim = new FindKim();
		String[] names = { "Queen", "Tod", "Kim" };
		System.out.println(kim.findKim(names));
	}

}

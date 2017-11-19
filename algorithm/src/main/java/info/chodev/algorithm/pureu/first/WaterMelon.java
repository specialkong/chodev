package info.chodev.algorithm.pureu.first;

/**
 * https://programmers.co.kr/learn/challenge_codes/109
 * 
 * 수박수박수박수박수?
 * 
 * water_melon함수는 정수 n을 매개변수로 입력받습니다.
 * 길이가 n이고, 수박수박수...와 같은 패턴을 유지하는 문자열을 리턴하도록 함수를 완성하세요.
 * 예를들어 n이 4이면 '수박수박'을 리턴하고 3이라면 '수박수'를 리턴하면 됩니다.
 * 
 * @author pureu
 * @since 2017.10.22
 *
 */
public class WaterMelon {

	public String waterMelon(int n) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<=n;i++) {
			if(isEven(i)) {
				sb.append("박");
			} else {
				sb.append("수");
			}
		}
		
		return sb.toString();
	}
	
	public boolean isEven(int n) {
		return n % 2 == 0;
	}
	
	public static void main(String[] args) {
		WaterMelon waterMelon = new WaterMelon();
		System.out.println(waterMelon.waterMelon(3));
		System.out.println(waterMelon.waterMelon(4));
	}

}

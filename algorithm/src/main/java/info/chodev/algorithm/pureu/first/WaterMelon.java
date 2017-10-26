package info.chodev.algorithm.pureu.first;

/**
 * 수박수박수박수박수?
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

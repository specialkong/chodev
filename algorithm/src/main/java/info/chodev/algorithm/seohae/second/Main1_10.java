package info.chodev.algorithm.seohae.second;

/**
 * 문자열 내 p와 y의 개수
 * @author seohae
 * @since 2017.11.01
 *
 */
public class Main1_10 {
	
	/**
	 * p와 y의 개수 확인하기
	 * @param String result
	 * @return boolean
	 */
	public boolean pycheck(String result){
		int p = 0; //p의 개수
		int y = 0; //y의 개수
		
		for(int i = 0; i<result.length(); i++){
			String a = String.valueOf(result.charAt(i));
			if(a.equals("p") || a.equals("P")){
				p++;
			}
			
			if(a.equals("y") || a.equals("Y")){
				y++;
			}
			
		}
		
		if(p == y){
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Main1_10 pyCheck = new Main1_10();
		
		String a="ppsadsyY";
		String b="asdpPPpYY";
		
		System.out.println(pyCheck.pycheck(a));
		System.out.println(pyCheck.pycheck(b));
	}
}

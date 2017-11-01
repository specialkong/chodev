package info.chodev.algorithm.baeyeongcheol.second;

public class CheckNumber {
	
	public boolean alpha_string46(String s){
		
		for(int i=0; i<s.length(); i++) {
			
			if(!('0' <= s.charAt(i) && s.charAt(i) <= '9')) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
	
		CheckNumber checkNumber = new CheckNumber();
		System.out.println(checkNumber.alpha_string46("234"));
		
	}
}

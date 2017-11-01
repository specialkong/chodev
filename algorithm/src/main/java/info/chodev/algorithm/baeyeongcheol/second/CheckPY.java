package info.chodev.algorithm.baeyeongcheol.second;

public class CheckPY {

	public boolean numPY(String s) {
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'p') {
				count++;
			}else if(s.charAt(i) == 'y') {
				count--;
			}
		}
		if(count != 0) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
	
		CheckPY checkPY = new CheckPY();
		System.out.println(checkPY.numPY("PyY"));
		
	}
}

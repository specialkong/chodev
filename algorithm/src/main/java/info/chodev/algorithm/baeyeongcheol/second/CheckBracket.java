package info.chodev.algorithm.baeyeongcheol.second;

public class CheckBracket {
	
	public boolean is_pair(String s) {
		int trueNum = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(') {
				trueNum++;
			}else if(s.charAt(i) == ')') {
				trueNum--;
			}else if(trueNum < 0) {
				return false;
			}
		}
		if(trueNum != 0) {
			return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		CheckBracket bracket = new CheckBracket();
		System.out.println(bracket.is_pair("(()(fdfd)f(df)dddd)"));
		
	}
}

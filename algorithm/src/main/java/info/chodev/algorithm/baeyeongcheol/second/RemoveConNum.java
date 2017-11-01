package info.chodev.algorithm.baeyeongcheol.second;

public class RemoveConNum {

	public String[] no_continuous(String s) {
		String b = s.charAt(0)+",";
		int count = 1;
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i) != s.charAt(i+1)) {
				count ++;
				b += s.charAt(i+1)+",";
			}
		}
		String[] a = b.split(",");
		return a;
	}
	
	public static void main(String[] args) {
		
		RemoveConNum conNum = new RemoveConNum();
		String[] b = conNum.no_continuous("12223333");
		for(int i=0; i<b.length;i++) {
			System.out.print(b[i]);
		}
	}
}

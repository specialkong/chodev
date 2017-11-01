package info.chodev.algorithm.baeyeongcheol.second;

public class MakejadenCase {

	
	public String jaden_Case(String s) {
		String [] a = s.split(" ");
		s = "";
		for(int i=0; i<a.length; i++) {
			if('a' <= a[i].charAt(0) && a[i].charAt(0) <='z') {
				String change = a[i].charAt(0)+"";
				a[i] = a[i].replaceFirst(change, change.toUpperCase());
			}
			s += a[i]+" ";	
		}
		return s;
	}
	
	public static void main(String[] args) {
		MakejadenCase case1 = new MakejadenCase();
		System.out.println(case1.jaden_Case("1ddd kfk ddd aaa ttt"));
		
	}
	
}

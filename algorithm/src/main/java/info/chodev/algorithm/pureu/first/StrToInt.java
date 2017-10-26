package info.chodev.algorithm.pureu.first;

import java.util.ArrayList;
import java.util.List;

/**
 * 스트링을 숫자로 바꾸기
 * 
 * @author purue
 * @since 2017.10.26
 *
 */
public class StrToInt {

	/**
	 * String to int
	 * 
	 * @param String str
	 * @return int
	 */
	public int getStrToInt(String str) {

		boolean isMinus = false;
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<str.length();i++) {
			int digit = Character.digit(str.charAt(i), 10);
			if(str.charAt(0) == '-') {
				isMinus = true;
			} 

			if(digit == -1) {
				continue;
			} else {
				list.add(digit);
			}
			
		}
		
		int sum = 0;
		for(int j=0;j<list.size();j++) {
			sum += list.get(j) * (int)Math.pow(10d, list.size() - j - 1);
		}
		
		if(isMinus) {
			sum *= -1;
		}
		
        return sum;
    }
	
	/**
	 * String to double
	 * 
	 * @param String str
	 * @return double
	 */
	public double getStrToDouble(String str) {

		boolean isMinus = false;
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<str.length();i++) {
			int digit = Character.digit(str.charAt(i), 10);
			if(str.charAt(0) == '-') {
				isMinus = true;
			} 
			if(str.charAt(i) == '.') {
				list.add(99);
			} else if(digit == -1) {
				continue;
			} else {
				list.add(digit);
			}
			
		}
		
		double sum = 0;
		int k = 0;
		boolean isDot = false;
		for(int j=0;j<list.size();j++) {
			if(99 == list.get(j)) {
				isDot = true;
				continue;
			}
			if(isDot) {
				sum += list.get(j) * Math.pow(10d, --k);
			} else {
				sum += list.get(j) * Math.pow(10d, list.indexOf(99) - j - 1);
			}
		}
		
		if(isMinus) {
			sum *= -1;
		}
		
        return sum;
    }

	public static void main(String args[]) {
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToInt("1234"));
        System.out.println(strToInt.getStrToInt("-1234"));
        System.out.println(strToInt.getStrToDouble("1234.567"));
        System.out.println(strToInt.getStrToDouble("-1234.567"));
    }
}

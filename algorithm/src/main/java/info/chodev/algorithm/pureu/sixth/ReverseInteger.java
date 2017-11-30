package info.chodev.algorithm.pureu.sixth;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import info.chodev.algorithm.pureu.first.HarshadNumber;

public class ReverseInteger {

	private HarshadNumber harshadNumber = new HarshadNumber();
	
	public int getReverseInteger(int n) {
		List<Integer> position = harshadNumber.getPosition(n, false);
		Collections.sort(position);
		Collections.reverse(position);
		String str = StringUtils.join(position, "");
		return Integer.parseInt(str);
	}
	
	public static void main(String[] args) {
		ReverseInteger reverseInteger = new ReverseInteger();
		System.out.println(reverseInteger.getReverseInteger(118372));
	}

}

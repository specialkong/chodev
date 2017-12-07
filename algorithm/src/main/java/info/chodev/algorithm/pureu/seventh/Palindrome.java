package info.chodev.algorithm.pureu.seventh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Palindrome {

	public int getPalindrome(String s) {
		
		List<String> list = new ArrayList<String>();
		List<Integer> n = new ArrayList<Integer>();
		for(int i=1;i<=s.length()-1;i++) {
			int leftLen = i;
			int rightLen = s.length() - i - 1;
			
			if(leftLen < rightLen) {
				for(int j=1;j<leftLen+1;j++) {
					String part = s.substring(i-j, i);
					part = StringUtils.reverse(part);
					if(s.substring(i+1).indexOf(part) == 0) {
						StringBuilder sb = new StringBuilder();
						sb.append(part);
						sb.append(s.substring(i, i+1));
						sb.append(part);
						list.add(sb.toString());
					}
				}
			} else {
				for(int j=1;j<rightLen+1;j++) {
					String part = s.substring(i+1, i+j+1);
					part = StringUtils.reverse(part);
					if(StringUtils.reverse(s.substring(0, i)).indexOf(part) == 0) {
						StringBuilder sb = new StringBuilder();
						sb.append(part);
						sb.append(s.substring(i, i+1));
						sb.append(part);
						list.add(sb.toString());
					}
				}
			}
		}
		
		if(list.size() == 0) {
			return 0;
		}
		
		for(int i=0;i<list.size();i++) {
			n.add(list.get(i).length());
		}
		
		return Collections.max(n);
	}
	
	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		System.out.println(palindrome.getPalindrome("토마토맛토마토"));
		System.out.println(palindrome.getPalindrome("토마토맛있어"));
	}

}

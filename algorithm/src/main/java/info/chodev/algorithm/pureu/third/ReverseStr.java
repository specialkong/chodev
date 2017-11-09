package info.chodev.algorithm.pureu.third;

import java.util.Arrays;
import java.util.Comparator;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 문자열 내림차순으로 배치하기
 * reverseStr 메소드는 String형 변수 str을 매개변수로 입력받습니다.
 * str에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 String을 리턴해주세요.
 * str는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 * 예를들어 str이 "Zbcdefg"면 "gfedcbZ"을 리턴하면 됩니다.
 * 
 * @author pureu
 * @since 2017.11.07
 *
 */
public class ReverseStr {

	/** 
	 * comparator 구현
	 * 
	 * @param strings
	 * @param n
	 * @return
	 */
	public String reverseStr(String string) {
		Character[] chars = ArrayUtils.toObject(string.toCharArray());
		Arrays.sort(chars, new ReverseComparator());
		return String.valueOf(ArrayUtils.toPrimitive(chars));
	}
	
	/**
	 * 버블 정렬
	 * 
	 * @param strings
	 * @param n
	 * @return
	 */
	public String manualSort(String string) {
		int len = string.length();
		char c;
		char[] chars = string.toCharArray();
		
		for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-1-i;j++) {
				if(chars[j] < chars[j+1]) {
					c = chars[j];
					chars[j] = chars[j+1];
					chars[j+1] = c;
				}
			}
		}
		return String.valueOf(chars);
	}
	
	public static void main(String[] args) {
		ReverseStr reverseStr = new ReverseStr();
		
		System.out.println(reverseStr.reverseStr(new String("Zbcdefg")));
		System.out.println(reverseStr.manualSort(new String("Zbcdefg")));
	}

}

class ReverseComparator implements Comparator<Character>{
	
	public int compare(Character o1, Character o2) { 
		if(o1.compareTo(o2) > 0) {
			return -1;
		} else if(o1.compareTo(o2) < 0) {
			return 1;
		} else {
			return 0;
		}
	}
}
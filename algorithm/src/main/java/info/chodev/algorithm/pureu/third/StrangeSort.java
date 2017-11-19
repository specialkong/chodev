package info.chodev.algorithm.pureu.third;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://programmers.co.kr/learn/challenge_codes/95
 * 
 * 문자열 내 마음대로 정렬하기
 * 
 * strange_sort함수는 strings와 n이라는 매개변수를 받아들입니다.
 * strings는 문자열로 구성된 리스트인데, 각 문자열을 인덱스 n인 글자를 기준으로 정렬하면 됩니다.
 * 예를들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1인 문자 u, e ,a를 기준으로 정렬해야 하므로 결과는 ["car", "bed", "sun"]이 됩니다.
 * 
 * @author pureu
 * @since 2017.11.07
 *
 */
public class StrangeSort {

	/** 
	 * comparator 구현
	 * 
	 * @param strings
	 * @param n
	 * @return
	 */
	public String[] strageSort(String[] strings, int n) {
		Arrays.sort(strings, new IndexComparator(n));
		return strings;
	}
	
	/**
	 * 버블 정렬
	 * 
	 * @param strings
	 * @param n
	 * @return
	 */
	public String[] manualSort(String[] strings, int n) {
		int len = strings.length;
		String tmp = new String();
		
		for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-1-i;j++) {
				if(strings[j].charAt(n) > strings[j+1].charAt(n)) {
					tmp = strings[j];
					strings[j] = strings[j+1];
					strings[j+1] = tmp;
				}
			}
		}
		return strings;
	}
	
	public static void main(String[] args) {
		StrangeSort strangeSort = new StrangeSort();
		
		System.out.println(Arrays.toString(strangeSort.strageSort(new String[]{"sun", "bed", "car"}, 1)));
		System.out.println(Arrays.toString(strangeSort.strageSort(new String[]{"sun", "bed", "car"}, 2)));
		System.out.println(Arrays.toString(strangeSort.manualSort(new String[]{"sun", "bed", "car"}, 1)));
		System.out.println(Arrays.toString(strangeSort.manualSort(new String[]{"sun", "bed", "car"}, 2)));
	}

}

class IndexComparator implements Comparator<String>{
	int n = 0;
	
	public IndexComparator(int n) {
		this.n = n;
	}
	
	public int compare(String o1, String o2) { 
		if(o1.charAt(n) > o2.charAt(n)) {
			return 1;
		} else if(o1.charAt(n) < o2.charAt(n)) {
			return -1;
		} else {
			return 0;
		}
	}
}
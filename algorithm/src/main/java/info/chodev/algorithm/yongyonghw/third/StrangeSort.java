package info.chodev.algorithm.yongyonghw.third;

import java.util.ArrayList;
import java.util.Comparator;

public class StrangeSort {

	static String [] doSort(final int n, String [] arr) {
		
		ArrayList<String> arrList = new ArrayList<String>();
		for(String temp : arr) {
			arrList.add(temp);
		}
		Comparator<String> comparator = new Comparator<String>() {
			public int compare(String o1, String o2) {
				if(o1.charAt(n) > o2.charAt(n))
					return 1;
				else if(o1.charAt(n) < o2.charAt(n))
					return -1;
				else
					return 0;
			}
		};
		arrList.sort(comparator);
		System.out.println(arrList.toString());
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"sun", "bed", "car"};
		doSort(1, arr);
	}

}

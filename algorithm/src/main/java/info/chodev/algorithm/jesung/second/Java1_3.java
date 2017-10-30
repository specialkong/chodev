package info.chodev.algorithm.jesung.second;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java1_3 {

	public List<Integer> isEven(int[] a) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
		list.add(a[i]);
		}
		Integer min = Collections.min(list);
		list.remove(min);
	 return	list;
	}
 public static void main(String[] args) {
	Java1_3 ja = new Java1_3();
	int[] a = {9,7,5,3};
	System.out.println(ja.isEven(a));
   }
}

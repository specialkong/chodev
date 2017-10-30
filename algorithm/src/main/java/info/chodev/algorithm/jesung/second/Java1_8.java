package info.chodev.algorithm.jesung.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class Java1_8 {

	public List<Integer> isEven(int[] a) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0 ;i<a.length-1;i++) {
			if(!(a[i]==a[i+1]))	{
				list.add(a[i]);
			}
		}return list;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 0;
		Java1_8 ja = new Java1_8();;
		int[] a = {9,7,9,9};
		System.out.println( ja.isEven(a));
	}
}
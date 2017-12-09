package info.chodev.algorithm.pureu.seventh;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class MinSum {

	int getMinSum(int[] a, int[] b) {
		
		if(a.length != b.length) {
			return 0;
		}
		
		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		Arrays.sort(b);
		ArrayUtils.reverse(b);
//		System.out.println(Arrays.toString(b));
		
		int minSum = 0;
		for(int i=0;i<a.length;i++) {
			minSum += a[i] * b[i];
		}
		return minSum;
	}
	
	public static void main(String[] args) {
		MinSum minSum = new MinSum();
		System.out.println(minSum.getMinSum(new int[]{1, 2}, new int[]{3, 4}));
	}
}

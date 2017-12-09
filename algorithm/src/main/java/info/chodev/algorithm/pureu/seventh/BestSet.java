package info.chodev.algorithm.pureu.seventh;

import java.util.Arrays;

public class BestSet {

	public int[] getBestSet(int n, int s) {
		
		if(n > s) {
			return new int[]{-1};
		}

		int devide = s / n;
		int mod = s % n;
		int[] bestSet = new int[n];
		
		for(int i=0;i<n;i++) {
			bestSet[i] = devide;
		}
		
		for(int i=n-1;i>=0;i--) {
			bestSet[i] += 1;
			mod--;
			if(mod == 0) {
				break;
			}
		}
		return bestSet;
	}
	
	public static void main(String[] args) {
		BestSet bestSet = new BestSet(); 
		System.out.println(Arrays.toString(bestSet.getBestSet(3, 13)));
	}
}

package info.chodev.algorithm.pureu.sixth;

import java.util.Arrays;

public class Matrix {

	public void renderMatrix(int[][] a) {
		
		for(int p=0;p<a.length;p++) {
			int value = 2;
			for(int q=0;q<p+1;q++) {
				a[p][q] = value++;
			}
		}
		
		for(int p=0;p<a.length;p++) {
			System.out.println(Arrays.toString(a[p]));
		}
	}
	public static void main(String[] args) {
		Matrix matrix = new Matrix();
		matrix.renderMatrix(new int[5][5]);
	}

}

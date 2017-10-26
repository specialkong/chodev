package info.chodev.algorithm.pureu.first;

import java.util.Arrays;

/**
 * 행렬의 곱셈
 * 
 * @author pureu
 * @since 2017.10.26
 *
 */
public class ProductMatrix {
	
	/**
	 * 행렬의 곱셈
	 * 
	 * @param int[][] A
	 * @param int[][] B
	 * @return int[][]
	 */
	public int[][] productMatrix(int[][] A, int[][] B) {
		int row = A.length;
		int col = B[0].length;
		
		int[][] answer = new int[row][col];

		int confirmRow = A[0].length;
		int confirmCol = B.length;
		
		if(confirmRow != confirmCol) {
			return answer;
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				int sum = 0;
				for(int k=0;k<col;k++) {
					sum += A[i][k] * B[k][j];
				}
				answer[i][j] = sum;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		ProductMatrix c = new ProductMatrix();
		int[][] a = { { 1, 2 }, { 2, 3 } };
		int[][] b = { { 3, 4 }, { 5, 6 } };

		int[][] r = c.productMatrix(a, b);
		for(int[] i:r) {
			System.out.println(Arrays.toString(i));
		}
		
		a = new int[][]{ { 1, 5, 4 }, { 5, 6, 10 } };
		b = new int[][]{ { 8, 3, 9 }, { 5, 2, 8 }, {10, 2, 5} };

		r = c.productMatrix(a, b);
		for(int[] i:r) {
			System.out.println(Arrays.toString(i));
		}
	}
}

package info.chodev.algorithm.pureu.fourth;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/challenge_codes/148
 * 
 * 행렬의 덧셈
 * 
 * @author pureu
 * @since 2017.11.15
 *
 */
public class SumMatrix {
	
	/**
	 * 행렬의 덧셈
	 * 
	 * @param int[][] A
	 * @param int[][] B
	 * @return int[][]
	 */
	public int[][] getSumMatrix(int[][] A, int[][] B) {
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
				sum += A[i][j] + B[i][j];
				answer[i][j] = sum;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		SumMatrix c = new SumMatrix();
		int[][] a = { { 1, 2 }, { 2, 3 } };
		int[][] b = { { 3, 4 }, { 5, 6 } };

		int[][] r = c.getSumMatrix(a, b);
		for(int[] i:r) {
			System.out.println(Arrays.toString(i));
		}
		
		a = new int[][]{ { 1, 5, 4 }, { 5, 6, 10 } };
		b = new int[][]{ { 8, 3, 9 }, { 5, 2, 8 }, {10, 2, 5} };

		r = c.getSumMatrix(a, b);
		for(int[] i:r) {
			System.out.println(Arrays.toString(i));
		}
	}
}

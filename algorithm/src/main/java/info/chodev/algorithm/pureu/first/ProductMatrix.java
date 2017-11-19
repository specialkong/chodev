package info.chodev.algorithm.pureu.first;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/challenge_codes/140
 * 
 * 행렬의 곱셈
 * 
 * 행렬의 곱셈은, 곱하려는 두 행렬의 어떤 행과 열을 기준으로, 
 * 좌측의 행렬은 해당되는 행, 우측의 행렬은 해당되는 열을 순서대로 곱한 값을 더한 값이 들어갑니다. 
 * 행렬을 곱하기 위해선 좌측 행렬의 열의 개수와 우측 행렬의 행의 개수가 같아야 합니다. 
 * 곱할 수 있는 두 행렬 A,B가 주어질 때, 행렬을 곱한 값을 출력하는 productMatrix 함수를 완성해 보세요.
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

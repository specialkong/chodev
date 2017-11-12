package info.chodev.algorithm.seohae.fourth;

import java.util.Arrays;

/**
 * 행렬의 덧셈
 * @author seohae
 * @since 2017.11.12
 */
public class SumMatrix {
	
	/**
	 * 행렬을 더해서 새로운 배열 생성
	 * @param A
	 * @param B
	 * @return 
	 */
	int[][] sumMatrix(int[][] A, int[][] B) {
		int[][] answer = {{0, 0}, {0, 0}};
		
		System.out.println(A[0][0]+B[0][0]);
		for(int i = 0; i<A.length; i++){
			for(int j = 0; j<A.length; j++){
				answer[i][j] = A[i][j] + B[i][j];
			}
		}
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		SumMatrix c = new SumMatrix();
		int[][] A = { { 1, 2 }, { 2, 3 } };
		int[][] B = { { 3, 4 }, { 5, 6 } };
		
		int[][] answer = c.sumMatrix(A, B);
		
		if (answer[0][0] == 4 && answer[0][1] == 6 && 
				answer[1][0] == 7 && answer[1][1] == 9) {
			System.out.println("맞았습니다. 제출을 눌러 보세요");
		} else {
			System.out.println("틀렸습니다. 수정하는게 좋겠어요");
		}
	}
}

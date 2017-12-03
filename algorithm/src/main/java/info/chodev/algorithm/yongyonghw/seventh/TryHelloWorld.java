package info.chodev.algorithm.yongyonghw.seventh;

import java.util.Arrays;
class TryHelloWorld {
	public int getMinSum(int[] A, int[] B) {
		int answer = 0;

		Arrays.sort(A);
		Arrays.sort(B);
		int aMinIndex = 0;
		int aMaxIndex = A.length - 1;
		int bMinIndex = 0;
		int bMaxIndex = A.length - 1;
		for(int i = 0; i < A.length; i ++) {
			if(A[aMinIndex] * B[bMaxIndex] >= A[aMaxIndex] * B[bMinIndex]) {
				answer += A[aMinIndex] * B[bMaxIndex];
				++aMinIndex;
				--bMaxIndex;
			} else {
				answer += A[aMaxIndex] * B[bMinIndex];
				++bMinIndex;
				--aMaxIndex;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		TryHelloWorld test = new TryHelloWorld();
		int[] A = { 1, 2 };
		int[] B = { 3, 4 };
		System.out.println(test.getMinSum(A, B));
	}
}
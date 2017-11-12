package info.chodev.algorithm.seohae.third;

import java.util.Arrays;

/**
 * 보물
 * @author seohae
 * @since 2017. 11. 09
 *
 */

/*
옛날 옛적에 수학이 항상 큰 골칫거리였던 나라가 있었다. 이 나라의 국왕 김지민은 다음과 같은 문제를 내고 큰 상금을 걸었다.
길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자.
S = A[0]*B[0] + ... + A[N-1]*B[N-1]
S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안된다.
S의 최솟값을 출력하는 프로그램을 작성하시오.
 */

/*
 1. 작은수 x 작은수 = 작은수..?
 2. 0은 제일 큰수와 곱하기
 */
public class Main1026 {
	
	/**
	 * A를 정렬해서 B를 곱한 값의 가장 작은수 구하기
	 * @param int[] A
	 * @param int[] B
	 * @return int 
	 */
	public int minNum(int[] A, int[] B){
		//A를 정렬할때 0을 가장 마지막에 정렬해야, B의 마지막에 있는 가장 큰 수와 곱함
		Arrays.sort(A);
		int result = 0;
		
		for(int i = 0; i<A.length; i++){
			if(A[i] == 0){ //0을 만났을땐,
				B[A.length-1] = 0; //마지막원소를 곱하면 어차피 0이므로 마지막 원소를 0으로 바꿔버림 (어차피 곱하면 0)
			}
			if(A[i] != 0){ //0이 없을땐 그대로 다 원소를 곱해서 더해버림.
				result += A[i] * B[i];
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Main1026 Find = new Main1026();
		
		int[] A = {1, 1, 1, 6, 0};
		int[] B = {2, 7, 8, 3, 1};
		
		System.out.println(Find.minNum(A, B));
	}
}

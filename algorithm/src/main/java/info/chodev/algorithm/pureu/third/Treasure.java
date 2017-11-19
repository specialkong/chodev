package info.chodev.algorithm.pureu.third;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

/**
 * https://www.acmicpc.net/problem/12021
 * 
 * 보물 찾기
 * 
 * 옛날 옛적에 수학이 항상 큰 골칫거리였던 나라가 있었다. 이 나라의 국왕 김지민은 다음과 같은 문제를 내고 큰 상금을 걸었다.
 * 길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자.
 * S = A[0]*B[0] + ... + A[N-1]*B[N-1]
 * S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안된다.
 * S의 최솟값을 출력하는 프로그램을 작성하시오.
 * 
 * @author pureu
 * @since 2017.11.08
 *
 */
public class Treasure {

	public int getTreasure(int[] a, int[] b) {
		int[] c = new int[a.length];
		int[] t = getIndexedArray(b);
		
		Arrays.sort(a);
		ArrayUtils.reverse(a);
		for(int i=0;i<t.length;i++) {
			c[i] = a[t[i]];
		}
		
		System.out.println(Arrays.toString(t));
		System.out.println(Arrays.toString(c));
		return getMultiple(c, b);
	}

	/**
	 * 작은 값 순서대로 indexd array를 리턴한다.
	 * 
	 * @param b
	 * @return
	 */
	public int[] getIndexedArray(int[] b) {
		int[] t = new int[b.length];
		for(int i=0;i<b.length;i++) {
			int index = 0;
			for(int j=0;j<b.length;j++) {
				if(b[i] > b[j]) {
					index++;
				}
			}
			t[i] = index;
		}
		return t;
	}
	
	/**
	 * 곱한다.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int getMultiple(int[] a, int[] b) {
		int sum = 0;
		
		for(int i=0;i<a.length;i++) {
			sum += a[i]*b[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Treasure treasure = new Treasure();
		System.out.println(treasure.getTreasure(new int[]{1,1,1,6,0}, new int[]{2,7,8,3,1}));
	}

}

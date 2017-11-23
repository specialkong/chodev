package info.chodev.algorithm.pureu.second;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

/**
 * https://programmers.co.kr/learn/challenge_codes/121
 * 
 * 제일 작은 수 제거하기
 * 
 * rm_small함수는 list타입 변수 mylist을 매개변수로 입력받습니다.
 * mylist 에서 가장 작은 수를 제거한 리스트를 리턴하고, mylist의 원소가 1개 이하인 경우는 []를 리턴하는 함수를 완성하세요.
 * 예를들어 mylist가 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10, 8, 22]면 [10, 22]를 리턴 합니다.
 * 
 * @author pureu
 * @since 2017.11.01
 *
 */
public class RmSmall {

	/**
	 * 제일 작은 수 제거하기
	 * @param n
	 * @return
	 */
	public int[] rmSmall(int[] n) {
		int[] tmp = n.clone();
		Arrays.sort(tmp);
		int min = tmp[0];

		return ArrayUtils.removeElement(n, min);
	}
	
	public static void main(String[] args) {
		RmSmall rmSmall = new RmSmall();
		System.out.println(Arrays.toString(rmSmall.rmSmall(new int[]{4, 3, 2, 1})));
	}
}

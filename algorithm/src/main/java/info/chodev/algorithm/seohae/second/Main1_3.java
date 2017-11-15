package info.chodev.algorithm.seohae.second;

import java.util.Arrays;

/**
 * 제일 작은 수 제거하기
 * @author seohae
 * @since 2017.10.31
 *
 */
public class Main1_3 {
	
	/**
	 * 제일 작은수를 추출한다
	 * @param int[] num
	 * @return void
	 */
	public int[] minCheck(int[] num){
		int min = num[0];
		int minNum = 0; //제일 작은 값 개수
		
		for(int i = 1; i<num.length; i++){ //작은수를 찾는다!
			if(num[i] < min){
				min = num[i]; //작은수는 변수 min 에 저장 
			}
		}
		
		//작은 값이 같은게 몇개인지 세야 새로운 배열의 길이를 정함!
		for(int i = 0; i<num.length; i++){
			if(num[i] == min){
				minNum++;
			}
		}
		
		int[] newMax = newArray(num, min, minNum); //배열과 가장 작은값을 파라미터로 메소드 호출.
		return newMax;
	}
	
	/**
	 * 새로운 배열에 가장 작은 값을 뺀 나머지 값들을 넣는다
	 * @param int[] num
	 * @param int min
	 * @param int minNum
	 * @return int[]
	 */
	public int[] newArray(int[] num, int min, int minNum){
		int[] newMax = new int[num.length -minNum]; //가장 작은수를 빼서(length-1) 나머지 객체들을 넣을 배열 선언!
		
		for(int i = 0; i<newMax.length; i++){
			if(num[i] != min){ //작은수는 넣지않는다
				newMax[i] = num[i];
			}
		}
		
		return newMax;
	}
	
	public static void main(String[] args) {
		Main1_3 minDelete = new Main1_3();
		
		int[] a = {10, 20, 40, 5};
		int[] b = {1, 14, 60, 101, 20};
		int[] c = {100, -1};
		int[] d = {3};
		int[] e = {3, 1, 1, 1};
		
		System.out.println(Arrays.toString(minDelete.minCheck(a)));
		System.out.println(Arrays.toString(minDelete.minCheck(b)));
		System.out.println(Arrays.toString(minDelete.minCheck(c)));
		System.out.println(Arrays.toString(minDelete.minCheck(d)));
		System.out.println(Arrays.toString(minDelete.minCheck(e)));
	}
}

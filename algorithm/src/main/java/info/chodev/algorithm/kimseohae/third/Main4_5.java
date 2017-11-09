package info.chodev.algorithm.kimseohae.third;

import java.util.Arrays;

/**
 * 땅따먹기 게임
 * @author seohae
 * @since 2017.11.09
 *
 */

/*
영희는 땅따먹기 게임에 푹 빠졌습니다. 땅따먹기 게임의 땅은 총 N행 4열로 나누어져 있고, 모든 칸에는 점수가 쓰여 있습니다. 
땅을 밟으면서 한 행씩 내려올 때, 영희는 각 행의 4칸 중 1칸만 밟으면서 내려올 수 있습니다. 
땅따먹기 게임에는 같은 열을 연속해서 밟을 수가 없는 특수 규칙이 있습니다. 즉, 1행에서 (5)를 밟았다면, 2행의 (8)은 밟을 수가 없게 됩니다. 
마지막 행까지 모두 내려왔을 때, 점수가 가장 높은 사람이 게임의 승자가 됩니다. 
여러분이 hopscotch 함수를 제작하여 영희가 최대 몇 점을 얻을 수 있는지 알려주세요. 예를 들어
1 2 3 5
5 6 7 8
4 3 2 1
의 땅이 있다면, 영희는 각 줄에서 (5), (7), (4) 땅을 밟아 16점을 최고점으로 받을 수 있으며, hopscotch 함수에서는 16을 반환해주면 됩니다.
 */

/*
1. 각 행에서 가장 큰 수를 찾기
2. 두번째 행에서 위에 행과 같은 열이면 다시 그보다  더 작지만 다른수보다 큰 수 찾기
 */
public class Main4_5 {
	
	/**
	 * 제일 큰 수를 찾자!
	 * @param a
	 * @param b
	 * @param c
	 * @return int
	 */
	public int maxFind(int[] a, int[] b, int[] c) {
		int sum = 0;
		
		//작은 순으로 정렬!!
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		//정렬했으니, 큰 값을 찾을때 무조건 뒤에서부터 찾음.
		//알게된 규칙: a.length에서 계속해서 -1,-2,-1,-2,-1.....순서로 빼게됨. -> 홀수번째 행: -1, 짝수번째 행: -2
		for(int i = 0; i<a.length; i++){
			sum = a[a.length-1]; //a 배열에서 가장 마지막원소(가장 큰수)를 sum에 저장
			sum += b[a.length-2]; //a 배열에서 가장 마지막원소(가장 큰수)를 sum에 저장
			sum += c[a.length-1];
		}
		return sum;
	}

	public static void main(String[] args) {
		Main4_5 Find = new Main4_5();
		int[] A ={1,2,3,5};
		int[] B ={5,6,7,8};
		int[] C ={4,3,2,1};
		
		System.out.println(Find.maxFind(A,B,C));
	}

}

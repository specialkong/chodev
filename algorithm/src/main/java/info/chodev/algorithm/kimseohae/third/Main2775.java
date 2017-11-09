package info.chodev.algorithm.kimseohae.third;

/**
 * 부녀회장이 될테야
 * @author seohae
 * @since 2017.11.04
 *
 */

/*
 평소 반상회에 참석하는 것을 좋아하는 주희는 이번 기회에 부녀회장이 되고 싶어 각 층의 사람들을 불러 모아 반상회를 주최하려고 한다.
이 아파트에 거주를 하려면 조건이 있는데, “a 층의 b 호에 살려면 자신의 아래(a-1)층에 1호부터 b 호까지 사람들의 수의 합만큼 사람들을 데려와 살아야한다” 는 
계약 조항을 꼭 지키고 들어와야 한다.
아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정 했을 때, 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있나를 출력하라. 
단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층에 i호에는 i명이 산다.
 */

/*
1. 0층 1호(1) 2호(2) 3호(3) 4호(4)
2. 1층 1호(1) 2호(3) 3호(6) 4호(10)
3. 2층 1호(1) 2호(4) 3호(10) 4호(20)
 */
public class Main2775 {
	
	/**
	 * k층 n호에 살고있는 인원수 구하기
	 * @param int k
	 * @param int n
	 * @return int
	 */
	public int sumFind(int k, int n) {
		int[] floorOne = {1,3,6,10}; //0 1 2 3
		int[] floorTwo = new int[floorOne.length];
		
		floorTwo[0]=1;
		
		for(int i=1; i<n; i++){ //i = 0, 1, 2, 3
			for(int j= 0; j<n; j++){
				floorTwo[i] += floorOne[j]; //1+3+6+10
			}
		}
		
		for(int i=1; i<n; i++){
			if(i == n-1){
				return floorTwo[i];
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		Main2775 Find = new Main2775();
		int k = 2; //2층
		int n = 4; //4호
		
		System.out.println(Find.sumFind(k,n)); //20명
	}

}

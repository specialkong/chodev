package info.chodev.algorithm.pureu.third;

/**
 * https://www.acmicpc.net/problem/2775
 * 
 * 부녀회장이 될테야
 * 
 * 평소 반상회에 참석하는 것을 좋아하는 주희는 이번 기회에 부녀회장이 되고 싶어 각 층의 사람들을 불러 모아 반상회를 주최하려고 한다.
 * 이 아파트에 거주를 하려면 조건이 있는데, “a 층의 b 호에 살려면 자신의 아래(a-1)층에 1호부터 b 호까지 사람들의 수의 합만큼 사람들을 데려와 살아야한다” 는 계약 조항을 꼭 지키고 들어와야 한다.
 * 아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정 했을 때, 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있나를 출력하라. 단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층에 i호에는 i명이 산다.
 * 
 * @author pureu
 * @since 2017.11.08
 *
 */
public class Apartment {

	/**
	 * f(1,3) = f(0,1) + f(0,2) + f(0,3) = 6
	 * f(2,3) = f(1,1) + f(1,2) + f(1,3)
	 *        = f(0,1) + f(0,1) + f(0,2) + f(0,1) + f(0,2) + f(0,3) = 10
	 * 
	 * @param floor
	 * @param house
	 * @return
	 */
	public int getPerson(int floor, int house) {
		
		if(floor == 0) {
			return house;
		} else {
			int person = 0;
			for(int i=1;i<=house;i++) {
				person += getPerson(floor-1, i);
			}
			return person;
		}
	}
	
	public static void main(String[] args) {
		Apartment apartment = new Apartment();
		System.out.println(apartment.getPerson(1, 3));
		System.out.println(apartment.getPerson(2, 3));
	}

}

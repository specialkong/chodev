package info.chodev.algorithm.pureu.second;

/**
 * 평균 구하기
 * 함수를 완성해서 매개변수 list의 평균값을 return하도록 만들어 보세요.
 * 어떠한 크기의 list가 와도 평균값을 구할 수 있어야 합니다.
 * 
 * @author pureu
 * @since 2017.11.01
 *
 */
public class Average {

	/**
	 * 평균 구하기
	 * 
	 * @param n
	 * @return
	 */
	public int getAverage(int[] n) {
		int sum = 0;
		if(n.length == 0) {
			return 0;
		}
		for(int i:n) {
			sum += i;
		}
		return sum / n.length;
	}
	
	public static void main(String[] args) {
		Average average = new Average();
		System.out.println(average.getAverage(new int[]{5, 4, 3}));
		System.out.println(average.getAverage(new int[]{5, 9, 4}));
	}

}

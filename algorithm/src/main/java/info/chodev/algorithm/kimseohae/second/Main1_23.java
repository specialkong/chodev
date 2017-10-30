package info.chodev.algorithm.kimseohae.second;

/**
 * 평균 구하기
 * 
 * @author seohae
 * @since 2017.10.30
 *
 */
public class Main1_23 {
	
	/**
	 * 배열의 평균 구하기
	 * 
	 * @param int[] list
	 * @return int
	 */
	public int average(int[] list){
		int result = 0;
		
		for(int i=0;i<list.length;i++){ 
    		result += list[i];
        }
		
		result = result / list.length;
		return result;
	}
	
	public static void main(String[] args) {
		int a[] = {5, 4, 3};
		int b[] = {50, 10, 20, 40};
		int c[] = {10, 40, 100, 131, 134};
		Main1_23 Average = new Main1_23();
		System.out.println("평균값 : " + Average.average(a));
		System.out.println("평균값 : " + Average.average(b));
		System.out.println("평균값 : " + Average.average(c));
	}
}

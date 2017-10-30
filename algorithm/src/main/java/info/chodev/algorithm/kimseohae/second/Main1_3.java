package info.chodev.algorithm.kimseohae.second;

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
	 * @return int[]
	 */
	public int[] minCheck(int[] num){
		int min = 0;
		int[] newMax = new int[num.length -1]; 
		for(int i = 0; i<num.length; i++){
			if(num[i] < num[i-1]){
				min = i;
			}
		}
		System.out.println(min);
		
		return num;
	}
	
	public static void main(String[] args) {
		Main1_3 minDelete = new Main1_3();
		
		int[] a = {10, 20, 40, 5};
		int[] b = {1, 14, 60, 101, 20};
		int[] c = {100, -1};
		int[] d = {3};
		
		System.out.println(minDelete.minCheck(a));
		System.out.println(minDelete.minCheck(b));
		System.out.println(minDelete.minCheck(c));
		System.out.println(minDelete.minCheck(d));
	}
}

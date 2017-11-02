package info.chodev.algorithm.kimseohae.second;

import java.util.Arrays;

/**
 * 야근지수
 * @author seohae
 * @since 2017.11.02
 *
 */
public class Main3_5 {
	
	/**
	 * 야간지수 계산
	 * @param int num
	 * @param int[] result
	 * @return int
	 */
	public int noOvertime(int no, int[] works){
		
		int start = works[0];
		int index = 0;
		
		for(int i =0; i<works.length; i++){
			if(start < works[i]){
				start = works[i]; //제일 큰 수를 구함
				index = i;
			}
		}
		
		for(int i=0;i<works.length;i++){
			//start는 제일 큰수다. start는 -1씩 하게되어 start보다 큰 값을 만나면, 그 큰 값의 -1을 해줘야한다.
			if(works[i] - 1 > 0 && start < works[i]){  //가장 큰 값 start 보다 큰 값을 만나면 큰 값을 -1해줘야 최소시간.
				works[i] = works[i] - 1; //가장 큰 값을 담는 start보다 큰 값을 만났다! 그럼 큰 값에 -1 해줘야 최소시간.
				start = works[i]; //start에 가장 큰 값의 -1 한 결과값을 넣어준다 (현재 start = 가장 큰 값 일수도있고, 다른값과 동일값일수도있다)
				no--;
			}else if(start == works[i]){ //큰값과 동일하다면,
				works[i] = works[i] - 1; 
				start = works[i]; //다시 -1한 값을 가장 큰값을 담는 start에 넣는다
				no--;
			}else if(start > 0){
				start = start -1;
				no--;
			}
			
			if(no == 0){
				break;
			}
		}
		
		//마지막 strt값을 넣어줘야함
		for(int i = 0; i<works.length; i++){
			if( i == index){
				works[i] = start;
			}
		}
		
		int result = Result(works);
		return result;
	} 
	
	/**
	 * 제곱수 계산
	 * @param int[] works
	 * @return int
	 */
	public int Result(int[] works){
		int result = 0;
		System.out.println(Arrays.toString(works));
		for(int i=0;i<works.length;i++){
			result += Math.pow(works[i], 2); //제곱근 구하는 식
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Main3_5 work = new Main3_5();
		
		int []test = {4,3,3};
		int []test2 = {6,2,7,9};
		System.out.println(work.noOvertime(4,test));
		System.out.println(work.noOvertime(4,test2));
	}
}

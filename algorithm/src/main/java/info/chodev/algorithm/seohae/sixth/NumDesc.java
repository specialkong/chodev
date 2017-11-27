package info.chodev.algorithm.seohae.sixth;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import info.chodev.algorithm.pureu.first.HarshadNumber;

/**
 * 정수 내림차순
 * @author seohae
 * @sinco 2017.11.27
 */
public class NumDesc {
	
	private HarshadNumber harshadNumber = new HarshadNumber();
	
	/**
	 * 내림차순으로 정렬
	 * @param n
	 */
	public void reverseInt(int num){
		
		List<Integer> position = harshadNumber.getPosition(num);
		
		Collections.sort(position);
		Collections.reverse(position);
    
		toInt(position);
	}
	
	public void toInt(List<Integer> position){
		String result ="";
		
		for(int i=0; i<position.size(); i++){
			result += position.get(i);
		}
		
		Integer.parseInt(result);
		
		System.out.println(result);
	}
  
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		NumDesc ri = new NumDesc();
		ri.reverseInt(118372);
	}
}
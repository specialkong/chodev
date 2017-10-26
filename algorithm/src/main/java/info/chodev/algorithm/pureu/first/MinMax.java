package info.chodev.algorithm.pureu.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 최소값과 최대값
 * 
 * @author pureu
 * @since 2017.10.25
 *
 */
public class MinMax {

	/**
	 * 최소값과 최대값
	 * 
	 * @param String str
	 * @return String
	 */
	public String getMinMaxString(String str) {
		String[] arr = str.split(" ");
		List<Integer> list = asIntegerList(arr);
		
		StringBuilder sb = new StringBuilder();
		sb.append(Collections.min(list));
		sb.append(" ");
		sb.append(Collections.max(list));

		return sb.toString();
    }
	
	/**
	 * String array convert to List<Integer>
	 * 
	 * @param String[] arr
	 * @return List<Integer>
	 */
	public List<Integer> asIntegerList(String[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for(String s:arr) {
			list.add(Integer.parseInt(s));
		}
		return list;
	}

    public static void main(String[] args) {
        MinMax minMax = new MinMax();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString("1 2 3 4"));
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString("-1 -2 -3 -4"));
    }
}

package info.chodev.algorithm.pureu.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://programmers.co.kr/learn/challenge_codes/125
 * 
 * 최소값과 최대값
 * 
 * getMinMaxString 메소드는 String형 변수 str을 매개변수로 입력받습니다.
 * str에는 공백으로 구분된 숫자들이 저장되어 있습니다.
 * str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 String을 반환하는 메소드를 완성하세요.
 * 예를들어 str이 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
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

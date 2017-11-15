package info.chodev.algorithm.seohae.third;

import java.util.Arrays;

/**
 * 문자열 내 마음대로 정렬하기 (진행중)
 * @author seohae
 * @since 2017.11.06
 *
 */
public class Main1_17 {
	
	
	/**
	 * 기준 찾기
	 * @param String[] str, int n
	 * @return void
	 */
	public void find(String[] str, int n){
		String[] temp = new String[str.length]; //새로운 배열 생성
		
		for(int i = 0; i<str.length; i++){
			String sentence = str[i].substring(n, n+1); //n번째에 해당하는 문자 추출하여 저장
			System.out.println("n번째에 해당하는 단어: " +sentence);
			temp[i] = sentence; //새로운 배열에 각 문자열을 저장
		}
		System.out.println("n번째에 해당하는 단어로 이루어진 배열: " +Arrays.toString(temp));
		result(str, temp, n);
	}
	
	/**
	 * 문자열 순서대로 다시 정렬
	 * @param String[] str, String[] temp, int n
	 * @return void
	 */
	public void result(String[] str, String[] temp, int n){
		String[] exam = new String[str.length]; //새로운 배열 생성
		
		Arrays.sort(temp, String.CASE_INSENSITIVE_ORDER); //temp: find 메소드에서 새로 생성된 배열을 영문 순으로 정렬
		System.out.println("*********영문 순으로 정렬한 후: " +Arrays.toString(temp));
		
		
		//temp[0]일때의 값을 temp 배열에서 찾으려면, 0은 그대로이고 temp[j]만 찾을때까지 늘어나야하므로 temp[i], str[j]이다.
		for(int i = 0; i<temp.length; i++){
			for(int j = 0; j<str.length; j++){
				if(temp[i].equals(str[j].substring(n, n+1))){ //정렬된 배열 순으로 원래 배열에서 맞는 값을 찾음!
					exam[i] = str[j]; //찾은 배열을 새로운 배열에 저장(영문 순으로 저장될것임)
				}
			}
		}
		
		System.out.println(Arrays.toString(exam));
	}
	
	public static void main(String[] args) {
		Main1_17 rs = new Main1_17();
		
		String a[] = {"sun", "bed", "car"};
		String b[] = {"kima", "seoa", "haea", "student"};
		
		rs.find(a,1);
		rs.find(b,2);
	}
}

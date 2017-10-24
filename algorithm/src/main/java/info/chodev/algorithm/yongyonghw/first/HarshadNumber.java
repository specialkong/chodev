package info.chodev.algorithm.yongyonghw.first;

import java.util.ArrayList;

public class HarshadNumber {
	public boolean isHarshad(int num) {
		String numStr = String.valueOf(num);
		ArrayList<Integer> arr = new ArrayList<Integer> ();
		//char 배열로 변환
		char [] cr = numStr.toCharArray();
		// 48을 빼서 int type 으로 사용
		for(char c : cr) {
			arr.add((int) c - 48);
		}
		//각 자리수 sum
		int sum = 0;
		for(int rs : arr) {
			sum += rs;
		}
		if(num %  sum == 0) {
			return true;
		} else
			return false;
	}
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(18));
	}
}

package info.chodev.algorithm.yongyonghw.first;

class Collatz {
	public int collatz(int num) {
		int result = num;
		int answer = 0;
		while(result != 1) {
			if(answer >= 500)
				return -1;
			++ answer;
			if(isEven(result)) {
				result = doEven(result);
			} else {
				result = doOdd(result);
			}
		}
		return answer;
	}
	
	/**
	 * 짝수판별
	 * @param num
	 * @return
	 */
	public boolean isEven(int num) {
		if(num % 2 == 0)
			return true;
		else
			return false;
	}
	
	/**
	 * 짝수일 때 연산
	 * @param num
	 * @return
	 */
	public int doEven(int num) {
		return num / 2;
	}

	/**
	 * 홀수일 때 연산
	 * @param num
	 * @return
	 */
	public int doOdd(int num) {
		return num * 3 + 1;	
	}
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 6;
		System.out.println(c.collatz(ex));
	}
}
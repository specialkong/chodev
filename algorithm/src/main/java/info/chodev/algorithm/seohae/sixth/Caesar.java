package info.chodev.algorithm.seohae.sixth;

/**
 * 시저암호
 * @author seohae
 * @since 2017.11.25
 */
class Caesar {
	
	/**
	 * 암호 구하기
	 * @param s
	 * @param n
	 * @return
	 */
	String caesar(String s, int n) {
		char toChar = '\u0000';
		String result = "";
		String[] resultStr = s.split(" ");
		
		// 함수를 완성하세요.
		for(int i = 0; i<resultStr.length; i++){
			toChar = resultStr[i].charAt(0);
			resultStr[i] = Character.toString((char) ((char)toChar+n));
			
			// 대문자이고, 4칸을 뛴 후 마지막 알파벳 'Z'로 넘어갔을때,
			if(toChar >= 65 && toChar <= 90 && toChar+n >= 91){
					String re = AtoFirst(toChar+n); //처음 'A'로 돌아가도록 함수 호출
					resultStr[i] = re;
			} 
			
			//소문자이고, 4칸을 뛴 후 마지막 알파벳 'z'로 넘어갔을때,
			if(toChar >= 97 && toChar <= 122 && toChar+n >= 123){
				if(toChar+n >= 91){ //z이상일때 (91)이 넘으면...a로 돌아가야함..
					String re = atoFirst(toChar+n); //처음 'a'로 돌아가도록 함수 호출
					resultStr[i] = re;
				}
			}
		}
		
		result = arrayToString(resultStr);

		return result;
	}
	
	
	/**
	 * z 를 넘었을떄 처음으로 돌아가서 찾기 (소문자일때)
	 * @param toStart
	 * @return
	 */
	public String atoFirst(int toStart){
		//toStart 변수 값 = 해당 알파벳 + 4를 한 후의 아스키코드 10진수 값에 (z의 아스키코드 10진수 값 +1 )값을 뺀다
		int aa = toStart - 123; //나머지
		
		String re = Character.toString((char)(97+aa)); //'a'의 시작점 + aa 한 위치의 아스키코드 값이 답.
		
		return re;
	}
	
	/**
	 * z 를 넘었을떄 처음으로 돌아가서 찾기 (대문자일때)
	 * @param toStart
	 * @return
	 */
	public String AtoFirst(int toStart){
		int aa = toStart - 91; //나머지
		
		String re = Character.toString((char)(65+aa));
		
		return re;
	}
	
	/**
	 * 배열을 다시 문자열로
	 * @param String[] str
	 * @return String
	 */
	public String arrayToString(String[] str){
		String result = "";
		
		for(int i = 0; i<str.length; i++){
			result+=str[i] + " ";
		}
		
		return result;
	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B Z", 4));
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B y", 4));
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B Y", 4));
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B w", 4));
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B W", 4));
	}
}

package info.chodev.algorithm.yongyonghw.sixth;


/*
 * 
 * 65 - 90 사이
 * 97 - 122 사이
 */
class Caesar {
	String caesar(String s, int n) {
		String result = "";
		String [] sList = s.split(" ");
		String resultStr = "";
		for(String temp : sList) {
			char beforeT = (char) (temp.charAt(0));
			int start = 0;
			char resultCh = 0;
			//시작 값 세팅
			if(beforeT < 91)
			{
				//대문자
				start = 65;
				if(beforeT + n > 90)
					resultCh = (char) ((beforeT + n) % 90 + start - 1);
				else
					resultCh = (char) (beforeT + n);
				
			} else {
				start = 97;
				if(beforeT + n > 122) {
					System.out.println(beforeT + n);
					resultCh = (char) ((beforeT + n) % 122 + start - 1);
				}
				else
					resultCh = (char) (beforeT + n);
			}
			resultStr += resultCh + " ";
		}
		
		return resultStr;
	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
	}
}

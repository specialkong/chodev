package info.chodev.algorithm.kimseohae.second;

/***
 * 괄호 확인하기
 * @author seohae
 * @since 2017.10.30
 *
 */
public class Main2_10 {
	
	/**
	 * 문자열을 배열에 담기
	 * @param String result
	 * @return boolean
	 */
	public boolean store(String result){
		
		String[] check = new String[result.length()];
		
		for(int i=0;i<result.length();i++){ //입력된 문자열의 길이만큼 반복
			check[i] =  String.valueOf(result.charAt(i)); //문자열의 문자 하나하나를 배열에 저장
        }
		
		boolean checkFinish = findTest(check);
		return checkFinish;
		
	}
	
	
	/**
	 * "(" , ")" 검사확인
	 * @param String[] check
	 * @return boolean
	 */
	public boolean findTest(String[] check){
		
		String view = null;
		
		for(int i=0; i<check.length; i++){
			//view가 null 이라는 말은 아직 (,)를 못만났다는 얘기 - 즉, 처음 만난 가로가 )이면 아웃!
			if(view == null && check[i].equals(")")){
				return false;
			}
			if(view == null && check[i].equals("(")){ //"("를 만났다!
				view = "("; //변수에 (를 넣어놓자
			}else if(view == "(" && check[i].equals(")")){ // 전에 "("를 만났다, 그러면 다음엔 ")"를 만나야한다
				view = ")";
			}else if(view == ")" && check[i].equals("(")){ // 전에 ")"를 만났다, 그러면 다음엔 "("를 만나야한다
				view = "(";
			}
			//마지막 원소
			if(i == check.length -1 && check[i].equals("(")){ //마지막에 왔는데, () 모양이면 )로 끝나야 정상..(로 끝났으면 아웃!
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		Main2_10 findCheck = new Main2_10();
		
		String a = ")(ads";
		String b = "(asdasadssa)()";
		String c = "(asdsa(asdass))";
		String d = "(as(";
		String e = "asdasd(as(";
		String f = "asdasd(as)";

		System.out.println(findCheck.store(a));
		System.out.println(findCheck.store(b));
		System.out.println(findCheck.store(c));
		System.out.println(findCheck.store(d));
		System.out.println(findCheck.store(f));
	}
}

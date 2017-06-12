package study.chodev.pureu.example.week1;

public class AccessModifier {
	public static void main(String[] args) {
		
		// private : 비공개, getter/setter 제공
		// public : 공개
		// protected : 같은패키지 허용, 상속받은 차일드 사용가능
		// default : 같은패키지만 허용
		
		// static : singleton 하나의 인스턴스만 생성
		// final : 상수
		
		// static은 class로 직접 접근
		AccessModifier.testStatic();
		
		// non static은 new로 인스턴스를 만들어서 콜
		AccessModifier am = new AccessModifier();
		am.testNonStatic();
	}
	
	public static void testStatic() {
		System.out.println("call static function");
	}
	
	public void testNonStatic() {
		System.out.println("call non static function");
	}
}

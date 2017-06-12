package study.chodev.pureu.example.week1;

/**
 * operator & if example
 * 
 * @author pureu
 * @since 2017.06.12
 * @version 1.0
 *
 */
public class OperatorIfExample {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		int c = 0;
		
		c = a + b;
		c = c + a;
		c += b;
		
		if(a>b && b>c) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		String str = a > b ? "true":"false";
		System.out.println(str);
		
		char ch = 'c';
		switch (ch) {
		case 'a':
			System.out.println("a : " + ch);
			break;
		case 'c':
			System.out.println("c : " + ch);
			break;
		default:
			break;
		}
	}
}

package study.chodev.pureu.example.week1;

/**
 * Variable Example
 * 
 * @author pureu
 * @since 2017.06.12
 * @version 1.0
 *
 */
public class VariableExample {

	public static void main(String[] args) {
		castExample();
	}
	
	/**
	 * base variable
	 * 
	 * @return void
	 */
	@SuppressWarnings("unused")
	public void baseVariable() {
		byte byte1 = 3;
		short short1 = 39; 
		int int1 = 245;
		long long1 = 34566; 
		float float1 =  23.45f;
		double double1 = 3545.65653; 
		char char1 = 'c';
		boolean boolean1 = false; 
	}
	
	/**
	 * wrapper variable
	 * 
	 * @return void
	 */
	@SuppressWarnings("unused")
	public void wrapperVariable() {
		Byte byte2 = 5;
		Short short2 = 57; 
		Integer int2 = 1024; 
		Long long2 = 8463864l; 
		Float float2 = 545.2324f; 
		Double double2 = 355656.343445d; 
		Character char2 = 'b';
		Boolean boolean2 = true;
		String str = "abc";
	}
	
	/**
	 * cast sample
	 * 
	 * @return void
	 */
	public static void castExample() {
		byte byte1 = 3;
		Byte byte2 = (Byte)byte1;
		byte byte3 = (byte)byte2;
		Byte byte4 = new Byte(byte1);
		System.out.println("Byte : " + byte2.byteValue());
		System.out.println("Byte : " + byte4.byteValue());
		System.out.println("byte : " + byte2);
		System.out.println("byte : " + byte3);
	}
}

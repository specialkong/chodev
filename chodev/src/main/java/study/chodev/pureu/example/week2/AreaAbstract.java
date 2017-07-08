package study.chodev.pureu.example.week2;

public abstract class AreaAbstract {

	void process(int a, int b) {
		
		System.out.println(" a : " + a);
		System.out.println(" b : " + b);
		
		double area = getArea(a, b);
		
		System.out.println(toString() + " area : " + area);
	}
	
	abstract double getArea(int a, int b); 
}
	

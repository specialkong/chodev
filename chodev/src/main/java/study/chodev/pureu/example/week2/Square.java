package study.chodev.pureu.example.week2;

public class Square extends AreaAbstract{
	
	double getArea(int a, int b) {
		return a * b;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "square";
	}
	
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		//tri.process(4, 5);
		
		Square sqa = new Square();
		//sqa.process(4, 5);		
		
		Integer i = new Integer(3);
		System.out.println(i.toString());
		
		AreaAbstract abc = new Triangle();
		abc.process(4, 6);
		
		AreaAbstract abc2 = new Square();
		abc2.process(4, 6);
		
		printArea(tri);
		printArea(sqa);
	}
	
	public static void printArea(AreaAbstract abc) {
		abc.process(4, 6);
	}
	
}

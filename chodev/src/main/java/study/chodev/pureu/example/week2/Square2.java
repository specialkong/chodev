package study.chodev.pureu.example.week2;

public class Square2 implements AreaInterface{
	
	public void getArea(int a, int b) {
		System.out.println(toString() + " area : " + a*b);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "square";
	}
	
	public static void main(String[] args) {
		Triangle2 tri = new Triangle2();
		tri.getArea(4, 6);
		Square2 sqa = new Square2();
		sqa.getArea(4, 6);
		
		AreaInterface ai = new Triangle2();
		ai.getArea(5, 6);
		
		printArea(tri);
		printArea(sqa);
	}
	
	public static void printArea(AreaInterface abc) {
		abc.getArea(4, 6);
	}
	
}

package study.chodev.pureu.example.week2;

public class Triangle2 implements AreaInterface{
	
	public void getArea(int a, int b) {
		System.out.println(toString() + " area : " + 0.5*a*b);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "triangle";
	}
}

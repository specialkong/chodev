package study.chodev.pureu.example.week2;

public class Triangle extends AreaAbstract{
	
	double getArea(int a, int b) {
		return 0.5 * a * b;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "triangle";
	}
}

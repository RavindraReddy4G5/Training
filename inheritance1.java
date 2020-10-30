public abstract class Shape {
	
	abstract public void rectangle(int x,int y);
	abstract public void square(int x);
	abstract public void circle(int r);
	
}
public class Area extends Shape {
	
	public void rectangle(int x,int y) {
		int area = x*y;
		System.out.println("Area of rectangle: "+area);
	}

	@Override
	public void square(int x) {
		int area = x*x;
		System.out.println("Area of square: "+area);
		
	}

	@Override
	public void circle(int r) {
		double pi = 3.14;
		double area = pi*r*r;
		System.out.println("Area of circle: "+area);
		
	}
	
	

}
public class MainClass1 {
	
	public static void main(String[] args) {
		Area area = new Area();
		area.rectangle(3,4);
		area.square(4);
		area.circle(9);
	}

}

enum Poly {  //열거형
	Rectangle, Triangle, Circle
}
abstract class Shape { // 추상 클래스, 필드와 메소드, 생성자를 가질 수 있음
	protected int x, y;
	protected final static double PI = 3.14;

	Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void coorPrint() {
		System.out.println("중심 좌표 : x=" + x + ",  y=" + y);
	}

	abstract void draw();
}

class Rectangle extends Shape {
	private int area; // 넓이

	Rectangle(int x, int y) {
		super(x, y);
	}

	public void setArea(int ga, int se) {
		area = ga * se;
	}

	public int getArea() {
		return area;
	}

	// 메소드 재정의
	@Override // 재정의 되는 메소드임을 나타내는 annotation
	public void draw() {
		System.out.println("Rectangle Draw");
		coorPrint();
	}
}

class Triangle extends Shape {
	Triangle(int x, int y) {
		super(x, y);
	}

	public void draw() {
		System.out.println("Triangle Draw");
		coorPrint();
	}
}

class Circle extends Shape {
	private double circum; // 원 둘레

	Circle(int x, int y) {
		super(x, y);
	}

	public void draw() {
		System.out.println("Circle Draw");
		coorPrint();
	}

	public void setCircum(double r) {
		circum = r * r * PI;
	}

	public double getCircum() {
		return circum;
	}
}

public class PolyTest {
	public static void draw(Shape[] shape) {
		for (Shape s : shape) {
			s.draw();
			if (s instanceof Rectangle) // 객체 s가 Rectangle 타입이면
				System.out.println("넓이 : " + ((Rectangle) s).getArea());
			else if (s instanceof Circle)
				System.out.printf("원 둘레 : %.2f\n", ((Circle) s).getCircum());
		}
	}

	public static void main(String[] args) {
		Poly[] choice= Poly.values(); //열거 객체를 배열로 반환
		Shape[] shape = new Shape[4];
		for (int i = 0; i < shape.length; i++) {
			int rnd = (int) (Math.random() * 3);
			int x = (int) (Math.random() * 100) + 1;
			int y = (int) (Math.random() * 100) + 1;
			switch (choice[rnd]) { 
			case Rectangle :
				shape[i] = new Rectangle(x, y);
				((Rectangle) shape[i]).setArea(x, y);
				break;
			case Triangle :
				shape[i] = new Triangle(x, y);
				break;
			case Circle :
				shape[i] = new Circle(x, y);
				((Circle) shape[i]).setCircum(Math.random() * 10);
			}
		}
		draw(shape);
	}
}
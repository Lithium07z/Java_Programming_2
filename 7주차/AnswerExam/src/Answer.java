class Answer{
	public static void main(String[] args) {
		GraphicsObject obj=new Rectangle();
		 ((Rectangle)obj).setDimensions(34,23);
		 obj.draw();
	}
}

interface GraphicsObject {
	int getArea(); // 추상 메소드 getArea 
	void draw(); // 추상 메소드 draw
}

class Rectangle implements GraphicsObject { // 인터페이스 GraphicsObjet를 구현함
	private int length;
	private int width;
	
	@Override // 재정의함 
	public int getArea() {
		return length * width;
	}
	@Override // 재정의함
	public void draw() {
		System.out.println("넓이가 " + getArea() + "인 사각형을 그립니다.");
	}
	void setDimensions (int l, int w) {
		this.length = l; this.width = w;
	}
}
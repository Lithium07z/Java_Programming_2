class Answer{
	public static void main(String[] args) {
		GraphicsObject obj=new Rectangle();
		 ((Rectangle)obj).setDimensions(34,23);
		 obj.draw();
	}
}

interface GraphicsObject {
	int getArea(); // �߻� �޼ҵ� getArea 
	void draw(); // �߻� �޼ҵ� draw
}

class Rectangle implements GraphicsObject { // �������̽� GraphicsObjet�� ������
	private int length;
	private int width;
	
	@Override // �������� 
	public int getArea() {
		return length * width;
	}
	@Override // ��������
	public void draw() {
		System.out.println("���̰� " + getArea() + "�� �簢���� �׸��ϴ�.");
	}
	void setDimensions (int l, int w) {
		this.length = l; this.width = w;
	}
}
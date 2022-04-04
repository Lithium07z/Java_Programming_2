package week10TestingPackage4;

class Box<T> { // T�� ������ Ÿ���� �ǹ�, < >�ȿ� ǥ��, generic
	private T data; // T Ÿ���� �ڷ������� ���� data �ʵ�

	public Box(T data) { // T Ÿ���� ���ĸŰ������� ���
		this.data = data;
	}

	public void set(T data) {
		this.data = data;
	}

	public T get() {
		return data;
	}
}

public class BoxTest {
	public static void main(String[] args) {
		// ���̾� ��� ������ ȣ�� �� Ÿ�� �μ� ���� ���� SE7 �������� ����
		Box<String> sg = new Box<>("Generic"); // ���ڿ��� �����ϴ� Box Ŭ������ ��ü ����
		Box<Integer> ig = new Box<Integer>(340); // ������ �����ϴ� Box Ŭ������ ��ü
		System.out.println("<String>" + sg.get());
		System.out.println("<Integer>" + ig.get());
	}
}

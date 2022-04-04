public class Person implements Comparable {
	private String name;
	private double height;
	
	Person(String name, double height) {
		this.name = name;  this.height = height;
	}
	
	@Override
	public int compareTo(Object per) {
			Person son = (Person)per; // ObjectŸ�� ��ü�̹Ƿ� Person���� ����ȯ 
		if (this.height < son.height) { // ���� ��ü�� Ű ���� ���� ��ü�� Ű ������ ũ�� 
			return -1; // -1 ��ȯ
		} else if (this.height > son.height) { // ���� ��ü�� Ű ���� ���� ��ü�� Ű ������ ������ 
			return 1; // 1 ��ȯ 
		} else 
			return 0; // ������ ��� 0 ��ȯ
	}
	
	public String toString() {
		return "[ name = " + name + ", height = " + height + " ]";
	}
}

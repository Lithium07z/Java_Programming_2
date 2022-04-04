public class Person implements Comparable {
	private String name;
	private double height;
	
	Person(String name, double height) {
		this.name = name;  this.height = height;
	}
	
	@Override
	public int compareTo(Object per) {
			Person son = (Person)per; // Object타입 객체이므로 Person으로 형변환 
		if (this.height < son.height) { // 받은 객체의 키 값이 현재 객체의 키 값보다 크면 
			return -1; // -1 반환
		} else if (this.height > son.height) { // 받은 객체의 키 값이 현재 객체의 키 값보다 작으면 
			return 1; // 1 반환 
		} else 
			return 0; // 예외의 경우 0 반환
	}
	
	public String toString() {
		return "[ name = " + name + ", height = " + height + " ]";
	}
}

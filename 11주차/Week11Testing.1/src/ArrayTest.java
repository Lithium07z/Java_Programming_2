import java.util.*;
class Person{
	private String name;  //�̸�
	private int height;   //Ű
	
	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + "]";
	}
}

public class ArrayTest {
	public static void write(ArrayList<Person> alist) {
		for(Person person : alist)
			System.out.println(person);
	}
	public static void main(String[] args) {
		ArrayList<Person> alist=new ArrayList<>();
		alist.add(new Person("����", 170));
		alist.add(new Person("����", 173));
		write(alist);
		alist.add(1, new Person("���", 171));
		write(alist);
		alist.set(1, new Person("ȯ��", 176));
		write(alist);
	}
}

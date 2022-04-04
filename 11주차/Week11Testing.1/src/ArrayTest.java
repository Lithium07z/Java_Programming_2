import java.util.*;
class Person{
	private String name;  //이름
	private int height;   //키
	
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
		alist.add(new Person("기태", 170));
		alist.add(new Person("동규", 173));
		write(alist);
		alist.add(1, new Person("재승", 171));
		write(alist);
		alist.set(1, new Person("환수", 176));
		write(alist);
	}
}

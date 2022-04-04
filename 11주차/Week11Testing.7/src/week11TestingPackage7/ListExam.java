package week11TestingPackage7;

import java.util.ArrayList;
public class ListExam {
	static <Person> void add(ArrayList<Person> alist, Person person) {
		if (alist.isEmpty() == true) {
			alist.add(0, person);
		} else if(((week11TestingPackage7.Person) person).getHeight() > ((week11TestingPackage7.Person) alist.get(0)).getHeight()) {
			alist.add(2, person);
		} else {
			alist.add(0, person);
		}
	}
	public static void write(ArrayList<Person> alist) {
		for(Person person : alist)
			System.out.println(person);
	}
}

package week10TestingPackage5;

class MyArrayAlg {
	public static <T> void swap(T[] a, int i, int j) {
		T tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}

public class MyArrayAlgTest {
	public static void main(String[] args) {
		String[] language = { "C++", "C#", "JAVA" };
		Integer[] integer= {4,2,7,30,55,21};
		MyArrayAlg.swap(language, 1, 2);
		MyArrayAlg.swap(integer, 3, 5);
		for (String value : language)
			System.out.println(value);
		for (Integer value : integer)
			System.out.println(value);
	}
}
